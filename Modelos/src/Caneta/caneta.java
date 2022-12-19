package Caneta;

public class caneta {
	private String modelo;
	private String cor;
	private float ponta;
	private int carga;
	private boolean tampada;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getPonta() {
		return ponta;
	}
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	public int getCarga() {
		return carga;
	}
	public void setCarga(int carga) {
		this.carga = carga;
	}
	public boolean isTampada() {
		return tampada;
	}
	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}
	
	public void escrever() {
	System.out.println("Modelo da Caneta "+this.getModelo());
	System.out.println("Cor da Caneta "+this.getCor());
	System.out.println("Tamanho da Ponta "+this.getPonta());
	System.out.println("Carga da Caneta "+this.getCarga());
		
	}
	public void rabiscar() {
		if(this.tampada==true) {
			System.out.println("Eu não posso escrever pois está tampada ");
		}else {
			System.out.println("A caneta pode escrever ");
		}
		
	}
	public void pintar() {
		System.out.println("Estou pintando ");
		
	}
	public void tampar() {
		this.tampada=true;
	}
	public void destampar() {
		this.tampada=false;
	}
	

}
