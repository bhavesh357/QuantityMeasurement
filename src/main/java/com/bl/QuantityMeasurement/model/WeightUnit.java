package com.bl.QuantityMeasurement.model;

public class WeightUnit {
    public double weight;
    public UnitType unitType;
    public enum UnitType {GRAM, KG}

    public WeightUnit(Double weight,UnitType unitType) {
        this.weight=weight;
        this.unitType=unitType;
    }

    public boolean equals(Object o) {
        if(o== null){
            return false;
        }
        if(o == this){
            return true;
        }
        WeightUnit weightUnit = (WeightUnit) o;
        if( this.getClass() == weightUnit.getClass()) {
            return this.weight == weightUnit.weight;
        }
        if(this.unitType== UnitType.KG){
            if(weightUnit.unitType== UnitType.GRAM){
                return this.weight== gramToKg(weightUnit.weight);
            }
        }
        if(this.unitType== UnitType.GRAM){
            if(weightUnit.unitType== UnitType.KG){
                return weightUnit.weight== gramToKg(this.weight);
            }
        }
        return false;
    }

    private double gramToKg(double weight) {
        return weight/1000;
    }
}
