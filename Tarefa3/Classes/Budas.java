package Tarefa3.Classes;

public class Budas {

    // Atributos
    private String material;
    private double altura;
    private boolean corpo;

    // Métodos de acesso
    public String getMaterial() {
        return(this.material);
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public double getAltura() {
        return(this.altura);
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public boolean getCorpo() {
        return(this.corpo);
    }
    public void setCorpo(boolean corpo) {
        this.corpo = corpo;
    }

    // Métodos
    public void pintar(String revestimento) {
        System.out.println("A peça foi revestida com " + revestimento);
    }
    public void personalizar(String tinta) {
        System.out.println("A peça foi revestida com " + tinta);
    }
    public boolean embrulhar(String embrulho) {
        boolean e = false;
        if (embrulho == "sim") e = true;
        return e;
    }

    public static void main(String[] args) {
        Budas b1 = new Budas();
        b1.material = "gesso";
        b1.altura = 30;
        b1.corpo = true;
    
        System.out.println("Altura: " + b1.altura + "cm\nModelo com corpo: " + b1.corpo + "\nMaterial " + b1.material);

        b1.pintar("verniz");
        b1.personalizar("vermelho");
        b1.embrulhar("sim");
    
        Budas b2 = new Budas();
        b2.material = "cimento";
        b2.altura = 20;
        b2.corpo = false;

        System.out.println("Altura: " + b2.altura + "cm\nModelo com corpo: " + b2.corpo + "\nMaterial: " + b2.material);

        b2.pintar("cera");
        b2.personalizar("azul");
        b2.embrulhar("não");  
        
        Budas b3 = new Budas();

        b3.material = "cerâmica";
        b3.altura = 40;
        b3.corpo = false;
        
        b3.pintar("nenhum");
        b3.personalizar("verde");
        b3.embrulhar("sim");

        System.out.println("Altura: " + b3.altura + "cm\nModelo com corpo: " + b3.corpo + "\nMaterial: " + b3.material);
    
    }

}

