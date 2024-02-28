// Atividade desenvolvida em sala e compartilhada no dia 1/3/2023
import java.util.Scanner;

public class MediaFormula {

    public double calcularMedia(double P1, double E1, double E2, double API, double X, double SUB) {
    double primeiroConjunto = (P1 * 0.6 + ((E1 + E2) / 2) * 0.4); // o peso da prova é 60% e da média das duas atividades é 40%
        return primeiroConjunto * 0.5 + (Math.max((primeiroConjunto - 5.9), 0) / (primeiroConjunto - 5.9)) * (API * 0.5) + X + (SUB * 0.2);
        // o peso do primeiro conjunto tem peso de 50% nessa parcela da fórmula, somado ao maior valor do primeiro conjuto (se for maior que 1). 
                                                                       // Caso o valor seja negativo, o maior valor será o 0, o que desconsidera a nota da API
    }

    public static void main(String[] args) {
        MediaFormula nota = new MediaFormula();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota P1: "); // máximo 10
        double P1 = sc.nextDouble();

        System.out.println("Digite a nota E1: "); // máximo 10
        double E1 = sc.nextDouble();

        System.out.println("Digite a nota E2: "); // máximo 10
        double E2 = sc.nextDouble();

        System.out.println("Digite a nota API: "); // máximo 10
        double API = sc.nextDouble();

        System.out.println("Digite a nota X: "); // máximo 1
        double X = sc.nextDouble();

        System.out.println("Digite a nota SUB: "); // máximo 10
        double SUB = sc.nextDouble();

        double mediaFinal = nota.calcularMedia(P1, E1, E2, API, X, SUB);
        System.out.println("Média Final: " + mediaFinal);
    }
}
