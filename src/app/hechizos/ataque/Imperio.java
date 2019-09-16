package app.hechizos.ataque;

/**
 * Imperio
 */
public class Imperio extends HechizoAtaque{

    public Imperio(String nombre, int nivelDaño,int nivelCuracion, int nivelEnergiaMagica, boolean esOscuro) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica, esOscuro);
    }
    
    @Override
    public String getTipoHechizo() {
		return "imperdonable";
    }
    

    public Imperio(){
        super("Imperio", 80, 0, 20, true);
    }

}