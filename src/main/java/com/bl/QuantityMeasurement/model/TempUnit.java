package com.bl.QuantityMeasurement.model;

public class TempUnit extends Unit {
    /**
     * constructor to create TempUnit
     * @param temp
     * @param unitType
     */
    public TempUnit(double temp, UnitType unitType) {
        super(temp,unitType,UnitClass.TEMP);
    }

    /**
     * get in base class
     * @param unit
     * @return
     */
    static double getInCel(TempUnit unit){
        switch (unit.unitType){
            case F:
                return farToCel(unit.size);
            default:
                return unit.size;
        }
    }

    /**
     * method to convert farenheit to celcius
     * @param temp
     * @return temp in celcius
     */
    private static double farToCel(double temp) {
        double v = ((temp - 32) / 9) * 5;
        return v;
    }
}
