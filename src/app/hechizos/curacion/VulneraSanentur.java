package app.hechizos.curacion;

/**
 * VulneraSanentur
 */
public class VulneraSanentur extends HechizoCuracion {

    public VulneraSanentur(String nombre, int nivelDaño, int nivelCuracion, int nivelEnergiaMagica, boolean esOscuro) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica, esOscuro);
    }
    public VulneraSanentur() {
        super("Vulnera Sanentur", 0, 40, 10, false);
    }
   
    @Override
    public String getTipoHechizo() {
		return "curacion";
	}
}