package Tarefa3.Classes;

public class Cachorros {
    // Atributos
    private double idade;
    private String raça;
    private String sexo;

    // Métodos de acesso
    public double getIdade() {
        return this.idade;
    }
    public String getRaça() {
        return this.raça;
    }
    public String getSexo() {
        return this.sexo;
    }

    // Métodos
    public boolean vacinar() {
        boolean apto = true;
        if (idade < 0.6) apto = false;
        return apto;
    }
    public boolean castrar() {
        boolean apto = true;
        if (idade < 0.2) apto = false;
        return apto;
    }
    public void passear(int passos) {
        if (passos < 20)
            System.out.println("Não passeou o suficiente");
        else
            System.out.println("Deu " + passos + " passos e passeou o suficiente");
    }

    public static void main(String[] args) {
        Cachorros c1 = new Cachorros();
        c1.idade = 0.3;
        c1.raça = "Chihuahua";
        c1.sexo = "fêmea";

        System.out.println("Raça: " + c1.raça + "\nSexo: " + c1.sexo + "\nIdade: " + c1.idade + " ano(s)");

        // System.out.println(c1.vacinar());
        // System.out.println(c1.castrar());
        c1.passear(50);

        Cachorros c2 = new Cachorros();
        c2.idade = 1;
        c2.raça = "Chihuahua";
        c2.sexo = "macho";

        System.out.println("Raça: " + c2.raça + "\nSexo: " + c2.sexo + "\nIdade: " + c2.idade + " ano(s)");

        c2.vacinar();
        c2.castrar();
        c2.passear(15);

        Cachorros c3 = new Cachorros();
        c3.idade = 0.5;
        c3.raça = "Poodle";
        c3.sexo = "macho";

        System.out.println("Raça: " + c3.raça + "\nSexo: " + c3.sexo + "\nIdade: " + c3.idade + " ano(s)");

        c3.vacinar();
        c3.castrar();
        c3.passear(21);

        Cachorros c4 = new Cachorros();
        c4.idade = 4;
        c4.raça = "Poodle";
        c4.sexo = "fêmea";

        System.out.println("Raça: " + c4.raça + "\nSexo: " + c4.sexo + "\nIdade: " + c4.idade + " ano(s)");

        c4.vacinar();
        c4.castrar();
        c4.passear(156);
    }
}


