package com.pedrobassetto.orderandpaymentservice.dto;

import java.math.BigDecimal;
import java.util.List;

public class OrderDTO {

    private String email;
    private String nomeCompleto;
    private String shippingAddress;
    private Integer idPedido;
    private List<String> dscPedido;
    private String qtdItensPedido;
    private List<BigDecimal> vlrUnitario;
    private BigDecimal vlrTotal;
    private String formaPagamento;
    private String dtPedido;
    private String statusPedido;
    private String idTransacao;
    private String numCartao;
    private String validadeCartao;
    private String bandeira;

    public OrderDTO(String email,
                    String nomeCompleto,
                    String shippingAddress,
                    Integer idPedido,
                    List<String> dscPedido,
                    String qtdItensPedido,
                    List<BigDecimal> vlrUnitario,
                    BigDecimal vlrTotal,
                    String formaPagamento,
                    String dtPedido,
                    String statusPedido,
                    String idTransacao,
                    String numCartao,
                    String validadeCartao,
                    String bandeira) {
        this.email = email;
        this.nomeCompleto = nomeCompleto;
        this.shippingAddress = shippingAddress;
        this.idPedido = idPedido;
        this.dscPedido = dscPedido;
        this.qtdItensPedido = qtdItensPedido;
        this.vlrUnitario = vlrUnitario;
        this.vlrTotal = vlrTotal;
        this.formaPagamento = formaPagamento;
        this.dtPedido = dtPedido;
        this.statusPedido = statusPedido;
        this.idTransacao = idTransacao;
        this.numCartao = numCartao;
        this.validadeCartao = validadeCartao;
        this.bandeira = bandeira;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public List<String> getDscPedido() {
        return dscPedido;
    }

    public void setDscPedido(List<String> dscPedido) {
        this.dscPedido = dscPedido;
    }

    public String getQtdItensPedido() {
        return qtdItensPedido;
    }

    public void setQtdItensPedido(String qtdItensPedido) {
        this.qtdItensPedido = qtdItensPedido;
    }

    public List<BigDecimal> getVlrUnitario() {
        return vlrUnitario;
    }

    public void setVlrUnitario(List<BigDecimal> vlrUnitario) {
        this.vlrUnitario = vlrUnitario;
    }

    public BigDecimal getVlrTotal() {
        return vlrTotal;
    }

    public void setVlrTotal(BigDecimal vlrTotal) {
        this.vlrTotal = vlrTotal;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getDtPedido() {
        return dtPedido;
    }

    public void setDtPedido(String dtPedido) {
        this.dtPedido = dtPedido;
    }

    public String getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(String statusPedido) {
        this.statusPedido = statusPedido;
    }

    public String getIdTransacao() {
        return idTransacao;
    }

    public void setIdTransacao(String idTransacao) {
        this.idTransacao = idTransacao;
    }

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public String getValidadeCartao() {
        return validadeCartao;
    }

    public void setValidadeCartao(String validadeCartao) {
        this.validadeCartao = validadeCartao;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }
}
