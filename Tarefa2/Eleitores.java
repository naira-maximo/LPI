// EXERCÍCIO 2
//  Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores. 
import java.text.DecimalFormat;
import java.util.Scanner;

public class Eleitores {

    public static void main(String[] args) {
        
        String município;
        double eleitores;
        double votosBrancos;
        double votosNulos;

        Scanner sc = new Scanner(System.in); 

        System.out.println("Digite o nome do município: "); município = sc.nextLine();
        System.out.println("Digite o total de eleitores em " + município + ":"); eleitores = sc.nextInt();
        System.out.println("Digite o total de votos brancos em " + município + ":"); votosBrancos = sc.nextInt();
        System.out.println("Digite o total de votos nulos em " + município + ":"); votosNulos = sc.nextInt();

        double votosValidos = eleitores - (votosBrancos + votosNulos);

        double percentualValidos = (votosValidos/eleitores)*100;
        double percentualBrancos = (votosBrancos/eleitores)*100;
        double percentualNulos = (votosNulos/eleitores)*100;

        DecimalFormat df = new DecimalFormat("#.##"); // Formatar o resultado para ter apenas duas casas decimais depois da vírgula
        String stringValidos = df.format(percentualValidos);
        String stringBrancos = df.format(percentualBrancos);
        String stringNulos = df.format(percentualNulos);

        System.out.println("O percentual de votos referente ao número total de eleitores em " + município + 
        " (" + (int) eleitores + " eleitores) é de: \nVotos válidos: " + stringValidos + "%\nVotos brancos: " + stringBrancos + "%\nVotos nulos: " + stringNulos + "%");

        sc.close();

    }
}