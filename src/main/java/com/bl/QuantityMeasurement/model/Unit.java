package com.bl.QuantityMeasurement.model;

import com.bl.QuantityMeasurement.exception.QuantityMeasurementException;

import static com.bl.QuantityMeasurement.model.LengthUnit.getInInch;
import static com.bl.QuantityMeasurement.model.TempUnit.getInCel;
import static com.bl.QuantityMeasurement.model.VolumeUnit.getInLitre;
import static com.bl.QuantityMeasurement.model.WeightUnit.getInKg;

public class Unit {
    public double size;// to store size
    public UnitType unitType;// to store unit type
    public UnitClass superClass;//to store  parent unit type

    /**
     *
     * @param size
     * @param unitType
     * @param superClass
     */
    public Unit(double size, UnitType unitType, UnitClass superClass) {
        this.size = size;
        this.unitType = unitType;
        this.superClass = superClass;
    }

    /**
     * method to call addition of two unit
     * @param unit
     * @return total size
     */
    public double addition(Unit unit){
        if (this.superClass!=unit.superClass){
            throw new QuantityMeasurementException(QuantityMeasurementException.ErrorType.DIFFERENT_UNIT);
        }
        return getInStandard(this)+getInStandard(unit);
    }

    /**
     * method to compare units
     * @param unit
     * @return if equals or not
     */
    public boolean equals(Unit unit){
        if(unit== null){
            return false;
        }
        if(unit == this){
            return true;
        }
        if(unit.getClass().getSuperclass() == this.getClass().getSuperclass()) {
            return getInStandard(this) == getInStandard(unit);
        }
        return false;
    }

    /**
     * method to get size in base
     * @param unit
     * @return unit size in base
     */
    private double getInStandard(Unit unit) {
        switch (unit.superClass){
            case LENGTH:
                LengthUnit lengthUnit = (LengthUnit) unit;
                return getInInch(lengthUnit);
            case WEIGHT:
                WeightUnit weightUnit = (WeightUnit) unit;
                return getInKg(weightUnit);
            case VOLUME:
                VolumeUnit volumeUnit = (VolumeUnit) unit;
                return getInLitre(volumeUnit);
            default:
                TempUnit tempUnit = (TempUnit) unit;
                return getInCel(tempUnit);
        }
    }

    /**
     * to store parent unit type
     */
    public enum UnitClass {
        LENGTH,WEIGHT,TEMP,VOLUME
    }

    /**
     * to store unit type
     */
    public enum UnitType {INCH, YARD, CM, FEET,C, F,GRAM, TON, KG,GALLON, ML, LITRE}
}
