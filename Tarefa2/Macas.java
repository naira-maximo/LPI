// EXERCÍCIO 9
// As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra.

import java.util.Scanner;

public class Macas {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double precoMacas;

        System.out.println("Quantas maçãs deseja comprar?");
        int quantidadeMacas = sc.nextInt();

        if (quantidadeMacas < 12) {
            precoMacas = 1.30;
        } else {
            precoMacas = 1;
        }

        System.out.println("O custo da sua compra é R$" + quantidadeMacas * precoMacas);
        sc.close();
    }
}