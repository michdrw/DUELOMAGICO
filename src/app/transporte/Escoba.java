package app.transporte;

/**
 * Escoba
 */
public class Escoba extends Transporte{

    public Escoba(String nombre) {
        super(nombre);
    }

    @Override
    public String getTipoDeTransporte() {
        return "Volador";
    }
}