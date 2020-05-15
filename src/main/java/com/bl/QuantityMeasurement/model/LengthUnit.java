package com.bl.QuantityMeasurement.model;

public class LengthUnit {
    public int length;
    public UnitType unitType;
    public enum UnitType {INCH, YARD, FEET}


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
        }
        return false;
    }

    private int yardToInch(int length) {
        return length*36;
    }

    private int feetToInch(int length) {
        return length*12;
    }

    public int getLength() {
        return length;
    }
}
