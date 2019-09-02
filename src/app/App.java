package app;

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

                System.out.println("¡¡¡¡¡Comienza el duelo!!!!!");
                while (personajeElegido.salud > 0 && enemigoElegido.salud > 0) {
                        if (personajeElegido instanceof Wizard && ((Wizard) personajeElegido).energiaMagica > 0) {
                                System.out.println("Turno de : " + personajeElegido.nombre);

                                ((IHacerMagia) personajeElegido).atacar(enemigoElegido,
                                                ((Wizard) personajeElegido).getHechizo());
                        }
                        if (enemigoElegido instanceof Wizard && ((Wizard) enemigoElegido).energiaMagica > 0) {
                                System.out.println("Turno de : " + enemigoElegido.nombre);
                                ((IHacerMagia) enemigoElegido).atacar(personajeElegido,
                                                ((Wizard) enemigoElegido).getHechizo());
                        }

                }

        }

}
