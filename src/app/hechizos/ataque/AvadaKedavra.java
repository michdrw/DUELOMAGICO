package app.hechizos.ataque;

/**
 * AvadaKedavra
 */
public class AvadaKedavra extends HechizoAtaque {
    
    public AvadaKedavra(String nombre, int nivelDaño, int nivelCuracion, int nivelEnergiaMagica, boolean esOscuro) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica, esOscuro);
    }
    
    @Override
    public String getTipoHechizo() {
		return "imperdonable";
	}

    public AvadaKedavra() {
        super("Avada Kedavra", 100, 0, 20, true);
    }
    
}