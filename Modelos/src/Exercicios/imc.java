package Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Locale.setDefault(Locale.US);	
		
		double peso,altura,retorno=0;
		String sexo = null;
	
		for (int i=0;  i<3; i++) {
		
		System.out.print("Informe o seu sexo: ");
		sexo=sc.next();
		System.out.print("Inorme a sua Altura: ");
		altura=sc.nextDouble();
		System.out.print("Informe o seu Peso: ");
		peso=sc.nextDouble();
		
		retorno= peso/(altura*altura);
		if (sexo =="F" && retorno <19.1) {
			System.out.println("Mulher está abaixo do Peso ");
		}
		else if(sexo=="M" && retorno< 20.7) {
			System.out.println("Homem está abaixo do Peso ");
		}
		else if(sexo== "F" && retorno>19.1 && retorno<25.8) {
			System.out.println("Mulher no Peso Normal ");
		}
		else if (sexo== "M" && retorno>20.7 && retorno<26.4) {
			System.out.println("Homem no Peso Normal ");
		}
		else if (sexo== "F" && retorno>25.8 && retorno<27.3) {
			System.out.println("Mulher marginalmente acima do peso");
		}
		else if (sexo== "M" && retorno>26.4 && retorno<27.8) {
			System.out.println("Homem marginalmente acima do peso");
		}
		else if(sexo== "F" && retorno>27.3 && retorno<32.3) {
			System.out.println("Mulher  acima do peso ideal");
		}
		else if(sexo== "M" && retorno>27.8 && retorno<31.3) {
			System.out.println("Homem  acima do peso ideal");
		}
		else if(sexo== "F" && retorno>32.3) {
			System.out.println("Mulher Obesa ");
		}
		else if(sexo== "M" && retorno>31.1) {
			System.out.println("Homem Obeso ");
		}

    
}
    }
}
