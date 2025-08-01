

public class Aula01 {
    public static void main(String[] args){
        Notebook n1 = new Notebook();
        n1.modelo = "Gamer";
        n1.marca = "Dell";
        n1.cor = "Preto e Vermelho";
        n1.aberto = false;
        n1.ligar();
        n1.statusNotebook();
    } 
    /*public static void main(String[] args){
        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.status();
        c1.rabiscar();


        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }*/


}
