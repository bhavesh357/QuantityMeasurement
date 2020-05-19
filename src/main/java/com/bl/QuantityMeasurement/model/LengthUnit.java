package com.bl.QuantityMeasurement.model;

import com.bl.QuantityMeasurement.QuantityMeasurement;
import com.bl.QuantityMeasurement.exception.QuantityMeasurementException;

import javax.lang.model.type.ErrorType;

public class LengthUnit extends Unit {
    public double length;
    public UnitType unitType;

    public LengthUnit(double length, UnitType unitType) {
        this.length=length;
        this.unitType=unitType;
    }

    static double getInInch(LengthUnit o) {
        if (o.length <0){
            throw new QuantityMeasurementException(QuantityMeasurementException.ErrorType.NEGATIVE_VALUE);
        }else {
            switch (o.unitType) {
                case CM:
                    return cmToInch(o.length);
                case FEET:
                    return feetToInch(o.length);
                case INCH:
                    return o.length;
                default:
                    return yardToInch(o.length);
            }
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
