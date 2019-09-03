package app.hechizos.imperdonable;

/**
 * Imperio
 */
public class Imperio extends HechizoImperdonable{

    public Imperio(String nombre, double nivelDaño, double nivelCuracion, int nivelEnergiaMagica ) {
        super(nombre, nivelDaño, nivelCuracion, nivelEnergiaMagica);
    }
    public Imperio(){
        super("Imperio", 300, 0, 30);
    }
    

    
}