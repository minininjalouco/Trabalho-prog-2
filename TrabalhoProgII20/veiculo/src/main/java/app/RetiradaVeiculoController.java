/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
package app;

import app.App;
import java.io.IOException;
import java.time.LocalDate;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import modelo.UsoVeiculo;
import modelo.Veiculo;
import util.Dao;

public class RetiradaVeiculoController {



    @FXML
    private ChoiceBox<Veiculo> choiceBoxVeiculo;

    
    @FXML
    private ChoiceBox<Veiculo> choiceBoxMotorista;
     
    @FXML
    private DatePicker datePickerRetirada;

   

    private Dao<UsoVeiculo> dao;

    @FXML
    private void initialize() {
        dao = new Dao<>(UsoVeiculo.class);
        // Popula a choice box com os veículos disponíveis
        Dao<Veiculo> daoVeiculo = new Dao<>(Veiculo.class);
        choiceBoxVeiculo.setItems((ObservableList<Veiculo>) daoVeiculo.listarTodos());
    }

    @FXML
    private void cancelarRetirada() {
        // Limpa os campos ao cancelar a retirada
        choiceBoxVeiculo.getSelectionModel().clearSelection();
        datePickerRetirada.setValue(null);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Retirada cancelada.");
        alert.show();
    }

    @FXML
    private void gravarRetirada() {
        Veiculo veiculo = choiceBoxVeiculo.getValue();
        LocalDate retirada = datePickerRetirada.getValue();
        
        if (veiculo == null || retirada == null) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("Selecione um veículo e uma data de retirada.");
            alert.show();
            return;
        }

        UsoVeiculo usoVeiculo = new UsoVeiculo(veiculo, null, retirada, null);

        // Lógica para gravar a retirada do veículo com a data selecionada
        dao.inserir(usoVeiculo);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Retirada gravada com sucesso.");
        alert.show();
    }

    @FXML
    private void voltarAoMenu() throws IOException {
        App.setRoot("menu");
    }
}
 */