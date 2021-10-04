package com.pedrobassetto.orderandpaymentservice.entity;

import java.math.BigDecimal;

public class Payment {

    private Integer idTransacao;
    private String numCartao;
    private String dtValidCartao;
    private BigDecimal vlrCompra;
    private String bandeira;

    public Payment(Integer idTransacao, String numCartao, String dtValidCartao, BigDecimal vlrCompra, String bandeira) {
        this.idTransacao = idTransacao;
        this.numCartao = numCartao;
        this.dtValidCartao = dtValidCartao;
        this.vlrCompra = vlrCompra;
        this.bandeira = bandeira;
    }

    public Integer getIdTransacao() {
        return idTransacao;
    }

    public void setIdTransacao(Integer idTransacao) {
        this.idTransacao = idTransacao;
    }

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public String getDtValidCartao() {
        return dtValidCartao;
    }

    public void setDtValidCartao(String dtValidCartao) {
        this.dtValidCartao = dtValidCartao;
    }

    public BigDecimal getVlrCompra() {
        return vlrCompra;
    }

    public void setVlrCompra(BigDecimal vlrCompra) {
        this.vlrCompra = vlrCompra;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }
}
