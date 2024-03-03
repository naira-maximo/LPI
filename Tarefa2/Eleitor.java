// EXERCÍCIO 11
// Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).
import java.util.Scanner;
public class Eleitor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int anoAtual = 2024;

        int anoNascimento;
        do {
            System.out.println("Digite os 4 dígitos do ano do seu nascimento:");
            while (!sc.hasNextInt()) { // Utilizei um loop do-while para garantir que o código seja executado pelo menos uma vez e depois continue pedindo entrada até que uma entrada válida seja fornecida. Dentro do loop, solicitei ao usuário que digite o ano de nascimento. Utilizei o método hasNextInt() para verificar se a entrada é um número inteiro.
                System.out.println("Por favor, digite um número válido.");
                sc.next();
            }
            anoNascimento = sc.nextInt(); //  Depois de garantir que a entrada seja um número inteiro, o ano de nascimento será verificado e terá pelo menos 4 dígitos e será menor que 2024.
        } while (anoNascimento < 1000 || anoNascimento >= 2024); // Se a entrada atender a todos os critérios, o programa imprime o ano de nascimento válido.

        int idade = (anoAtual - anoNascimento);

        if ( idade >= 18 && idade <=70) {
            System.out.println("Você tem/completará " + idade + " anos em " + anoAtual +". Portanto, o seu voto é obrigatório.");
        } else if (idade == 16 || idade == 17 || idade > 70) {
            System.out.println("Você tem/completará " + idade + " anos em " + anoAtual +". Portanto, o seu voto é facultativo.");
        } else {
            System.out.println("Você tem/completará " + idade + " anos em " + anoAtual +". Você ainda não pode votar, pois a idade mínima para o alistamento eleitoral é de 18 anos.");
        }


    sc.close();

    }
}