package br.edu.ifba.saj.fwads.model;

import java.util.List;
import java.util.UUID;

public class Rota extends AbstractModel<UUID> {

    private Ponto pontoInitial;
    private Ponto pontoFinal;
    private List<Ponto> paradas;

    public Rota(Ponto pontoInitial, Ponto pontoFinal, List<Ponto> paradas) {
        this.pontoInitial = pontoInitial;
        this.pontoFinal = pontoFinal;
        this.paradas = paradas;
        this.setCreatedAt(java.time.LocalDateTime.now());
        this.setUpdatedAt(java.time.LocalDateTime.now());
    }

    public Ponto getPontoInitial() {
        return pontoInitial;
    }
    public void setPontoInitial(Ponto pontoInitial) {
        this.pontoInitial = pontoInitial;
    }
    public Ponto getPontoFinal() {
        return pontoFinal;
    }
    public void setPontoFinal(Ponto pontoFinal) {
        this.pontoFinal = pontoFinal;
    }
    public List<Ponto> getParadas() {
        return paradas;
    }
    public void setParadas(List<Ponto> paradas) {
        this.paradas = paradas;
    }
    
}
