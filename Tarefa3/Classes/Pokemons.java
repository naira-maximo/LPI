package Tarefa3.Classes;

class Pokemons {

    // Atributos
    private String nome;
    private String tipo;
    private String regiao;

    // Métodos de acesso
    public String getNomePokemon() {
        return this.nome;
    }
    public void setNomePokemon(String nome) {
        this.nome = nome;
    }
    public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getRegiao() {
        return this.regiao;
    }
    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }
        
    public boolean batalhar(String escolhido) {
        boolean chosen = true;
        if (escolhido == "Não") chosen = false;
        return chosen;
    }

    public String capturar(String jogada) {
        String pokebola;
        if (jogada == "Excelente" || jogada == "Ótima") {
            pokebola = "Capturado";
        } else if (jogada == "Boa") {
            pokebola = "...\n\n\nCapturado";
        } else {
            pokebola = "O Pokemón selvagem fugiu";
        }
        return pokebola;
    }

    public void avaliar(int estrelas) {
        System.out.println("Seu pokemon foi avaliado em " + estrelas + " estrelas");
    }
    public static void main(String[] args) {
        Pokemons p1 = new Pokemons();
        p1.nome = "Bulbasaur";
        p1.tipo = "Planta e Venenoso";
        p1.regiao = "Kanto";
    
        System.out.println("Nome: " + p1.nome + "\nTipo: " + p1.tipo + "\nRegião: " + p1.regiao);

        System.out.println(p1.batalhar("Sim"));
        System.out.println(p1.capturar("Boa"));
        p1.avaliar(3);

        Pokemons p2 = new Pokemons();
        p2.nome = "Pikachu";
        p2.tipo = "Elétrico";
        p2.regiao = "Kanto";
    
        System.out.println("Nome: " + p2.nome + "\nTipo: " + p2.tipo + "\nRegião: " + p2.regiao);

        System.out.println(p2.batalhar("Sim"));
        System.out.println(p2.capturar("Ótima"));
        p2.avaliar(3);

        Pokemons p3 = new Pokemons();
        p3.nome = "Charmander";
        p3.tipo = "Fogo";
        p3.regiao = "Kanto";
    
        System.out.println("Nome: " + p3.nome + "\nTipo: " + p3.tipo + "\nRegião: " + p3.regiao);

        System.out.println(p3.batalhar("Não"));
        System.out.println(p3.capturar("Excelente"));
        p3.avaliar(2);

        Pokemons p4 = new Pokemons();
        p4.nome = "Squirtle";
        p4.tipo = "Água";
        p4.regiao = "Kanto";
    
        System.out.println("Nome: " + p4.nome + "\nTipo: " + p4.tipo + "\nRegião: " + p4.regiao);

        System.out.println(p4.batalhar("Não"));
        System.out.println(p4.capturar(""));
        p4.avaliar(0);
    }
}
