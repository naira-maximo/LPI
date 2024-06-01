// 1. Na empresa em que trabalhamos, há tabelas com o quanto foi gasto em cada mês.
// Para fechar o balanço do primeiro trimestre, precisamos somar o gasto total. Sabendo que, em Janeiro, foram gastos R$15000,
// em Fevereiro R$23000 e em Março R$17000, faça um programa que calcule e imprima a despesa total no trimestre e a média mensal de gastos.
public class BalancoTrimestral {

    public static void main (String[] args) {

        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;
        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        int mediaMensal = (gastosJaneiro + gastosFevereiro + gastosMarco)/3;
        System.out.println("O total de gastos do trimestre foi de R$"+gastosTrimestre+" e a média mensal foi de R$"+mediaMensal);
    }
}