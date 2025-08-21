package br.edu.ifba.saj.fwads.model;
import java.time.LocalDateTime;
import java.util.UUID;

public class Linha  extends AbstractModel<UUID>{

    private Onibus onibus;
    private Motorista motorista;
    private Itinerario itinerario;

    Linha (Onibus onibus, Motorista motorista, Itinerario itinerario) {
        this.onibus = onibus;
        this.motorista = motorista;
        this.itinerario = itinerario;
        this.setCreatedAt(LocalDateTime.now());
        this.setUpdatedAt(LocalDateTime.now());
    }

    public Onibus getOnibus() {
        return onibus;
    }
    public void setOnibus(Onibus onibus) {
        this.onibus = onibus;
    }
    public Motorista getMotorista() {
        return motorista;
    }
    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }
    public Itinerario getItinerario() {
        return itinerario;
    }
    public void setItinerario(Itinerario itinerario) {
        this.itinerario = itinerario;
    }
    
}