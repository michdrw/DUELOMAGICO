package app.hechizos.curacion;

/**
 * VulneraSanentur
 */
public class VulneraSanentur extends HechizoCuracion {

    public VulneraSanentur(String nombre, double nivelDaño, double nivelCuracion) {
        super(nombre, nivelDaño, nivelCuracion);
    }
    public VulneraSanentur() {
        super("Vulnera Sanentur", 0, 80);
    }

}