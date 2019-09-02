package app;

import app.hechizos.Hechizo;
import app.interfaces.IHacerMagia;
import app.personajes.Personaje;
import app.personajes.persona.Wizard;

public class App {

        public static void main(String[] args) throws Exception {

                System.out.println("Inicializando Catalogos");
                DueloMagico.agregarPoder();
                DueloMagico.agregarArtefactos();
                DueloMagico.inicializarCatalogoHechizos();
                DueloMagico.inicializarCatalogoPersonajes();

                Personaje personajeElegido = (Personaje) DueloMagico.elegirPersonaje1("Fred Weasley");

                Personaje enemigoElegido = (Personaje) DueloMagico.elegirPersonaje2("George Weasley");

                System.out.println("¡Comienza el duelo!");
                while (personajeElegido.salud > 0 && enemigoElegido.salud > 0) {

                        if (personajeElegido instanceof Wizard && ((Wizard) personajeElegido).energiaMagica > 0) {
                                System.out.println("");
                                System.out.println("Turno de : " + personajeElegido.nombre);
                                System.out.println("");
                                Hechizo hechizoElegido =  ((Wizard) personajeElegido).getHechizo();
                                ((IHacerMagia) personajeElegido).atacar(enemigoElegido, hechizoElegido);
                                                System.out.println("El hechizo utilizado fue " + hechizoElegido.nombre + ".");
                                                System.out.println("La salud de " + ((Wizard) personajeElegido).nombre + " es " + ((Wizard) personajeElegido).salud + ".");
                                                System.out.println("La salud de " + enemigoElegido.nombre + " es " + enemigoElegido.salud + ".");
                                                System.out.println("La energia magica de " + ((Wizard) personajeElegido).nombre + " es " + ((Wizard) personajeElegido).energiaMagica + ".");
                                                System.out.println("");
                        }
                        if (enemigoElegido instanceof Wizard && ((Wizard) enemigoElegido).energiaMagica > 0) {

                                System.out.println("Turno de : " + enemigoElegido.nombre);
                                System.out.println("");
                                Hechizo hechizoElegido =  ((Wizard) enemigoElegido).getHechizo();
                                ((IHacerMagia) enemigoElegido).atacar(personajeElegido,
                                                hechizoElegido);
                                                System.out.println("El hechizo utilizado fue " + hechizoElegido.nombre + ".");
                                                System.out.println("La salud de " + enemigoElegido.nombre + " es " + enemigoElegido.salud + ".");
                                                System.out.println("La salud de " + ((Wizard) personajeElegido).nombre + " es " + ((Wizard) personajeElegido).salud + ".");
                                                System.out.println("La energia magica de " + enemigoElegido.nombre + " es " + ((Wizard) enemigoElegido).energiaMagica + ".");
                                                System.out.println("");
                        }

                }

                if (personajeElegido.salud > enemigoElegido.salud) {
                System.out.println("¡¡¡¡ " + personajeElegido.nombre + " ganó el duelo!!!!");
                } else {
                        System.out.println("¡¡¡¡ " + enemigoElegido.nombre + " ganó el duelo!!!!");
                }

        }

}
