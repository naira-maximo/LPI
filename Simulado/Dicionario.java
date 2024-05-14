/* Componentes utilizados na interface gráfica:

TextField: Para o usuário digitar o termo e a definição (input)
Button: Um botão para o usuário escolher entre as ações de procurar e adicionar.
Label: Para definir os rótulos de cada componente na interface, como "Termo" e "Definição". */

package Simulado;

public class Dicionario {

    //Atributos
    private String termo;
    private String definicao;

    //Contrutor
    public Dicionario(String termo, String definicao) {
        this.termo = termo;
        this.definicao = definicao;
    }

    // Métodos de acesso
    public String getTermo() {
        return termo;
    }
    public void setTermo(String termo) {
        this.termo = termo;
    }
    public String getDefinicao() {
        return definicao;
    }
    public void setDefinicao(String definicao) {
        this.definicao = definicao;
    }
}