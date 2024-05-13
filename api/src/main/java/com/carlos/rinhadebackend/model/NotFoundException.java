package com.carlos.rinhadebackend.model;

import org.springframework.http.HttpStatus;

public class NotFoundException extends BaseException{
    public NotFoundException(String message, HttpStatus status) {
        super(message, status);
    }


    public NotFoundException() {
        super("Nada encontrado", HttpStatus.NOT_FOUND);
    }
}
