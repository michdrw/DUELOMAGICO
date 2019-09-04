package app.hechizos.imperdonable;

/**
 * Imperio
 */
public class Imperio extends HechizoImperdonable{

    public Imperio(String nombre, int nivelDaño,int nivelCuracion, int nivelEnergiaMagica) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica);
    }
    
    @Override
    public String getTipoHechizo() {
		return "imperdonable";
    }
    

    public Imperio(){
        super("Imperio", 80, 0, 20);
    }
    

    
}