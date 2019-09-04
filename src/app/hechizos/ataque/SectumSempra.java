package app.hechizos.ataque;

/**
 * SeptuSempra
 */
public class SectumSempra extends HechizoAtaque {

    public SectumSempra(String nombre, int nivelDaño, int nivelCuracion, int nivelEnergiaMagica) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica);
    }

    public SectumSempra() {
        super("Sectum Sempra", 40, 0, 10);
    }

    @Override
    public String getTipoHechizo() {
		return "ataque";
	}
}