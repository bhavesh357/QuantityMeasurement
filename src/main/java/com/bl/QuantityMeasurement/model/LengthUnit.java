package com.bl.QuantityMeasurement.model;

import com.bl.QuantityMeasurement.QuantityMeasurement;
import com.bl.QuantityMeasurement.exception.QuantityMeasurementException;

import javax.lang.model.type.ErrorType;

public class LengthUnit extends Unit {


    public LengthUnit(double length, UnitType unitType) {
        super(length,unitType, UnitClass.LENGTH);
    }

    /**
     * method to get in base unit
     * @param unit
     * @return unit in inch
     */
    static double getInInch(LengthUnit unit) {
        if (unit.size <0){
            throw new QuantityMeasurementException(QuantityMeasurementException.ErrorType.NEGATIVE_VALUE);
        }else {
            switch (unit.unitType) {
                case CM:
                    return cmToInch(unit.size);
                case FEET:
                    return feetToInch(unit.size);
                case INCH:
                    return unit.size;
                default:
                    return yardToInch(unit.size);
            }
        }
    }


    /**
     * method to get length in cm
     * @param length
     * @return length in cm
     */
    private static double cmToInch(double length) {
        return (length/2.5);
    }
    /**
     * method to get length in yard
     * @param length
     * @return length in yard
     */
    private static double yardToInch(double length) {
        return length*36;
    }
    /**
     * method to get length in feet
     * @param length
     * @return length in feet
     */
    private static double feetToInch(double length) {
        return length*12;
    }

}
