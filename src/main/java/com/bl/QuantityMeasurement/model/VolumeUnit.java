package com.bl.QuantityMeasurement.model;

public class VolumeUnit implements Unit{
    public double volume;
    public VolumeUnit.UnitType unitType;

    public enum UnitType {GALLON, ML, LITRE}

    public VolumeUnit(double volume, VolumeUnit.UnitType unitType) {
        this.volume=volume;
        this.unitType=unitType;
    }

    @Override
    public double addition(Unit o) {
        if (o.getClass().getSuperclass() == VolumeUnit.class){
            VolumeUnit newunit = (VolumeUnit) o;
            return getInLitre(this)+getInLitre(newunit);
        }
        return 0;
    }

    private double getInLitre(VolumeUnit o) {
        switch (o.unitType){
            case GALLON:
                return gallonToLitre(o.volume);
            case ML:
                return mlToLitre(o.volume);
            case LITRE:
                return o.volume;
            default:
                return 0;
        }
    }

    public boolean equals(Object o) {
        if(o== null){
            return false;
        }
        if(o == this){
            return true;
        }
        VolumeUnit volumeUnit = (VolumeUnit) o;
        if( this.getClass() == volumeUnit.getClass()) {
            return this.volume == volumeUnit.volume;
        }
        if(this.unitType== UnitType.GALLON){
            if(volumeUnit.unitType== UnitType.LITRE){
                return volumeUnit.volume== gallonToLitre(this.volume);
            }
            if(volumeUnit.unitType== UnitType.ML){
                return gallonToLitre(this.volume)==mlToLitre(volumeUnit.volume);
            }
        }
        if(this.unitType== UnitType.LITRE){
            if(volumeUnit.unitType== UnitType.GALLON){
                return this.volume== gallonToLitre(volumeUnit.volume);
            }
            if(volumeUnit.unitType== UnitType.ML){
                return this.volume== mlToLitre(volumeUnit.volume);
            }
        }
        if(this.unitType== UnitType.ML){
            if(volumeUnit.unitType== UnitType.GALLON){
                return this.volume== gallonToLitre(volumeUnit.volume);
            }
            if(volumeUnit.unitType== UnitType.LITRE){
                return volumeUnit.volume== mlToLitre(this.volume);
            }
        }
        return false;
    }

    private double mlToLitre(double volume) {
        return volume/1000;
    }

    private double gallonToLitre(double volume) {
        return volume*3.78;
    }
}
