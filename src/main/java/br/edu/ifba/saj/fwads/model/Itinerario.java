package br.edu.ifba.saj.fwads.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Itinerario  extends AbstractModel<UUID>{
    private LocalDateTime horaPartida;
    private Rota rota;
}
