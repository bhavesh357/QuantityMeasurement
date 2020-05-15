package com.bl.QuantityMeasurement.model;

import java.util.Objects;

public class Feet {
    public int length;

    public Feet() {
    }

    public Feet(int length) {
        this.length=length;
    }

    @Override
    public boolean equals(Object o) {
        if(o== null){
            return false;
        }
        if(o == this){
            return true;
        }
        Feet feet = (Feet) o;
        return length == feet.length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length);
    }
}
