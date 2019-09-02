package app.hechizos;

/**
 * Hechizo
 */
public class Hechizo {
    public String nombre;
    public int nivelDaño;
	public int nivelCuracion;
	public int nivelEnergiaMagica;

    public Hechizo(String nombre, int nivelDaño, int nivelCuracion, int nivelEnergiaMagica) {
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

	public void setNivelDaño(int nivelDaño) {
		this.nivelDaño = nivelDaño;
	}

	public double getNivelCuracion() {
		return nivelCuracion;
	}

	public void setNivelCuracion(int nivelCuracion) {
		this.nivelCuracion = nivelCuracion;
	}

}