package com.bl.QuantityMeasurement.model;

import com.bl.QuantityMeasurement.QuantityMeasurement;
import com.bl.QuantityMeasurement.exception.QuantityMeasurementException;

import javax.lang.model.type.ErrorType;

public class LengthUnit extends Unit {


    public LengthUnit(double length, UnitType unitType) {
        super(length,unitType, UnitClass.LENGTH);
    }

    static double getInInch(LengthUnit o) {
        if (o.size <0){
            throw new QuantityMeasurementException(QuantityMeasurementException.ErrorType.NEGATIVE_VALUE);
        }else {
            switch (o.unitType) {
                case CM:
                    return cmToInch(o.size);
                case FEET:
                    return feetToInch(o.size);
                case INCH:
                    return o.size;
                default:
                    return yardToInch(o.size);
            }
        }
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
