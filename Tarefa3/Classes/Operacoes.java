// Código inicial incompleto > Verificar Fracoes/.

// package Tarefa3.Classes;

// public class Operacoes {
//     private int numerador;
//     private int denominador;

//     // Construtor
//     public Operacoes(int numerador, int denominador) {
//         this.numerador = numerador;
//         this.denominador = denominador;
//     }

//     // Método para soma de duas frações
//     public Operacoes soma(Operacoes outraOperacao) {
//         int novoNumerador = this.numerador * outraOperacao.denominador + outraOperacao.numerador * this.denominador;
//         int novoDenominador = this.denominador * outraOperacao.denominador;
//         return new Operacoes(novoNumerador, novoDenominador);
//     }

//     // Método para subtração de duas frações
//     public Operacoes subtracao(Operacoes outraOperacao) {
//         int novoNumerador = this.numerador * outraOperacao.denominador - outraOperacao.numerador * this.denominador;
//         int novoDenominador = this.denominador * outraOperacao.denominador;
//         return new Operacoes(novoNumerador, novoDenominador);
//     }

//     // Método para multiplicação de duas frações
//     public Operacoes multiplicacao(Operacoes outraOperacao) {
//         int novoNumerador = this.numerador * outraOperacao.numerador;
//         int novoDenominador = this.denominador * outraOperacao.denominador;
//         return new Operacoes(novoNumerador, novoDenominador);
//     }

//     // Método para divisão de duas frações
//     public Operacoes divisao(Operacoes outraOperacao) {
//         int novoNumerador = this.numerador * outraOperacao.denominador;
//         int novoDenominador = this.denominador * outraOperacao.numerador;
//         return new Operacoes(novoNumerador, novoDenominador);
//     }

//     // Método para soma de três frações
//     public Operacoes soma(Operacoes segundaOperacao, Operacoes terceiraOperacao) {
//         return this.soma(segundaOperacao).soma(terceiraOperacao);
//     }

//     // Método para subtração de três frações
//     public Operacoes subtracao(Operacoes segundaOperacao, Operacoes terceiraOperacao) {
//         return this.subtracao(segundaOperacao).subtracao(terceiraOperacao);
//     }

//     // Método para multiplicação de três frações
//     public Operacoes multiplicacao(Operacoes segundaOperacao, Operacoes terceiraOperacao) {
//         return this.multiplicacao(segundaOperacao).multiplicacao(terceiraOperacao);
//     }

//     // Método para divisão de três frações
//     public Operacoes divisao(Operacoes segundaOperacao, Operacoes terceiraOperacao) {
//         return this.divisao(segundaOperacao).divisao(terceiraOperacao);
//     }

//     // Método para obter uma representação da fração  
//     public String toString() {
//         return numerador + "/" + denominador;
//     }

//     public static void main(String[] args) {
//         // Exemplo de uso
//         Operacoes op1 = new Operacoes(2, 5); // Fração 2/5
//         Operacoes op2 = new Operacoes(3, 7); // Fração 3/7
//         Operacoes op3 = new Operacoes(4, 3); // Fração 4/3
//         Operacoes op4 = new Operacoes(2, 7); // Fração 2/7
//         Operacoes op5 = new Operacoes(3, 2); // Fração 3/2
//         Operacoes op6 = new Operacoes(10, 3); // Fração 10/3
//         Operacoes op7 = new Operacoes(1, 3); // Fração 1/3
//         Operacoes op8 = new Operacoes(5, 2); // Fração 5/2
//         Operacoes op9 = new Operacoes(2, 1); // Fração 2/1
//         Operacoes op10 = new Operacoes(5, 1); // Fração 5/1

//         // Realizando operações
//         Operacoes primeiroTeste = op1.soma(op2);
//         Operacoes segundoTeste = op3.subtracao(op4);
//         Operacoes terceiroTeste = op3.soma(op1, op2);
//         Operacoes quartoTeste = op6.subtracao(op3, op4);
//         Operacoes quintoTeste = op9.soma(op7, op8);

//         // Imprimindo resultados
//         System.out.println("Soma: " + primeiroTeste);
//         System.out.println("Subtração: " + segundoTeste);
//         System.out.println("Soma de três frações: " + terceiroTeste);
//         System.out.println("Subtração de três frações: " + quartoTeste);
//         System.out.println("Divisão de três frações: " + quintoTeste);
//     }
// }