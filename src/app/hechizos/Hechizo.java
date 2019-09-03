package app.hechizos;

/**
 * Hechizo
 */
public class Hechizo {
    public String nombre;
    public double nivelDaño;
	public double nivelCuracion;
	public int nivelEnergiaMagica;

    public Hechizo(String nombre, double nivelDaño, double nivelCuracion, int nivelEnergiaMagica) {
        this.nombre = nombre;
        this.nivelDaño = nivelDaño;
		this.nivelCuracion = nivelCuracion;
		this.nivelEnergiaMagica = nivelEnergiaMagica;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNivelDaño() {
		return nivelDaño;
	}

	public void setNivelDaño(double nivelDaño) {
		this.nivelDaño = nivelDaño;
	}

	public double getNivelCuracion() {
		return nivelCuracion;
	}

	public void setNivelCuracion(double nivelCuracion) {
		this.nivelCuracion = nivelCuracion;
	}

}