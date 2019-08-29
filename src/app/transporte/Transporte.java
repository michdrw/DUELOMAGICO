package app.transporte;

import app.interfaces.IEsMagico;

/**
 * Transporte
 */
public class Transporte //implements IEsMagico 
{

    public String nombre;

    public Transporte(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

}