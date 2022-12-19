package Exercicios;
import java.util.Scanner;

public class exercicioWhile {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int numero =123;
		String nome="lucas";
		while (true) {
		System.out.println("Digite o Código   ");
		int digitado=sc.nextInt();
		
		if (digitado == 123) {
			System.out.println("Estou Salvo");break;
		}else {
			System.out.println("Numero errado ");
		}
    }
    
}
}
