package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Fracao {

    // Atributos
    private int numerador;

    private int denominador;
    public static List<Fracao> fracaoList = new ArrayList<>();

    // Métodos de acesso
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public void setListFracao() {
        fracaoList.add(this); // Adiciona o objeto à lista ao ser criado
    }

    public Fracao() {
        this.numerador = 0;
        this.denominador = 1; // Para evitar divisão por zero
    }

    // Construtor
    public Fracao(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    // Método para a operação de soma
    public Fracao soma(Fracao outraFracao) {
        int novoNumerador = this.numerador * outraFracao.denominador + outraFracao.numerador * this.denominador;
        int novoDenominador = this.denominador * outraFracao.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    // Método para a operação de subtração
    public Fracao subtracao(Fracao outraFracao) {
        int novoNumerador = this.numerador * outraFracao.denominador - outraFracao.numerador * this.denominador;
        int novoDenominador = this.denominador * outraFracao.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    // Método para a operação de multiplicação
    public Fracao multiplicacao(Fracao outraFracao) {
        int novoNumerador = this.numerador * outraFracao.numerador;
        int novoDenominador = this.denominador * outraFracao.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    // Método para a operação de divisão
    public Fracao divisao(Fracao outraFracao) {
        int novoNumerador = this.numerador * outraFracao.denominador;
        int novoDenominador = this.denominador * outraFracao.numerador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    // Método para calcular o máximo divisor comum (MDC)
    public int mdc(int a, int b) {
        return b == 0 ? a : mdc(b, a % b); // O "?"" é operador ternário em Java. b == 0 é a condição. Se b for igual a 0, o valor retornado será a. Se b não for igual a 0, retorna mdc(b, a % b)
    }

    // Método para simplificar a fração
    public String simplificar() {
        int simp = mdc(numerador, denominador);
        numerador /= simp;
        denominador /= simp;
        return numerador + "/" + denominador;
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
}

//     public static void main(String[] args) {
//
//         // 1º teste
//         Fracao fracao1 = new Fracao(2, 3);
//         Fracao fracao2 = new Fracao(3, 7);
//
//         Fracao resultado1 = fracao1.soma(fracao2);
//
//         String simp1 = resultado1.simplificar();
//
//         System.out.println("Resultado da expressão 2/5 + 3/7 = " + simp1);
//
//         // 2º teste
//         Fracao fracao3 = new Fracao(4, 3);
//         Fracao fracao4 = new Fracao(2, 7);
//
//         Fracao resultado2 = fracao3.subtracao(fracao4);
//
//         String simp2 = resultado2.simplificar();
//
//         System.out.println("Resultado da expressão 4/3 - 2/7 = " + simp2);
//
//         // 3º teste
//         Fracao fracao5 = new Fracao(4, 3);
//         Fracao fracao6 = new Fracao(2, 5);
//         Fracao fracao7 = new Fracao(3, 2);
//
//         Fracao resultado3 = fracao5.soma(fracao6);
//         Fracao resultado4 = resultado3.soma(fracao7);
//
//         String simp3 = resultado4.simplificar();
//
//         System.out.println("Resultado da expressão 4/3 + 2/5 + 3/2): " + simp3);
//
//         // 4º teste
//         Fracao fracao8 = new Fracao(10, 3);
//         Fracao fracao9 = new Fracao(4, 3);
//
//         Fracao resultado8 = fracao8.subtracao(fracao9);
//
//         String simp4 = resultado8.simplificar();
//
//         System.out.println("Resultado da expressão 10/3 - 4/3 = " + simp4);
//
//         // 5º teste
//         Fracao fracao10 = new Fracao(2, 1);
//         Fracao fracao11 = new Fracao(1, 3);
//         Fracao fracao12 = new Fracao(5, 4);
//
//         Fracao resultado9 = fracao10.soma(fracao11);
//         Fracao resultado10 = resultado9.subtracao(fracao12);
//
//         String simp5 = resultado10.simplificar();
//
//         System.out.println("Resultado da expressão 2 + 1/3 - 5/4 = " + simp5);
//
//         // 6º teste
//         Fracao fracao13 = new Fracao(5, 2);
//         Fracao fracao14 = new Fracao(4, 3);
//         Fracao fracao15 = new Fracao(2, 5);
//
//         Fracao resultado11 = fracao14.subtracao(fracao15);
//         Fracao resultado12 = fracao13.multiplicacao(resultado11);
//
//         String simp6 = resultado12.simplificar();
//
//         System.out.println("Resultado da expressão 5/2 * (4/3 - 2/5) = " + simp6);
//
//         // 7º teste
//         Fracao fracao16 = new Fracao(5, 1);
//         Fracao fracao17 = new Fracao(2, 7);
//
//         Fracao resultado13 = fracao16.soma(fracao17);
//
//         String simp7 = resultado13.simplificar();
//
//         System.out.println("Resultado da expressão 5 + 2/7 = " + simp7);
//
//         // 8º teste
//         Fracao fracao18 = new Fracao(5, 3);
//         Fracao fracao19 = new Fracao(7, 4);
//
//         Fracao resultado14 = fracao18.multiplicacao(fracao19);
//
//         String simp8 = resultado14.simplificar();
//
//         System.out.println("Resultado da expressão 5/3 * 7/4 = " + simp8);
//     }
//}