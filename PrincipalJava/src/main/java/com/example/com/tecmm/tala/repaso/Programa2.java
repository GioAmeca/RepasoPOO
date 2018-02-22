package com.example.com.tecmm.tala.repaso;

import java.util.Scanner;

/**
 * Created by Gio on 21/02/2018.
 */

public class Programa2 {
    public void IVA(){
        double a;
        System.out.println(">>>Programa que calcula el IVA de un producto<<<");
        System.out.println("___________________________________________________");
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce el precio del producto: ");
        a=leer.nextDouble();
        a=a+(a*.16);
        System.out.println("El precio final es: "+a);

    }
}
