package app.hechizos.ataque;

/**
 * SeptuSempra
 */
public class SectumSempra extends HechizoAtaque {

    public SectumSempra(String nombre,  double nivelDaño, double nivelCuracion, int nivelEnergiaMagica ) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica);
    }

    public SectumSempra() {
        super("Sectum Sempra", 90, 0, 10);
    }
}