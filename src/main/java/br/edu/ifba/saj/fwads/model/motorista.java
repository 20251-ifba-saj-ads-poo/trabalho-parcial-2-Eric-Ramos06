package br.edu.ifba.saj.fwads.model;

public class motorista extends AbstractModel{
    private String nome;
    private String cpf;
    private Onibus onibus;

    public motorista(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void setOnibus(Onibus onibus) {
    this.onibus = onibus;
}
    public Onibus getOnibus() {
        return onibus;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    
    
}
