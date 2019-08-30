package app.hechizos.defensa;

/**
 * InnerCaveInmicum
 */
public class CaveInmicum extends HechizoDefensa {
	public CaveInmicum(String nombre, double nivelDaño, double nivelCuracion) {
		super(nombre, nivelDaño, nivelCuracion);
	}
    public CaveInmicum() {
        super("CaveInmicum", 0, 0);
    }
}