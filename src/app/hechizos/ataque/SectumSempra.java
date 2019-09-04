package app.hechizos.ataque;

/**
 * SeptuSempra
 */
public class SectumSempra extends HechizoAtaque {

    public SectumSempra(String nombre, int nivelDaño, int nivelCuracion, int nivelEnergiaMagica, String tipoHechizo) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica, tipoHechizo);
    }

    public SectumSempra() {
        super("Sectum Sempra", 40, 0, 10, "ataque");
    }
}