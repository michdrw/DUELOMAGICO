package app.hechizos.maldicion;

/**
 * Crucio
 */
public class Crucio extends Maldicion{

    public Crucio(String nombre, double nivelDaño, double nivelCuracion) {
        super(nombre, nivelDaño, nivelCuracion);
    }
    public Crucio(){
        super("Crucio", 500, 0);
    }

    
}