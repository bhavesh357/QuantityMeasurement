package com.bl.QuantityMeasurement;

import com.bl.QuantityMeasurement.exception.QuantityMeasurementException;
import com.bl.QuantityMeasurement.model.*;

public class QuantityMeasurement {
    public boolean equalComparator(Unit one, Unit two) {
        if(one == null){
            return false;
        }
        return one.equals(two);
    }
    public double addition(Unit one, Unit two) {
        if(one == null || two == null){
            throw new QuantityMeasurementException(QuantityMeasurementException.ErrorType.NULL_UNIT);
        }
      return one.addition(two);
    }
}

