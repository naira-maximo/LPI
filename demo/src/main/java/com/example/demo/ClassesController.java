package com.example.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ClassesController {
    // Atributos Cachorro
    @FXML
    private TextField idadeTextField;
    @FXML
    private TextField racaTextField;
    @FXML
    private TextField sexoTextField;
    @FXML
    private TextField passosTextField;
    // Atributos Mariachi
    @FXML
    private TextField instrumentoTextField;
    @FXML
    private TextField nacionalidadeTextField;
    @FXML
    private TextField nomeTextField;
    @FXML
    private TextField minutosTextField;
    // Atributos Suco
    @FXML
    private TextField saborTextField;
    @FXML
    private TextField metodoTextField;
    @FXML
    private TextField medidaTextField;
    @FXML
    private TextField escolhaTextField;
    // Atributos Frações
    @FXML
    private TextField num1TextField;
    @FXML
    private TextField den1TextField;
    @FXML
    private TextField num2TextField;
    @FXML
    private TextField den2TextField;

    @FXML
    private TextField operadorTextField;

    // Botões
    @FXML
    private Button criarObjetoCachorro;
    @FXML
    private Button criarObjetoMariachis;
    @FXML
    private Button criarObjetoSuco;
    @FXML
    private Button criarObjetoFracao;
    

    // Listas
    @FXML
    private ListView<String> cachorroListView;
    private ObservableList<String> cachorroNames = FXCollections.observableArrayList();

    @FXML
    private ListView<String> mariachiListView;
    private ObservableList<String> mariachiNames = FXCollections.observableArrayList();

    @FXML
    private ListView<String> sucoListView;
    private ObservableList<String> sucoNames = FXCollections.observableArrayList();

    @FXML
    ListView<String> fracaoListView;
    private ObservableList<String> fracaoNames = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        criarObjetoCachorro.setOnAction(event -> {
            // Obter os valores inseridos pelo usuário
            String idadeStr = idadeTextField.getText();
            String raca = racaTextField.getText();
            String sexo = sexoTextField.getText();
            String passosStr = passosTextField.getText();

            try {
                // Converter os valores para os tipos corretos
                double idade = Double.parseDouble(idadeStr);
                int passos = Integer.parseInt(passosStr);

                // Criar um novo objeto Cachorro
                Cachorro cachorro = new Cachorro(idade, raca, sexo);

                // Adicionar o cachorro à lista
                cachorro.setListCachorro();

                // Adicionar o cachorro à lista
                cachorroNames.add("Cachorro " + cachorroNames.size() + ": " + cachorro.toString() + cachorro.passear(passos) + " | Idade para vacinar: " + cachorro.vacinar() + " | Idade para castrar: " + cachorro.castrar());

                // Atualizar a lista na interface do usuário
                cachorroListView.setItems(cachorroNames);

            } catch (NumberFormatException e) {
                System.out.println("Erro: Por favor, insira um valor válido para a idade e para os passos.");
            }
        });
        criarObjetoMariachis.setOnAction(event -> {
            // Obter os valores inseridos pelo usuário
            String instrumento = instrumentoTextField.getText();
            String nacionalidade = nacionalidadeTextField.getText();
            String nome = nomeTextField.getText();
            String minutosStr = minutosTextField.getText();

            try {
                // Converter os valores para os tipos corretos
                int minutos = Integer.parseInt(minutosStr);

                // Criar um novo objeto Mariachi
                Mariachi mariachi = new Mariachi(instrumento, nacionalidade, nome);

                // Adicionar o mariachi à lista
                mariachi.setListMariachi();

                // Adicionar o objeto mariachi à lista
                mariachiNames.add("Mariachi " + mariachiNames.size() + ": " + mariachi.toString() + mariachi.tocar(minutos));

                // Atualizar a lista na interface do usuário
                mariachiListView.setItems(mariachiNames);

            } catch (NumberFormatException e) {
                System.out.println("Erro: Por favor, insira um valor válido para minutos.");
            }
        });
        criarObjetoSuco.setOnAction(event -> {
            // Obter os valores inseridos pelo usuário
            String sabor = saborTextField.getText();
            String metodo = metodoTextField.getText();
            String medidaStr = medidaTextField.getText();
            String escolha = escolhaTextField.getText();

            try {
                // Converter os valores para os tipos corretos
                int medida = Integer.parseInt(medidaStr);

                // Criar um novo objeto Suco
                Suco suco = new Suco(sabor, metodo, medida);

                // Adicionar o suco à lista
                suco.setListSuco();

                // Adicionar o objeto suco à lista
                sucoNames.add("Suco " + sucoNames.size() + ": " + suco.toString() + "Colocar gelo: " + suco.colocarGelo(escolha) + " | O suco foi feito com " + metodo + ". " + suco.coar() + " | Beber: " + suco.beber());

                // Atualizar a lista na interface do usuário
                sucoListView.setItems(sucoNames);

            } catch (NumberFormatException e) {
                System.out.println("Erro: Por favor, insira um valor válido para medida.");
            }
        });
        criarObjetoFracao.setOnAction(event -> {
            Fracao fracao1 = new Fracao(Integer.parseInt(num1TextField.getText()), Integer.parseInt(den1TextField.getText()));
            Fracao fracao2 = new Fracao(Integer.parseInt(num2TextField.getText()), Integer.parseInt(den2TextField.getText()));

            // Obter os valores inseridos pelo usuário
            String operador = operadorTextField.getText();

            try {
                Fracao resultado = new Fracao();
                if (operador.equals("soma")) {
                    resultado = fracao1.soma(fracao2);
                    resultado.simplificar();
                } else if (operador.equals("subtração")) {
                    resultado = fracao1.subtracao(fracao2);
                    resultado.simplificar();
                } else if (operador.equals("multiplicação")) {
                    resultado = fracao1.multiplicacao(fracao2);
                    resultado.simplificar();
                } else if (operador.equals("divisão")) {
                    resultado = fracao1.divisao(fracao2);
                    resultado.simplificar();
                }

                // Adicionar o suco à lista
                resultado.setListFracao();

                // Adicionar o objeto suco à lista
                fracaoNames.add("Objeto Fração " + fracaoNames.size() + ": " + fracao1.toString() + " " + operador + " " + fracao2.toString() + " = " + resultado.toString());

                // Atualizar a lista na interface do usuário
                fracaoListView.setItems(fracaoNames);

            } catch (NumberFormatException e) {
                System.out.println("Erro: Por favor, insira um valor válido para a fração.");
            }
        });
    }
}
        