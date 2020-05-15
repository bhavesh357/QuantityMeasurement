package com.bl.QuantityMeasurement.model;

public class Inch{
    public int length;

    public Inch(int length) {
        this.length=length;
    }

    @Override
    public boolean equals(Object o) {

        Inch inch = (Inch) o;
        return length == inch.length;
    }
}
