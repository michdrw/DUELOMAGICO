package app;

import app.interfaces.IHacerMagia;
import app.personajes.Personaje;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Inicializando Catalogo de personajes");
        DueloMagico.inicializarCatalogoPersonajes();
        
        IHacerMagia personajeElegido = (IHacerMagia) DueloMagico.elegirPersonaje("Fred Weasley");
        IHacerMagia enemigoElegido = (IHacerMagia) DueloMagico.elegirPersonaje("George Weasley");
        //Poder poderelegido = personajeelegido.get 
        
        personajeElegido.atacar(enemigoElegido, ha1);
    }
}