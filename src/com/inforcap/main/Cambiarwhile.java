package com.inforcap.main;

public class Cambiarwhile {
    public static void main(String[] args) {
     /*
     Formato original
        int i = 0;
        while (i < 50) {
            i += 1;
            System.out.printf("Iteración %d\n", i);
        }
    }
}
*/
        int i = 1;
        do {
            if (i <= 50) {
                System.out.println("Iteracion " + i++);
            }
        } while (i <= 50);

    }
}