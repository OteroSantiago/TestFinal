/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Santiago
 */
public class Empleado extends Persona {//Si se define una clase como final, no pueden haber subclases
    //Si quitamos el final en el metodo de la padre, debemos escribir @override en la clase hija
    //metodo imprimir sobreescrito en clase hija
    @Override
    public void imprimir(){
        System.out.println("Imprimir desde hija");
    }
}
