package com.inforcap.main;

import java.util.Scanner;

public class Solopares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cant,vistos,num;
        System.out.println("Ingrese la cantidad de numeros pares que desea visualizar: ");
        cant = sc.nextInt();
        vistos=0;
        num=0;
        while (cant>vistos){
            if (num %2==0) {
                System.out.println(num);
                vistos++;
            }
            num++;
            }
        }
    }

