package br.edu.ifba.saj.fwads.model;

import java.util.UUID;

public class Motorista  extends AbstractModel<UUID>{
    private String nome;
    private String cpf;
    
    public Motorista(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.setCreatedAt(java.time.LocalDateTime.now());
        this.setUpdatedAt(java.time.LocalDateTime.now());
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
