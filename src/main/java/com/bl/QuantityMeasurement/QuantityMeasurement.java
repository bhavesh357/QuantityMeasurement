package com.bl.QuantityMeasurement;

public class QuantityMeasurement {
    public boolean compareFeetAndInches(int feet, int inches) {
        if(feet == 12*inches) {
            return true;
        }
        return false;
    }
}
