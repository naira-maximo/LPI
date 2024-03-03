// EXERCÍCIO 10
//  Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever também a média calculada. 

import java.text.DecimalFormat;
import java.util.Scanner;

public class MediaAluno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua nota na 1ª Avaliação:");
        double primeiraAvaliacao = sc.nextDouble();
        System.out.println("Digite sua nota na 2ª Avaliação:");
        double segundaAvaliacao = sc.nextDouble();

        double mediaAritmetica = (primeiraAvaliacao + segundaAvaliacao) / 2;
        
        DecimalFormat df = new DecimalFormat("#.##"); // Formatar o resultado para ter apenas duas casas decimais depois da vírgula
        String stringMedia = df.format(mediaAritmetica);

        if (mediaAritmetica >= 6) {
            System.out.println("Sua média é " + stringMedia + " e você está aprovado!");
        } else {
            System.out.println("Sua média é " + stringMedia + " e você está reprovado!");
        }
        sc.close();
    }
}