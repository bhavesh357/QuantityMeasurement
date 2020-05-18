package com.bl.QuantityMeasurement.model;

public class LengthUnit extends Unit {
    public double length;
    public UnitType unitType;

    public LengthUnit(double length, UnitType unitType) {
        this.length=length;
        this.unitType=unitType;
    }

    static double getInInch(LengthUnit o) {
            switch (o.unitType) {
                case CM:
                    return cmToInch(o.length);
                case FEET:
                    return feetToInch(o.length);
                case INCH:
                    return o.length;
                case YARD:
                    return yardToInch(o.length);
                default:
                    return 0;
            }
    }

    public enum UnitType {INCH, YARD, CM, FEET}


    public LengthUnit(int length, UnitType unitType) {
        this.length=length;
        this.unitType=unitType;
    }

    private static double cmToInch(double length) {
        return (length/2.5);
    }

    private static double yardToInch(double length) {
        return length*36;
    }

    private static double feetToInch(double length) {
        return length*12;
    }

}
