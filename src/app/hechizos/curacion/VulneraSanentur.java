package app.hechizos.curacion;

/**
 * VulneraSanentur
 */
public class VulneraSanentur extends HechizoCuracion {

    public VulneraSanentur(String nombre, double nivelDaño, double nivelCuracion, int nivelEnergiaMagica ) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica);
    }
    public VulneraSanentur() {
        super("Vulnera Sanentur", 0, 80, 10);
    }

}