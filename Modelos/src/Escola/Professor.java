package Escola;

public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    public Professor(String nome,String sexo,int idade){
        super(nome, sexo, idade);
    }


    public Professor(String nome,String sexo,int idade,String especialidade,float salario){
        super(nome, sexo, idade);
        this.especialidade=especialidade;
        this.salario=salario;
    }
    public String getEspecialidade(){
        return especialidade;
    }
    public void setEspecialidade(String especialidade){
        this.especialidade=especialidade;
    }
    public float getSalario(){
        return salario;
    }
    public void setSalario(float salario){
        this.salario=salario;
    }
    
    public void informacao_Professor(){
        System.out.println("Informações do Professor  ");
        System.out.println("Nome "+this.getNome());
        System.out.println("Idade "+this.getIdade());
        System.out.println("Sexo "+this.getSexo());
        System.out.println("Matricula "+this.getEspecialidade());
        System.out.println("Curso "+this.getSalario());
    }





    
}
