package Tarefa3.Classes;

public class Sucos {

    private String sabor;
    private String metodo;
    private int medida;

    public String getSabor(){
        return this.sabor;
    }
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    public String getMetodo(){
        return this.metodo;
    }
    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }
    public int getMedida(){
        return this.medida;
    }
    public void setMedida(int medida) {
        this.medida = medida;
    }

    public boolean colocarGelo(String escolha){
        boolean i = false;
        if (escolha == "sim") i = true;
        return i;
    }

    public boolean beber(){
        boolean ml = true;
        if (medida == 0) ml = false;
        return ml;
    }

    public String coar(){
        String c;
        if (metodo == "liquidificador" || metodo == "mixer"){
            c = "É indicado coar";
        } else if (metodo == "centrifuga" || metodo == "espremedor"){
            c = "Não é necessário coar";
        } else {
            c = "Verifique a necessidade de coar";
        }
        return c;
    }
        public static void main(String[] args) {
            Sucos s1 = new Sucos();
            s1.sabor = "morango e laranja";
            s1.metodo = "mixer";
            s1.medida = 110;
    
            System.out.println("Sabor: " + s1.sabor + "\nMétodo de preparo: " + s1.metodo + "\nQuantidade: " + s1.medida);
    
            s1.colocarGelo("sim");
            s1.beber();
            s1.coar();
    
            Sucos s2 = new Sucos();
            s2.sabor = "acerola";
            s2.metodo = "liquidificador";
            s2.medida = 240;
    
            System.out.println("Sabor: " + s2.sabor + "\nMétodo de preparo: " + s2.metodo + "\nQuantidade: " + s2.medida);
    
            s2.colocarGelo("não");
            System.out.println(s2.beber());
            System.out.println(s2.coar());
    
            Sucos s3 = new Sucos();
            s3.sabor = "limão";
            s3.metodo = "espremedor";
            s3.medida = 200;
    
            System.out.println("Sabor: " + s3.sabor + "\nMétodo de preparo: " + s3.metodo + "\nQuantidade: " + s3.medida);
    
            s3.colocarGelo("sim");
            s3.beber();
            s3.coar();
        
    }
}