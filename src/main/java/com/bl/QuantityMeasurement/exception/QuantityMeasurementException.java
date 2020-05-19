package com.bl.QuantityMeasurement.exception;

public class QuantityMeasurementException extends RuntimeException {
    public ErrorType type;
    public QuantityMeasurementException(ErrorType negativeValue) {
        type = negativeValue;
    }

    /**
     * enum to store error type
     */
    public enum ErrorType {
        NEGATIVE_VALUE,NULL_UNIT, DIFFERENT_UNIT;
    }
}
