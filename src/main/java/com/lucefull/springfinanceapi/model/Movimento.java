package com.lucefull.springfinanceapi.model;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tab_movimentos", schema = "finance")
public class Movimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMovimento;
    private String descricao;
    private Date dataMovimento;
    private float valor;
    private String categoria;
    @OneToMany
    @JoinColumn(name = "id_movimento", insertable = false, updatable = false)
    private Set<Parcela> parcelas;
    // private EStatus status;
    @ManyToOne
    @JoinColumn(name = "cartao", nullable = false)
    private Cartao cartao;

    public Movimento() {
    }

    public Movimento(long idMovimento, String descricao, Date dataMovimento, float valor, String categoria,
            Set<Parcela> parcelas, Cartao cartao) {
        this.idMovimento = idMovimento;
        this.descricao = descricao;
        this.dataMovimento = dataMovimento;
        this.valor = valor;
        this.categoria = categoria;
        this.parcelas = parcelas;
        this.cartao = cartao;
    }

    public long getidMovimento() {
        return idMovimento;
    }

    public void setidMovimento(long idMovimento) {
        this.idMovimento = idMovimento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataMovimento() {
        return dataMovimento;
    }

    public void setDataMovimento(Date dataMovimento) {
        this.dataMovimento = dataMovimento;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Set<Parcela> getParcelas() {
        return parcelas;
    }

    public void setParcelas(Set<Parcela> parcelas) {
        this.parcelas = parcelas;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

}
