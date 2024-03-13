public class Corpo_humano {
    // Atributos
    
    private String sexo;
    private double altura;
    private double massa;
    private String nome;

    // Métodos de acesso
    public String getSexo() {
        return(this.sexo);
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return(this.altura);
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getMassa() {
        return(this.massa);
    }
    public void setMassa(double massa) {
        this.massa = massa;
    }

    public String getNome() {
        return(this.nome);
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos    
    public String andar(int passos) {
        return ("andando " + passos);
    }
    public void falar(String palavra) {
        System.out.println("Estou falando " + palavra);
    }
    public boolean ouvir(int i){
        boolean r=true;
        if(i%2==0) r=false;
        return r;
    }
    public void sorrir(){
    System.out.println("Sorrindo");
    }
    public double comer() {
        return (1.5);
    }

    public static void main(String[] args) {
        Corpo_humano c1 = new Corpo_humano();
        c1.altura=1.7;
        c1.massa=85;
        c1.sorrir();
        c1.nome = "Vinicius";

        Corpo_humano c2 = new Corpo_humano();
        c2.nome = "Medino";
        c2.falar("Ontem foi meu aniversário");
    }
}
