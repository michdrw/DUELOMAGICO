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
    private boolean esOscuro;

    public Hechizo(String nombre, int nivelDaño, int nivelCuracion, int nivelEnergiaMagica, boolean esOscuro) {
		this.nombre = nombre;
		this.nivelDaño = nivelDaño;
		this.nivelCuracion = nivelCuracion;
		this.nivelEnergiaMagica = nivelEnergiaMagica;
		this.esOscuro = esOscuro;
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

	public boolean isEsOscuro() {
		return esOscuro;
	}

	public void setEsOscuro(boolean esOscuro) {
		this.esOscuro = esOscuro;
	}

	
}