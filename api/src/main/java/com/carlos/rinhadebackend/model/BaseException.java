package com.carlos.rinhadebackend.model;

import org.springframework.http.HttpStatus;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseException extends RuntimeException {
    private HttpStatus status = HttpStatus.BAD_REQUEST;
    private final List<Error> errors = new ArrayList<>();


    public BaseException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
