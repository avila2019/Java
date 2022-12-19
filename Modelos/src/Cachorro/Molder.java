package Cachorro;
public class Molder {
	
	String nome,cor_pelo;
	float peso;
	
public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor_pelo() {
		return cor_pelo;
	}

	public void setCor_pelo(String cor_pelo) {
		this.cor_pelo = cor_pelo;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

public void novo(String nome,String cor_pelo,float peso){

this.nome=nome;
this.cor_pelo=cor_pelo;
this.peso=peso;

}
public void informacao() {
	System.out.println("Nome do Cachorro: "+getNome());
	System.out.println("Cor do Pelo: "+getCor_pelo());
	System.out.println("Peso do Cachorro: "+getPeso()+"kg");
}
public void latir() {
	System.out.println("Cachorro latindo ");
}

public void comer() {
	System.out.println("Cachorro comendo ");
}

}
