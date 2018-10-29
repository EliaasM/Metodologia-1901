/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author T-107
 */
public class Banco {
    public static void main(String[] args) {
        //Primero creamos tarjeta de credito
        TarjetaCredito t1=new TarjetaCredito();
        //Le asignamos un numero
        t1.setNumero(666);
        
        //Creamos tarjeta de ahorro
        TarjetaAhorro t2=new TarjetaAhorro();
        //Le asignamos un numero
        
        
        //Creamos tarjeta de nomina
        //TarjetaNomina t3=new TarjetaNomina();
        //Le asignamos un numero
        //t3.numero=-666;
        
        System.out.println("El numero de la tarjeta es "+t1.getNumero());
    }
}
