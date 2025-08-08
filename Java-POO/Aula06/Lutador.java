public class Lutador {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //Métodos
    public void apresentar(){
        System.out.println("----------------------------------------------------------");
        System.out.printf("CHEGOU A HORA!! Apresentamos o lutador %s \n", getNome());
        System.out.printf("Diretamente de: %s \n", getNacionalidade());
        System.out.printf("com %s anos, \n", getIdade());
        System.out.printf("%s m de altura e \n", getAltura());
        System.out.printf("pesando %s KG. \n", getPeso());
        System.out.printf("Ganhou %s partidas, \n", getVitorias());
        System.out.printf("perdeu %s e \n", getDerrotas());
        System.out.printf("empatou %s! \n", getEmpates());
        System.out.println("----------------------------------------------------------");
    }
    public void status(){
        System.out.println(getNome());
        System.out.printf("é um peso %s, \n", getCategoria());
        System.out.printf("com %s vitórias \n", getVitorias());
        System.out.printf("%s derrotas \n", getDerrotas());
        System.out.printf("%s empates. \n", getEmpates());
    }
    public void ganharLuta(){
        this.setVitorias(getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(getEmpates() + 1);
    }
    //Métodos Especiais
    public void Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String no){
        this.nome = no;
    }
    public String getNacionalidade(){
        return nacionalidade;
    }
    public void setNacionalidade(String na){
        this.nacionalidade = na;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int id){
        this.idade = id;
    }
    public float getAltura(){
        return altura;
    }
    public void setAltura(float al){
        this.altura = al;
    }
    public float getPeso(){
        return peso;
    }
    public void setPeso(float pe){
        this.peso = pe;
        this.setCategoria();
    }
    private String getCategoria(){
        return categoria;
    }
    private void setCategoria(){
        if(this.getPeso() < 52.2){
            this.categoria = "Inválido";
        }else if(this.getPeso() <= 70.3){
            this.categoria = "Leve";
        }else if(this.getPeso() <= 83.9){
            this.categoria = "Médio";
        }else if(this.getPeso() <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.setCategoria("Inválido");
        }
    }
    public int getVitorias(){
        return vitorias;
    }
    public void setVitorias(int vi){
        this.vitorias = vi;
    }
    public int getDerrotas(){
        return derrotas;
    }
    public void setDerrotas(int de){
        this.derrotas = de;
    }
    public int getEmpates(){
        return empates;
    }
    public void setEmpates(int em){
        this.empates = em;
    }
}


