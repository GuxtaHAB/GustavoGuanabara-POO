package aula08;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public void cancelarMatricula(){
        System.out.println("Sua matricula foi cancelada");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int m) {
        this.matricula = m;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String c) {
        this.curso = c;
    }
    
}
