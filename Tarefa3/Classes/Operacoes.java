package Tarefa3.Classes;

public class Operacoes {
    private int numerador;
    private int denominador;

    // Construtor
    public Operacoes(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    // Método para soma
    public Operacoes soma(Operacoes outraOperacao) {
        int novoNumerador = this.numerador * outraOperacao.denominador + outraOperacao.numerador * this.denominador;
        int novoDenominador = this.denominador * outraOperacao.denominador;
        return new Operacoes(novoNumerador, novoDenominador);
    }

    // Método para subtração
    public Operacoes subtracao(Operacoes outraOperacao) {
        int novoNumerador = this.numerador * outraOperacao.denominador - outraOperacao.numerador * this.denominador;
        int novoDenominador = this.denominador * outraOperacao.denominador;
        return new Operacoes(novoNumerador, novoDenominador);
    }

    // Método para multiplicação
    public Operacoes multiplicacao(Operacoes outraOperacao) {
        int novoNumerador = this.numerador * outraOperacao.numerador;
        int novoDenominador = this.denominador * outraOperacao.denominador;
        return new Operacoes(novoNumerador, novoDenominador);
    }

    // Método para divisão
    public Operacoes divisao(Operacoes outraOperacao) {
        int novoNumerador = this.numerador * outraOperacao.denominador;
        int novoDenominador = this.denominador * outraOperacao.numerador;
        return new Operacoes(novoNumerador, novoDenominador);
    }

    // Método para obter uma representação da fração
    public String toString() {
        return numerador + "/" + denominador;
    }

    // Método para simplificar a fração
    private void simplificar() {
        int gcd = gcd(numerador, denominador);
        numerador /= gcd;
        denominador /= gcd;
    }

    // Método para calcular o máximo divisor comum (MDC)
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        // Exemplo de uso
        Operacoes op1 = new Operacoes(1, 2); // Fração 1/2
        Operacoes op2 = new Operacoes(1, 3); // Fração 1/3

        // Realizando operações
        Operacoes resultadoSoma = op1.soma(op2);
        Operacoes resultadoSubtracao = op1.subtracao(op2);
        Operacoes resultadoMultiplicacao = op1.multiplicacao(op2);
        Operacoes resultadoDivisao = op1.divisao(op2);

        // Imprimindo resultados
        System.out.println("Soma: " + resultadoSoma);
        System.out.println("Subtração: " + resultadoSubtracao);
        System.out.println("Multiplicação: " + resultadoMultiplicacao);
        System.out.println("Divisão: " + resultadoDivisao);
    }
}