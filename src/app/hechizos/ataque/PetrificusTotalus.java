package app.hechizos.ataque;

/**
 * PetrificusTotalus
 */
public class PetrificusTotalus extends HechizoAtaque {
    public PetrificusTotalus(String nombre, int nivelDaño, int nivelCuracion, int nivelEnergiaMagica) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica);
    }
    public PetrificusTotalus() {
        super("Petrificus Totalus", 20, 0, 10);
    }

    @Override
    public String getTipoHechizo() {
		return "ataque";
	}

}