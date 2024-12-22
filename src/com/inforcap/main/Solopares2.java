package com.inforcap.main;

import java.util.Scanner;

public class Solopares2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cant,vistos,num;
        System.out.println("Ingrese la cantidad de pares a visualizar: ");
        cant = sc.nextInt();
        vistos=0;
        num=1;
        while (vistos<cant){
            if (num %2==0) {
                System.out.println(num);
                vistos++;
            }
            num++;
        }
    }
}
