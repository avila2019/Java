package Alura.POO.Filme;
import java.util.*;

public class Filme_exercicio {
    Scanner sc = new Scanner(System.in);
    String nome ;
    double anoDeLancamento;
    double duracaoEmMinutos;
    String incluidoNoPlano;
    Double somaDasAvaliacoes;
    int totalDeAvaliacoes;

    void exibeFichaTecnica(){
        System.out.println("Nome informado "+nome);
        System.out.println("Soma das avaliações "+somaDasAvaliacoes);
        System.out.println("Media das avaliações "+totalDeAvaliacoes);
    }
    void avalia1(double soma ){
          somaDasAvaliacoes+=soma;
          totalDeAvaliacoes++;
    }
    double pegaMedia1(){
        return totalDeAvaliacoes/somaDasAvaliacoes;


    }






}
