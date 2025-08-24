package br.edu.ifba.saj.fwads.controller;


import br.edu.ifba.saj.fwads.Dados;
import br.edu.ifba.saj.fwads.model.Itinerario;
import br.edu.ifba.saj.fwads.model.Rota;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.util.StringConverter;

public class CadItinerarioController {

    @FXML
    private TextField txNome;

    @FXML
    private TextField txHoraPartida;

    @FXML
    private ChoiceBox<Rota> slRota;
    @FXML
    private void salvarItinerario() {
        String nome = txNome.getText();
        String horaPartida = txHoraPartida.getText();
        Rota rota = slRota.getValue();
        Itinerario novaItinerario = new Itinerario(nome, horaPartida, rota);
        new Alert(AlertType.INFORMATION,
                "Cadastrando Itinerário:" + novaItinerario.getNome() + " - " + novaItinerario.getHoraPartida() + " - " + novaItinerario.getRota().getNome()).showAndWait();
        Dados.listaItinerario.add(novaItinerario);
        limparTela();

    }
    @FXML 
    private void initialize() {
        slRota.setConverter(new StringConverter<Rota>() {
            @Override
            public String toString(Rota obj) {
                if (obj != null) {
                    return obj.getNome();
                }
                return "";
            }

            @Override
            public Rota fromString(String stringRota) {
                return Dados.listaRota
                    .stream()
                    .filter(rota -> stringRota.equals(rota.getNome()))
                    .findAny()
                    .orElse(null);                
            }
        });

        carregarListaRotas();
    }


    @FXML
    private void limparTela() {
        txNome.setText("");
        txHoraPartida.setText("");
    }

    private void carregarListaRotas() {
        slRota.setItems(Dados.listaRota);
    }
}
