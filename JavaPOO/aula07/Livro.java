package aula07;

public class Livro implements Publicacao {
    //Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    //Métodos
        public String detalhes() {
        return "Livro [titulo=" + titulo + 
            "\n, autor=" + autor + 
            "\n, totPaginas=" + totPaginas + 
            "\n, pagAtual=" + pagAtual + 
            "\n, aberto=" + aberto + 
            "\n, leitor=" + leitor.getNome() +
            "\n, idade=" + leitor.getIdade() + 
            "\n, sexo=" + leitor.getSexo() +"]";
    }
    //Métodos Especiais
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.aberto = false;
        this.pagAtual = 0;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String t) {
        this.titulo = t;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String a) {
        this.autor = a;
    }
    public int getTotPaginas() {
        return totPaginas;
    }
    public void setTotPaginas(int tp) {
        this.totPaginas = tp;
    }
    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pa) {
        this.pagAtual = pa;
    }
    public boolean isAberto() {
        return aberto;
    }
    public void setAberto(boolean a) {
        this.aberto = a;
    }
    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa l) {
        this.leitor = l;
    }
    @Override
    public void abrir() {
        this.aberto = true;
    }
    @Override
    public void fechar() {
        this.aberto = false;
    }
    @Override
    public void folhear(int p) {
        this.pagAtual = p;
    }
    @Override
    public void avançarPag() {
        this.pagAtual++;
    }
    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
}
    