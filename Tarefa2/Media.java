// Atividade desenvolvida em sala e compartilhada no dia 1/3/2023
import java.util.Scanner;

public class Media {

	public void media_aritmetica(double N1, double N2, double N3) {
		double media;
		media = (N1 + N2 + N3) / 3;
		System.out.println("Média aritmética: " + media);
	}
	
	public double media_ponderada(double N1, double N2, double N3) {
		double media;
		media = (double) ((N1 * 0.2) + (N2 * 0.3) + (N3 * 0.5));
		return media;
	}
	
	
	public static void main(String[] args) {
		Media nota = new Media();
		
		int op;
		double N1;
		double N2;
		double N3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite: \n 1 - Média Aritmética \n 2 - Média Ponderada \n");
		
		op = sc.nextInt();
		
		System.out.println("Digite a nota N1: ");
		N1 = sc.nextDouble();
		
		System.out.println("Digite a nota N2: ");
		N2 = sc.nextDouble();
		
		System.out.println("Digite a nota N3: ");
		N3 = sc.nextDouble();
		
		if(op == 1) {
			nota.media_aritmetica(N1, N2, N3);
		}
		else {
			System.out.println("Média ponderada: " + nota.media_ponderada(N1, N2, N3));
		}
	}

}
