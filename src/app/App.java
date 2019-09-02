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

                Personaje personajeElegido = (Personaje) DueloMagico.elegirPersonaje1("Lucius Malfoy");

                Personaje enemigoElegido = (Personaje) DueloMagico.elegirPersonaje2("George Weasley");

                System.out.println("¡Comienza el duelo!");
                while (personajeElegido.salud > 0 && enemigoElegido.salud > 0) {

                        if (personajeElegido instanceof Wizard && ((Wizard) personajeElegido).energiaMagica > 0) {
                                System.out.println("");
                                System.out.println("¡Turno de " + personajeElegido.nombre + "!");
                                System.out.println("");
                                Hechizo hechizoElegido = ((Wizard) personajeElegido).getHechizo();
                                ((IHacerMagia) personajeElegido).atacar(enemigoElegido, hechizoElegido);
                                if (hechizoElegido.nivelDaño > 0) {
                                        System.out.println("El hechizo conjurado fue " + hechizoElegido.nombre
                                                        + " y le resta " + hechizoElegido.nivelDaño
                                                        + " de salud al enemigo.");
                                } else if (hechizoElegido.nivelCuracion > 0) {
                                        System.out.println("El hechizo conjurado fue " + hechizoElegido.nombre
                                                        + " y le suma " + hechizoElegido.nivelCuracion
                                                        + " de salud al personaje.");
                                } else {
                                        System.out.println("El hechizo conjurado fue " + hechizoElegido.nombre + " y no resta ni suma salud.");
                                }
                                System.out.println("La salud de " + ((Wizard) personajeElegido).nombre + " es de "
                                                + ((Wizard) personajeElegido).salud + ".");
                                System.out.println("La salud de " + enemigoElegido.nombre + " es de "
                                                + enemigoElegido.salud + ".");
                                System.out.println("La energia magica de " + ((Wizard) personajeElegido).nombre
                                                + " es de " + ((Wizard) personajeElegido).energiaMagica + ".");
                                System.out.println("");
                        }
                        if (enemigoElegido instanceof Wizard && ((Wizard) enemigoElegido).energiaMagica > 0
                                        && enemigoElegido.salud > 0) {

                                System.out.println("¡Turno de " + enemigoElegido.nombre + "!");
                                System.out.println("");
                                Hechizo hechizoElegido = ((Wizard) enemigoElegido).getHechizo();
                                ((IHacerMagia) enemigoElegido).atacar(personajeElegido, hechizoElegido);
                                if (hechizoElegido.nivelDaño > 0) {
                                        System.out.println("El hechizo conjurado fue " + hechizoElegido.nombre
                                                        + " y le resta " + hechizoElegido.nivelDaño
                                                        + " de salud al personaje.");
                                } else if (hechizoElegido.nivelCuracion > 0) {
                                        System.out.println("El hechizo conjurado fue " + hechizoElegido.nombre
                                                        + " y le suma " + hechizoElegido.nivelCuracion
                                                        + " de salud al enemigo.");
                                } else {
                                        System.out.println("El hechizo conjurado fue " + hechizoElegido.nombre + " y no resta ni suma salud.");
                                }
                                System.out.println("La salud de " + enemigoElegido.nombre + " es de "
                                                + enemigoElegido.salud + ".");
                                System.out.println("La salud de " + ((Wizard) personajeElegido).nombre + " es de "
                                                + ((Wizard) personajeElegido).salud + ".");
                                System.out.println("La energia magica de " + enemigoElegido.nombre + " es de "
                                                + ((Wizard) enemigoElegido).energiaMagica + ".");
                                System.out.println("");
                        }

                }

                if (personajeElegido.salud > enemigoElegido.salud) {
                        System.out.println("¡¡¡¡ " + personajeElegido.nombre + " ganó el duelo !!!!");
                } else {
                        System.out.println("¡¡¡¡ " + enemigoElegido.nombre + " ganó el duelo !!!!");
                }

        }

}
