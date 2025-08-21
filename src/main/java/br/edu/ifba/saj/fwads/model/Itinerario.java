package br.edu.ifba.saj.fwads.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Itinerario  extends AbstractModel<UUID>{
    private LocalDateTime horaPartida;
    private Rota rota;

    public Itinerario(LocalDateTime horaPartida, Rota rota) {
        this.horaPartida = horaPartida;
        this.rota = rota;
        this.setCreatedAt(LocalDateTime.now());
        this.setUpdatedAt(LocalDateTime.now());
    }

    public LocalDateTime getHoraPartida() {
        return horaPartida;
    }    
    public void setHoraPartida(LocalDateTime horaPartida) {
        this.horaPartida = horaPartida;
    }

    public Rota getRota() {
        return rota;
    }
    public void setRota(Rota rota) {
        this.rota = rota;
    }

}
