package com.bl.QuantityMeasurement.model;

import java.util.Objects;

public class Feet {
    public int length;

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
        if(this.getClass() != o.getClass()){
            return false;
        }
        Feet feet = (Feet) o;
        return length == feet.length;
    }
}
