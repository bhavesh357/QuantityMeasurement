package com.bl.QuantityMeasurement;

import com.bl.QuantityMeasurement.model.Feet;
import com.bl.QuantityMeasurement.model.Inch;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementTest {
    public QuantityMeasurement quantityMeasurement;
    @Before
    public void setUp() throws Exception {
        quantityMeasurement = new QuantityMeasurement();
    }

    @Test
    public void givenFeetAndFeet_WhenZero_ShouldReturnTrue() {
        boolean isEqual = quantityMeasurement.equalComparator(new Feet(0), new Feet(0));
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenFeetAndFeet_WhenFirstNull_ShouldReturnFalse() {
        Feet one= new Feet(0);
        Feet two = null;
        boolean isEqual = quantityMeasurement.equalComparator(two, one);
        Assert.assertFalse(isEqual);
    }

    @Test
    public void givenFeetAndFeet_WhenSecondNull_ShouldReturnFalse() {
        Feet one= new Feet(0);
        Feet two = null;
        boolean isEqual = quantityMeasurement.equalComparator(one, two);
        Assert.assertFalse(isEqual);
    }

    @Test
    public void givenFeetAndFeet_WhenSame_ShouldReturnFalse() {
        Feet one= new Feet(0);
        boolean isEqual = quantityMeasurement.equalComparator(one, one);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenFeetAndFeet_WhenTypeSame_ShouldReturnFalse() {
        Feet one= new Feet(0);
        Feet two = new Feet(0);
        boolean isEqual = quantityMeasurement.equalComparator(one, two);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenFeetAndFeet_WhenDiffLength_ShouldReturnFalse() {
        Feet one= new Feet(0);
        Feet two = new Feet(10);
        boolean isEqual = quantityMeasurement.equalComparator(one, two);
        Assert.assertFalse(isEqual);
    }

    @Test
    public void givenInchAndInch_WhenZero_ShouldReturnTrue() {
        boolean isEqual = quantityMeasurement.equalComparator(new Inch(0), new Inch(0));
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenInchAndInch_WhenFirstNull_ShouldReturnFalse() {
        Inch one= new Inch(0);
        Inch two = null;
        boolean isEqual = quantityMeasurement.equalComparator(two, one);
        Assert.assertFalse(isEqual);
    }

    @Test
    public void givenInchAndInch_WhenSecondNull_ShouldReturnFalse() {
        Inch one= new Inch(0);
        Inch two = null;
        boolean isEqual = quantityMeasurement.equalComparator(one, two);
        Assert.assertFalse(isEqual);
    }

    @Test
    public void givenInchAndInch_WhenSame_ShouldReturnFalse() {
        Inch one= new Inch(0);
        boolean isEqual = quantityMeasurement.equalComparator(one, one);
        Assert.assertTrue(isEqual);
    }

}
