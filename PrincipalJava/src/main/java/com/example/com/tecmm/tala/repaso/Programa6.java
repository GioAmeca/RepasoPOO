package com.example.com.tecmm.tala.repaso;

import java.util.Scanner;

/**
 * Created by Gio on 21/02/2018.
 */

public class Programa6 {
    public void Par(){
        System.out.println("Programa que indica si un numero es par o inpar");
        System.out.println("________________________________________________");
        System.out.println("Introduce un numero: ");
        Scanner leer= new Scanner(System.in);
        int a=leer.nextInt(),b;
        b=a%2;
        if (b==0){System.out.println(a+" es par");}
        else {
            System.out.println(a+" no es par");
        }
    }
}
