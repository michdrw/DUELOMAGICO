package app.hechizos.maldicion;

/**
 * AvadaKedavra
 */
public class AvadaKedavra extends Maldicion{

    public AvadaKedavra(String nombre, double nivelDaño, double nivelCuracion) {
        super(nombre, nivelDaño, nivelCuracion);
    }
    public AvadaKedavra(){
        super("Avada Kedavra", 500, 0);
    }
}