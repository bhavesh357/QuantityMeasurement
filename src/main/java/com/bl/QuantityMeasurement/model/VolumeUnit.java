package com.bl.QuantityMeasurement.model;

import com.bl.QuantityMeasurement.exception.QuantityMeasurementException;

public class VolumeUnit extends Unit {
    public double volume;
    public VolumeUnit.UnitType unitType;

    public enum UnitType {GALLON, ML, LITRE}

    public VolumeUnit(double volume, VolumeUnit.UnitType unitType) {
        this.volume=volume;
        this.unitType=unitType;
    }

    public static double getInLitre(VolumeUnit o) {
        if (o.volume <0){
            throw new QuantityMeasurementException(QuantityMeasurementException.ErrorType.NEGATIVE_VALUE);
        }else {
        switch (o.unitType) {
            case GALLON:
                return gallonToLitre(o.volume);
            case ML:
                return mlToLitre(o.volume);
            default:
                return o.volume;
        }
    }
    }

    private static double mlToLitre(double volume) {
        return volume/1000;
    }

    private static double gallonToLitre(double volume) {
        return volume*3.78;
    }
}
