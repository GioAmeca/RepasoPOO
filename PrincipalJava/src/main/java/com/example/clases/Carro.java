package com.example.clases;
/**
 * Created by Gio on 19/02/2018.
 */
public class Carro {
    int modelo;
     public String color;
    public String nombre;

    public void  datosVehiculo(){
    int y=90;
        System.out.println(modelo+" "+ color+" "+ nombre);
        System.out.println("Corre a: "+ y +"Km");
    }
    public void setModelo(int m){
        modelo=m;
    }
    public void setColor(String color){
        this.color=color;
    }
}
