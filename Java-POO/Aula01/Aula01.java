

public class Aula01 {
    public static void main(String[] args){
        /*Notebook n1 = new Notebook();
        n1.modelo = "Gamer";
        n1.marca = "Dell";
        n1.cor = "Preto e Vermelho";
        n1.aberto = false;
        n1.ligar();
        n1.statusNotebook();*/

        Caneta c1 = new Caneta();
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        // c1.ponta = 0.5f;
        c1.carga = 80;
        //c1.tampada = false;
        c1.tampar();
        c1.status();
        c1.rabiscar();

    } 
    
}

