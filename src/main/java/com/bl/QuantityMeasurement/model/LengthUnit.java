package com.bl.QuantityMeasurement.model;

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
        if( this.getClass()!=o.getClass() ) {
            return false;
        }
        LengthUnit lengthUnit = (LengthUnit) o;
        if(this.unitType==lengthUnit.unitType){
            return this.length == lengthUnit.length;
        }
        return false;
    }

    public int getLength() {
        return length;
    }
}
