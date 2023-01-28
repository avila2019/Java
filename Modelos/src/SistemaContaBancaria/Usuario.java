package SistemaContaBancaria;

public class Usuario {
    private String nome;
    private String email;
    private int idade;
    private int cpf;

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
    
    
    
}

