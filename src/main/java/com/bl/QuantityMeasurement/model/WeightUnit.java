package com.bl.QuantityMeasurement.model;

import com.bl.QuantityMeasurement.exception.QuantityMeasurementException;

public class WeightUnit extends Unit {

    public WeightUnit(Double weight,UnitType unitType) {
        super(weight,unitType,UnitClass.WEIGHT);
    }
    static double getInKg(WeightUnit weight) {
        if (weight.size <0){
            throw new QuantityMeasurementException(QuantityMeasurementException.ErrorType.NEGATIVE_VALUE);
        }else {
            switch (weight.unitType) {
                case TON:
                    return tonToKg(weight.size);
                case GRAM:
                    return gramToKg(weight.size);
                default:
                    return weight.size;
            }
        }
    }

    private static double tonToKg(double weight) {
        return weight*1000;
    }

    private static double gramToKg(double weight) {
        return weight/1000;
    }
}
