/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesorandomico;

/**
 *
 * @author bryan
 */
public class IngresoDP {

    int clave;
    String nombre;
    int edad;

    public IngresoDP(int clave, String nombre, int edad) {
        this.clave = clave;
        this.nombre = nombre;
        this.edad = edad;
    }
    public IngresoDP()
    {
    }
    
    public void definirClave(int clave)
    {
        this.clave = clave;
    }
    
    public int obtenerClave()
    {
        return clave;
    }
    public void definriNombre(String nombre){
        this.nombre = nombre;
    }
    public String obtenerNombre()
    {
        return nombre;
    }
    public void defirnirEdad(int edad)
    {
        this.edad = edad;
    }
    public int obtenerEdad()
    {
        return edad;
    }
    
    public void grabarDatos(){
        
    }
    

}
