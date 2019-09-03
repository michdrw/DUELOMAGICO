package app.hechizos.imperdonable;

/**
 * Imperio
 */
public class Imperio extends HechizoImperdonable{

    public Imperio(String nombre, int nivelDaño, int nivelCuracion, int nivelEnergiaMagica, String tipoHechizo) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica, tipoHechizo);
    }
    public Imperio(){
        super("Imperio", 80, 0, 20, "imperdonable");
    }
    

    
}