// EXERCÍCIO 6
// Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor correspondente em graus Celsius. Observação: Para testar se a sua resposta está correta saiba que 100°C = 212°F

import java.text.DecimalFormat;
import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit (°F) para a conversão em Celsius (°C):");
        double temperaturaF = sc.nextDouble();
        double temperaturaC = temperaturaF/2.12;

        DecimalFormat df = new DecimalFormat("#.##"); // Formatar o resultado para ter apenas duas casas depois da vírgula
        String stringTempF = df.format(temperaturaF);
        String stringTempC = df.format(temperaturaC);

        System.out.println(stringTempF + "°F corresponde a " + stringTempC + "°C");
        sc.close();
    }
}