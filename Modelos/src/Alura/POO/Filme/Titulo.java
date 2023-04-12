package Alura.POO.Filme;

public class Titulo {
    private String nome;
    private double anoDeLancamento;
    private double duracaoEmMinutos;
    private String incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public double getAnoDeLancamento(){
        return anoDeLancamento;
    }
    public void setAnoDeLancamento(double anoDeLancamento){
        this.anoDeLancamento=anoDeLancamento;
    }
    public double getDuracaoEmMinutos(){
        return duracaoEmMinutos;
    }
    public void setDuracaoEmMinutos(double duracaoEmMinutos){
        this.duracaoEmMinutos=duracaoEmMinutos;
    }
    public String getIncluidoNoPlano(){
        return incluidoNoPlano;
    }
    public void setIncluidoNoPlano(String incluidoNoPlano){
        this.incluidoNoPlano=incluidoNoPlano;
    }
    public double getSomaDasAvaliacoes(){
        return somaDasAvaliacoes;
    }
    public void setSomaDasAvaliacoes(double somaDasAvaliacoes){
        this.somaDasAvaliacoes=somaDasAvaliacoes;
    }
    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }
    public void setTotalDeAvaliacoes(int totalDeAvaliacoes){
        this.totalDeAvaliacoes=totalDeAvaliacoes;
    }

    void exibeFichaTecnica(){
        System.out.println("Nome Informado "+getNome());
        System.out.println("Soma informada "+getSomaDasAvaliacoes());
        System.out.println("Quantidade de Avaliação "+getTotalDeAvaliacoes());
        System.out.println("Ano de Lançamento "+getAnoDeLancamento());
    }

    void avalia(double soma ){
        somaDasAvaliacoes+=soma;
        this.totalDeAvaliacoes++;
    }
    double  pegaMedia(){
       return getSomaDasAvaliacoes()/getTotalDeAvaliacoes();
        
    }
    
}
