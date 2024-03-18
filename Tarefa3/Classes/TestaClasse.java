package Tarefa3.Classes;

import java.time.LocalDate;

public class TestaClasse {

    public static void main(String[] args) {
        Budas b1 = new Budas();
        b1.setMaterial("gesso");
        b1.setAltura(25);
        b1.setCorpo(true);

        b1.pintar("verniz");
        b1.personalizar("vermelho");

        Cachorros c3 = new Cachorros();
        c3.setIdade(0.5);
        c3.setRaça("Poodle");
        c3.setSexo("macho");

        c3.vacinar();
        c3.passear(21);

        Criancas crianca1 = new Criancas();
        crianca1.setIdade(6);
        crianca1.setNome("Ana");
        crianca1.setCorCabelo("Loiro");

        System.out.println(crianca1.estudar());
        crianca1.cruzarMembros("braços");

        Filhotes f3 = new Filhotes();
        f3.setMeses(3);
        f3.setCor("Branco e cinza");
        f3.setSexo("Fêmea");

        System.out.println(f3.castrar());
        f3.alimentar();

        Instrumentos i7 = new Instrumentos();
        i7.setNome("Violão");
        i7.setCordas(true);
        i7.setMaterial("Madeira");

        i7.tocar(12);
        i7.estudar(7);

        Mariachis m2 = new Mariachis();
        m2.setInstrumento("guitarrón");
        m2.setNacionalidade("México");
        m2.setNome("Alejandro");

        m2.tocar(20);
        m2.cantar("El Rey");

        Paes pao5 = new Paes();
        pao5.setTipoFarinha("Integral");
        pao5.setTamanho(30);
        pao5.setFabricacao(LocalDate.of(2024, 03, 06));

        System.out.println(pao5.esquentar("sanduicheira"));
        pao5.cortar();

        Pokemons p1 = new Pokemons();
        p1.setNomePokemon("Bulbasaur");
        p1.setTipo("Planta e Venenoso");
        p1.setRegiao("Kanto");

        System.out.println(p1.capturar("Boa"));
        p1.avaliar(3);

        Sucos s2 = new Sucos();
        s2.setSabor("acerola");
        s2.setMetodo("liquidificador");
        s2.setMedida(240);
    
        System.out.println(s2.beber());
        System.out.println(s2.coar());    
    }
}
