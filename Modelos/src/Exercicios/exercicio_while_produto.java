package Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class exercicio_while_produto {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		String produto;
		float valor;
		int cont=0;
		while (true) {
			
			System.out.println("Informe o Produto ");
			produto=sc.next();
			if (produto.equalsIgnoreCase("fim"))break;{
				
			}
			System.out.println("Informe o valor do Produto");
			valor=sc.nextFloat();
			System.out.println("Produto: "+ produto +" Valor R$"+valor);
			
			
			
			
			
			cont++;
		}
    }
}
