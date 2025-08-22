package br.edu.ifba.saj.fwads.controller;

import br.edu.ifba.saj.fwads.Dados;
import br.edu.ifba.saj.fwads.model.Motorista;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class CadMotoristaController {
    @FXML
    private TextField txNome;
    @FXML
    private TextField txCPF;
    @FXML
    void salvarMotorista(ActionEvent event) {
        Motorista novoMotorista = new Motorista(txNome.getText(),
                                                txCPF.getText());

        new Alert(AlertType.INFORMATION, 
    "Cadastrando Motorista: " + novoMotorista.getNome()).showAndWait();

        Dados.listaMotorista.add(novoMotorista);
        limparTela();

      

    }
    
    @FXML
    private void limparTela() {
        txNome.setText("");
        txCPF.setText("");
        
    }
}