package Tarefa3.Classes;
public class TestaClasse {

    public static void main(String[] args) {
        Budas b1 = new Budas();
        b1.setMaterial("gesso");
        b1.setAltura(25);
        b1.setCorpo(true);

        b1.pintar("verniz");
        b1.personalizar("vermelho");


        Pokemons p1 = new Pokemons();
        p1.setNomePokemon("Bulbasaur");
        p1.setTipo("Planta e Venenoso");
        p1.setRegiao("Kanto");

        System.out.println(p1.capturar("Boa"));
        p1.avaliar(3);


    }
}