package com.example.principaljava;

//import com.example.clases.Carro;
//import com.example.clases.Motocicleta;
import com.example.com.tecmm.tala.repaso.Programa1;
import com.example.com.tecmm.tala.repaso.Programa2;
import com.example.com.tecmm.tala.repaso.Programa3;
import com.example.com.tecmm.tala.repaso.Programa4;
import com.example.com.tecmm.tala.repaso.Programa5;
import com.example.com.tecmm.tala.repaso.Programa6;
import com.example.com.tecmm.tala.repaso.Programa7;
import com.example.com.tecmm.tala.repaso.Programa8;
import com.example.com.tecmm.tala.repaso.Programa9;
import com.example.com.tecmm.tala.repaso.Programa10;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println(">>>Repaso de poo con ejercicios basicos<<<");
        Scanner leer = new Scanner(System.in);
        int a=1;


        while (a!=0) {


            System.out.print("Seleccione su opcion: \n" +
                    "0.Salir.\n"+
                    "1.Area de un triangulo.\n" +
                    "2.IVA.\n" +
                    "3.Conversor de Medidas.\n" +
                    "4.Conversor de Horarios.\n" +
                    "5.Doble o Triple.\n" +
                    "6.Identifique pares o nones.\n" +
                    "7.Cambia un numero arabico a romano.\n"+
                    "8. Repetir un Nombre.\n"+
                    "9. Contar del 1 a 500.\n"+
                     "10.Factorial.");
            a = leer.nextInt();
            switch (a) {
                case 1: {
                    Programa1 area = new Programa1();
                    area.Area();
                }
                break;
                case 2: {
                    Programa2 iva = new Programa2();
                    iva.IVA();
                }
                break;
                case 3: {
                    Programa3 Tem = new Programa3();
                    Tem.Temperatura();
                }
                break;
                case 4: {
                    Programa4 hora = new Programa4();
                    hora.horas();
                }
                break;
                case 5: {
                    Programa5 doble = new Programa5();
                    doble.Doble();
                }
                break;
                case 6: {
                    Programa6 par = new Programa6();
                    par.Par();
                }
                break;
                case 7:{
                    Programa7 roma=new Programa7();
                    roma.roma();
                }
                break;
                case 8:{
                    Programa8 repetir=new Programa8();
                    repetir.nombre();
                }
                break;
                case 9:{
                    Programa9 contar=new Programa9();
                    contar.contar();
                }
                break;
                case 10:{
                    Programa10 fac=new Programa10();
                    fac.factorial();
                }
                break;

            }
            System.out.println("******************************************************");
        }



  /**5
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
   **/
    }
/**
    public static void imprimeAutos(Carro...c) {
        System.out.println("imprimiendo");
        for (Carro carro: c)
            carro.datosVehiculo();

    }**/

}
