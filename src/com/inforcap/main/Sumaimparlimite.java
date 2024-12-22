package com.inforcap.main;

import java.util.Scanner;

public class Sumaimparlimite {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int liminicio,limfin,suma,x;
        suma=0;
        System.out.println("Ingrese el valor de inicio superior a cero: ");
        liminicio= sc.nextInt();
        System.out.println("Ingrese el valor final superior al inicial: ");
        limfin= sc.nextInt();
        x=liminicio;
        while (x<=limfin){
            if(x%2==1){
                suma+=x;
            }
            x++;
        }
        System.out.println("La suma de sus valores entre: " + liminicio + " y " + limfin + " es: " +" " + suma);
    }
}
