package com.carlos.rinhadebackend.dto;

import com.carlos.rinhadebackend.model.Cliente;

public class ClienteDto {

    private Integer saldo;
    private Integer limite;

    public ClienteDto(Cliente cliente) {
        this.saldo = cliente.getSaldo();
        this.limite = cliente.getLimite();
    }

    public ClienteDto(Integer saldo, Integer limite){
        this.saldo = saldo;
        this.limite = limite;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public Integer getLimite() {
        return limite;
    }

    public void setLimite(Integer limite) {
        this.limite = limite;
    }
}
