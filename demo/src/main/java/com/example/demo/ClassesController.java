package com.lpi.classes;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ClassesController {

    @FXML
    private TextField corTextField;

    @FXML
    private TextField especieTextField;

    @FXML
    private TextField tamanhoTextField;

    @FXML
    private Button criarObjetoButton;

    @FXML
    private ListView<String> animalListView;

    private int count = 1;
    private ObservableList<String> animalNames = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        criarObjetoButton.setOnAction(event -> {
            // Obter os valores inseridos pelo usuário
            String cor = corTextField.getText();
            String especie = especieTextField.getText();
            String tamanho = tamanhoTextField.getText();

            // Criar um novo objeto Animal
            Animal animal = new Animal(cor, especie, tamanho);

            // Imprimir informações do objeto criado
            System.out.println("Animal" + count + ": " + animal);

            // Exibir a lista de objetos criados
            System.out.println("Lista de animais:");
            for (Animal a : Animal.getAnimalList()) {
                System.out.println(a);
            }

            // Incrementar o contador
            count++;
        });
    }
}