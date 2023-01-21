package Escola;

public class Funcionario extends Pessoa {
    private String setor;
    private String trabalhando;

    public Funcionario() {

    }

    // public Funcionario(String nome,String sexo,int idade){
    // super(nome, sexo, idade);

    // }

    public Funcionario(String nome, String sexo, int idade, String setor, String trabalhando) {
        super(nome, sexo, idade);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(String trabalhando) {
        this.trabalhando = trabalhando;
    }

    public void informacao_Funcionario() {
        System.out.println("Informações do funcionário  ");
        System.out.println("Nome " + this.getNome());
        System.out.println("Idade " + this.getIdade());
        System.out.println("Sexo " + this.getSexo());
        System.out.println("Matricula " + this.getTrabalhando());
        System.out.println("Curso " + this.getSetor());
    }

}
