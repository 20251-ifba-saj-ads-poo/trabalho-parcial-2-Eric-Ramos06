package br.edu.ifba.saj.fwads.model;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Itinerario  extends AbstractModel<UUID>{
    private String horaPartida;
    private List<Rota> Rotass;


    public Itinerario(String horaPartida, ArrayList<Rota> rotas) {
        this.horaPartida = horaPartida;
        this.Rotass = new ArrayList<>(rotas);
        this.setCreatedAt(LocalDateTime.now());
        this.setUpdatedAt(LocalDateTime.now());
    }

    public String getHoraPartida() {
        return horaPartida;
    }    
    public void setHoraPartida(String horaPartida) {
        this.horaPartida = horaPartida;
    }

    public List<Rota> getRotas() {
        return Rotass;
    }
    public void setRotas(List<Rota> rotas) {
        Rotass = rotas;
    }

}
