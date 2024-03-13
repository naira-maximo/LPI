package Tarefa3.Classes;
import java.time.LocalDate;

public class Paes {
    // Atributos
    private String tipoFarinha;
    private int tamanho;
    private LocalDate fabricacao;

    // Métodos de acesso
    public String getTipoFarinha() {
        return this.tipoFarinha;
    }
    public int getTamanho() {
        return this.tamanho;
    }
    public LocalDate getFabricacao() {
        return this.fabricacao;
    }

    // Métodos
    public String esquentar(String metodo) {
        return ("Esquentar o pão utilizando " + metodo);
    }
    public boolean congelar() {
        LocalDate hoje = LocalDate.now();
        return fabricacao.isEqual(hoje);
    }
    public void cortar() {
        int fatia;
        if (tipoFarinha == "Integral") {
            fatia = 2;
        } else { fatia = 1;}
        System.out.println("Para pães feitos com farinha " + tipoFarinha + " é indicado comer  " + fatia + " fatia(s)");
}

    public static void main(String[] args) {
        Paes pao1 = new Paes();
        pao1.tipoFarinha = "Branca";
        pao1.tamanho = 15;
        pao1.fabricacao = LocalDate.of(2024, 2, 29);

        System.out.println("Tamanho: " + pao1.tamanho + "cm\nData de fabricação: " + pao1.fabricacao + "\nTipo de farinha: " + pao1.tipoFarinha);

        System.out.println(pao1.esquentar("frigideira"));
        System.out.println(pao1.congelar());
        pao1.cortar();

        Paes pao2 = new Paes();
        pao2.tipoFarinha = "Aveia";
        pao2.tamanho = 20;
        pao2.fabricacao = LocalDate.of(2024, 03, 10);

        System.out.println("Tamanho: " + pao2.tamanho + "cm\nData de fabricação: " + pao2.fabricacao + "\nTipo de farinha: " + pao2.tipoFarinha);

        System.out.println(pao2.esquentar("chapa"));
        System.out.println(pao2.congelar());
        pao2.cortar();

        Paes pao3 = new Paes();
        pao3.tipoFarinha = "Integral";
        pao3.tamanho = 30;
        pao3.fabricacao = LocalDate.of(2024, 03, 10);

        System.out.println("Tamanho: " + pao3.tamanho + "cm\nData de fabricação: " + pao3.fabricacao + "\nTipo de farinha: " + pao3.tipoFarinha);

        System.out.println(pao3.esquentar("forno"));
        System.out.println(pao3.congelar());
        pao3.cortar();

        Paes pao4 = new Paes();
        pao4.tipoFarinha = "Branca";
        pao4.tamanho = 15;
        pao4.fabricacao = LocalDate.of(2024, 03, 06);

        System.out.println("Tamanho: " + pao4.tamanho + "cm\nData de fabricação: " + pao4.fabricacao + "\nTipo de farinha: " + pao4.tipoFarinha);

        System.out.println(pao4.esquentar("grelha"));
        System.out.println(pao4.congelar());
        pao4.cortar();

        Paes pao5 = new Paes();
        pao5.tipoFarinha = "Integral";
        pao5.tamanho = 30;
        pao5.fabricacao = LocalDate.of(2024, 03, 06);

        System.out.println("Tamanho: " + pao5.tamanho + "cm\nData de fabricação: " + pao5.fabricacao + "\nTipo de farinha: " + pao5.tipoFarinha);

        System.out.println(pao5.esquentar("sanduicheira"));
        System.out.println(pao5.congelar());
        pao5.cortar();
    }
}

