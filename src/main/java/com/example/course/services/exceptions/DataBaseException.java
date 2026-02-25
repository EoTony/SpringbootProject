package com.example.course.services.exceptions;

import java.io.Serial;

public class DataBaseException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = -3834342693170430857L;

    public DataBaseException(String message) {
        super(message);
    }
}
