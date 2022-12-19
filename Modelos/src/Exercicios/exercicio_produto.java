package Exercicios;
import java.util.Locale;
import java.util.Scanner;


public class exercicio_produto {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		String produto;
		float valor;
		
		for (int i =0; i<3; i++) {

		System.out.println("Informe o "+(i+1) +"Produto ");
		produto=sc.next();
        System.out.println("Informe o valor do Produto");
		valor=sc.nextFloat();
		System.out.println("Produto: "+ produto +" Valor R$"+valor);
		System.out.println("--------------------------------------------------------------");
    
}
    }
    }
