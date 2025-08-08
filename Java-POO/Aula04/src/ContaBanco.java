public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Métodos Personalizados
    public void estadoAtual(){
        System.out.println("--------------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
        System.out.println("--------------------------------------------");
    }
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if(t == "CC" || t == "Conta Corrente"){
            this.setSaldo(50);
            System.out.println("Conta aberta com sucesso!");
        }else if(t == "CP" || t == "Conta Poupança"){
            this.setSaldo(150);
            System.out.println("Conta aberta com sucesso!");
        }else{
            System.out.println("ERRO! TIPO INVÁLIDO");
        }
    }
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("ERRO! Não pode fechar conta, pois ainda tem saldo");
        } else if(this.getSaldo() < 0){
            System.out.println("ERRO! Não pode fechar conta, pois existe um saldo devedor");
        } else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositar(float v){
        if(this.isStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado com sucesso!");
        }else{
            System.out.println("Não é possível realizar depósitos em contas inativas");
        }
    }
    public void sacar(float v){
        if(isStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.printf("Saque de R$ %.2f realizado com sucesso!", v);
            } else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Não é possível realizar saques em contas inativas");
        }
    }
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC" || this.getTipo() == "Conta Corrente") {
            v = 12;
        } else if(this.getTipo() == "CP" || this.getTipo() == "Conta Poupança"){
            v = 20;
        }
        if (this.isStatus()){
            this.setSaldo(getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso!");
        }else{
            System.out.println("Não é possível pagar a mensalidade de contas inativas");
        }   
        
    }
    //Métodos Especiais (Getters, Setters e Constructors)
    public ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }
    public int getNumConta(){
        return this.numConta;
    }
    public void setNumConta(int n){
        this.numConta = n;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    public String getDono(){
        return this.dono;
    }
    public void setDono(String d){
        this.dono = d;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float s){
        this.saldo = s;
    }
    public boolean isStatus(){
        return status;
    }
    public void setStatus(boolean stat){
        this.status = stat;
    }
} 
