package app.hechizos.curacion;

/**
 * VulneraSanentur
 */
public class VulneraSanentur extends HechizoCuracion {

    public VulneraSanentur(String nombre, int nivelDaño, int nivelCuracion, int nivelEnergiaMagica) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica);
    }
    public VulneraSanentur() {
        super("Vulnera Sanentur", 0, 40, 10);
    }
   
    @Override
    public String getTipoHechizo() {
		return "curacion";
	}
}