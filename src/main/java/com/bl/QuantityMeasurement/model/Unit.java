package com.bl.QuantityMeasurement.model;

import static com.bl.QuantityMeasurement.model.LengthUnit.getInInch;
import static com.bl.QuantityMeasurement.model.TempUnit.getInCel;
import static com.bl.QuantityMeasurement.model.VolumeUnit.getInLitre;
import static com.bl.QuantityMeasurement.model.WeightUnit.getInKg;

public class Unit {
    public double addition(Unit o){
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
        Class<?> classUnit = o.getClass().getSuperclass();
        if( classUnit== LengthUnit.class){
            LengthUnit newUnit = (LengthUnit) o;
            return getInInch(newUnit);
        }else if(classUnit == WeightUnit.class){
            WeightUnit newUnit = (WeightUnit) o;
            return getInKg(newUnit);
        }else if(classUnit == VolumeUnit.class){
            VolumeUnit newUnit = (VolumeUnit) o;
            return getInLitre(newUnit);
        }else if(classUnit == TempUnit.class){
            TempUnit newUnit = (TempUnit) o;
            return getInCel(newUnit);
        }
        return 0;
    }
}
