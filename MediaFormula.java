// Atividade desenvolvida em sala e compartilhada no dia 1/3/2023
import java.util.Scanner;

public class MediaFormula {

    public double calcularMedia(double P1, double E1, double E2, double API, double X, double SUB) {
    double primeiroConjunto = (P1 * 0.6 + ((E1 + E2) / 2) * 0.4);
        return primeiroConjunto * 0.5 + (Math.max((primeiroConjunto - 5.9), 0) / (primeiroConjunto - 5.9)) * (API * 0.5) + X + (SUB * 0.2);
    }

    public static void main(String[] args) {
        MediaFormula nota = new MediaFormula();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota P1: ");
        double P1 = sc.nextDouble();

        System.out.println("Digite a nota E1: ");
        double E1 = sc.nextDouble();

        System.out.println("Digite a nota E2: ");
        double E2 = sc.nextDouble();

        System.out.println("Digite a nota API: ");
        double API = sc.nextDouble();

        System.out.println("Digite a nota X: ");
        double X = sc.nextDouble();

        System.out.println("Digite a nota SUB: ");
        double SUB = sc.nextDouble();

        double mediaFinal = nota.calcularMedia(P1, E1, E2, API, X, SUB);
        System.out.println("Média Final: " + mediaFinal);
    }
}