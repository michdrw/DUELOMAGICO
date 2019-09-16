package app.hechizos.ataque;

/**
 * SeptuSempra
 */
public class SectumSempra extends HechizoAtaque {

    public SectumSempra(String nombre, int nivelDaño, int nivelCuracion, int nivelEnergiaMagica, boolean esOscuro) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica, esOscuro);
    }

    public SectumSempra() {
        super("Sectum Sempra", 40, 0, 10, false);
    }

    @Override
    public String getTipoHechizo() {
		return "ataque";
	}
}