package app.hechizos.ataque;

/**
 * PetrificusTotalus
 */
public class PetrificusTotalus extends HechizoAtaque {
    public PetrificusTotalus(String nombre,  double nivelDaño, double nivelCuracion, int nivelEnergiaMagica ) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica);
    }
    public PetrificusTotalus() {
        super("Petrificus Totalus", 50, 0, 10);
    }

}