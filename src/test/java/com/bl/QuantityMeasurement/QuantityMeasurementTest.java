package com.bl.QuantityMeasurement;

import com.bl.QuantityMeasurement.model.*;
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

    @Test
    public void givenInchAndYard_WhenOne_ShouldReturnFalse() {
        Yard two = new Yard(1);
        Inch one= new Inch(1);
        boolean isEqual = quantityMeasurement.equalComparator(one, two);
        Assert.assertFalse(isEqual);
    }

    @Test
    public void givenYardAndInch_WhenProper_ShouldReturnTrue() {
        Yard one = new Yard(1);
        Inch two= new Inch(36);
        boolean isEqual = quantityMeasurement.equalComparator(one, two);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenInchAndYard_WhenProper_ShouldReturnTrue() {
        Inch one= new Inch(36);
        Yard two = new Yard(1);
        boolean isEqual = quantityMeasurement.equalComparator(one, two);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenYardAndFeet_WhenProper_ShouldReturnTrue() {
        Yard one = new Yard(1);
        Feet two= new Feet(3);
        boolean isEqual = quantityMeasurement.equalComparator(one, two);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenInchAndCm_WhenProper_ShouldReturnTrue() {
        Inch one = new Inch(2);
        Centimeters two= new Centimeters(5);
        boolean isEqual = quantityMeasurement.equalComparator(one, two);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenInchAndInch_WhenProper_ShouldReturnAddition() {
        Inch one = new Inch(2);
        Inch two= new Inch(2);
        double addition = quantityMeasurement.addLength(one, two);
        Assert.assertEquals(4,addition,0.0);
    }

    @Test
    public void givenFeetAndInch_WhenProper_ShouldReturnAddition() {
        Feet one = new Feet(1);
        Inch two= new Inch(2);
        double addition = quantityMeasurement.addLength(one, two);
        Assert.assertEquals(14,addition,0.0);
    }

    @Test
    public void givenFeetAndFeet_WhenProper_ShouldReturnAddition() {
        Feet one = new Feet(1);
        Feet two= new Feet(1);
        double addition = quantityMeasurement.addLength(one, two);
        Assert.assertEquals(24,addition,0.0);
    }

    @Test
    public void givenInchAndCm_WhenProper_ShouldReturnAddition() {
        Inch one = new Inch(2);
        Centimeters two= new Centimeters(2.5);
        double addition = quantityMeasurement.addLength(one, two);
        Assert.assertEquals(3,addition,0.0);
    }

    @Test
    public void givenGallonAndLitre_WhenProper_ShouldReturnTrue() {
        Gallon one = new Gallon(1);
        Litre two = new Litre(3.78);
        boolean isEqual = quantityMeasurement.equalComparator(one,two);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenLitreAndMl_WhenProper_ShouldReturnTrue() {
        Litre one = new Litre(1);
        Mililitre two = new Mililitre(1000);
        boolean isEqual = quantityMeasurement.equalComparator(one,two);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenGallonAndLitre_WhenProper_ShouldReturnAddition() {
        Gallon one = new Gallon(1);
        Litre two= new Litre(3.78);
        double addition = quantityMeasurement.addVolume(one, two);
        Assert.assertEquals(7.57,addition,0.03);
    }

    @Test
    public void givenLitreAndMl_WhenProper_ShouldReturnAddition() {
        Mililitre two = new Mililitre(1000);
        Litre one= new Litre(1);
        double addition = quantityMeasurement.addVolume(one, two);
        Assert.assertEquals(2,addition,0.03);
    }

    @Test
    public void givenKgAndGram_WhenProper_ShouldReturnTrue() {
        Kilogram one = new Kilogram(1);
        Gram two = new Gram(1000);
        boolean isEqual = quantityMeasurement.equalComparator(one,two);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenTonAndKg_WhenProper_ShouldReturnTrue() {
        Ton one = new Ton(1);
        Kilogram two = new Kilogram(1000);
        boolean isEqual = quantityMeasurement.equalComparator(one,two);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenTonAndGram_WhenProper_ShouldReturnAddition() {
        Ton one = new Ton(1);
        Gram two= new Gram(1000);
        double addition = quantityMeasurement.addWeight(one, two);
        Assert.assertEquals(1001,addition,0.03);
    }
}
