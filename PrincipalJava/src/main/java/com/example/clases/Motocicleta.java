package com.example.clases;

/**
 * Created by Gio on 20/02/2018.
 */


public class Motocicleta extends Carro {
   boolean casco;
   int cantGazolina;

    @Override
    public void datosVehiculo() {
        super.datosVehiculo();
        System.out.println("casco "+isCasco()+" gas: "+ getCantGazolina());
    }

    public boolean isCasco() {
        return casco;
    }

    public void setCasco(boolean casco) {
        this.casco = casco;
    }

    public int getCantGazolina() {
        return cantGazolina;
    }

    public void setCantGazolina(int cantGazolina) {
        this.cantGazolina = cantGazolina;
    }
}

