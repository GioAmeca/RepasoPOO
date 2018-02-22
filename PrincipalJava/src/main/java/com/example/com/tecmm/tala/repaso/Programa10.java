package com.example.com.tecmm.tala.repaso;

import java.util.Scanner;

/**
 * Created by Gio on 22/02/2018.
 */

public class Programa10 {
    public void factorial() {
        System.out.println("Programa que calcula el factorial de un numero");
        System.out.println("______________________________________________");
        System.out.println("Intruduce un numero: ");
        Scanner leer = new Scanner(System.in);
        int a,b=1;
        a=leer.nextInt();
        System.out.print(" el factorial de: "+ a + " es " );
        while(a!=0){
            b=b*a;
            a--;
        }
        System.out.println(b);
    }

}
