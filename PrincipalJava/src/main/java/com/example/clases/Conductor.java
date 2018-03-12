package com.example.clases;

/**
 * Created by Gio on 26/02/2018.
 */

public abstract class Conductor implements OperacionesDatos {
    do
    public void metodo(){
        System.out.println("es el metodo 1");
    }
    @Override
    public void aumentar(){
        System.out.println("esta aumentando");

    }
    public abstract void comoConducir();
}
