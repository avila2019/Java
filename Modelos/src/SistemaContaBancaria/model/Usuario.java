package SistemaContaBancaria.model;

import java.util.Calendar;

public class Usuario {
    private String nome;
    private String email;
    private int idade;
    private int cpf;
    private Calendar dataNasc;
    

    public Usuario(){

    }

    public Usuario(String nome, String email, int idade, int cpf) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Calendar getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Calendar dataNasc) {
        this.dataNasc = dataNasc;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + idade;
        result = prime * result + cpf;
        result = prime * result + ((dataNasc == null) ? 0 : dataNasc.hashCode());
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
        Usuario other = (Usuario) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (idade != other.idade)
            return false;
        if (cpf != other.cpf)
            return false;
        if (dataNasc == null) {
            if (other.dataNasc != null)
                return false;
        } else if (!dataNasc.equals(other.dataNasc))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Usuario [nome=" + nome + ", email=" + email + ", idade=" + idade + ", cpf=" + cpf + ", dataNasc="
                + dataNasc + "]";
    }


    

    


    }

    
    
    
    
    
}

