
package br.edu.ifba.saj.fwads.controller;

import br.edu.ifba.saj.fwads.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class LoginController {

    @FXML
    private PasswordField txSenha;

    @FXML
    private TextField txUsuario;

    @FXML
    void entrar(ActionEvent event) {
        if(txUsuario.getText().equals("admin") && txSenha.getText().equals("admin")){
            new Alert(AlertType.INFORMATION, "Usuário e senha corretos").showAndWait();
            App.setRoot("controller/Master.fxml");
            }else if(txUsuario.getText().equals("") && txSenha.getText().equals("")){
            new Alert(AlertType.INFORMATION, "Entrando como visitante").showAndWait();
            App.setRoot("controller/Master.fxml");
        }
        else{
            new Alert(AlertType.ERROR, "Usuário ou senha inválidos").show();
        }
    }

    @FXML
    void limparCampos(ActionEvent event) {
        txUsuario.setText("");
        txSenha.setText("");
    }

}

