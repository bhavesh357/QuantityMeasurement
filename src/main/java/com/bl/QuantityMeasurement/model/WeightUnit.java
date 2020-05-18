package com.bl.QuantityMeasurement.model;

public class WeightUnit extends Unit {
    public double weight;
    public UnitType unitType;

    public enum UnitType {GRAM, TON, KG}

    public WeightUnit(Double weight,UnitType unitType) {
        this.weight=weight;
        this.unitType=unitType;
    }

    static double getInKg(WeightUnit weight) {
        switch (weight.unitType){
            case KG:
                return weight.weight;
            case TON:
                return tonToKg(weight.weight);
            case GRAM:
                return gramToKg(weight.weight);
            default:
                return 0;
        }
    }

    private static double tonToKg(double weight) {
        return weight*1000;
    }

    private static double gramToKg(double weight) {
        return weight/1000;
    }
}
