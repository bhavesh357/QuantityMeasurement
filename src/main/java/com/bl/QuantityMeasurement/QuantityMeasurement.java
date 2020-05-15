package com.bl.QuantityMeasurement;

import com.bl.QuantityMeasurement.model.Feet;
import com.bl.QuantityMeasurement.model.Inch;
import com.bl.QuantityMeasurement.model.LengthUnit;

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
}

