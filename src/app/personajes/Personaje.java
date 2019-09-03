package app.personajes;

/**
 * Personajes
 */
public class Personaje {
    public double salud;
    public String nombre;

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Personaje(String nombre, double salud) {
        this.nombre = nombre;
        this.salud = salud;
    }


}