package com.bl.QuantityMeasurement;

import com.bl.QuantityMeasurement.exception.QuantityMeasurementException;
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
        Feet firstUnit= new Feet(0);
        Feet secondUnit = null;
        boolean isEqual = quantityMeasurement.equalComparator(secondUnit, firstUnit);
        Assert.assertFalse(isEqual);
    }

    @Test
    public void givenFeetAndFeet_WhenSecondNull_ShouldReturnFalse() {
        Feet firstUnit= new Feet(0);
        Feet secondUnit = null;
        boolean isEqual = quantityMeasurement.equalComparator(firstUnit, secondUnit);
        Assert.assertFalse(isEqual);
    }

    @Test
    public void givenFeetAndFeet_WhenSame_ShouldReturnTrue() {
        Feet firstUnit= new Feet(0);
        boolean isEqual = quantityMeasurement.equalComparator(firstUnit, firstUnit);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenFeetAndFeet_WhenTypeSame_ShouldReturnTrue() {
        Feet firstUnit= new Feet(0);
        Feet secondUnit = new Feet(0);
        boolean isEqual = quantityMeasurement.equalComparator(firstUnit, secondUnit);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenFeetAndFeet_WhenDiffLength_ShouldReturnFalse() {
        Feet firstUnit= new Feet(0);
        Feet secondUnit = new Feet(10);
        boolean isEqual = quantityMeasurement.equalComparator(firstUnit, secondUnit);
        Assert.assertFalse(isEqual);
    }

    @Test
    public void givenFeetAndFeet_WhenNegativeLength_ShouldReturnFalse() {
        try{
        Feet firstUnit= new Feet(-10);
        Feet secondUnit = new Feet(10);
        boolean isEqual = quantityMeasurement.equalComparator(firstUnit, secondUnit);
        Assert.assertFalse(isEqual);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ErrorType.NEGATIVE_VALUE,e.type);
        }
    }

    @Test
    public void givenInchAndInch_WhenZero_ShouldReturnTrue() {
        boolean isEqual = quantityMeasurement.equalComparator(new Inch(0), new Inch(0));
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenInchAndInch_WhenFirstNull_ShouldReturnFalse() {
        Inch firstUnit= new Inch(0);
        Inch secondUnit = null;
        boolean isEqual = quantityMeasurement.equalComparator(secondUnit, firstUnit);
        Assert.assertFalse(isEqual);
    }

    @Test
    public void givenInchAndInch_WhenSecondNull_ShouldReturnFalse() {
        Inch firstUnit= new Inch(0);
        Inch secondUnit = null;
        boolean isEqual = quantityMeasurement.equalComparator(firstUnit, secondUnit);
        Assert.assertFalse(isEqual);
    }

    @Test
    public void givenInchAndInch_WhenSame_ShouldReturnTrue() {
        Inch firstUnit= new Inch(0);
        boolean isEqual = quantityMeasurement.equalComparator(firstUnit, firstUnit);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenInchAndInch_WhenTypeSame_ShouldReturnTrue() {
        Inch firstUnit= new Inch(0);
        Inch secondUnit = new Inch(0);
        boolean isEqual = quantityMeasurement.equalComparator(firstUnit, secondUnit);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenInchAndInch_WhenDiffLength_ShouldReturnFalse() {
        Inch firstUnit= new Inch(0);
        Inch secondUnit = new Inch(10);
        boolean isEqual = quantityMeasurement.equalComparator(firstUnit, secondUnit);
        Assert.assertFalse(isEqual);
    }

    @Test
    public void givenFeetAndInch_WhenZero_ShouldReturnTrue() {
        Feet firstUnit= new Feet(0);
        Inch secondUnit = new Inch(0);
        boolean isEqual = quantityMeasurement.equalComparator(firstUnit, secondUnit);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenInchAndFeet_WhenfirstUnit_ShouldReturnFalse() {
        Inch secondUnit = new Inch(1);
        Feet firstUnit= new Feet(1);
        boolean isEqual = quantityMeasurement.equalComparator(firstUnit, secondUnit);
        Assert.assertFalse(isEqual);
    }

    @Test
    public void givenFeetAndInch_WhenfirstUnit_ShouldReturnFalse() {
        Inch secondUnit = new Inch(1);
        Feet firstUnit= new Feet(1);
        boolean isEqual = quantityMeasurement.equalComparator(secondUnit, firstUnit);
        Assert.assertFalse(isEqual);
    }

    @Test
    public void givenFeetAndInch_WhenProper_ShouldReturnTrue() {
        Feet firstUnit= new Feet(1);
        Inch secondUnit = new Inch(12);
        boolean isEqual = quantityMeasurement.equalComparator(firstUnit, secondUnit);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenInchAndFeet_WhenProper_ShouldReturnTrue() {
        Inch secondUnit = new Inch(12);
        Feet firstUnit= new Feet(1);
        boolean isEqual = quantityMeasurement.equalComparator(secondUnit, firstUnit);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenFeetAndYard_WhenProper_ShouldReturnTrue() {
        Yard secondUnit = new Yard(1);
        Feet firstUnit= new Feet(3);
        boolean isEqual = quantityMeasurement.equalComparator(firstUnit, secondUnit);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenFeetAndYard_WhenfirstUnit_ShouldReturnFalse() {
        Yard secondUnit = new Yard(1);
        Feet firstUnit= new Feet(1);
        boolean isEqual = quantityMeasurement.equalComparator(firstUnit, secondUnit);
        Assert.assertFalse(isEqual);
    }

    @Test
    public void givenInchAndYard_WhenfirstUnit_ShouldReturnFalse() {
        Yard secondUnit = new Yard(1);
        Inch firstUnit= new Inch(1);
        boolean isEqual = quantityMeasurement.equalComparator(firstUnit, secondUnit);
        Assert.assertFalse(isEqual);
    }

    @Test
    public void givenYardAndInch_WhenProper_ShouldReturnTrue() {
        Yard firstUnit = new Yard(1);
        Inch secondUnit= new Inch(36);
        boolean isEqual = quantityMeasurement.equalComparator(firstUnit, secondUnit);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenInchAndYard_WhenProper_ShouldReturnTrue() {
        Inch firstUnit= new Inch(36);
        Yard secondUnit = new Yard(1);
        boolean isEqual = quantityMeasurement.equalComparator(firstUnit, secondUnit);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenYardAndFeet_WhenProper_ShouldReturnTrue() {
        Yard firstUnit = new Yard(1);
        Feet secondUnit= new Feet(3);
        boolean isEqual = quantityMeasurement.equalComparator(firstUnit, secondUnit);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenInchAndCm_WhenProper_ShouldReturnTrue() {
        Inch firstUnit = new Inch(2);
        Centimeters secondUnit= new Centimeters(5);
        boolean isEqual = quantityMeasurement.equalComparator(firstUnit, secondUnit);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenInchAndInch_WhenProper_ShouldReturnAddition() {
        Inch firstUnit = new Inch(2);
        Inch secondUnit= new Inch(2);
        double addition = quantityMeasurement.addition(firstUnit, secondUnit);
        Assert.assertEquals(4,addition,0.0);
    }

    @Test
    public void givenFeetAndInch_WhenProper_ShouldReturnAddition() {
        Feet firstUnit = new Feet(1);
        Inch secondUnit= new Inch(2);
        double addition = quantityMeasurement.addition(firstUnit, secondUnit);
        Assert.assertEquals(14,addition,0.0);
    }

    @Test
    public void givenFeetAndFeet_WhenProper_ShouldReturnAddition() {
        Feet firstUnit = new Feet(1);
        Feet secondUnit= new Feet(1);
        double addition = quantityMeasurement.addition(firstUnit, secondUnit);
        Assert.assertEquals(24,addition,0.0);
    }

    @Test
    public void givenInchAndCm_WhenProper_ShouldReturnAddition() {
        Inch firstUnit = new Inch(2);
        Centimeters secondUnit= new Centimeters(2.5);
        double addition = quantityMeasurement.addition(firstUnit, secondUnit);
        Assert.assertEquals(3,addition,0.0);
    }

    @Test
    public void givenGallonAndLitre_WhenProper_ShouldReturnTrue() {
        Gallon firstUnit = new Gallon(1);
        Litre secondUnit = new Litre(3.78);
        boolean isEqual = quantityMeasurement.equalComparator(firstUnit,secondUnit);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenLitreAndMl_WhenProper_ShouldReturnTrue() {
        Litre firstUnit = new Litre(1);
        Mililitre secondUnit = new Mililitre(1000);
        boolean isEqual = quantityMeasurement.equalComparator(firstUnit,secondUnit);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenGallonAndLitre_WhenProper_ShouldReturnAddition() {
        Gallon firstUnit = new Gallon(1);
        Litre secondUnit= new Litre(3.78);
        double addition = quantityMeasurement.addition(firstUnit, secondUnit);
        Assert.assertEquals(7.57,addition,0.03);
    }
    @Test
    public void givenGallonAndLitre_WhenImProper_ShouldReturnAddition() {
        try {
            Gallon firstUnit = new Gallon(-1);
            Litre secondUnit= new Litre(3.78);
            double addition = quantityMeasurement.addition(firstUnit, secondUnit);
            Assert.assertEquals(7.57,addition,0.03);
        }catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ErrorType.NEGATIVE_VALUE,e.type);
        }
    }

    @Test
    public void givenLitreAndMl_WhenProper_ShouldReturnAddition() {
        Mililitre secondUnit = new Mililitre(1000);
        Litre firstUnit= new Litre(1);
        double addition = quantityMeasurement.addition(firstUnit, secondUnit);
        Assert.assertEquals(2,addition,0.03);
    }

    @Test
    public void givenInchAndMl_WhenProper_ShouldReturnAddition() {
        try {
            Inch secondUnit = new Inch(1000);
            Litre firstUnit= new Litre(1);
            double addition = quantityMeasurement.addition(firstUnit, secondUnit);
        }catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ErrorType.DIFFERENT_UNIT,e.type);
        }

    }

    @Test
    public void givenInchAndMl_WhenNull_ShouldReturnAddition() {
        try {
            Mililitre secondUnit = null;
            Litre firstUnit= new Litre(1);
            double addition = quantityMeasurement.addition(firstUnit, secondUnit);
        }catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ErrorType.NULL_UNIT,e.type);
        }

    }

    @Test
    public void givenKgAndGram_WhenProper_ShouldReturnTrue() {
        Kilogram firstUnit = new Kilogram(1);
        Gram secondUnit = new Gram(1000);
        boolean isEqual = quantityMeasurement.equalComparator(firstUnit,secondUnit);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenTonAndKg_WhenProper_ShouldReturnTrue() {
        Ton firstUnit = new Ton(1);
        Kilogram secondUnit = new Kilogram(1000);
        boolean isEqual = quantityMeasurement.equalComparator(firstUnit,secondUnit);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenInchAndKg_WhenProper_ShouldReturnFalse() {
        Inch firstUnit = new Inch(1);
        Kilogram secondUnit = new Kilogram(1000);
        boolean isEqual = quantityMeasurement.equalComparator(firstUnit,secondUnit);
        Assert.assertFalse(isEqual);
    }

    @Test
    public void givenTonAndKg_WhenImProper_ShouldReturnTrue() {
        try{
        Ton firstUnit = new Ton(1);
        Kilogram secondUnit = new Kilogram(-1000);
        boolean isEqual = quantityMeasurement.equalComparator(firstUnit,secondUnit);
        Assert.assertTrue(isEqual);
        } catch (QuantityMeasurementException e){
            Assert.assertEquals(QuantityMeasurementException.ErrorType.NEGATIVE_VALUE,e.type);
        }
    }

    @Test
    public void givenTonAndGram_WhenProper_ShouldReturnAddition() {
        Ton firstUnit = new Ton(1);
        Gram secondUnit= new Gram(1000);
        double addition = quantityMeasurement.addition(firstUnit, secondUnit);
        Assert.assertEquals(1001,addition,0.03);
    }

    @Test
    public void givenFarenheitAndCelcius_WhenProper_ShouldReturnTrue() {
        Farenheit firstUnit = new Farenheit(212);
        Celcius secondUnit = new Celcius(100);
        boolean isEqual = quantityMeasurement.equalComparator(firstUnit,secondUnit);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void givenFarenheitAndCelcius_WhenImProper_ShouldReturnTrue() {
        Farenheit firstUnit = new Farenheit(-148);
        Celcius secondUnit = new Celcius(-100);
        boolean isEqual = quantityMeasurement.equalComparator(firstUnit,secondUnit);
        Assert.assertTrue(isEqual);
    }
}
