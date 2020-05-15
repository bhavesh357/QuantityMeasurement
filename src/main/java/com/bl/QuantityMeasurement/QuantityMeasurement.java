package com.bl.QuantityMeasurement;

import com.bl.QuantityMeasurement.model.*;

public class QuantityMeasurement {
    public boolean equalComparator(LengthUnit one, LengthUnit two) {
        if(one == null){
            return false;
        }
        return one.equals(two);
    }

    public double addLength(LengthUnit one, LengthUnit two) {
        return one.addition(two);
    }

    public boolean equalComparator(VolumeUnit one, VolumeUnit two) {
        if(one == null){
            return false;
        }
        return one.equals(two);
    }

    public double addVolume(VolumeUnit one, VolumeUnit two) {
        return one.addition(two);
    }

    public boolean equalComparator(WeightUnit one, WeightUnit two) {
        if(one == null){
            return false;
        }
        return one.equals(two);
    }

    public double addWeight(WeightUnit one, WeightUnit two) {
        return one.addition(two);
    }

    public boolean equalComparator(TempUnit one, TempUnit two) {
        if(one == null){
            return false;
        }
        return one.equals(two);
    }
}

