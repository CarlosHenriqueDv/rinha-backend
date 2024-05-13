package com.carlos.rinhadebackend.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "TRANSACOES")
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "VALOR", nullable = false)
    private int valor;
    @Enumerated
    @Column(name = "TIPO")
    private Tipo tipo;
    @Column(name = "DESCRICAO",length = 10, nullable = false)
    private String descricao;

    @Column(name = "DATA_TRANSACAO")
    private LocalDateTime dataTransacao;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
