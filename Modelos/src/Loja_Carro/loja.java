package Loja_Carro;

import java.util.ArrayList;
import java.util.Scanner;

public class loja extends Carro {
    private ArrayList<Carro> carrosCadastrados = new ArrayList<>();
    private int quantidade;
    private pessoa proprietarioLoja;

    Scanner sc = new Scanner(System.in);

    public loja() {

    }

    public loja(String dono, String placa, String marca, String modelo, int ano, float valorAproximado, int quantidade,
            String proprietaioLoja,
            String nome, String cpf, String telefone) {
        super(dono, placa, marca, modelo, ano, valorAproximado);
        this.quantidade = quantidade;

    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void cadastrarCarro() {
        Carro c = new Carro();
        pessoa p = new pessoa();

        // Setando informações da classe carro

        System.out.println("Informe o Nome do Dono do Carro  ");
        c.setDono(sc.next());
        System.out.println("Informe a Sua placa ");
        c.setPlaca(sc.next());
        System.out.println("Infome a Marca do Carro ");
        c.setMarca(sc.next());
        System.out.println("Informe o Modelo do Carro ");
        c.setModelo(sc.next());
        System.out.println("Informe o Ano do Carro");
        c.setAno(sc.nextInt());
        System.out.println("Informe o Valor r$");
        c.setValorAproximado(sc.nextFloat());
        System.out.println("Informe a Quantidade ");
        this.setQuantidade(sc.nextInt());

        // Setando informações da classe pessoa

        System.out.println("Informe o proprietário da Loja");
        p.setNome(sc.next());
        System.out.println("Informe o seu CPF ");
        p.setCpf(sc.next());
        System.out.println("Informe o seu Telefone ");
        p.setTelefone(sc.next());

        carrosCadastrados.add(p);
        carrosCadastrados.add(c);

    }

    public void listagem() {
        for (int i = 0; i < carrosCadastrados.size(); i++) {

            if (carrosCadastrados.size() > 0) {
                System.out.println(carrosCadastrados.size());
            } else {
                System.out.println("Não existe informações ");
            }

        }
    }

    public void pesquisar() {
        pessoa p = new pessoa();
       
        System.out.println("Informe a placa a ser Pesquisada ");
        p.setPlaca(inputnext);
        for (int i = 0; i < carrosCadastrados.size(); i++) {
             if(carrosCadastrados.get(i).getPlaca().equals(placa))


        

    }}

}
