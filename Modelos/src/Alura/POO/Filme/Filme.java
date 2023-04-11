package Alura.POO.Filme;
import java.util.*;

public class Filme {
    
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaAvaliacao;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica(){
        System.out.println("Nome informado: "+nome);
        System.out.println("Soma avaliação: "+somaAvaliacao);
       
    }
    void avalia(double nota){
        somaAvaliacao+=nota;
        totalDeAvaliacoes++;
    }
    double pegaMedia(){
        return somaAvaliacao/totalDeAvaliacoes;
        
    }



}
