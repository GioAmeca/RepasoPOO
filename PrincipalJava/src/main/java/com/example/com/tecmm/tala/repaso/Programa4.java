package com.example.com.tecmm.tala.repaso;

import java.util.Scanner;

/**
 * Created by Gio on 21/02/2018.
 */

public class Programa4 {
    public  void horas(){
        System.out.println("Programa que recibe la hora del dia en \n" +
                           "en formato de 24 horas y lo cambiara a \n " +
                           " formato de 12 horas   ");
        System.out.println("__________________________________________");
        System.out.println("Introduse la hora al convertir");
        Scanner leer= new Scanner(System.in);
        double a,b;
        a=leer.nextDouble();
        if (a<=24){
        b=a-12;
        if (b>=0){
            System.out.println("las "+a +" horas son "+b+" P.M.");
        }
        else{
            System.out.println("las "+a +" horas son "+a+" A.M.");
        }}
        else{
            System.out.println("el dia solo tiene 24 horas");}

    }
}
