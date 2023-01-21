package Escola;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    public Aluno() {

    }

    // public Aluno(String nome,String sexo,int idade){
    // super(nome, sexo, idade);
    // }

    public Aluno(String nome, String sexo, int idade, int matricula, String curso) {
        super(nome, sexo, idade);
        this.matricula = matricula;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void informacao_aluno() {
        System.out.println("Informações do Aluno  ");
        System.out.println("Nome " + this.getNome());
        System.out.println("Idade " + this.getIdade());
        System.out.println("Sexo " + this.getSexo());
        System.out.println("Matricula " + this.getMatricula());
        System.out.println("Curso " + this.getCurso());
    }

}
