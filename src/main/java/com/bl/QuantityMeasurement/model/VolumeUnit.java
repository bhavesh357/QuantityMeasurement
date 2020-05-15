package com.bl.QuantityMeasurement.model;

public class VolumeUnit {
    public double volume;
    public VolumeUnit.UnitType unitType;

    public enum UnitType {GALLON, LITRE}

    public VolumeUnit(double volume, VolumeUnit.UnitType unitType) {
        this.volume=volume;
        this.unitType=unitType;
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
        }
        if(this.unitType== UnitType.LITRE){
            if(volumeUnit.unitType== UnitType.GALLON){
                return this.volume== gallonToLitre(volumeUnit.volume);
            }
        }
        return false;
    }

    private double gallonToLitre(double volume) {
        return volume*3.78;
    }
}
