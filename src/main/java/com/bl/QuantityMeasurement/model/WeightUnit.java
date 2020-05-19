package com.bl.QuantityMeasurement.model;

import com.bl.QuantityMeasurement.exception.QuantityMeasurementException;

public class WeightUnit extends Unit {

    public WeightUnit(Double weight,UnitType unitType) {
        super(weight,unitType,UnitClass.WEIGHT);
    }

    /**
     * method to get in base unit
     * @param unit
     * @return unit in Kg
     */
    static double getInKg(WeightUnit unit) {
        if (unit.size <0){
            throw new QuantityMeasurementException(QuantityMeasurementException.ErrorType.NEGATIVE_VALUE);
        }else {
            switch (unit.unitType) {
                case TON:
                    return tonToKg(unit.size);
                case GRAM:
                    return gramToKg(unit.size);
                default:
                    return unit.size;
            }
        }
    }
    /**
     * method to get weight in ton
     * @param weight
     * @return weight in ton
     */
    private static double tonToKg(double weight) {
        return weight*1000;
    }
    /**
     * method to get weight in gram
     * @param weight
     * @return weight in gram
     */
    private static double gramToKg(double weight) {
        return weight/1000;
    }
}
