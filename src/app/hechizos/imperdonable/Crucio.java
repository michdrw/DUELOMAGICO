package app.hechizos.imperdonable;

/**
 * Crucio
 */
public class Crucio extends HechizoImperdonable{

    public Crucio(String nombre, double nivelDaño, double nivelCuracion) {
        super(nombre, nivelDaño, nivelCuracion);
    }
    public Crucio(){
        super("Crucio", 500, 0);
    }

    
}