package com.bl.QuantityMeasurement.model;

import com.bl.QuantityMeasurement.exception.QuantityMeasurementException;

import static com.bl.QuantityMeasurement.model.LengthUnit.getInInch;
import static com.bl.QuantityMeasurement.model.TempUnit.getInCel;
import static com.bl.QuantityMeasurement.model.VolumeUnit.getInLitre;
import static com.bl.QuantityMeasurement.model.WeightUnit.getInKg;

public class Unit {
    public double size;
    public UnitType unitType;
    public UnitClass superClass;

    public Unit(double size, UnitType unitType, UnitClass superClass) {
        this.size = size;
        this.unitType = unitType;
        this.superClass = superClass;
    }

    public double addition(Unit o){
        if (this.superClass!=o.superClass){
            throw new QuantityMeasurementException(QuantityMeasurementException.ErrorType.DIFFERENT_UNIT);
        }
        return getInStandard(this)+getInStandard(o);
    }

    public boolean equals(Unit o){
        if(o== null){
            return false;
        }
        if(o == this){
            return true;
        }
        if(o.getClass().getSuperclass() == this.getClass().getSuperclass()) {
            return getInStandard(this) == getInStandard(o);
        }
        return false;
    }

    private double getInStandard(Unit o) {
        switch (o.superClass){
            case LENGTH:
                LengthUnit lengthUnit = (LengthUnit) o;
                return getInInch(lengthUnit);
            case WEIGHT:
                WeightUnit weightUnit = (WeightUnit) o;
                return getInKg(weightUnit);
            case VOLUME:
                VolumeUnit volumeUnit = (VolumeUnit) o;
                return getInLitre(volumeUnit);
            default:
                TempUnit tempUnit = (TempUnit) o;
                return getInCel(tempUnit);
        }
    }


    public enum UnitClass {
        LENGTH,WEIGHT,TEMP,VOLUME
    }

    public enum UnitType {INCH, YARD, CM, FEET,C, F,GRAM, TON, KG,GALLON, ML, LITRE}
}
