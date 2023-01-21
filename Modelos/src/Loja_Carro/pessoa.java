package Loja_Carro;

public class pessoa extends Carro{
    private String nome;
    private String cpf;
    private String telefone;

    public pessoa() {

    }

    public pessoa(String dono,String placa,String marca, String modelo,int ano, float valorAproximado,String nome, String cpf, String telefone) {
        super(dono, placa, marca, modelo, ano, valorAproximado);
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

public String getNome(){
    return this.nome;
}
public void setNome(String nome){
    this.nome=nome;
}
public String getCpf(){
    return this.cpf;
}
public void setCpf(String cpf){
    this.cpf=cpf;
}
public String getTelefone(){
    return this.telefone;
}
public void setTelefone(String telefone){
    this.telefone=telefone;
}
















}
