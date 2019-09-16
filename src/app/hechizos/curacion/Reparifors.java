package app.hechizos.curacion;

/**
 * Reparifors
 */
public class Reparifors extends HechizoCuracion {

    public Reparifors(String nombre, int nivelDaño, int nivelCuracion, int nivelEnergiaMagica, boolean esOscuro) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica, esOscuro);
    }
    public Reparifors() {
        super("Reparifors", 0, 20, 10, false);
    }

    @Override
    public String getTipoHechizo() {
		return "curacion";
	}
}