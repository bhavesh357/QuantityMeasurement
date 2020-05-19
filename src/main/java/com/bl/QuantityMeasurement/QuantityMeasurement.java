package com.bl.QuantityMeasurement;

import com.bl.QuantityMeasurement.exception.QuantityMeasurementException;
import com.bl.QuantityMeasurement.model.*;

public class QuantityMeasurement {
    /**
     * method to compare two units
     * @param one
     * @param two
     * @return none
     */
    public boolean equalComparator(Unit one, Unit two) {
        if(one == null){
            return false;
        }
        return one.equals(two);
    }

    /**
     * method to add two units
     * @param one
     * @param two
     * @return total size
     */
    public double addition(Unit one, Unit two) {
        if(one == null || two == null){
            throw new QuantityMeasurementException(QuantityMeasurementException.ErrorType.NULL_UNIT);
        }
      return one.addition(two);
    }
}

