package com.bl.QuantityMeasurement.model;

public class WeightUnit {
    public double weight;
    public UnitType unitType;
    public enum UnitType {GRAM, TON, KG}

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
            if(weightUnit.unitType== UnitType.TON){
                return this.weight== tonToKg(weightUnit.weight);
            }
        }
        if(this.unitType== UnitType.GRAM){
            if(weightUnit.unitType== UnitType.KG){
                return weightUnit.weight== gramToKg(this.weight);
            }
            if(weightUnit.unitType== UnitType.TON){
                return tonToKg(weightUnit.weight)== gramToKg(this.weight);
            }
        }
        if(this.unitType== UnitType.TON){
            if(weightUnit.unitType== UnitType.KG){
                return weightUnit.weight== tonToKg(this.weight);
            }
            if(weightUnit.unitType== UnitType.GRAM){
                return tonToKg(this.weight)== gramToKg(weightUnit.weight);
            }
        }
        return false;
    }

    private double tonToKg(double weight) {
        return weight*1000;
    }

    private double gramToKg(double weight) {
        return weight/1000;
    }
}
