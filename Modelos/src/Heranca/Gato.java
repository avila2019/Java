package Heranca;

public class gato extends Mamifero{
    private String cor;
    private double peso;
  

public gato(String nome,String sexo,int idade){
    super(nome,sexo,idade);
}

public gato(String nome,String sexo,int idade,String cor,double peso){
    super(nome,sexo,idade);
    this.cor=cor;
    this.peso=peso;
    
}
public void imprimi(){
    System.out.println("Nome:  "+this.getNome());
    System.out.println("Sexo:  "+this.getSexo());
    System.out.println("Idade: "+this.getIdade());
    System.out.println("Cor:  "+this.getCor());
    System.out.println("Peso:  "+this.getPeso());
}

public String getCor(){
    return cor;
}
public void setCor(String cor){
    this.cor=cor;
}
public double getPeso(){
    return peso;
}
public void setPeso(double peso){
    this.peso=peso;
}










}
