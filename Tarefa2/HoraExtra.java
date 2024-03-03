// EXERCÍCIO 15
// A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas). 
import java.text.DecimalFormat;
import java.util.Scanner;

public class HoraExtra {

    public static void main(String[] args) {
        int jornadaMensal = 40 * 4;
        double salario = 1412;
        double horaRegular = salario/jornadaMensal;
        double acrescimoHoraExtra = horaRegular*1.5;
        double salarioMes;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá, funcionário! Digite suas horas de trabalho deste mês:");
        double horasTrabalhadas = sc.nextDouble();
        
        
        double horaExtra = horasTrabalhadas - jornadaMensal;
        if (horaExtra >=1) {
            salarioMes = salario + (horaExtra * acrescimoHoraExtra);
        } else {salarioMes = horasTrabalhadas * horaRegular;}

        DecimalFormat df = new DecimalFormat("#.##"); // Formatar o resultado para ter apenas duas casas depois da vírgula
        String stringSalario = df.format(salarioMes);

        // System.out.println(horaExtra);
        // System.out.println(horaRegular);
        // System.out.println(acrescimoHoraExtra);
        System.out.println("O seu salário será de R$" + stringSalario);

        sc.close();
    }
}