package br.edu.ifba.saj.fwads.controller;

import br.edu.ifba.saj.fwads.Dados;
import br.edu.ifba.saj.fwads.model.Ponto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class CadPontoController {

    @FXML
    private TextField txEndereco;

    @FXML
    void salvarPonto(ActionEvent event) {
        Ponto novoPonto = new Ponto(txEndereco.getText());

        new Alert(AlertType.INFORMATION, 
    "Cadastrando Ponto: " + novoPonto.getEndereco()).showAndWait();

        Dados.listaPonto.add(novoPonto);
        limparTela();

      

    }
    
    
    @FXML
    private void limparTela() {
        txEndereco.setText("");
        
    }
}