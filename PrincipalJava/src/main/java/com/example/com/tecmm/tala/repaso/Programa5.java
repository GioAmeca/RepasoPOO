package com.example.com.tecmm.tala.repaso;

import java.util.Scanner;

/**
 * Created by Gio on 21/02/2018.
 */

public class Programa5 {
    public void Doble(){
        System.out.println("Programa que da el doble o triple de  un numero");
        System.out.println("_______________________________________");
        System.out.println("Introduce un numero: ");
        Scanner leer= new Scanner(System.in);
        int a=leer.nextInt(),b;
        if (a>=50){
            b=a*3;
            System.out.println("el triple de "+a+" es "+b);

        }
        else{
            b=a*2;
            System.out.println("el doble de "+a+" es "+b);
        }

    }

}
