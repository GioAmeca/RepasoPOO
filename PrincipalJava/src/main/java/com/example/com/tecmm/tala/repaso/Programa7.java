package com.example.com.tecmm.tala.repaso;

import java.util.Scanner;

/**
 * Created by Gio on 22/02/2018.
 */

public class Programa7 {
    public void roma() {
        System.out.println("Programa que cambia un numero arabigo y lo muestra en Romano");
        System.out.println("_____________________________________________________________");
        System.out.println("Introduce un numero arabigo: ");
        Scanner leer= new Scanner(System.in);
        int a=leer.nextInt();
        if (a<=3){
            System.out.print(a + " es: ");
            for (int i=1; i<=a; i++){
                System.out.print("I");
            }
            System.out.println(" en romano");
        }
        if (a == 4) {
            System.out.println(a +" es: IV en romano");
        }
        if (a>=5&&a>7&&a<0){
            System.out.print(a +" es: V");
            int j=a-5;
            for (int i=0;i<j;i++){
                System.out.print("I");
            }
            System.out.println(" en romano");
        }
        if (a>7||a<0){
            System.out.println("error en el dato introducido ");
        }
    }
}
