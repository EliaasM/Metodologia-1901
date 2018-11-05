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
        tCredito.setSaldo(100);
        
        TarjetaAhorro tAhorro=new TarjetaAhorro();
        tAhorro.setNumero(4321);
        tAhorro.setNombre("Bancomer");
        tAhorro.setTipo("Ahorro");    
        tAhorro.setSaldo(100);
        
        TarjetaNomina tNomina=new TarjetaNomina();
        tNomina.setNumero(777);
        tNomina.setNombre("HSBC");
        tNomina.setTipo("Nomina");
        tNomina.setSaldo(100);
        
        //Generamos el codigo del deposito,,,Vamos hacerlo de la forma mas basica
        //Tarjeta de nomina
        //tNomina.pagar(150);
        //Tarjeta ahorro
        //tAhorro.pagar(150);
        //Tarjeta credito
        //tCredito.pagar(150);        
        
        //Generamos arreglo de tarjetas
        Tarjeta tarjetas[]=new Tarjeta[3];
        tarjetas[0]=tNomina;
        tarjetas[1]=tCredito;
        tarjetas[2]=tAhorro;
        
        //Iteramos el arreglo
        for(Tarjeta t: tarjetas){
            t.pagar(150);           
            System.out.println("Saldo es: "+t.getSaldo()+" Tipo "+t.getTipo());
        }
    }
}
