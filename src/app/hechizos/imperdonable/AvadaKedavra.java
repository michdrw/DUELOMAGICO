package app.hechizos.imperdonable;

/**
 * AvadaKedavra
 */
public class AvadaKedavra extends HechizoImperdonable{

    public AvadaKedavra(String nombre, double nivelDaño, double nivelCuracion) {
        super(nombre, nivelDaño, nivelCuracion);
    }
    public AvadaKedavra(){
        super("Avada Kedavra", 1000, 0);
    }
}