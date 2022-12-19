package Exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class placar_Futebol {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		ArrayList<String> time1 = new ArrayList<>();
		ArrayList<String> time2 = new ArrayList<>();
		ArrayList<Integer> placartime1 = new ArrayList<>();
		ArrayList<Integer> placartime2 = new ArrayList<>();
		String nome;
		int numero;
		
		for(int i=0; i<2; i++) {
			System.out.println("Informe qual o time ?  ");
			nome=sc.next();
			
			
			if(nome.equalsIgnoreCase("time1")) {
				time1.add(nome);
				System.out.println("Informe o Número de Gols do TIME 1");
				numero=sc.nextInt();
				placartime1.add(numero);
			}else if (nome.equalsIgnoreCase("time2")) {
				time2.add(nome);
				System.out.println("Informe o Número de Gols do TIME 2");
				numero=sc.nextInt();
				placartime2.add(numero);
			}
			
		}
		System.out.printf("Time 1 "+time1+ "Placa  "+placartime1+"\n");
		System.out.printf("Time 2 "+time2+ "Placa  "+placartime2+"\n");
		if(placartime1.get(0)>placartime2.get(0)) {
			System.out.println("Time 1 é Campeão");
		}
		else {
			System.out.println("Time 2 é Campeão");
		}
    }
}
