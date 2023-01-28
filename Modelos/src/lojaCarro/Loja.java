package lojaCarro;

import java.util.ArrayList;
import java.util.Scanner;

public class Loja extends Carro {

	    //Atributos:
		private int quantidade;
		private Pessoa proprietarioLoja;
		private ArrayList <Carro> carrosCadastrados = new ArrayList <> ();
		
		//Objeto para armazenar informações do dono do carro (nome, cpf, telefone)
		Pessoa dono = new Pessoa();
		Pessoa proprietario;
		
		Scanner sc = new Scanner (System.in);

		//Construtores:
		
		public Loja() {
			
		}
		
		public Loja(String marca, String modelo, String placa, int ano, double valorAproximado, Pessoa dono, int quantidade, Pessoa proprietarioLoja) {
			super(marca, modelo, placa, ano, valorAproximado, dono);
		}
		
		public Loja(int quantidade, Pessoa proprietarioLoja) {
			this.quantidade = quantidade;
			this.proprietarioLoja = proprietarioLoja;
		}

		//Métodos acessores:
		
		public int getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}

		public Pessoa getProprietarioLoja() {
			return proprietarioLoja;
		}

		public void setProprietarioLoja(Pessoa proprietarioLoja) {
			this.proprietarioLoja = proprietarioLoja;
		}

		//Métodos especiais: 
		//Método de cadastrar:
		public void cadastrarCarro() {
			System.out.println(" *======== CADASTRO DE CARROS ========* ");
			System.out.print("Digite o nome do(a) proprietário da loja: ");
			String nome = sc.nextLine();
			System.out.print("Digite o cpf do proprietário da loja: ");
			String cpf = sc.nextLine();
			System.out.print("Digite o telefone do proprietário da loja: ");
			String fone = sc.nextLine();
			
			//objeto onde fica armazenada as informações do proprietário;
			proprietario = new Pessoa (nome, cpf, fone);
			
			System.out.println("Seja bem vindo a loja do(a) " + proprietario.getNome());
			System.out.println("=========================================");
			System.out.print("Digite quantos carros deseja cadastrar: ");
			setQuantidade(sc.nextInt());
			sc.nextLine();
			System.out.println("=========================================");
		
			
			for(int i = 0; i < getQuantidade(); i++) {
     			System.out.println("CADASTRE O " + (i+1) + "° CARRO: ");
				System.out.print("Qual a marca do carro? ");
				setMarca(sc.nextLine());
				System.out.print("Qual o modelo do carro? ");
				setModelo(sc.nextLine());
				System.out.print("Qual a placa do carro? ");
				setPlaca(sc.nextLine());
				System.out.print("Qual o ano do carro? ");
				setAno(sc.nextInt());
				System.out.print("Qual o valor do carro? ");
				setValorAproximado(sc.nextDouble());
				sc.nextLine();
				System.out.println(" *==== CADASTRO DO PROPRIETÁRIO DO CARRO ====*");
				System.out.print("Qual o nome do dono do carro? ");
				dono.setNome(sc.nextLine());
				System.out.print("Qual o cpf do dono do carro? ");
				dono.setCpf(sc.nextLine());
				System.out.print("Qual o telefone do dono do carro? ");
				dono.setTelefone(sc.nextLine());
				System.out.println("==============================================");
			
				carrosCadastrados.add(new Carro(getMarca(), getModelo(), getPlaca(), 
						             getAno(), getValorAproximado(), 
						             new Pessoa (dono.getNome(), dono.getCpf(), dono.getTelefone())));
			}
		}
		
		//Método de Listar:
		public void ListarCarro() {
			System.out.println("*========== LISTA DE CARROS ===========*");
			System.out.println("Quantidade: " + getQuantidade());
			System.out.println("======================================");
			for (Carro c: carrosCadastrados) {
				System.out.println("Marca: "+ c.getMarca());
				System.out.println("Modelo: " + c.getModelo());
				System.out.println("Placa: " + c.getPlaca());
				System.out.println("Ano: " + c.getAno());
				System.out.println("Valor: " + c.getValorAproximado());
				System.out.println("Nome do dono: " + c.getDono().getNome());
				System.out.println("CPF: " + c.getDono().getCpf());
				System.out.println("Telefone: " + c.getDono().getTelefone());
		    System.out.println("=======================================");
			}
		}
		
		//Método de pesquisar:
		public void PesquisarCarro() {
			  System.out.println("*======= PESQUISAR CARRO =======*");
		      System.out.println("Digite a placa do carro que deseja procurar: ");
			  String placa = sc.next();
			  System.out.println("*========== CARRO ENCONTRADO ===========*");
			for (int i = 0; i < carrosCadastrados.size(); i++) {
				if (carrosCadastrados.get(i).getPlaca().equals(placa)) {
					System.out.println("Marca: "+ carrosCadastrados.get(i).getMarca());
					System.out.println("Modelo: " + carrosCadastrados.get(i).getModelo());
					System.out.println("Placa: " + carrosCadastrados.get(i).getPlaca());
					System.out.println("Ano: " + carrosCadastrados.get(i).getAno());
					System.out.println("Valor: " + carrosCadastrados.get(i).getValorAproximado());
					System.out.println("Nome do dono: " + carrosCadastrados.get(i).getDono().getNome());
					System.out.println("CPF: " + carrosCadastrados.get(i).getDono().getCpf());
					System.out.println("Telefone: " + carrosCadastrados.get(i).getDono().getTelefone());
				}
			}
		} 
		
		//Update carro:
		public void UpdateCarro() {
			//indicar o número da placa para pesquisa
			System.out.println("*===============================*");
			System.out.println("Digite o número da placa: ");
	        String placa = sc.next();
			System.out.println("*====== UPDATE DO CARRO ======*");
			for (int i = 0; i < carrosCadastrados.size(); i++) {
				if (carrosCadastrados.get(i).getPlaca().equals(placa)) {
					
					//remover informações daquela placa
				     carrosCadastrados.remove(i);
				     
				    
				    //Adicionar informações da pessoa:
				    System.out.print("Digite o nome: ");
				    dono.setNome(sc.next());
				    System.out.print("Digite o CPF: ");
				    dono.setCpf(sc.next());
				    System.out.print("Digite o Telefone: ");
				    dono.setTelefone(sc.next());
				    System.out.println("*===============================*");
				    
				    //nova instancia da lista na posição desejada
				    carrosCadastrados.add(new Carro(getMarca(), getModelo(), getPlaca(), 
				             getAno(), getValorAproximado(), 
				             new Pessoa (dono.getNome(), dono.getCpf(), dono.getTelefone())));
				    
				    
				    //Lista de atualição:
				    System.out.println("Marca: "+ carrosCadastrados.get(i).getMarca());
					System.out.println("Modelo: " + carrosCadastrados.get(i).getModelo());
					System.out.println("Placa: " + carrosCadastrados.get(i).getPlaca());
					System.out.println("Ano: " + carrosCadastrados.get(i).getAno());
					System.out.println("Valor: " + carrosCadastrados.get(i).getValorAproximado());
					System.out.println("Nome do dono: " + carrosCadastrados.get(i).getDono().getNome());
					System.out.println("CPF: " + carrosCadastrados.get(i).getDono().getCpf());
					System.out.println("Telefone: " + carrosCadastrados.get(i).getDono().getTelefone());
				}
			}
			System.out.println("*====================================*");
			System.out.println(" Update do carro realizado com sucesso!! ");
		}
		
		public void informcoesLoja() {
			System.out.println("*===========INFORMAÇÕES DO PROPRIETÁRIO============*");
			System.out.println("Nome do proprietário: " + proprietario.getNome());
			System.out.println("CPF do proprietário: " + proprietario.getCpf());
			System.out.println("Telefone do proprietário: " + proprietario.getTelefone());
		}
}
