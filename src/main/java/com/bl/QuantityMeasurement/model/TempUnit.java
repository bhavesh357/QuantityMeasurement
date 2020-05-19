package com.bl.QuantityMeasurement.model;

public class TempUnit extends Unit {
    public double temp;
    public TempUnit.UnitType unitType;

    public enum UnitType {C, F}

    public TempUnit(double temp, UnitType unitType) {
        this.temp = temp;
        this.unitType = unitType;
    }

    static double getInCel(TempUnit o){
        switch (o.unitType){
            case F:
                return farToCel(o.temp);
            default:
                return o.temp;
        }
    }

    private static double farToCel(double temp) {
        double v = ((temp - 32) / 9) * 5;
        return v;
    }
}
