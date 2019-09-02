package app.hechizos.imperdonable;

/**
 * AvadaKedavra
 */
public class AvadaKedavra extends HechizoImperdonable {

    public AvadaKedavra(String nombre, int nivelDaño, int nivelCuracion, int nivelEnergiaMagica) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica);
    }

    public AvadaKedavra() {
        super("Avada Kedavra", 1000, 0, 100);
    }
}