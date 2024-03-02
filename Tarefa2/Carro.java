// O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
// Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor. 

import java.util.Scanner;

public class Carro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nomeConsumidor;
        double custoFabrica;
        double porcentagemDistribuidor = 0.28;
        double impostos = 0.45;

        System.out.println("Insira seu nome: ");
        nomeConsumidor = sc.nextLine();
        System.out.println("Insira o custo de fábrica do seu carro: ");
        custoFabrica = sc.nextDouble();
        
        double custoCarro = custoFabrica + (custoFabrica * porcentagemDistribuidor) + (custoFabrica * impostos);

        System.out.println(custoFabrica*porcentagemDistribuidor);
        System.out.println(custoFabrica*impostos);

        System.out.println("Parabéns, " + nomeConsumidor +"! Seu carro novo custa R$" + custoCarro);
        
    }
}
