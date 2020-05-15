package com.bl.QuantityMeasurement.model;

public class Celcius extends TempUnit{
    public Celcius(double temp) {
        super(temp,TempUnit.UnitType.C);
    }
}
