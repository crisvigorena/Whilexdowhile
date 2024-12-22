package com.inforcap.main;

import java.util.Scanner;

public class Sumaimpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros impares a sumar: ");
        int cant = sc.nextInt();
        int suma= 0;
        int i=0;
        while (i<=cant){
            if (i%2==1){
                suma+=i;
            }
            i++;
        }

            System.out.println("la suma de sus valores es: " + suma);
        }
    }
