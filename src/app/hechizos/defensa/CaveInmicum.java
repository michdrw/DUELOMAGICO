package app.hechizos.defensa;

/**
 * CaveInmicum
 */
public class CaveInmicum extends HechizoDefensa {

    public CaveInmicum (String nombre, int nivelDaño, int nivelCuracion, int nivelEnergiaMagica, boolean esOscuro) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica, esOscuro);
    }
    public CaveInmicum() {
        super("CaveInmicum", 0, 0, 10, false);
    }

    @Override
    public String getTipoHechizo() {
		return "defensa";
	}
}