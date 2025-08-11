package aula07;

public class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private String sexo;

    //Métodos
    public void fazerAniver(){
        this.idade++;
    }
    
    //Métodos Especiais
    public Pessoa(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int i){
        this.idade = i;
    }
    public String getSexo(){
        return sexo;
    }
    public void setSexo(String s){
        this.sexo = s;
    }
}
