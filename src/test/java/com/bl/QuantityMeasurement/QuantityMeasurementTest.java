package com.bl.QuantityMeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenFeetAndInches_WhenZero_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean isEqual = quantityMeasurement.compareFeetAndInches(0, 0);
        Assert.assertTrue(isEqual);
    }
}
