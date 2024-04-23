package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Mariachi {
    private String instrumento;
    private String nacionalidade;
    private String nome;

    private static List<Mariachi> mariachiList = new ArrayList<>();

    public Mariachi(String instrumento, String nacionalidade, String nome) {
        this.instrumento = instrumento;
        this.nacionalidade = nacionalidade;
        this.nome = nome;
    }

    // Métodos de acesso
    public String getInstrumento() {
        return this.instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setListMariachi() {
        mariachiList.add(this); // Adiciona o objeto à lista ao ser criado
    }

    // Métodos
    public String tocar(int minutos) {
        String tocou = nome + " tocou por " + minutos + " minutos.";
        return tocou;
    }

    public void cantar(String musica) {
        System.out.println(nome + " cantou a música " + musica);
    }

    public void dancar(int passos) {
        if (passos == 0)
            System.out.println(nome + " não dançou");
        else
            System.out.println(nome + " dançou " + passos + " passos.");
    }
    @Override
    public String toString() {
        return "Instrumento: " + instrumento + " | Nacionalidade: " + nacionalidade + " | Nome: " + nome + " | ";
    }
}

//    public static void main(String[] args) {
//        Mariachi m1 = new Mariachi();
//        m1.instrumento = "trompeta"; // O trompete é um  instrumento essencial no conjunto de mariachi, adicionando brilho e energia com suas fanfarras e notas altas.
//        m1.nacionalidade = "Colômbia";
//        m1.nome = "Jose";
//
//        System.out.println("Nome: " + m1.nome + "\nInstrumento: " + m1.instrumento + "\nNacionalidade: " + m1.nacionalidade);
//
//        m1.tocar(15);
//        m1.cantar("Cielito Lindo");
//        m1.dançar(50);
//
//        Mariachi m2 = new Mariachi();
//        m2.instrumento = "guitarrón"; // O guitarrón é um instrumento de cordas mexicano grande e profundo, semelhante ao violão, mas com um corpo mais amplo e caixa de ressonância maior. Ele fornece a linha de baixo para a música mariachi, adicionando profundidade e peso ao som.
//        m2.nacionalidade = "México";
//        m2.nome = "Alejandro";
//
//        System.out.println("Nome: " + m2.nome + "\nInstrumento: " + m2.instrumento + "\nNacionalidade: " + m2.nacionalidade);
//
//        m2.tocar(20);
//        m2.cantar("El Rey");
//        m2.dançar(0);
//
//        Mariachi m3 = new Mariachi();
//        m3.instrumento = "vihuela"; // A vihuela é um instrumento de cordas mexicano de pequenas dimensões, semelhante ao violão, mas com uma caixa de ressonância mais arredondada. Ela adiciona uma sonoridade característica à música mariachi, preenchendo o espaço sonoro com acordes e ritmos.
//        m3.nacionalidade = "Venezuela";
//        m3.nome = "Ramón";
//
//        System.out.println("Nome: " + m3.nome + "\nInstrumento: " + m3.instrumento + "\nNacionalidade: " + m3.nacionalidade);
//
//        m3.tocar(5);
//        m3.cantar("La Cucaracha");
//        m3.dançar(5);
//    }
//}
//
