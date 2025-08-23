package br.edu.ifba.saj.fwads.controller;

import br.edu.ifba.saj.fwads.Dados;
import br.edu.ifba.saj.fwads.model.Rota;
import br.edu.ifba.saj.fwads.model.Ponto;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.util.StringConverter;

public class CadRotaController {

    @FXML
    private TextField txNome;

    @FXML
    private TextField txPontoInitial;

    @FXML
    private TextField txPontoFinal;

    @FXML
    private ChoiceBox<Ponto> slPonto;

    @FXML
    private void salvarRota() {

        String nome = txNome.getText();
        Ponto pontoInicial = slPonto.getValue();
        Ponto pontoFinal = slPonto.getValue();
        Rota novaRota = new Rota(nome,pontoInicial, pontoFinal, Dados.listaPonto);

        if (nome == null || nome.trim().isEmpty()) {
        new Alert(AlertType.WARNING, "O nome da rota não pode estar vazio.").showAndWait();
        return;
    }

    if (pontoInicial == null || pontoFinal == null) {
        new Alert(AlertType.WARNING, "Selecione os pontos inicial e final da rota.").showAndWait();
        return;
    }

    else if (Dados.listaPonto == null || Dados.listaPonto.isEmpty()) {
        new Alert(AlertType.ERROR, "Não há pontos cadastrados no sistema.").showAndWait();
        return;
    }
        new Alert(AlertType.INFORMATION,
                "Cadastrando Rota:" + novaRota.getNome() + " - " + novaRota.getPontoInitial().getEndereco() + " a " + novaRota.getPontoFinal().getEndereco()).showAndWait();
        Dados.listaRota.add(novaRota);
        limparTela();
        
    }
    @FXML 
    private void initialize() {
        slPonto.setConverter(new StringConverter<Ponto>() {
            @Override
            public String toString(Ponto obj) {
                if (obj != null) {
                    return obj.getEndereco();
                }
                return "";
            }

            @Override
            public Ponto fromString(String stringPonto) {
                return Dados.listaPonto
                    .stream()
                    .filter(ponto -> stringPonto.equals(ponto.getEndereco()))
                    .findAny()
                    .orElse(null);                
            }
        });

        carregarListaPontos();
    }


    @FXML
    private void limparTela() {
        txPontoInitial.setText("");
        txPontoFinal.setText("");
    }

    private void carregarListaPontos() {
        slPonto.setItems(Dados.listaPonto);
    }
}
