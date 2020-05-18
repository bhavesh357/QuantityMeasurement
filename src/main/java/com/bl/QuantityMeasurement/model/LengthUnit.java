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


    public boolean equals(Object o) {
        if(o== null){
            return false;
        }
        if(o == this){
            return true;
        }
        LengthUnit lengthUnit = (LengthUnit) o;
        if( this.getClass() == lengthUnit.getClass()) {
                return this.length == lengthUnit.length;
        }
        if(this.unitType==UnitType.FEET){
            if(lengthUnit.unitType==UnitType.INCH){
                return lengthUnit.length== feetToInch(this.length);
            }
            if(lengthUnit.unitType==UnitType.YARD){
                return yardToInch(lengthUnit.length)== feetToInch(this.length);
            }
        }
        if(this.unitType==UnitType.INCH){
            if(lengthUnit.unitType==UnitType.FEET){
                return this.length== feetToInch(lengthUnit.length);
            }
            if(lengthUnit.unitType==UnitType.YARD){
                return yardToInch(lengthUnit.length)== this.length;
            }
            if(lengthUnit.unitType==UnitType.CM){
                return this.length== cmToInch(lengthUnit.length);
            }
        }
        if(this.unitType==UnitType.YARD){
            if(lengthUnit.unitType==UnitType.INCH){
                return lengthUnit.length== yardToInch(this.length);
            }
            if(lengthUnit.unitType==UnitType.FEET){
                return yardToInch(this.length)== feetToInch(lengthUnit.length);
            }
        }
        return false;
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
