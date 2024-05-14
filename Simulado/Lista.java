package Simulado;

import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // DECLARE lista[10], item, 1, achou
        int[] lista = new int[10];
        int item;
        int i = 0;
        boolean achou = false;
        
        /* PARA i DE 0 ATE 9 FAÇA 
            ESCREVA "Digite o item ", i+1, " da lista: " */
        for (i = 0; i < lista.length; i++) {
            System.out.print("Digite o item " + (i + 1) + " da lista: ");
            lista[i] = sc.nextInt(); // LEIA lista[i]
        }

        // ESCREVA "Digite o item a ser procurado: "
        System.out.print("Digite o item a ser procurado: ");
        item = sc.nextInt(); // LEIA item


        i = 0; // i <- 0
        achou = false; // achou <- FALSO

        /*  ENQUANTO I <10 E NÃO achou FAÇA
            SE LISTA[I] = item ENTÃO 
                achou <- VERDADEIRO */
        while (i < 10 && achou == false) {
            if (lista[i] == item) {
                achou = true;
            }
            i++; // i <- i + 1
    }
        /*  SE achou ENTÃO 
                ESCREVA item, " encontrado na posição ", i 
            SENÃO
                ESCREVA item, " não encontrado na lista"*/
        if (achou) {
            System.out.println(item + " encontrado na posição " + i);
        } else {
            System.out.println(item + " não encontrado na lista");
        }

        sc.close();
    }
}