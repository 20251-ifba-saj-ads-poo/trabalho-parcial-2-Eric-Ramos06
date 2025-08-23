package br.edu.ifba.saj.fwads.controller;

import br.edu.ifba.saj.fwads.Dados;
import br.edu.ifba.saj.fwads.model.Rota;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CadRotaController {

    @FXML
    private TextField txOrigem;

    @FXML
    private TextField txDestino;

    @FXML
    private Label lbOrigem;

    @FXML
    private Label lbDestino;

    @FXML
    private void salvarRota() {
        Rota novaRota = new Rota(txOrigem.getText(), txDestino.getText());
        new Alert(AlertType.INFORMATION,
                "Cadastrando Rota:" + novaRota.getOrigem() + " - " + novaRota.getDestino()).showAndWait();
        Dados.listaRotas.add(novaRota);
        limparTela();
    }
    @FXML
    private void limparTela() {
        txOrigem.setText("");
        txDestino.setText("");
    }

}