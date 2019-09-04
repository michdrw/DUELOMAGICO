package app.hechizos;

/**
 * Hechizo
 */
public abstract class Hechizo {
    private String nombre;
    private int nivelDaño;
	private int nivelCuracion;
	private int nivelEnergiaMagica;
	private String tipoHechizo;

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

	public int getNivelDaño() {
		return nivelDaño;
	}

	public void setNivelDaño(int nivelDaño) {
		this.nivelDaño = nivelDaño;
	}

	public int getNivelCuracion() {
		return nivelCuracion;
	}

	public void setNivelCuracion(int nivelCuracion) {
		this.nivelCuracion = nivelCuracion;
	}

	public int getNivelEnergiaMagica() {
		return nivelEnergiaMagica;
	}

	public void setNivelEnergiaMagica(int nivelEnergiaMagica) {
		this.nivelEnergiaMagica = nivelEnergiaMagica;
	}

	public String getTipoHechizo() {
		return "desconocido";
	}

	public void setTipoHechizo(String tipoHechizo) {
		this.tipoHechizo = tipoHechizo;
	}
}