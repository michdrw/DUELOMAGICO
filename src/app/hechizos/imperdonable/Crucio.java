package app.hechizos.imperdonable;

/**
 * Crucio
 */
public class Crucio extends HechizoImperdonable{

    public Crucio(String nombre, double nivelDaño, double nivelCuracion, int nivelEnergiaMagica ) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica);
    }
    public Crucio(){
        super("Crucio", 500, 0, 70);
    }

    
}