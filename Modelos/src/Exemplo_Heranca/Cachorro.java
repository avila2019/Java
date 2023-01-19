package Exemplo_Heranca;

public class Cachorro extends Mamifero{

    private String nome;
    private String cor;
    private String pelo;
    private double peso;

    public Cachorro(String sexo,int idade){
        super(sexo,idade);


    }
    public Cachorro(String sexo,int idade,String nome,String cor,String pelo,double peso){
        super(sexo,idade);
        this.nome=nome;
        this.cor=cor;
        this.pelo=pelo;
        this.peso=peso;
    }






    
}
