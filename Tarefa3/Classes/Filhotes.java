package Tarefa3.Classes;

public class Filhotes {
    // Atributos
    private double meses;
    private String cor;
    private String sexo;

    // Métodos de acesso
    public double getIdade() {
        return this.meses;
    }
    public String getCor() {
        return this.cor;
    }
    public String getSexo() {
        return this.sexo;
    }

    // Métodos
    public boolean vacinar() {
        boolean apto = true;
        if (meses < 2) apto = false;
        return apto;
    }
    public boolean castrar() {
        boolean apto = true;
        if (meses < 6) apto = false;
        return apto;
    }
    public void alimentar() {
        String vezes;
        if (meses <= 1) {
            vezes = "de 8 a 12 vezes por dia.";
        } else if (meses > 1 || meses <= 2) {
            vezes = "de 4 a 6 vezes por dia.";
        } else if (meses > 2 || meses <= 3) {
            vezes = "de 3 a 4 vezes por dia.";
        } else {vezes = "de 2 a 3 vezes por dia.";}

            System.out.println("Com " + meses + " meses, é indicado alimentar o filhote " + vezes);
    }

    public static void main(String[] args) {
        Filhotes f1 = new Filhotes();
        f1.meses = 0.29;
        f1.cor = "Laranja";
        f1.sexo = "Macho";

        System.out.println("Cor: " + f1.cor + "\nSexo: " + f1.sexo + "\nIdade: " + f1.meses + " meses");

        System.out.println(f1.vacinar());
        System.out.println(f1.castrar());
        f1.alimentar();

        Filhotes f2 = new Filhotes();
        f2.meses = 1;
        f2.cor = "Branco e cinza";
        f2.sexo = "Macho";

        System.out.println("Cor: " + f2.cor + "\nSexo: " + f2.sexo + "\nIdade: " + f2.meses + " meses");

        System.out.println(f2.vacinar());
        System.out.println(f2.castrar());
        f2.alimentar();

        Filhotes f3 = new Filhotes();
        f3.meses = 3;
        f3.cor = "Branco e cinza";
        f3.sexo = "Fêmea";

        System.out.println("Cor: " + f3.cor + "\nSexo: " + f3.sexo + "\nIdade: " + f3.meses + " meses");

        System.out.println(f3.vacinar());
        System.out.println(f3.castrar());
        f3.alimentar();

        Filhotes f4 = new Filhotes();
        f4.meses = 4;
        f4.cor = "Marrom e laranja";
        f4.sexo = "Fêmea";

        System.out.println("Cor: " + f4.cor + "\nSexo: " + f4.sexo + "\nIdade: " + f4.meses + " meses");

        System.out.println(f4.vacinar());
        System.out.println(f4.castrar());
        f4.alimentar();

        Filhotes f5 = new Filhotes();
        f5.meses = 2;
        f5.cor = "Marrom e laranja";
        f5.sexo = "Fêmea";

        System.out.println("Cor: " + f5.cor + "\nSexo: " + f5.sexo + "\nIdade: " + f5.meses + " meses");

        System.out.println(f5.vacinar());
        System.out.println(f5.castrar());
        f5.alimentar();
    }
}

