package com.lucefull.springfinanceapi.model;

import java.util.Date;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name = "tab_cartoes", schema = "finance")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tpCartao", discriminatorType = DiscriminatorType.STRING)
public class Cartao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCartao;
    private String tipoCartao;
    private Date dataValidade;
    private String nomeCarto;
    private int finalCartao;
    private String bandeira;
    private String banco;
    private String usuario;

    public Cartao() {
    }

    public Cartao(long idCartao, String tipoCartao, Date dataValidade, String nomeCarto, int finalCartao,
            String bandeira, String banco, String usuario) {
        this.idCartao = idCartao;
        this.tipoCartao = tipoCartao;
        this.dataValidade = dataValidade;
        this.nomeCarto = nomeCarto;
        this.finalCartao = finalCartao;
        this.bandeira = bandeira;
        this.banco = banco;
        this.usuario = usuario;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public long getIdCartao() {
        return idCartao;
    }

    public void setIdCartao(long idCartao) {
        this.idCartao = idCartao;
    }

    public String getTipoCartao() {
        return tipoCartao;
    }

    public void setTipoCartao(String tipoCartao) {
        this.tipoCartao = tipoCartao;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getNomeCarto() {
        return nomeCarto;
    }

    public void setNomeCarto(String nomeCarto) {
        this.nomeCarto = nomeCarto;
    }

    public int getFinalCartao() {
        return finalCartao;
    }

    public void setFinalCartao(int finalCartao) {
        this.finalCartao = finalCartao;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

}
