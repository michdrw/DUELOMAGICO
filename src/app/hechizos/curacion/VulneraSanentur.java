package app.hechizos.curacion;

/**
 * VulneraSanentur
 */
public class VulneraSanentur extends HechizoCuracion {

    public VulneraSanentur(String nombre, int nivelDaño, int nivelCuracion, int nivelEnergiaMagica, String tipoHechizo) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica, tipoHechizo);
    }
    public VulneraSanentur() {
        super("Vulnera Sanentur", 0, 40, 10, "curacion");
    }

}