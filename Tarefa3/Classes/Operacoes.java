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
    // private void simplificar() {
        // int gcd = gcd(numerador, denominador);
        // numerador /= gcd; // Divide o valor de numerador pelo valor de gcd e atribui o resultado de volta a numerador.
        // denominador /= gcd; // Divide o valor de denominador pelo valor de gcd e atribui o resultado de volta a denominador.
    // }

    // Método para calcular o máximo divisor comum (MDC)
    // private int gcd(int a, int b) { 
        // return b == 0 ? a : gcd(b, a % b); // O ? é operador ternário em Java. b == 0 é a condição. Se b for igual a 0, o valor retornado será a. Se b não for igual a 0, retorna gcd(b, a % b)
    // }

    public static void main(String[] args) {
        // Exemplo de uso
        Operacoes op1 = new Operacoes(2, 5); // Fração 2/5
        Operacoes op2 = new Operacoes(3, 7); // Fração 3/7
        Operacoes op3 = new Operacoes(4, 3); // Fração 4/3
        Operacoes op4 = new Operacoes(2, 7); // Fração 2/7
        Operacoes op5 = new Operacoes(3, 2); // Fração 3/2
        Operacoes op6 = new Operacoes(10, 3); // Fração 10/3
        Operacoes op7 = new Operacoes(1, 3); // Fração 1/3
        Operacoes op8 = new Operacoes(5, 2); // Fração 5/2
        Operacoes op9 = new Operacoes(2, 1); // Fração 2/1
        Operacoes op10 = new Operacoes(5, 1); // Fração 5/1

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