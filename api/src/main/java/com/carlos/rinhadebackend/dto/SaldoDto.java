package com.carlos.rinhadebackend.dto;

import java.time.LocalDateTime;

public class SaldoDto {

    private Integer total;
    private LocalDateTime dataHoraExtrato;
    private Integer limite;



    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public LocalDateTime getDataHoraExtrato() {
        return dataHoraExtrato;
    }

    public void setDataHoraExtrato(LocalDateTime dataHoraExtrato) {
        this.dataHoraExtrato = dataHoraExtrato;
    }

    public Integer getLimite() {
        return limite;
    }

    public void setLimite(Integer limite) {
        this.limite = limite;
    }
}
