package com.ufcg.si1.model;

public class Lote {

    private long id;
    private Produto produto;
    private int numeroDeItens;
    private String dataDeValidade;

    public Lote() {
        this.id = 0;
    }

    public Lote(Produto produto, int numeroDeItens, String dataDeValidade) {
        super();
        this.produto = produto;
        this.numeroDeItens = numeroDeItens;
        this.dataDeValidade = dataDeValidade;
    }

    public Lote(long id, Produto produto, int numeroDeItens, String dataDeValidade) {
        this.id = id;
        this.produto = produto;
        this.numeroDeItens = numeroDeItens;
        this.dataDeValidade = dataDeValidade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getNumeroDeItens() {
        return numeroDeItens;
    }

    public void setNumeroDeItens(int numeroDeItens) {
        this.numeroDeItens = numeroDeItens;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    @Override
    public String toString() {
        return "Lote{" +
                "id=" + id +
                ", produto=" + produto.getId() +
                ", numeroDeItens=" + numeroDeItens +
                ", dataDeValidade='" + dataDeValidade + '\'' +
                '}';
    }
}
