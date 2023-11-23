package com.lucefull.springfinanceapi.model;

import java.util.Date;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tab_cartoes_debito", schema = "finance")
@DiscriminatorValue("D")
public class CartaoDebito extends Cartao {

    private float saldo;
    private int agencia;
    private int conta;
    private int digito;

    public CartaoDebito() {
    }

    public CartaoDebito(float saldo, int agencia, int conta, int digito) {
        this.saldo = saldo;
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
    }

    public CartaoDebito(long idCartao, String tipoCartao, Date dataValidade, String nomeCarto, int finalCartao,
            String bandeira, String banco, String usuario, float saldo, int agencia, int conta, int digito) {
        super(idCartao, tipoCartao, dataValidade, nomeCarto, finalCartao, bandeira, banco, usuario);
        this.saldo = saldo;
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getDigito() {
        return digito;
    }

    public void setDigito(int digito) {
        this.digito = digito;
    }

}
