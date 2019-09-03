package app.hechizos.imperdonable;

/**
 * Crucio
 */
public class Crucio extends HechizoImperdonable{

    public Crucio(String nombre, int nivelDaño, int nivelCuracion, int nivelEnergiaMagica, String tipoHechizo) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica, tipoHechizo);
    }
    public Crucio(){
        super("Crucio", 70, 0, 20, "imperdonable");
    }

    
}