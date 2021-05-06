/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesorandomico;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

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

    public IngresoDP() {
    }

    public void definirClave(int clave) {
        this.clave = clave;
    }

    public int obtenerClave() {
        return clave;
    }

    public void definirNombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void defirnirEdad(int edad) {
        this.edad = edad;
    }

    public int obtenerEdad() {
        return edad;
    }

    public void grabarDatos() {
        String raiz = System.getProperty("user.dir");
        try {
            File arch = new File(raiz + "\\archivo1.dat");
            RandomAccessFile archivo = new RandomAccessFile(arch, "rw");

            if (archivo.length() != 0) {
                archivo.seek(archivo.length());
                archivo.writeInt(clave);
                archivo.writeChars(nombre);
                archivo.writeInt(edad);
                archivo.close();
            } else {
                archivo.writeInt(clave);
                archivo.writeChars(nombre);
                archivo.writeInt(edad);
                archivo.close();
            }
        } catch (IOException e) {
            System.out.println("errore en el ingreso");
        }

    }

}
