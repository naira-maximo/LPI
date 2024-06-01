package Simulado;

public class Aviao {

    // Atributos
    private String tipo;
    private String modelo;
    private int ano;

    // Construtor
    public Aviao(String tipo, String modelo, int ano) {
        this.tipo = tipo;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Métodos de acesso
    public void setTipo(String tipo) {this.tipo = tipo;}
    public String getTipo() {return tipo;}
    public void setModelo(String modelo) {this.modelo = modelo;}
    public String getModelo() {return modelo;}
    public void setAno(int ano) {this.ano = ano;}
    public int getAno() {return ano;}
    
    // Métodos
    public boolean decolar() {
        System.out.println("O " + modelo + " está decolando");
        return true;
    }
    public boolean pousar() {
        System.out.println("O " + modelo + " está pousando");
        return true;
    }
    public boolean virarADireita() {
        System.out.println("O " + modelo + " está virando à direita");
        return true;
    }
    public boolean virarAEsquerda() {
        System.out.println("O " + modelo + " está virando à esquerda");
        return true;
    }
    public static void main(String[] args) {
        // Instanciando e configurando os aviões
        Aviao aviao1 = new Aviao("Comercial", "Boeing", 2020);
        Aviao aviao2 = new Aviao("Comercial", "Phenom", 2016);
        Aviao aviao3 = new Aviao("Particular", "Airbus", 2018);

        // Chamando métodos dos aviões
        aviao1.decolar();
        aviao1.virarADireita();
        aviao1.virarAEsquerda();
        aviao1.pousar();

        aviao2.decolar();
        aviao2.virarADireita();
        aviao2.virarAEsquerda();
        aviao2.pousar();

        aviao3.decolar();
        aviao3.virarADireita();
        aviao3.virarAEsquerda();
        aviao3.pousar();
    }
}

