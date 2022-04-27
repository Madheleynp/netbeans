/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reformad;

/**
 *
 * @author Unireformada
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    public Persona(String  nom, String ape, int ed){
    this.nombre=nom;
    this.apellido=ape;
    this.edad=ed;
    System.out.println("Se ejecuta el constructor de persona");
    System.out.println("El nombre es:"+nombre);
    System.out.println("El apellido es:"+apellido);
    System.out.println("La edad es:"+edad);
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}