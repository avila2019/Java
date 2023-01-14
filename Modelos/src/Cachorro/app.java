package Cachorro;

public class app {

	public static void main(String[] args) {
		Molder n1= new Molder();
		
		n1.setNome("Gil");
		n1.setCor_pelo("Prata");
		n1.setPeso(1.2f);
		n1.setSituacao("comendo");
		
		n1.informacao();
		n1.latir();
		

	}

}
