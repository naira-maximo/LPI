package Tarefa3.Classes;

class Pokemons {

    // Atributos
    private String nome;
    private String tipo;
    private String regiao;

    // Métodos de acesso
    public String getNome() {
        return this.nome;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public String getRegiao() {
        return this.regiao;
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
            pokebola = "O Pokemón selvagem fugiu"
        }
        
    }
}