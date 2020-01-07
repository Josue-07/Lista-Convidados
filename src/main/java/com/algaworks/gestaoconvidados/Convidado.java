package com.algaworks.gestaoconvidados;

public class Convidado {
    private String nome;
    private int quantidadeDeAcompanhantes;

    public Convidado() {
    }

    public Convidado(String nome, int quantidadeDeAcompanhantes) {
        this.nome = nome;
        this.quantidadeDeAcompanhantes = quantidadeDeAcompanhantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeDeAcompanhantes() {
        return quantidadeDeAcompanhantes;
    }

    public void setQuantidadeDeAcompanhantes(int quantidadeDeAcompanhantes) {
        this.quantidadeDeAcompanhantes = quantidadeDeAcompanhantes;
    }

}