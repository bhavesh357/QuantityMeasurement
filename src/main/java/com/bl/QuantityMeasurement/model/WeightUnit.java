package com.bl.QuantityMeasurement.model;

import com.bl.QuantityMeasurement.exception.QuantityMeasurementException;

public class WeightUnit extends Unit {
    public double weight;
    public UnitType unitType;

    public enum UnitType {GRAM, TON, KG}

    public WeightUnit(Double weight,UnitType unitType) {
        this.weight=weight;
        this.unitType=unitType;
    }

    static double getInKg(WeightUnit weight) {
        if (weight.weight <0){
            throw new QuantityMeasurementException(QuantityMeasurementException.ErrorType.NEGATIVE_VALUE);
        }else {
            switch (weight.unitType) {
                case TON:
                    return tonToKg(weight.weight);
                case GRAM:
                    return gramToKg(weight.weight);
                default:
                    return weight.weight;
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
