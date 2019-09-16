package app.hechizos.defensa;

/**
 * Protego
 */
public class Protego extends HechizoDefensa {

    public Protego(String nombre, int nivelDaño, int nivelCuracion, int nivelEnergiaMagica, boolean esOscuro) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica, esOscuro);
    }
    public Protego() {
        super("Protego", 0, 0, 10, false);
    }

    @Override
    public String getTipoHechizo() {
		return "defensa";
	}
}