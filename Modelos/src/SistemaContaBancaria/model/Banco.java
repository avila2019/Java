package SistemaContaBancaria.model;

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

@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nome == null) ? 0 : nome.hashCode());
    result = prime * result + cnpj;
    result = prime * result + ((presidente == null) ? 0 : presidente.hashCode());
    return result;
}

@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Banco other = (Banco) obj;
    if (nome == null) {
        if (other.nome != null)
            return false;
    } else if (!nome.equals(other.nome))
        return false;
    if (cnpj != other.cnpj)
        return false;
    if (presidente == null) {
        if (other.presidente != null)
            return false;
    } else if (!presidente.equals(other.presidente))
        return false;
    return true;
}

@Override
public String toString() {
    return "Banco [nome=" + nome + ", cnpj=" + cnpj + ", presidente=" + presidente + "]";
}







}


