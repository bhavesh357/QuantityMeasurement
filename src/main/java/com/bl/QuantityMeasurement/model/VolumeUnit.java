package com.bl.QuantityMeasurement.model;

import com.bl.QuantityMeasurement.exception.QuantityMeasurementException;

public class VolumeUnit extends Unit {

    public VolumeUnit(double volume, VolumeUnit.UnitType unitType) {
        super(volume,unitType,UnitClass.VOLUME);
    }

    public static double getInLitre(VolumeUnit o) {
        if (o.size <0){
            throw new QuantityMeasurementException(QuantityMeasurementException.ErrorType.NEGATIVE_VALUE);
        }else {
        switch (o.unitType) {
            case GALLON:
                return gallonToLitre(o.size);
            case ML:
                return mlToLitre(o.size);
            default:
                return o.size;
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
