package lojaCarro;

public class Carro {
	    //Atributos:
		private String marca;
		private String modelo;
		private String placa;
		private int ano;
		private double valorAproximado;
		private Pessoa dono;
		
		//Construtores:
		
		public Carro() {
			
		}
		
		public Carro(String marca, String modelo, String placa, int ano, double valosAproximado, Pessoa dono) {
			this.marca = marca;
			this.modelo = modelo;
			this.placa = placa;
			this.ano = ano;
			this.valorAproximado = valosAproximado;
			this.dono = dono;
		}

		//Métodos acessores:
		
		public String getPlaca() {
			return placa;
		}

		public void setPlaca(String placa) {
			this.placa = placa;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public int getAno() {
			return ano;
		}

		public void setAno(int ano) {
			this.ano = ano;
		}

		public double getValorAproximado() {
			return valorAproximado;
		}

		public void setValorAproximado(double valorAproximado) {
			this.valorAproximado = valorAproximado;
		}

		public Pessoa getDono() {
			return dono;
		}

		public void setDono(Pessoa dono) {
			this.dono = dono;
		}
}
