package com.carlos.rinhadebackend.dto;


import java.util.List;

public class ExtratoDto {

    private SaldoDto saldoDto;
    private List<TransacaoDto> ultimasTransacoes;

    public ExtratoDto(SaldoDto saldo, List<TransacaoDto> transacoes){
        this.saldoDto = saldo;
        this.ultimasTransacoes = transacoes;
    }


    public SaldoDto getSaldo() {
        return saldoDto;
    }

    public void setSaldo(SaldoDto saldoDto) {
        this.saldoDto = saldoDto;
    }

    public List<TransacaoDto> getUltimasTransacoes() {
        return ultimasTransacoes;
    }

    public void setUltimasTransacoes(List<TransacaoDto> ultimasTransacoes) {
        this.ultimasTransacoes = ultimasTransacoes;
    }
}
