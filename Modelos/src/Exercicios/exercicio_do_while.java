package Exercicios;
import java.util.Scanner;

public class exercicio_do_while {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String nome="lucas";
		
		do {	
			System.out.printf("Qual a situação  " );
			nome=sc.next();
		    if (nome.equalsIgnoreCase("salve")) {
			System.out.println("Estou Salvo");break;
		}else {
			System.out.println("Estou me Afogando ");
		}
			}while(true);
		
	}
    
}
