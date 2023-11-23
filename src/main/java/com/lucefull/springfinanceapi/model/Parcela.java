package com.lucefull.springfinanceapi.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tab_parcelas", schema = "finance")
public class Parcela {
    @Id
    @ManyToOne
    @JoinColumn(name = "id_movimento", nullable = false)
    private Movimento idMovimento;
    @Id
    private int numeroParcela;
    private Date dataPagamento;
    private float valorParcela;

    public Parcela() {
    }

    public Parcela(Movimento idMovimento, int numeroParcela, Date dataPagamento, float valorParcela) {
        this.idMovimento = idMovimento;
        this.numeroParcela = numeroParcela;
        this.dataPagamento = dataPagamento;
        this.valorParcela = valorParcela;
    }

    public Movimento getIdMovimento() {
        return idMovimento;
    }

    public void setIdMovimento(Movimento idMovimento) {
        this.idMovimento = idMovimento;
    }

    public int getNumeroParcela() {
        return numeroParcela;
    }

    public void setNumeroParcela(int numeroParcela) {
        this.numeroParcela = numeroParcela;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public float getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(float valorParcela) {
        this.valorParcela = valorParcela;
    }

}
