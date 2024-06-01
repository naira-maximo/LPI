package Tarefa3.Classes;

class Instrumentos {

    private String nome;
    private boolean cordas;
    private String material;

    // Métodos de acesso
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public boolean getCordas() {
        return this.cordas;
    }
    public void setCordas(boolean cordas) {
        this.cordas = cordas;
    }
    public String getMaterial() {
        return this.material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    // Métodos
    public void tocar(int notas) {
        if (notas == 0) {
            System.out.println("Não tocou");
        } else if (notas <= 4) {
            System.out.println("Essa é uma música simples");
        } else if (notas >4 && notas < 6) { 
            System.out.println("Essa é uma música intermediária");
        } else {
            System.out.println("Essa é uma música difícil");
        }
    }
    public boolean afinar() {
        boolean a;
        if (cordas == true) {
            a = true;
        } else {
            a = false; }
        return a;
    }
    public void estudar (double horas) {
        if (horas <= 0) {
            System.out.println("Não estudou");
        } else System.out.println("Estudou " + horas + " horas");
    }

    public static void main(String[] args) {
        Instrumentos i1 = new Instrumentos();
        i1.nome = "Harpa";
        i1.cordas = true;
        i1.material = "Madeira";

        System.out.println("Nome: " + i1.nome + "\nCordas: " + i1.cordas + "\nMaterial: " + i1.material);

        i1.tocar(7);
        i1.afinar();
        i1.estudar(10);

        Instrumentos i2 = new Instrumentos();
        i2.nome = "Bateria";
        i2.cordas = false;
        i2.material = "Madeira, plástico e metal";

        System.out.println("Nome: " + i2.nome + "\nCordas: " + i2.cordas + "\nMaterial: " + i2.material);

        i2.tocar(4);
        i2.afinar();
        i2.estudar(5.5);

        Instrumentos i3 = new Instrumentos();
        i3.nome = "Bongos";
        i3.cordas = false;
        i3.material = "Madeira";

        System.out.println("Nome: " + i3.nome + "\nCordas: " + i3.cordas + "\nMaterial: " + i3.material);

        i3.tocar(1);
        i3.afinar();
        i3.estudar(0.35);

        Instrumentos i4 = new Instrumentos();
        i4.nome = "Metalofone";
        i4.cordas = false;
        i4.material = "Metal";

        System.out.println("Nome: " + i4.nome + "\nCordas: " + i4.cordas + "\nMaterial: " + i4.material);

        i4.tocar(0);
        i4.afinar();
        i4.estudar(0);

        Instrumentos i5 = new Instrumentos();
        i5.nome = "Pandeiro";
        i5.cordas = false;
        i5.material = "Plástico";

        System.out.println("Nome: " + i5.nome + "\nCordas: " + i5.cordas + "\nMaterial: " + i5.material);

        i5.tocar(2);
        i5.afinar();
        i5.estudar(1);

        Instrumentos i6 = new Instrumentos();
        i6.nome = "Maracas";
        i6.cordas = false;
        i6.material = "Madeira";

        System.out.println("Nome: " + i6.nome + "\nCordas: " + i6.cordas + "\nMaterial: " + i6.material);

        i6.tocar(3);
        i6.afinar();
        i6.estudar(3);

        Instrumentos i7 = new Instrumentos();
        i7.nome = "Violão";
        i7.cordas = true;
        i7.material = "Madeira";

        System.out.println("Nome: " + i7.nome + "\nCordas: " + i7.cordas + "\nMaterial: " + i7.material);

        i7.tocar(12);
        i7.afinar();
        i7.estudar(7);

    
    }

}