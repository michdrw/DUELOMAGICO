package app.hechizos.imperdonable;

/**
 * AvadaKedavra
 */
public class AvadaKedavra extends HechizoImperdonable {

    public AvadaKedavra(String nombre, int nivelDaño, int nivelCuracion, int nivelEnergiaMagica) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica);
    }
    
    @Override
    public String getTipoHechizo() {
		return "imperdonable";
	}

    public AvadaKedavra() {
        super("Avada Kedavra", 100, 0, 20);
    }
}