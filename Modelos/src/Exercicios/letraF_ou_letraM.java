package Exercicios;

import java.util.Scanner;

public class letraF_ou_letraM {
    public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		String nome;
		while(true) {
			System.out.println("Informe a letra: ");
			nome=sc.next();
			if(nome.equalsIgnoreCase("fim"))break;
			
			if(nome.equalsIgnoreCase("f")){
				System.out.println("Feminino");
			}else if(nome.equalsIgnoreCase("m")) {
				System.out.println("Masculino");
			}else {
				System.out.println("Sexo inválido");
			}
        }
}   }
