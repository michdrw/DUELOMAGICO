package app.hechizos.imperdonable;

/**
 * Crucio
 */
public class Crucio extends HechizoImperdonable{

    public Crucio(String nombre, int nivelDaño, int nivelCuracion, int nivelEnergiaMagica ) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica);
    }
    public Crucio(){
        super("Crucio", 500, 0, 70);
    }

    
}