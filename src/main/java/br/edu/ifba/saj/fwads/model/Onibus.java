package br.edu.ifba.saj.fwads.model;

public class Onibus extends AbstractModel{
    private String placa;
    private motorista Motorista ;


    public Onibus(String placa) {
        this.placa = placa;
    }

    public void setMotorista(motorista motorista) {
        Motorista = motorista;
    }
    public motorista getMotorista() {
        return Motorista;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    } 
    public String getPlaca() {
        return placa;
    }

}
