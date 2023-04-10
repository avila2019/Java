package Alura;
import java.util.*;

public class exercicio_desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome,tipo_conta;
        float saldo;
        int opcao=0;

        System.out.println("Informe o nome do colaborador  ");
        nome=sc.next();
        System.out.println("Informe o tipo da conta  ");
        tipo_conta=sc.next();
        System.out.println("Informe o Saldo do Cliente  ");
        saldo=sc.nextFloat();

        System.out.println("********************************************************************");
        System.out.println("********************************************************************");
        System.out.println("********************************************************************");



        String menu="""
        
        System.out.println("***** MENU ****************");
        System.out.println("**** DIGITE SUA OPÇÃO *****");
        System.out.println("1- CONSULTAR NOME");
        System.out.println("2- CONSULTAR TIPO CONTA ");
        System.out.println("3- CONSULTAR SALDO");
        System.out.println("4- SAIR");
               
               """;
        while(opcao != 4){
            System.out.println(menu);
            opcao=sc.nextInt();
            switch(opcao){
                case 1:
                System.out.print("OPÇÃO 1 :Nome Aplicado: "+nome+"\n");
                break;
                case 2:
                System.out.println("OPÇÃOO 2 :Tipo da conta Aplicada: "+tipo_conta);
                break;
                case 3:
                System.out.println("OPÇÃO 3 :Saldo da Conta Aplicada: "+saldo);
                break;



            }
                
            



        }
 
        




       
    










        
    }
    
}
