package app.personajes;

/**
 * Personajes
 */
public class Personaje {
    private int salud;
    private String nombre;
    private boolean estaVivo ;

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
        this.estaVivo = true;
    }

    public boolean isEstaVivo() {
        return estaVivo;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }


}