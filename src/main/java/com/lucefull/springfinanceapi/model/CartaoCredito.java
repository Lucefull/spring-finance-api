package com.lucefull.springfinanceapi.model;

import java.util.Date;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tab_cartoes_credito", schema = "finance")
@DiscriminatorValue("C")
public class CartaoCredito extends Cartao {
    private int diaFechamento;
    private int vencimentoFatura;
    private float limiteTotal;
    private float limiteDisponivel;
    private float limiteUtilizado;

    public CartaoCredito() {
    }

    public CartaoCredito(int diaFechamento, int vencimentoFatura, float limiteTotal,
            float limiteDisponivel, float limiteUtilizado) {
        this.diaFechamento = diaFechamento;
        this.vencimentoFatura = vencimentoFatura;
        this.limiteTotal = limiteTotal;
        this.limiteDisponivel = limiteDisponivel;
        this.limiteUtilizado = limiteUtilizado;
    }

    public CartaoCredito(long idCartao, String tipoCartao, Date dataValidade, String nomeCarto, int finalCartao,
            String bandeira, String banco, String usuario, int diaFechamento, int vencimentoFatura,
            float limiteTotal, float limiteDisponivel, float limiteUtilizado) {
        super(idCartao, tipoCartao, dataValidade, nomeCarto, finalCartao, bandeira, banco, usuario);
        this.diaFechamento = diaFechamento;
        this.vencimentoFatura = vencimentoFatura;
        this.limiteTotal = limiteTotal;
        this.limiteDisponivel = limiteDisponivel;
        this.limiteUtilizado = limiteUtilizado;
    }

    public int getDiaFechamento() {
        return diaFechamento;
    }

    public void setDiaFechamento(int diaFechamento) {
        this.diaFechamento = diaFechamento;
    }

    public int getVencimentoFatura() {
        return vencimentoFatura;
    }

    public void setVencimentoFatura(int vencimentoFatura) {
        this.vencimentoFatura = vencimentoFatura;
    }

    public float getLimiteTotal() {
        return limiteTotal;
    }

    public void setLimiteTotal(float limiteTotal) {
        this.limiteTotal = limiteTotal;
    }

    public float getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void setLimiteDisponivel(float limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }

    public float getLimiteUtilizado() {
        return limiteUtilizado;
    }

    public void setLimiteUtilizado(float limiteUtilizado) {
        this.limiteUtilizado = limiteUtilizado;
    }

}
