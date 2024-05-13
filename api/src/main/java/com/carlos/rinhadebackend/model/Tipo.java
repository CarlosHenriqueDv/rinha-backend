package com.carlos.rinhadebackend.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Tipo {

    CREDITO("c"),
    DEBITO("d");

    private String label;

    Tipo(String label) {
        this.label = label;
    }


    @JsonValue
    public String getLabel() {
        return label;
    }
}
