package com.bl.QuantityMeasurement.model;

public class TempUnit extends Unit {

    public TempUnit(double temp, UnitType unitType) {
        super(temp,unitType,UnitClass.TEMP);
    }
    static double getInCel(TempUnit o){
        switch (o.unitType){
            case F:
                return farToCel(o.size);
            default:
                return o.size;
        }
    }

    private static double farToCel(double temp) {
        double v = ((temp - 32) / 9) * 5;
        return v;
    }
}
