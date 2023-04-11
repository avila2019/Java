package Alura.POO.Filme;

public class Filme {
    String nome;
    Double anoDeLancamento;
    Double duracaoEmMinutos;
    String incluidoNoPlano;
    Double somaDasAvaliacoes;
    int totalDeAvaliacoes;

    
    void exibeFichaTecnica(){
        System.out.println("Nome Informado "+nome);
        System.out.println("Soma informada "+somaDasAvaliacoes);
        System.out.println("Quantidade de Avaliação "+totalDeAvaliacoes);
    }

    void avalia(double soma){
        somaDasAvaliacoes+=soma;
        totalDeAvaliacoes++;
    }
    Double pegaMedia(){
        return somaDasAvaliacoes/totalDeAvaliacoes;
    }
    
}
