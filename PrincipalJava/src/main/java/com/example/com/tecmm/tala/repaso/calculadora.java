package com.example.com.tecmm.tala.repaso;

/**
 * Created by Gio on 27/02/2018.
 */

public class calculadora {
    double res;
    public static void main(String args[]){

        calculadora calc=new calculadora();
        calc.suma(13.4,39.2,78.9,98.4);
        calc.resta(1.2,8.9,7.6,6.7);
        calc.resta(1.3,-7.9,9.8);
        calc.multiplicacion(6.1,8.2,3.3,2.1,2.3);
        calc.multiplicacion(6.9,8.9,4.9,1.9);
        calc.multiplicacion(8.9,8,3);
    }
    void suma(double a ,double b,double c,double d){
        res=a+b+c+d;
    }
    void resta(double a ,double b,double c,double d){
        res=a-b-c-d;
    }
    void resta(double a ,double b,double c){
        res=a-b-c;
    }
    void multiplicacion(double a ,double b,double c,double d,double e){
        res=a*b*c*d*e;
    }
    void multiplicacion(double a ,double b,double c,double d){
        res=a*b*c*d;
    }
    void multiplicacion(double a ,double b,double c){
        res=a*b*c;
    }

}
