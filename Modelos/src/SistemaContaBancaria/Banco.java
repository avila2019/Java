package SistemaContaBancaria;

public class Banco {
    private String nome;
    private int cnpj;
    private String presidente;
    


public Banco(){

}

public Banco(String nome, int cnpj, String presidente) {
    this.nome = nome;
    this.cnpj = cnpj;
    this.presidente = presidente;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public int getCnpj() {
    return cnpj;
}

public void setCnpj(int cnpj) {
    this.cnpj = cnpj;
}

public String getPresidente() {
    return presidente;
}

public void setPresidente(String presidente) {
    this.presidente = presidente;
}



}


