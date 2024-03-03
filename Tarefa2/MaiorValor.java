// EXERCÍCIO 12
// Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles. 
import java.util.Scanner;

public class MaiorValor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int primeiroValor = sc.nextInt();
        int segundoValor;

        do { // Utilizei um loop do-while para solicitar a entrada do segundo valor até que ele seja diferente do primeiro valor.
            System.out.println("Digite outro número inteiro diferente do primeiro:");
            segundoValor = sc.nextInt();
        } while (segundoValor == primeiroValor); // Verificação da igualdade entre os valores usando a condição segundoValor == primeiroValor.

        int maior = Math.max(primeiroValor, segundoValor); // Função Math.max() para obter o maior valor entre primeiroValor e segundoValor.
        int menor = Math.min(primeiroValor, segundoValor); // Função Math.min() para obter o menor valor entre primeiroValor e segundoValor.

        System.out.println("O número " + maior + " é maior que " + menor);
        sc.close();
    }
}
