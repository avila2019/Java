package Exercicios;

import java.util.ArrayList;

public class somaArray {
    public static void main(String[] args) {
		
		ArrayList<Double> numeros = new ArrayList<>();
		numeros.add(4.5);
		numeros.add(6.3);
		numeros.add(1.1);
		numeros.add(4.7);
		numeros.add(4.4);
		numeros.add(6.2);
		numeros.add(2.9);
		
		double valor=0;
		for(int i=0; i<numeros.size();i++) {
			valor= valor+numeros.get(i);
		}
		System.out.println(valor);
		
    
}
