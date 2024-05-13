package com.carlos.rinhadebackend.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Positive;

@Entity
@Table(name = "CLIENTES")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "SALDO", nullable = false)
    @Positive
    private Integer saldo;
    @Column(name = "LIMITE", nullable = false)
    private Integer limite;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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


    public void saque(Integer valor) {
        if (this.saldo < valor){
            throw new TransacaoException();
        }
        this.saldo -= valor;
    }

    public void deposito(Integer valor) {
        this.saldo += valor;
    }
}
