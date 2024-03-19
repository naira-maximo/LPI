public class Fracoes {

    // Atributos
    private int numerador;
    private int denominador;

    // Construtor
    public Fracoes(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    // Método para a operação de soma
    public Fracoes soma(Fracoes outraFracao) {
        int novoNumerador = this.numerador * outraFracao.denominador + outraFracao.numerador * this.denominador;
        int novoDenominador = this.denominador * outraFracao.denominador;
        return new Fracoes(novoNumerador, novoDenominador);
    }
    // Método para a operação de subtração
    public Fracoes subtracao(Fracoes outraFracao) {
        int novoNumerador = this.numerador * outraFracao.denominador - outraFracao.numerador * this.denominador;
        int novoDenominador = this.denominador * outraFracao.denominador;
        return new Fracoes(novoNumerador, novoDenominador);
    }
    // Método para a operação de multiplicação
    public Fracoes multiplicacao(Fracoes outraFracao) {
        int novoNumerador = this.numerador * outraFracao.numerador;
        int novoDenominador = this.denominador * outraFracao.denominador;
        return new Fracoes(novoNumerador, novoDenominador);
    }
    // Método para a operação de divisão
    public Fracoes divisao(Fracoes outraFracao) {
        int novoNumerador = this.numerador * outraFracao.denominador;
        int novoDenominador = this.denominador * outraFracao.numerador;
        return new Fracoes(novoNumerador, novoDenominador);
    }

    // Método para calcular o máximo divisor comum (MDC)
    public int mdc(int a, int b) {
        return b == 0 ? a : mdc(b, a % b); // O "?"" é operador ternário em Java. b == 0 é a condição. Se b for igual a 0, o valor retornado será a. Se b não for igual a 0, retorna simp(b, a % b)
    }

    // Método para simplificar a fração
    public String simplificar() {
        int simp = mdc(numerador, denominador);
        numerador /= simp;
        denominador /= simp;
        return numerador + "/" + denominador;
    }

    // public String toString() {
    //     return numerador + "/" + denominador;
    // }

    public static void main(String[] args) {

        // 1º teste
        Fracoes fracao1 = new Fracoes(2, 3);
        Fracoes fracao2 = new Fracoes(3, 7);

        Fracoes resultado1 = fracao1.soma(fracao2);

        String simp1 = resultado1.simplificar();

        System.out.println("Resultado da expressão 2/5 + 3/7 = " + simp1);

        // 2º teste
        Fracoes fracao3 = new Fracoes(4, 3);
        Fracoes fracao4 = new Fracoes(2, 7);

        Fracoes resultado2 = fracao3.subtracao(fracao4);

        String simp2 = resultado2.simplificar();

        System.out.println("Resultado da expressão 4/3 - 2/7 = " + simp2);

        // 3º teste
        Fracoes fracao5 = new Fracoes(4, 3);
        Fracoes fracao6 = new Fracoes(2, 5);
        Fracoes fracao7 = new Fracoes(3, 2);

        Fracoes resultado3 = fracao5.soma(fracao6);
        Fracoes resultado4 = resultado3.soma(fracao7);

        String simp3 = resultado4.simplificar();

        System.out.println("Resultado da expressão 4/3 + 2/5 + 3/2): " + simp3);

        // 4º teste
        Fracoes fracao8 = new Fracoes(10, 3);
        Fracoes fracao9 = new Fracoes(4, 3);

        Fracoes resultado8 = fracao8.subtracao(fracao9);

        String simp4 = resultado8.simplificar();

        System.out.println("Resultado da expressão 10/3 - 4/3 = " + simp4);

        // 5º teste
        Fracoes fracao10 = new Fracoes(2, 1);
        Fracoes fracao11 = new Fracoes(1, 3);
        Fracoes fracao12 = new Fracoes(5, 4);

        Fracoes resultado9 = fracao10.soma(fracao11);
        Fracoes resultado10 = resultado9.subtracao(fracao12);

        String simp5 = resultado10.simplificar();

        System.out.println("Resultado da expressão 2 + 1/3 - 5/4 = " + simp5);

        // 6º teste
        Fracoes fracao13 = new Fracoes(5, 2);
        Fracoes fracao14 = new Fracoes(4, 3);
        Fracoes fracao15 = new Fracoes(2, 5);

        Fracoes resultado11 = fracao14.subtracao(fracao15);
        Fracoes resultado12 = fracao13.multiplicacao(resultado11);

        String simp6 = resultado12.simplificar();

        System.out.println("Resultado da expressão 5/2 * (4/3 - 2/5) = " + simp6);

        // 7º teste
        Fracoes fracao16 = new Fracoes(5, 1);
        Fracoes fracao17 = new Fracoes(2, 7);

        Fracoes resultado13 = fracao16.soma(fracao17);

        String simp7 = resultado13.simplificar();

        System.out.println("Resultado da expressão 5 + 2/7 = " + simp7);

        // 8º teste
        Fracoes fracao18 = new Fracoes(5, 3);
        Fracoes fracao19 = new Fracoes(7, 4);

        Fracoes resultado14 = fracao18.multiplicacao(fracao19);

        String simp8 = resultado14.simplificar();

        System.out.println("Resultado da expressão 5/3 * 7/4 = " + simp8);
    }
}