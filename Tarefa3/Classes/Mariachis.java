package Tarefa3.Classes;

public class Mariachis {
    // Atributos
    private String instrumento;
    private String nacionalidade;
    private String nome;

    // Métodos de acesso
    public String getInstrumento() {
        return this.instrumento;
    }
    public String getNacionalidade() {
        return this.nacionalidade;
    }
    public String getNome() {
        return this.nome;
    }

    // Métodos
    public void tocar(int minutos) {
        System.out.println(nome + " tocou por " + minutos + " minutos.");
    }
    public void cantar(String musica) {
        System.out.println(nome + " cantou a música " + musica);
    }
    public void dançar(int passos) {
        if (passos == 0)
            System.out.println(nome + " não dançou");
        else
            System.out.println(nome + " dançou " + passos + " passos.");
    }

    public static void main(String[] args) {
        Mariachis m1 = new Mariachis();
        m1.instrumento = "trompeta"; // O trompete é um  instrumento essencial no conjunto de mariachi, adicionando brilho e energia com suas fanfarras e notas altas.
        m1.nacionalidade = "Colômbia";
        m1.nome = "Jose";

        System.out.println("Nome: " + m1.nome + "\nInstrumento: " + m1.instrumento + "\nNacionalidade: " + m1.nacionalidade);

        m1.tocar(15);
        m1.cantar("Cielito Lindo");
        m1.dançar(50);

        Mariachis m2 = new Mariachis();
        m2.instrumento = "guitarrón"; // O guitarrón é um instrumento de cordas mexicano grande e profundo, semelhante ao violão, mas com um corpo mais amplo e caixa de ressonância maior. Ele fornece a linha de baixo para a música mariachi, adicionando profundidade e peso ao som.
        m2.nacionalidade = "México";
        m2.nome = "Alejandro";

        System.out.println("Nome: " + m2.nome + "\nInstrumento: " + m2.instrumento + "\nNacionalidade: " + m2.nacionalidade);

        m2.tocar(20);
        m2.cantar("El Rey");
        m2.dançar(0);

        Mariachis m3 = new Mariachis();
        m3.instrumento = "vihuela"; // A vihuela é um instrumento de cordas mexicano de pequenas dimensões, semelhante ao violão, mas com uma caixa de ressonância mais arredondada. Ela adiciona uma sonoridade característica à música mariachi, preenchendo o espaço sonoro com acordes e ritmos.
        m3.nacionalidade = "Venezuela";
        m3.nome = "Ramón";

        System.out.println("Nome: " + m3.nome + "\nInstrumento: " + m3.instrumento + "\nNacionalidade: " + m3.nacionalidade);

        m3.tocar(5);
        m3.cantar("La Cucaracha");
        m3.dançar(5);
    }
}


