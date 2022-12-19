package Exercicios;
import java.util.Scanner;


public class exercicio_for {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int numero=2;
		String nome="hugo";
		
		for (int i=0; i<=(numero*2); i++) {
			System.out.print(i +"-"+nome+"\n");
			
		}
    }
}
