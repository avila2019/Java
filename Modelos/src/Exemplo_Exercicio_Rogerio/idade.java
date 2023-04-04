package Exemplo_Exercicio_Rogerio;
import java.util.*;


//Faça um algoritmo que leia quatro idades e calcule a média aritmética das
//mesmas;

public class idade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float idade1,idade2,idade3,idade4,media;

        System.out.print("Informe o Primeiro Numero:: ");
        idade1=sc.nextFloat();
        System.out.print("Informe o Segundo Numero:: ");
        idade2=sc.nextFloat();
        System.out.print("Informe o Terceiro Numero:: ");
        idade3=sc.nextFloat();
        System.out.print("Informe o Quarto Numero:: ");
        idade4=sc.nextFloat();

        media= (idade1+idade2+idade3+idade4)/4;

        System.out.printf("Média do total das idades = "+media);

      

      
        
    }
}
