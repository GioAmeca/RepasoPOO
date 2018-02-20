package com.example.principaljava;

import com.example.clases.Carro;
import com.example.clases.Motocicleta;

public class Principal {
    public static void main(String[] args) {

        Carro cnuevo=new Carro();
        cnuevo.nombre="mazda";
        cnuevo.setColor("azul");
        cnuevo.setModelo(200);
        cnuevo.datosVehiculo();
        System.out.println();
        Carro cUsado=new Carro();
        cUsado.setModelo(1998);
        cUsado.nombre="Nissan";
        cUsado.setColor("Amarillo");
        cUsado.datosVehiculo();

        System.out.println("------------");
        Motocicleta moto= new Motocicleta();
        moto.setModelo(112);
        
        moto.setCasco(true);
        moto.setCantGazolina(30);
        moto.datosVehiculo();
        imprimeAutos(cnuevo,moto, cUsado);
    }

    public static void imprimeAutos(Carro...c) {
        System.out.println("imprimiendo");
        for (Carro carro: c)
            carro.datosVehiculo();

    }

}
