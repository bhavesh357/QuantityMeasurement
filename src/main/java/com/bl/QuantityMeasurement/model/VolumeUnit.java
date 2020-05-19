package com.bl.QuantityMeasurement.model;

import com.bl.QuantityMeasurement.exception.QuantityMeasurementException;

public class VolumeUnit extends Unit {

    public VolumeUnit(double volume, VolumeUnit.UnitType unitType) {
        super(volume,unitType,UnitClass.VOLUME);
    }
    /**
     * method to get in base unit
     * @param unit
     * @return unit in litre
     */
    public static double getInLitre(VolumeUnit unit) {
        if (unit.size <0){
            throw new QuantityMeasurementException(QuantityMeasurementException.ErrorType.NEGATIVE_VALUE);
        }else {
        switch (unit.unitType) {
            case GALLON:
                return gallonToLitre(unit.size);
            case ML:
                return mlToLitre(unit.size);
            default:
                return unit.size;
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
