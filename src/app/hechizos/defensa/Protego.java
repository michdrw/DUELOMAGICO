package app.hechizos.defensa;

/**
 * Protego
 */
public class Protego extends HechizoDefensa {

    public Protego(String nombre, int nivelDaño, int nivelCuracion, int nivelEnergiaMagica) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica);
    }
    public Protego() {
        super("Protego", 0, 0, 10);
    }

    @Override
    public String getTipoHechizo() {
		return "defensa";
	}
}