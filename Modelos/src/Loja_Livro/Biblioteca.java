package Loja_Livro;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca extends Livros{
    private String nome;
    private String local;
    private String capacidade;
    private int sessao;
    private ArrayList <Livros> listaLivros = new ArrayList <Livros> ();
    
    // CONSTRUTOR VAZIO 

    public Biblioteca(){

    }

    // CONSTRUTOR COM ATRIBUTOS 

    public Biblioteca(String nome,String local,String capacidade,int sessao){
        this.nome=nome;
        this.local=local;
        this.capacidade=capacidade;
        this.sessao=sessao;

    }

    // GET E SET

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    public int getSessao() {
        return sessao;
    }

    public void setSessao(int sessao) {
        this.sessao = sessao;
    }

    // CADASTRO DE LIVRO 

    public void cadastroLivro(){
        Scanner sc=new Scanner(System.in);
        Livros livro = new Livros();

        System.out.println("#### CADASTRO DE LIVROS  ####");
        


    }

       
    
}
