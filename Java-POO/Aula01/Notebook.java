
public class Notebook {
    String modelo;
    String marca;
    String cor;
    boolean aberto;
    boolean ligado;
    void statusNotebook(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Está aberto? : " + aberto);
    }
    void ligar(){
        if(aberto == true){
            System.out.println("Notebook ligado.");
        } else{
            System.out.println("ERRO! Não posso ligar.");
        }
    }

}
