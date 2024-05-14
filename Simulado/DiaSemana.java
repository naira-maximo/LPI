/* Simulado de prova LP1 
Construa um algoritmo em Java que peça um valor compreendido entre 1 e 7 ao usuário e escreva na tela o dia da semana correspondente:
1: "Domingo"
2: "Segunda"
3: "Terça"
4: "Quarta"
5: "Quinta"
6: "Sexta"
7: "Sábado"
Outro: "Inválido"*/

package Simulado;

import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array com os nomes dos dias da semana
        String[] diasSemana = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};

        System.out.print("Digite um número entre 1 e 7: ");
        int numero = sc.nextInt();

        String dia;

        // Verifica se o número fornecido está dentro do intervalo válido
        if (numero >= 1 && numero <= 7) {
            // Encontra o índice do array de acordo com a entrada do usuário. 
            dia = diasSemana[numero - 1];
        } else {
            dia = "Inválido";
        }

        System.out.println(dia);

        sc.close();
    }
}
