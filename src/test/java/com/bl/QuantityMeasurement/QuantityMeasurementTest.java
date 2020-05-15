package com.bl.QuantityMeasurement;

import com.bl.QuantityMeasurement.model.Feet;
import com.bl.QuantityMeasurement.model.Inch;
import com.bl.QuantityMeasurement.model.Yard;
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
    public void givenFeetAndFeet_WhenSame_ShouldReturnTrue() {
        Feet one= new Feet(0);
        boolean isEqual = quantityMeasurement.equalComparator(one, one);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenFeetAndFeet_WhenTypeSame_ShouldReturnTrue() {
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
    public void givenInchAndInch_WhenSame_ShouldReturnTrue() {
        Inch one= new Inch(0);
        boolean isEqual = quantityMeasurement.equalComparator(one, one);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenInchAndInch_WhenTypeSame_ShouldReturnTrue() {
        Inch one= new Inch(0);
        Inch two = new Inch(0);
        boolean isEqual = quantityMeasurement.equalComparator(one, two);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenInchAndInch_WhenDiffLength_ShouldReturnFalse() {
        Inch one= new Inch(0);
        Inch two = new Inch(10);
        boolean isEqual = quantityMeasurement.equalComparator(one, two);
        Assert.assertFalse(isEqual);
    }

    @Test
    public void givenFeetAndInch_WhenZero_ShouldReturnTrue() {
        Feet one= new Feet(0);
        Inch two = new Inch(0);
        boolean isEqual = quantityMeasurement.equalComparator(one, two);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenInchAndFeet_WhenOne_ShouldReturnFalse() {
        Inch two = new Inch(1);
        Feet one= new Feet(1);
        boolean isEqual = quantityMeasurement.equalComparator(one, two);
        Assert.assertFalse(isEqual);
    }

    @Test
    public void givenFeetAndInch_WhenOne_ShouldReturnFalse() {
        Inch two = new Inch(1);
        Feet one= new Feet(1);
        boolean isEqual = quantityMeasurement.equalComparator(two, one);
        Assert.assertFalse(isEqual);
    }

    @Test
    public void givenFeetAndInch_WhenProper_ShouldReturnTrue() {
        Feet one= new Feet(1);
        Inch two = new Inch(12);
        boolean isEqual = quantityMeasurement.equalComparator(one, two);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenInchAndFeet_WhenProper_ShouldReturnTrue() {
        Inch two = new Inch(12);
        Feet one= new Feet(1);
        boolean isEqual = quantityMeasurement.equalComparator(two, one);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenFeetAndYard_WhenProper_ShouldReturnTrue() {
        Yard two = new Yard(1);
        Feet one= new Feet(3);
        boolean isEqual = quantityMeasurement.equalComparator(one, two);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenFeetAndYard_WhenOne_ShouldReturnFalse() {
        Yard two = new Yard(1);
        Feet one= new Feet(1);
        boolean isEqual = quantityMeasurement.equalComparator(one, two);
        Assert.assertFalse(isEqual);
    }
}
