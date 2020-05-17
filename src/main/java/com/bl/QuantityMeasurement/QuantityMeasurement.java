package com.bl.QuantityMeasurement;

import com.bl.QuantityMeasurement.model.*;

public class QuantityMeasurement {
    public boolean equalComparator(Unit one, Unit two) {
        if(one == null){
            return false;
        }
        return one.equals(two);
    }
    //public double addition(Unit one, Unit two) {
      //  return one.addition(two);
    //}

    public double addLength(LengthUnit one, LengthUnit two) {
        return one.addition(two);
    }

    public double addVolume(VolumeUnit one, VolumeUnit two) {
        return one.addition(two);
    }


    public double addWeight(WeightUnit one, WeightUnit two) {
        return one.addition(two);
    }
}

