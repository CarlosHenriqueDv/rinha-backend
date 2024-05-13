package com.carlos.rinhadebackend.model;

import org.springframework.http.HttpStatus;

public class TransacaoException extends BaseException {



    public TransacaoException() {
        super("Transação não permitida", HttpStatus.UNPROCESSABLE_ENTITY);
    }
}
