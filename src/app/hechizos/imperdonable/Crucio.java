package app.hechizos.imperdonable;

/**
 * Crucio
 */
public class Crucio extends HechizoImperdonable{

    public Crucio(String nombre, int nivelDaño, int nivelCuracion, int nivelEnergiaMagica) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica);
    }
    
    @Override
    public String getTipoHechizo() {
		return "imperdonable";
    }
    
    public Crucio(){
        super("Crucio", 70, 0, 20);
    }

    
}