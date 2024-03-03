// EXERCÍCIO 8
// Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo). 

import java.util.Scanner;

public class PositivoNegativo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo ou negativo:");
        int valor = sc.nextInt();

        if (valor >= 0) {
            System.out.println(valor + " é um número positivo!");
        } else {
            System.out.println(valor + " é um número negativo!");
        }
        sc.close();
    }
}