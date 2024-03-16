package Tarefa3.Classes;

public class Sucos {

    private String sabor;
    private String metodo;
    private int medida;

    public String getSabor(){
        return this.sabor;
    }
    public String getMetodo(){
        return this.metodo;
    }
    public int getMedida(){
        return this.medida;
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
}