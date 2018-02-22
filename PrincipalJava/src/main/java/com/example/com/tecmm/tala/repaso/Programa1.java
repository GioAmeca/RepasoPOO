package com.example.com.tecmm.tala.repaso;
import java.util.Scanner;
/**
 * Created by Gio on 21/02/2018.
 */

public class Programa1 {
    public void Area(){
        double a,b;
        System.out.println(">>>Programa que calcula el area de un triangulo<<<");
        System.out.println("___________________________________________________");
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce el Base del triangulo: ");
        a=leer.nextDouble();
        System.out.println("Base: "+a+"  Introduce la Altura: ");
        b=leer.nextDouble();
        a=(a*b)/2;
        System.out.println("El area del triangulo es: "+a);


    }
}
