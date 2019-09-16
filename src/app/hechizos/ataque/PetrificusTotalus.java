package app.hechizos.ataque;

/**
 * PetrificusTotalus
 */
public class PetrificusTotalus extends HechizoAtaque {
    public PetrificusTotalus(String nombre, int nivelDaño, int nivelCuracion, int nivelEnergiaMagica, boolean esOscuro) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica, esOscuro);
    }
    public PetrificusTotalus() {
        super("Petrificus Totalus", 20, 0, 10, false);
    }

    @Override
    public String getTipoHechizo() {
		return "ataque";
	}

}