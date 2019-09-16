package app.hechizos.ataque;

/**
 * Crucio
 */
public class Crucio extends HechizoAtaque {
    
    public Crucio(String nombre, int nivelDaño, int nivelCuracion, int nivelEnergiaMagica, boolean esOscuro) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica, esOscuro);
    }
    
    @Override
    public String getTipoHechizo() {
		return "imperdonable";
    }
    
    public Crucio(){
        super("Crucio", 70, 0, 20, true);
    }
    
}