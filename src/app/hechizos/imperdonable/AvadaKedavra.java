package app.hechizos.imperdonable;

/**
 * AvadaKedavra
 */
public class AvadaKedavra extends HechizoImperdonable {

    public AvadaKedavra(String nombre, int nivelDaño, int nivelCuracion, int nivelEnergiaMagica, String tipoHechizo) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica, tipoHechizo);
    }

    public AvadaKedavra() {
        super("Avada Kedavra", 100, 0, 20, "imperdonable");
    }
}