// EXERCÍCIO 1
// Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias. 
import java.util.Scanner;

public class Idade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite abaixo sua idade expressa em anos, meses e dias");
        System.out.println("Anos:");
        int anos = sc.nextInt();
        
        System.out.println("Meses (0 a 11):");
        int meses = sc.nextInt();
        if (meses >= 0 && meses <= 11) {
        } else {
            System.out.println("Por favor, digite um número válido para meses (0 a 11)");
            meses = sc.nextInt();}
        
        System.out.println("Dias (0 a 29):");
        int dias = sc.nextInt();
        if (dias >= 0 && dias <= 29) {
        } else {
            System.out.println("Por favor, digite um número válido para dias (0 a 29)");
            dias = sc.nextInt();}

        int totalDias = (anos * 365) + (meses * 30) + dias;

        System.out.println("Sua idade expressa em dias é de " + totalDias + " dias.");

        sc.close();
    }
}