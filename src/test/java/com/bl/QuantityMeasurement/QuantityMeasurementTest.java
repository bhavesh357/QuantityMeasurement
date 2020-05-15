package com.bl.QuantityMeasurement;

import com.bl.QuantityMeasurement.model.Feet;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void givenFeetAndFeet_WhenZero_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        boolean isEqual = quantityMeasurement.compareFeetAndInches(new Feet(0), new Feet(0));
        Assert.assertTrue(isEqual);
    }

}
