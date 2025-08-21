package br.edu.ifba.saj.fwads.model;

import java.util.List;
import java.util.UUID;

public class Rota extends AbstractModel<UUID> {

    private Ponto pontoInitial;
    private Ponto pontoFinal;
    private List<Ponto> paradas;
}
