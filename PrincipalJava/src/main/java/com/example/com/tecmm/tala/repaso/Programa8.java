package com.example.com.tecmm.tala.repaso;

import java.util.Scanner;

/**
 * Created by Gio on 22/02/2018.
 */

public class Programa8 {
    public void nombre(){
        System.out.println("Programa que repite un nombre x veces");
        System.out.println("_____________________________________");
        System.out.println("Intruduce un nombre: ");
        Scanner leer=new Scanner(System.in);
        String nom=leer.nextLine();
        System.out.println("Introduce el numero de veces que deseas repetir el nombre: ");
        int v=leer.nextInt();
        for (int i=1;i>=v; i++){
            System.out.println(nom+" "+i+" vez");
        }
    }
}
