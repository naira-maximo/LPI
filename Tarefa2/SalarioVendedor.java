// EXERCÍCIO 5
// Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do vendedor.
import java.util.Scanner;
public class SalarioVendedor {

    public static void main(String[] args) {

        int carrosVendidos;
        int totalVendas;

        Scanner sc = new Scanner(System.in);

        System.out.println("Número de carros vendidos: ");
        carrosVendidos = sc.nextInt();

        System.out.println("Valor total de vendas: ");
        totalVendas = sc.nextInt();
        
        int salarioFixo = 1500;
        double comissaoVendas = totalVendas * 0.05;
        double comissaoCarros = carrosVendidos * 50;

        System.out.println("Número de carros vendidos: " + carrosVendidos);
        System.out.println("Valor total de vendas: R$" + totalVendas);
        System.out.println("Salário fixo: R$" + salarioFixo);
        System.out.println("Comissão da quantidade de carros vendidos do mês: R$" + comissaoCarros);
        System.out.println("Comissão do total de vendas do mês: R$" + comissaoVendas);
        System.out.println("Total a receber: R$" + (comissaoVendas+salarioFixo+comissaoCarros));

        sc.close();
    }
}

