package app.hechizos.ataque;

/**
 * PetrificusTotalus
 */
public class PetrificusTotalus extends HechizoAtaque {
    public PetrificusTotalus(String nombre, int nivelDaño, int nivelCuracion, int nivelEnergiaMagica, String tipoHechizo) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica, tipoHechizo);
    }
    public PetrificusTotalus() {
        super("Petrificus Totalus", 20, 0, 10, "ataque");
    }

}