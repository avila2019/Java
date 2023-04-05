package Alura_banco;
import java.util.*;

public class usuario {
    Scanner sc= new Scanner(System.in);
    private String nome;
    private String tipo_conta;
    private float saldo;
    private float transferir;


public  usuario(){

}

public String getNome(){
    return nome;
}
public void setNome(String nome){
    this.nome=nome;
}
public String getTipo_conta(){
    return tipo_conta;
}
public void setTipo_conta(String tipo_conta){
    this.tipo_conta=tipo_conta;
}
public float getSaldo(){
    return saldo;
}
public void setSaldo(float saldo){
    this.saldo=saldo;

}
public float getTransferir(){
    return transferir;
}
public void setTransferir(float transferir){
    this.transferir=transferir;
}

public void cadastro(){
    System.out.print("Informe o Seu Nome:  ");
    this.nome=sc.next();
    System.out.print("Informe o Tipo da Conta: ");
    this.tipo_conta=sc.next();
    System.out.print("Informe o Saldo da sua conta:  ");
    this.saldo=sc.nextFloat();  
}
public void status(){
    System.out.println("Nome Informado: "+this.nome);
    System.out.println("Tipo da conta informada: "+tipo_conta);
    System.out.println("Saldo Inicial da conta: "+this.saldo);
    System.out.println("#########################################");
}
public void transferencia(){
    String condicao;
    System.out.println("Você deseja transferir o seu Dinheiro  Sim ou Nao ?");
    condicao=sc.next();
    if (condicao.equalsIgnoreCase("sim")){
    
    System.out.println("Informe quanto que você quer transferir ");
    this.transferir=sc.nextFloat();
    float minuta=0;
    minuta= this.saldo- this.transferir;
    System.out.println("Foi retirado "+this.transferir+" e você vai ficar com um saldo de "+minuta);
    }else{
        System.out.println("Foi um Prazer em te atender ");
    }

}
    
}
