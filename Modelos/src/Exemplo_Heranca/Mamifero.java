package Exemplo_Heranca;

public class Mamifero {
    private String sexo;
    private int idade;

public Mamifero(String sexo,int idade){
    super();
    this.sexo=sexo;
    this.idade=idade;
}

public void amamentar(){
    System.out.println("Estou amamentando !!!! ");
}
public String getSexo(){
    return sexo;
} 
public void setSexo(String sexo){
    this.sexo=sexo;
} 
public int getIdade(){
    return idade;
} 
public void setIdade(int idade){
    this.idade=idade;
} 

}
