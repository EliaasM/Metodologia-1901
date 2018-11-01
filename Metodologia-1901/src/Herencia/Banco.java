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
        TarjetaCredito tCredito=new TarjetaCredito();
        tCredito.setNumero(1234);
        tCredito.setNombre("Banamex");
        tCredito.setTipo("Credito");
        
        TarjetaAhorro tAhorro=new TarjetaAhorro();
        tAhorro.setNumero(4321);
        tAhorro.setNombre("Bancomer");
        tAhorro.setTipo("Ahorro");       
        
        TarjetaNomina tNomina=new TarjetaNomina();
        tNomina.setNumero(777);
        tNomina.setNombre("HSBC");
        tNomina.setTipo("Nomina");
        
    }
}
