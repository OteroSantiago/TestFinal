/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfinal;
import domain.Persona;
/**
 *
 * @author Santiago
 */
public class TestFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //La palabra final tiene diferentes significados depende de donde la usamos
        //En variables-> evita que podamos cambiar el valor que almacena una variable
        //En metodos->y estamos aplicando herencia, hace que la clase hija no pueda modificar el comportamiento de la padre
        //En clases->Evita que se cree una subclase
        final int variable = 10;
        System.out.println("variable ="+variable);
        //Intentamos modificar la variable
        //variable = 8;
        //Persona.Constante = 5;
        System.out.println("Constante: "+Persona.Constante);
        //Podemos ver como el valor de la Constante es el que le habiamos asignado en la clase
        
        //Intentamos modificar el objeto personas
        final Persona p1 = new Persona();
        //p1 = new Persona();//no deja
        p1.setNombre("Santiago");
        System.out.println(p1.getNombre());
    }
    
}
