/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author T-107
 */
public class Probar {
    public static void main(String[] args) {
        Persona p=new Persona();
        p.altura=1.74f;
        p.peso=65;
        
        Imc x=new Imc();
        x.p=p;
        x.calcular();
        System.out.println("El valor del IMC "+x.valor);
    }    
}
