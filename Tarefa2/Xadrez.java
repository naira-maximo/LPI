// EXERCÍCIO 14
//  Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.

import java.util.Scanner;

public class Xadrez {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicio;
        int horaFim;
        do { 
            System.out.println("Digite a hora do início do jogo (entre 0 e 23): ");
            horaInicio = sc.nextInt();
        } while (horaInicio < 0 || horaInicio > 23);
        
        do { 
            System.out.println("Digite a hora do fim do jogo (entre 0 e 23): ");
            horaFim = sc.nextInt();
        } while (horaFim < 0 || horaFim > 23);
        
        int duracaoJogo;
        if (horaFim > horaInicio) {
            duracaoJogo = horaFim - horaInicio;
        } else {
            duracaoJogo = (24 - horaInicio) + horaFim;
        }
        
        System.out.println("A duração do jogo foi de " + duracaoJogo + " horas.");
        
        sc.close();
    }
}