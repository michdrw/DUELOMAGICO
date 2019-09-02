package app.personajes;

/**
 * Personajes
 */
public class Personaje {
    public int salud;
    public String nombre;

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Personaje(String nombre, int salud) {
        this.nombre = nombre;
        this.salud = salud;
    }


}