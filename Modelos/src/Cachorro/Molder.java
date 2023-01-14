package Cachorro;
public class Molder {
	
	String nome,cor_pelo,situacao;
	float peso;
	boolean status;
	
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
	

    public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

public void novo(String nome,String cor_pelo,float peso,String situacao){

this.nome=nome;
this.cor_pelo=cor_pelo;
this.peso=peso;
this.situacao=situacao;

}
public void informacao() {
	System.out.println("Nome do Cachorro: "+getNome());
	System.out.println("Cor do Pelo: "+getCor_pelo());
	System.out.println("Peso do Cachorro: "+getPeso()+"kg");
	System.out.println("Situacao do cachorro ? "+getSituacao());
}
public void latir() {
	if(this.situacao.equalsIgnoreCase("comendo")){
		System.out.println("Cachorro não pode Latir pois está comendo");
	}else{
		System.out.println("Cachorro latindo ");
	}
	
}

public void comer() {
	if(this.situacao.equalsIgnoreCase("latindo")){
		System.out.println("Cachorro comendo não pode latir ");
	}else{
		System.out.println("Cachorro comendo ");

	}

	
}

}
