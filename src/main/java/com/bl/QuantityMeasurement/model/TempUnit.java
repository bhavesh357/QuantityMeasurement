package com.bl.QuantityMeasurement.model;

public class TempUnit implements Unit{
    public double temp;
    public TempUnit.UnitType unitType;

    @Override
    public double addition(Unit two) {
        return 0;
    }

    public enum UnitType {C, F}

    public TempUnit(double temp, UnitType unitType) {
        this.temp = temp;
        this.unitType = unitType;
    }


    public boolean equals(Object o) {
        if(o== null){
            return false;
        }
        if(o == this){
            return true;
        }
        TempUnit tempUnit = (TempUnit) o;
        if( this.getClass() == tempUnit.getClass()) {
            return this.temp == tempUnit.temp;
        }
        if(this.unitType== UnitType.F){
            if (tempUnit.unitType==UnitType.C) {
                return tempUnit.temp == farToCel(this.temp);
            }
        }
        if(this.unitType== UnitType.C){
            if(tempUnit.unitType== UnitType.F){
                return this.temp== farToCel(tempUnit.temp);
            }
        }
        return false;
    }

    private double farToCel(double temp) {
        double v = ((temp - 32) / 9) * 5;
        return v;
    }
}
