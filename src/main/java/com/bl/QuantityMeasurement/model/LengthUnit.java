package com.bl.QuantityMeasurement.model;

import java.util.Objects;

public class LengthUnit {
    public int length;
    public UnitType unitType;
    public enum UnitType {INCH, FEET}


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
                return lengthUnit.length==FeetToInch(this.length);
            }
        }
        if(this.unitType==UnitType.INCH){
            if(lengthUnit.unitType==UnitType.FEET){
                return this.length==FeetToInch(lengthUnit.length);
            }
        }
        return false;
    }

    private int FeetToInch(int length) {
        return length*12;
    }

    public int getLength() {
        return length;
    }
}
