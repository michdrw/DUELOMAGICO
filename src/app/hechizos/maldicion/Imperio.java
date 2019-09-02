package app.hechizos.maldicion;

/**
 * Imperio
 */
public class Imperio extends Maldicion{

    public Imperio(String nombre, double nivelDaño, double nivelCuracion) {
        super(nombre, nivelDaño, nivelCuracion);
    }
    public Imperio(){
        super("Imperio", 300, 0);
    }
    

    
}