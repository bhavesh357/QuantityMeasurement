package com.bl.QuantityMeasurement;

import com.bl.QuantityMeasurement.model.Feet;
import com.bl.QuantityMeasurement.model.Inch;

public class QuantityMeasurement {
    public boolean equalComparator(Feet one, Feet two) {
        if(one == null){
            return false;
        }
        return one.equals(two);
    }

    public boolean equalComparator(Inch one, Inch two) {
        if(one == null){
            return false;
        }
        return one.equals(two);
    }
}

