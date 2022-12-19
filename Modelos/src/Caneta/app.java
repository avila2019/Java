package Caneta;

public class app {
    public static void main(String[] args) {
		caneta n1=new caneta();
		
		n1.setModelo("Americanas");
		n1.setCor("Azul");
		n1.setPonta(1.2f);
		n1.setCarga(50);
		
		n1.escrever();
		n1.destampar();
		n1.rabiscar();

	}
    
}
