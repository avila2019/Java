package Cadastro_pessoa;
import java.util.ArrayList;
import java.util.Scanner;


public class pessoa {
	private String nome;
	private int idade;
	private float peso;
	private int cpf;
	private int matricula;
	
	Scanner sc=new Scanner(System.in);
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public void coleta() {
		
		ArrayList<String> name = new ArrayList<>();
		ArrayList<Integer> valorinteiro = new ArrayList<>();
		ArrayList<Float> valorfloat = new ArrayList<>();
		
		for (int i=0; i<1; i++) {
			System.out.println("Informe o Nome ");
			this.nome=sc.next();
			name.add(nome);
			System.out.println("Informe a sua Idade ");
			this.idade=sc.nextInt();
			valorinteiro.add(idade);
			System.out.println("Informe o seu Peso ");
			this.peso=sc.nextFloat();
			valorfloat.add(peso);
			System.out.println("Informe seu CPF ");
			this.cpf=sc.nextInt();
			valorinteiro.add(cpf);
			System.out.println("Informe a sua Matricula ");
			this.matricula=sc.nextInt();
			valorinteiro.add(matricula);
			
	}
		System.out.printf("Nome informado "+name+"\n");
		System.out.println("Idade informada "+valorinteiro);
		
		
	
	

}
}
