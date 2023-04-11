package Alura.Modulo1;
import java.util.*;

public class exercicio {
    public static void main(String[] args) {
        
        // Scanner joga o conteúdo que você digitar na tela para o syste,.out.print
        Scanner sc=new Scanner(System.in);

        // double é o tipo de dado e numero1,numero2 e numero3 são as variáveis que vão armazenar valores

        double numero1;
        double numero2;
        double numero3;

        // média só vai armazenar os dados do cálculo de numero1 , numero2 e numero3
        double media=0;

        // recebendo valor via teclado

        System.out.print("Informe o Primeira Nota  ");
        numero1=sc.nextDouble();
        System.out.print("Informe o Segunda Nota  ");
        numero2=sc.nextDouble();
        System.out.print("Informe o Terceira Nota ");
        numero3=sc.nextDouble();

        // Realizando a Média dos números 
        media=(numero1+numero2+numero3)/3;


        // informando na tela a média 
        System.out.println("Média informada dos números "+media);

        if (media <=4){
            System.out.println("Aluno reprovado ");
        }else if (media >4 && media <=6){
            System.out.println("Aluno Em recuperação ");
        }else{
            System.out.println("Aluno Aprovado ");
        }

        
    }


    
}
