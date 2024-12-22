package com.inforcap.main;

import java.util.Scanner;

public class Fibionacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Cuantos numeros de la serie fibionacci deseas visualizar: ");
        int cant = sc.nextInt();
        int num1,num2,num3,i;
        i=2;
        num1=0;
        num2=1;
        System.out.print(num1 + "|" + num2);
        while(i<=cant) {
            num3 = num1 + num2;
            System.out.print("|" + num3);
            num1 = num2;
            num2 = num3;

            i++;
        }
        }


    }

