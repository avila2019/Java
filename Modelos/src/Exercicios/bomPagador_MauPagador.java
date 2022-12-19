package Exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class bomPagador_MauPagador {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer> bompagador = new ArrayList<>();
		ArrayList<Integer> maupagador = new ArrayList<>();
		int numero=0;
		for (int i=0; i<5;i++) {
			System.out.println("Informe o Número ");
			numero=sc.nextInt();
			if(numero>0) {
				bompagador.add(numero);
			}else {
				maupagador.add(numero);
			}
		}
		System.out.printf("Lista de Bom Pagador "+bompagador+"\n");
		System.out.printf("Lista de Bom Mau Pagador "+maupagador);	

	}
    
}
