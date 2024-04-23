package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Cachorro {
    // Atributos
    private Double idade;
    private String raca;
    private String sexo;
    private static List<Cachorro> cachorroList = new ArrayList<>();

    // Construtor
    public Cachorro(Double idade, String raca, String sexo) {
        this.idade = idade;
        this.raca = raca;
        this.sexo = sexo;
    }

    // Métodos de acesso
    public double getIdade() {
        return this.idade;
    }
    public void setIdade(double idade) {
        this.idade = idade;
    }
    public String getRaca() {
        return this.raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String getSexo() {
        return this.sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setListCachorro() {
        cachorroList.add(this); // Adiciona o objeto à lista ao ser criado
    }

    // Métodos
    public boolean vacinar() {
        boolean apto = true;
        if (idade < 0.2) apto = false;
        return apto;
    }
    public boolean castrar() {
        boolean apto = true;
        if (idade < 0.6) apto = false;
        return apto;
    }
    public String passear(int passos) {
        String passeio;
        if (passos < 20) {
            passeio = "Não passeou o suficiente";
        }
        else {passeio = "Deu "+ passos +" passos e passeou o suficiente";}
        return passeio;
    }

    @Override
    public String toString() {
        return "Idade: " + idade + " | Raça: " + raca + " | Sexo: " + sexo + " | ";
    }
}