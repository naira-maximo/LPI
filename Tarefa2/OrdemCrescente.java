// EXERCÍCIO 13
// Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.

import java.util.Scanner;

public class OrdemCrescente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int primeiro = sc.nextInt();
        int segundo;

        do { // Utilizei um loop do-while para solicitar a entrada do segundo valor até que ele seja diferente do primeiro valor.
            System.out.println("Digite outro número inteiro diferente do primeiro:");
            segundo = sc.nextInt();
        } while (segundo == primeiro); // Verificação da igualdade entre os valores usando a condição segundoValor == primeiroValor.

        int maior = Math.max(primeiro, segundo); // Função Math.max() para obter o maior valor entre primeiroValor e segundoValor.
        int menor = Math.min(primeiro, segundo); // Função Math.min() para obter o menor valor entre primeiroValor e segundoValor.

        System.out.println("A ordem crescente dos dois números é: " + maior + ", " + menor);
        sc.close();
    }
}