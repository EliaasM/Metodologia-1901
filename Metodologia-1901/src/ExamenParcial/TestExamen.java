/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenParcial;

/**
 *
 * @author T-107
 */
public class TestExamen {
    public static void main(String[] args) {
        Opcion op1=new Opcion("El Popocatepetl",false);
        Opcion op2=new Opcion("El Everest",true);
        Opcion op3=new Opcion("El Aconcagua",false);
        Opcion op4=new Opcion("El Pico de Orizaba",false);

        Opcion[] opciones={op1,op2,op3,op3};
        Pregunta p1=new Pregunta("Cual es la montaña mas alta del mundo",opciones);
        
        System.out.println(p1.titulo);
        for(Opcion opcion : opciones){
            System.out.println(opcion.titulo);
        }
        
        Opcion op11=new Opcion("Jalisco",false);
        Opcion op12=new Opcion("Michoacan",false);
        Opcion op13=new Opcion("Coahuila",true);
        Opcion op14=new Opcion("Tamaulipas",false);
        
        Opcion[] opciones1={op11,op12,op13,op14};
        Pregunta p2=new Pregunta("Todos los estados tienen costas excepto",opciones1);
        System.out.println(p2.titulo);
        for(Opcion opcion : opciones1){
            System.out.println(opcion.titulo);
        }
    }  
}
