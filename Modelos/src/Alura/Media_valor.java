package Alura;
import java.util.*;

public class Media_valor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double media=0,nota=0;

        for (int i=0; i<3; i++){
            System.out.println("Diga a  "+(i+1)+" Nota da Avaliação ");
            nota=sc.nextDouble();
            media= media+nota/3;
        }
        System.out.println("Média recebida "+media);

        
    }

    
}
