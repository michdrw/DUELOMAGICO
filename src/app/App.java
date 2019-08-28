package app;

import app.interfaces.IHacerMagia;
import app.personajes.Personaje;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Inicializando Catalogo de personajes");
        DueloMagico.inicializarCatalogoPersonajes();

        IHacerMagia personajeElegido = (IHacerMagia) DueloMagico.elegirPersonaje("Dudley Dursley");
        IHacerMagia enemigoElegido = (IHacerMagia) DueloMagico.elegirPersonaje("Dobby");

        
     //   personajeElegido.atacar(enemigoElegido, ha1);
    }
}