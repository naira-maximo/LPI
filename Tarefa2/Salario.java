// EXERCÍCIO 3
// Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e escrever o valor do novo salário. 
import java.text.DecimalFormat;
import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá, funcionário! Digite seu salário mensal atual:");
        double salarioAtual = sc.nextDouble();
        double dissidio = salarioAtual*0.0697; // O dissídio de 2024 apresenta um reajuste de 6,97% no salário mínimo, elevando-o de R$ 1.320 para R$ 1.412
        
        double novoSalario = salarioAtual + dissidio;

        DecimalFormat df = new DecimalFormat("#.##"); // Formatar o resultado para ter apenas duas casas depois da vírgula
        String stringSalario = df.format(novoSalario);
        String stringDissidio = df.format(dissidio);

        System.out.println("O dissídio de 2024 apresenta um reajuste de 6,97%, R$" + stringDissidio + " referente ao seu salário de R$" + salarioAtual + ". O valor do seu novo salário é R$" + stringSalario);

        sc.close();
    }
}