package Tarefa3.Classes;

public class Criancas {

    // Atributos
    private int idade;
    private String nome;
    private String corCabelo;

    // Métodos de acesso
    public int getIdade() {
        return this.idade;
    }
    public String getNome() {
        return this.nome;
    }
    public String getCorCabelo() {
        return this.corCabelo;
    }

    // Métodos
    public String estudar() { // No Brasil, a obrigatoriedade de frequentar a escola começa aos 4 anos de idade
        String obrigatorio;
        if (idade < 4) obrigatorio = nome + " não precisa estar matriculado(a) na escola.";
        else obrigatorio = nome + " precisa estar matriculado(a) na escola.";
        return("No Brasil, a obrigatoriedade de frequentar a escola começa aos 4 anos de idade. Portanto, " + obrigatorio);
    }
    public void cruzarMembros(String membro) {
        System.out.println(nome + " cruzou os/as " + membro);
    }
    public boolean brincar (String sono) {
        boolean brincadeira = true;
        if (sono == "Sim") brincadeira=false;
        return brincadeira;
    }

    public static void main(String[] args) {
        Criancas crianca1 = new Criancas();
        crianca1.idade = 6;
        crianca1.nome = "Ana";
        crianca1.corCabelo = "Loiro";

        System.out.println("Nome: " + crianca1.nome + "\nCor do cabelo: " + crianca1.corCabelo + "\nIdade: " + crianca1.idade + " anos");

        System.out.println(crianca1.estudar());
        crianca1.cruzarMembros("braços");
        crianca1.brincar("Sim");

        Criancas crianca2 = new Criancas();
        crianca2.idade = 5;
        crianca2.nome = "Pedro";
        crianca2.corCabelo = "Castanho";

        System.out.println("Nome: " + crianca2.nome + "\nCor do cabelo: " + crianca2.corCabelo + "\nIdade: " + crianca2.idade + " anos");

        System.out.println(crianca2.estudar());
        crianca2.cruzarMembros("pernas");
        crianca2.brincar("Não");
    }
}

