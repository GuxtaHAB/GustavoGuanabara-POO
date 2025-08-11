
public class Notebook {
    String modelo;
    String marca;
    String cor;
    boolean aberto;
    boolean ligado;
    void statusNotebook(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Está aberto? : " + this.aberto);
    }
    void ligar(){
        if(this.aberto == true){
            System.out.println("Notebook ligado.");
        } else{
            System.out.println("ERRO! Não posso ligar.");
        }
    }

}
