package br.edu.ifba.saj.fwads.controller;

import br.edu.ifba.saj.fwads.Dados;
import br.edu.ifba.saj.fwads.model.Onibus;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CadOnibusController {

    @FXML
    private TextField txPlaca;

    @FXML
    private Label lbPlaca;


    @FXML
    private void salvarOnibus() {
        Onibus novoOnibus = new Onibus(txPlaca.getText());
        new Alert(AlertType.INFORMATION,
                "Cadastrando Ônibus:" + novoOnibus.getPlaca()).showAndWait();
        Dados.listaOnibus.add(novoOnibus);
        limparTela();
    }
    @FXML
    private void limparTela() {
        txPlaca.setText("");
    }

}
