package app.hechizos.ataque;

/**
 * PetrificusTotalus
 */
public class PetrificusTotalus extends HechizoAtaque {
    public PetrificusTotalus(String nombre, double nivelDaño, double nivelCuracion) {
        super(nombre, nivelDaño, nivelCuracion);
    }
    public PetrificusTotalus() {
        super("Petrificus Totalus", 50, 0);
    }

}