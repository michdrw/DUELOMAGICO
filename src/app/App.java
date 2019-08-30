package app;

import app.hechizos.Hechizo;
import app.hechizos.ataque.SectumSempra;
import app.interfaces.IHacerMagia;
import app.personajes.Personaje;

public class App {

    public static void main(String[] args) throws Exception {

        System.out.println("Inicializando Catalogos");
        DueloMagico.inicializarCatalogoPersonajes();
        DueloMagico.agregarPoder();
        DueloMagico.agregarArtefactos();
        DueloMagico.inicializarCatalogoHechizos();

        Personaje personajeElegido = DueloMagico.elegirPersonaje("Fred Weasley");
        Personaje enemigoElegido = DueloMagico.elegirPersonaje("George Weasley");

        personajeElegido.atacar(enemigoElegido, personajeElegido.getHechizo());

        enemigoElegido.atacar(personajeElegido, enemigoElegido.getHechizo());

        System.out.println(
                "La salud de " + ((Personaje) personajeElegido).nombre + " es " + ((Personaje) personajeElegido).salud);
        System.out.println(
                "La salud de " + ((Personaje) enemigoElegido).nombre + " es " + ((Personaje) enemigoElegido).salud);

        while (personajeElegido.salud > 0) {
           // for (Personaje p : DueloMagico) {
            personajeElegido.atacar(enemigoElegido, personajeElegido.getHechizo());
            enemigoElegido.atacar(personajeElegido, enemigoElegido.getHechizo());

            System.out.println("La salud de " + ((Personaje) personajeElegido).nombre + " es "
                    + ((Personaje) personajeElegido).salud);
            System.out.println(
                    "La salud de " + ((Personaje) enemigoElegido).nombre + " es " + ((Personaje) enemigoElegido).salud);
                }
        }

        /*
         * String nombreMago1; String nombreMago2;
         * 
         * System.out.println("Ingrese nombre del 1er personaje:"); nombreMago1 =
         * Teclado.nextLine();
         * 
         * IHacerMagia personajeElegido = (IHacerMagia)
         * DueloMagico.elegirPersonaje(nombreMago1); personajeElegido.aprender(new
         * SectumSempra());
         * 
         * System.out.println("Ingrese nombre del 2do personaje:"); nombreMago2 =
         * Teclado.nextLine(); //IHacerMagia enemigoElegido2 = (IHacerMagia)
         * DueloMagico.elegirPersonaje(nombreMago2);
         * 
         * //Poder poderelegido = personajeelegido.get
         * System.out.println("La salud del personaje es: " + ((Personaje)
         * personajeElegido).salud); System.out.println("La salud del enemigo es: " +
         * ((Personaje) enemigoElegido).salud);
         * 
         * Hechizo ha1 = new SectumSempra();
         * 
         * //personajeElegido.getArtefacto()
         * 
         * personajeElegido.atacar(((Personaje)enemigoElegido), ha1);
         * 
         * }
         */
    }
