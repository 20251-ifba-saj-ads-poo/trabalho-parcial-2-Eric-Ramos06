package br.edu.ifba.saj.fwads.controller;

import br.edu.ifba.saj.fwads.Dados;
import br.edu.ifba.saj.fwads.model.Itinerario;
import br.edu.ifba.saj.fwads.model.Linha;
import br.edu.ifba.saj.fwads.model.Ponto;
import br.edu.ifba.saj.fwads.model.Rota;
import javafx.fxml.FXML;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.Region;

import java.util.stream.Collectors;

public class ShowLinhasVisuController{

    @FXML
    private ListView<Linha> listViewLinhas;

    @FXML
    private void initialize() {
        // 1) Carrega todas as Linhas cadastradas
        listViewLinhas.setItems(Dados.listaLinha);

        // 2) Customiza cada célula para exibir multilinha com todos os detalhes
        listViewLinhas.setCellFactory(lv -> new ListCell<>() {
            @Override
            protected void updateItem(Linha linha, boolean empty) {
                super.updateItem(linha, empty);

                if (empty || linha == null) {
                    setText(null);
                } else {
                    // Extrai Itinerário e Rota
                    Itinerario iti = linha.getItinerarios();
                    Rota rota       = iti.getRota();

                    // Junta as paradas num único texto
                    String paradas = rota.getParadas()
                                        .stream()
                                        .map(Ponto::getEndereco)
                                        .collect(Collectors.joining(", "));

                    // Monta o texto com quebra de linha
                    String info = String.format(
                        "Linha: %s%n" +
                        "Motorista: %s (CPF: %s)%n" +
                        "Ônibus: %s%n" +
                        "Itinerário: %s às %s%n" +
                        "Rota: %s (%s → %s)%n" +
                        "Paradas: %s",
                        linha.getNome(),
                        linha.getMotorista().getNome(),
                        linha.getMotorista().getCpf(),
                        linha.getOnibus().getPlaca(),
                        iti.getNome(),
                        iti.getHoraPartida(),
                        rota.getNome(),
                        rota.getPontoInitial().getEndereco(),
                        rota.getPontoFinal().getEndereco(),
                        paradas
                    );

                    setText(info);
                    setWrapText(true);
                    setPrefHeight(Region.USE_COMPUTED_SIZE);
                }
            }
        });
    }
}