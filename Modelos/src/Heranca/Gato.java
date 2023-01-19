package Heranca;

public class Gato extends Mamifero {
    private String cor;
    private double peso;

   public Gato(String nome,String sexo, int idade){
    super(nome,sexo,idade);
   }

   public Gato(String nome,String sexo, int idade,String cor,double peso){
    super(nome, sexo, idade);
    this.cor=cor;
    this.peso=peso;
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
