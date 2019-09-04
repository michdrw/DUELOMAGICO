package app.transporte;

/**
 * Tren
 */
public class HogwartsExpress extends Transporte{

    public HogwartsExpress(String nombre) {
        super(nombre);
    }

    @Override
    public String getTipoDeTransporte() {
        return "Terrestre";
    }
}