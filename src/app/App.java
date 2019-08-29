package app;
import java.util.Scanner;

import app.hechizos.Hechizo;
import app.interfaces.IHacerMagia;
import app.personajes.Personaje;


public class App {

    public static Scanner Teclado = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        System.out.println("Inicializando Catalogos");
        DueloMagico.inicializarCatalogoPersonajes();
        DueloMagico.agregarPoder();
        DueloMagico.agregarArtefactos();
        DueloMagico.inicializarCatalogoHechizos();
    


        Personaje personajeElegido = DueloMagico.elegirPersonaje("Fred Weasley");
        IHacerMagia enemigoElegido = (IHacerMagia) DueloMagico.elegirPersonaje("George Weasley");


        personajeElegido.atacar(enemigoElegido, personajeElegido.getHechizo());

        enemigoElegido.atacar(personajeElegido, enemigoElegido.getHechizo());


        /*String nombreMago1;
        String nombreMago2;

        System.out.println("Ingrese nombre del 1er personaje:");
        nombreMago1 = Teclado.nextLine();

        IHacerMagia personajeElegido = (IHacerMagia) DueloMagico.elegirPersonaje(nombreMago1);
        personajeElegido.aprender(new SeptuSempra());

        System.out.println("Ingrese nombre del 2do personaje:");
        nombreMago2 = Teclado.nextLine();
        IHacerMagia enemigoElegido = (IHacerMagia) DueloMagico.elegirPersonaje(nombreMago2);

        //Poder poderelegido = personajeelegido.get 
        System.out.println("La salud del personaje es: " + ((Personaje) personajeElegido).salud);
        System.out.println("La salud del enemigo es: " + ((Personaje) enemigoElegido).salud);

        Hechizo ha1 = new SeptuSempra();

        //personajeElegido.getArtefacto() 
        
        personajeElegido.atacar(((Personaje)enemigoElegido), ha1);
        System.out.println("La salud del enemigo es: " + ((Personaje) enemigoElegido).salud); */

        
    }
}