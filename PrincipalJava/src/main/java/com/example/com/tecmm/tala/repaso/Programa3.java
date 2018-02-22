package com.example.com.tecmm.tala.repaso;

import java.util.Scanner;

/**
 * Created by Gio on 21/02/2018.
 */

public class Programa3 {
     public void Temperatura(){
         double c,f,k;
         System.out.println("Programa que convierta grados celsius a fahrenheit y kelvin ");
         System.out.println("____________________________________________________________");
         System.out.println("Intruduce la temperatura en °C: ");
         Scanner leer =new Scanner(System.in);
         c=leer.nextDouble();
         f=(c*1.8)+32;
         k=c+273;
         System.out.println(" Tabla de Converciones");
         System.out.print("__________________\n" +
                            "  C  -  F  -  K  \n" +
                               c+" "+f+" "+k  +
                             "__________________\n");
       }
}
