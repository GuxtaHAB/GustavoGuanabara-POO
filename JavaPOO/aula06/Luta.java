package aula06;
import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    //Métodos
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
          this.aprovada = true;
          this.desafiado = l1;
          this.desafiante = l2;  
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        if(getAprovada()){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0, 1 ou 2
            switch(vencedor){
                case 0: //Empate
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //Desafiado vence
                    System.out.printf("O lutador %s venceu a luta \n", this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: //Desafiante vence
                    System.out.printf("O lutador %s venceu a luta \n", this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
        }else{
            System.out.println("Luta não pode acontecer!!!!");
        }
    }
    //Métodos Especiais
    public Lutador getDesafiado(){
        return desafiado;
    }
    public void setDesafiado(Lutador dd){
        this.desafiado = dd;
    }
    public Lutador getDesafiante(){
        return desafiante;
    }
    public void setDesafiante(Lutador dt){
        this.desafiante = dt;
    }
    public int getRounds(){
        return rounds;
    }
    public void setRounds(int r){
        this.rounds = r;
    }
    public boolean getAprovada(){
        return aprovada;
    }
    public void setAprovada(boolean a){
        this.aprovada = a;
    }
}
