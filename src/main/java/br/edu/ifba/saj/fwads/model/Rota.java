package br.edu.ifba.saj.fwads.model;
import java.util.List;

public class Rota extends AbstractModel{
    private int id;
    private String PontoI;
    private String PontoF;
    private List<String> Paradas;

    public Rota(int id, String PontoI, String PontoF, List<String> Paradas) {
        this.id = id;
        this.PontoI = PontoI;
        this.PontoF = PontoF;
        this.Paradas = Paradas;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setPontoI(String pontoI) {
        PontoI = pontoI;
    }

    public String getPontoI() {
        return PontoI;
    }

    public void setPontoF(String pontoF) {
        PontoF = pontoF;
    }

    public String getPontoF() {
        return PontoF;
    }

    public void setParadas(List<String> paradas) {
        Paradas = paradas;
    }

    public List<String> getParadas() {
        return Paradas;
    }
}
