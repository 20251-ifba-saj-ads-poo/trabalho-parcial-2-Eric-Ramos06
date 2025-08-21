package br.edu.ifba.saj.fwads.model;

import java.util.UUID;

public class Ponto  extends AbstractModel<UUID>{
    private String nome;
    private String endereco;

    public Ponto(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
