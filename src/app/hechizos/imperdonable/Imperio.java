package app.hechizos.imperdonable;

/**
 * Imperio
 */
public class Imperio extends HechizoImperdonable{

    public Imperio(String nombre, double nivelDaño, double nivelCuracion) {
        super(nombre, nivelDaño, nivelCuracion);
    }
    public Imperio(){
        super("Imperio", 300, 0);
    }
    

    
}