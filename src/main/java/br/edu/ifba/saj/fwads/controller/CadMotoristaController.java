package br.edu.ifba.saj.fwads.controller;

import br.edu.ifba.saj.fwads.Dados;
import br.edu.ifba.saj.fwads.model.Motorista;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.BooleanBinding;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class CadMotoristaController {
    @FXML
    private TextField txNome;

    @FXML
    private TextField txCPF;

    @FXML
    private Button btnSalvar;

    @FXML
    void salvarMotorista() {
        Motorista novoMotorista = new Motorista(txNome.getText(),txCPF.getText());
        new Alert(AlertType.INFORMATION,
                "Cadastrando Motorista: " + novoMotorista.getNome() + " - " + novoMotorista.getCpf()).showAndWait();
        Dados.listaMotorista.add(novoMotorista);
        limparTela();

}

    @FXML
    private void initialize() {
    BooleanBinding camposInvalidos = Bindings.createBooleanBinding(
            () -> txNome.getText() == null
                   || txNome.getText().trim().isEmpty()
                   || txCPF.getText() == null
                   || txCPF.getText().trim().isEmpty(),
            txNome.textProperty(),
            txCPF.textProperty()
        );

        btnSalvar.disableProperty().bind(camposInvalidos);
    }


    @FXML
    private void limparTela() {
        txNome.setText("");
        txCPF.setText("");
        
    }
}

