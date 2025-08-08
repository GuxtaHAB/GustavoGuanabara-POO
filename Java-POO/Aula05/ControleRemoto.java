
public class ControleRemoto implements Controlador{
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //Métodos Especiais
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    public int getVolume(){
        return volume;
    }
    public void setVolume(int v){
        this.volume = v;
    }
    public boolean isLigado(){
        return ligado;
    }
    public void setLigado(boolean l){
        this.ligado = l;
    }
    public boolean isTocando(){
        return tocando;
    }
    public void setTocando(boolean t){
        this.tocando = t;
    }

    //Métodos Abstratos
    public void ligar(){
        this.setLigado(true);
    }
    public void desligar(){
        this.setLigado(false);
    }
    public void abrirMenu(){
        System.out.println("-------MENU-------");
        System.out.println("Está ligado?" + this.isLigado());
        System.out.println("Está tocando?" + this.isTocando());
        System.out.println("Volume: " + this.getVolume());
        for(int i = 0; i <= this.getVolume(); i+=10){
            System.out.println("||");
        }
    }
    public void fecharMenu(){
        System.out.println("Fechando menu...");
    }
    public void maisVolume(){
        if (this.isLigado()){
            this.setVolume(this.getVolume() + 5);
        }else{
            System.out.println("Impossível diminuir volume");
        }
    }
    public void menosVolume(){
        if (this.isLigado()){
            this.setVolume(this.getVolume() - 5);
        }else{
            System.out.println("Impossível diminuir volume");
        }
    }
    public void ligarMudo(){
        if(this.isLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }
    public void desligarMudo(){
        if(this.isLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }
    public void play(){
        if(this.isLigado() && !(this.isTocando())){
            this.setTocando(true);
        }
    }
    public void pause(){
        if(this.isLigado() && this.isTocando()){
            this.setTocando(false);
        }
    }

}
