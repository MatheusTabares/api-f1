package com.api.icarros.f1.services.exceptions;

public class NotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public static final String F1_RACE_RESULT_NOT_FOUND_EXCEPTION = "F1_RACE_RESULT_NOT_FOUND_EXCEPTION";

    public NotFoundException(String msg) {
        super(msg);
    }

    public NotFoundException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
