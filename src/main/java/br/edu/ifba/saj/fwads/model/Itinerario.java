package br.edu.ifba.saj.fwads.model;

public class Itinerario extends AbstractModel{
    private int id;
    private int horaInicio;
    private Rota rota;

    public Itinerario(int id, int horaInicio, Rota rota) {
        this.id = id;
        this.horaInicio = horaInicio;
        this.rota = rota;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getHoraInicio() {
        return horaInicio;
    }
    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }
    public Rota getRota() {
        return rota;
    }
    public void setRota(Rota rota) {
        this.rota = rota;
    }
}
