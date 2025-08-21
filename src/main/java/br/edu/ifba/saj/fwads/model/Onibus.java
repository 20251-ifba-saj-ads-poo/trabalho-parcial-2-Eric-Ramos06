package br.edu.ifba.saj.fwads.model;

import java.util.UUID;

public class Onibus extends AbstractModel<UUID>{
    private String placa;

    public Onibus(String placa) {
        this.placa = placa;
        this.setCreatedAt(java.time.LocalDateTime.now());
        this.setUpdatedAt(java.time.LocalDateTime.now());
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
