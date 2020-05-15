package com.bl.QuantityMeasurement;

import com.bl.QuantityMeasurement.model.Feet;

public class QuantityMeasurement {
    public boolean equalComparator(Feet one, Feet two) {
        if(one == null){
            return false;
        }
        return one.equals(two);
    }
}
