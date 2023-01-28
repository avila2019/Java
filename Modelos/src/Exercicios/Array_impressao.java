package Exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_impressao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();

        for (int i = 0; i <= 2; i++) {
            System.out.println("Informe os Números  ");
            num.add(sc.nextInt());
        }
        System.out.println("Números digitados " + num);

    }
}
