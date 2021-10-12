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
public class Persona {
    //atributo
    public final static int Constante = 2;
    private String nombre;
    //metodo imrpimir en clase padre
    public void imprimir(){
        System.out.println("En la clase padre");
    }
    //getters and setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
