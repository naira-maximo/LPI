// EXERCÍCIO 7
// Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso contrário escrever NÃO É MAIOR QUE 10! 

import java.util.Scanner;

public class MaiorMenor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = sc.nextInt();

        if (numero < 10) {
            System.out.println(numero + " é menor que 10!");
        } else if (numero == 10) {
            System.out.println("É o número 10!");
        } else {
            System.out.println(numero + " é maior que 10!");
        }
        sc.close();
    }
}