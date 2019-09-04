package app;

import app.artefactos.Artefacto;
import app.hechizos.Hechizo;
import app.interfaces.IHacerMagia;
import app.personajes.Personaje;
import app.personajes.persona.Wizard;
import app.transporte.Transporte;

public class App {

        public static void main(String[] args) throws Exception {

                System.out.println("Inicializando Catalogos");
                DueloMagico.agregarPoder();
                DueloMagico.agregarArtefactos();
                DueloMagico.inicializarCatalogoHechizos();
                DueloMagico.agregarTransportes();
                DueloMagico.inicializarCatalogoPersonajes();

                Personaje personajeElegido = (Personaje) DueloMagico.elegirPersonaje1("Fred Weasley");
                Artefacto artefactoPersonaje = ((Wizard) personajeElegido).getArtefacto();
                System.out.println("El personaje elegido es: " + personajeElegido.getNombre()
                                + " y su artefacto elegido es "
                                + artefactoPersonaje.getNombre());

                Personaje enemigoElegido = (Personaje) DueloMagico.elegirPersonaje2("Severus Snape");
                Artefacto artefactoEnemigo = ((Wizard) enemigoElegido).getArtefacto();
                System.out.println("El enemigo elegido es: " + enemigoElegido.getNombre()
                                + " y su artefacto elegido es "
                                + artefactoEnemigo.getNombre());

                System.out.println("¡Comienza el duelo!");
                while (personajeElegido.getSalud() > 0 && enemigoElegido.getSalud() > 0) {

                        if (personajeElegido instanceof Wizard && ((Wizard) personajeElegido).energiaMagica > 0) {
                                System.out.println("");
                                System.out.println("¡Turno de " + personajeElegido.getNombre() + "!");
                                System.out.println("");
                                Hechizo hechizoElegido = ((Wizard) personajeElegido).getHechizo();
                                ((IHacerMagia) personajeElegido).atacar(enemigoElegido, hechizoElegido);
                                if (hechizoElegido.getNivelDaño() > 0) {
                                        System.out.println("El hechizo conjurado fue " + hechizoElegido.getNombre()
                                                        + " y le resta " + hechizoElegido.getNivelDaño()
                                                        + " de salud al enemigo.");
                                        if (artefactoPersonaje.getAmplificadorDaño() > 0) {
                                                System.out.println("La potencia del hechizo fue amplificada "
                                                                + artefactoEnemigo.getAmplificadorDaño()
                                                                + " puntos por el artefacto.");
                                        }
                                } else if (hechizoElegido.getNivelCuracion() > 0) {
                                        System.out.println("El hechizo conjurado fue " + hechizoElegido.getNombre()
                                                        + " y le suma " + hechizoElegido.getNivelCuracion()
                                                        + " de salud al personaje.");
                                        if (artefactoPersonaje.getAmplificadorCuracion() > 0) {
                                                System.out.println("La potencia del hechizo fue amplificada "
                                                                + artefactoEnemigo.getAmplificadorCuracion()
                                                                + " puntos por el artefacto.");
                                        }
                                } else {
                                        System.out.println("El hechizo conjurado fue " + hechizoElegido.getNombre()
                                                        + " y no resta ni suma salud.");
                                }
                                System.out.println("La salud de " + ((Wizard) personajeElegido).getNombre() + " es de "
                                                + ((Wizard) personajeElegido).getSalud() + ".");
                                System.out.println("La salud de " + enemigoElegido.getNombre() + " es de "
                                                + enemigoElegido.getSalud() + ".");
                                System.out.println("La energia magica de " + ((Wizard) personajeElegido).getNombre()
                                                + " es de " + ((Wizard) personajeElegido).energiaMagica + ".");
                                System.out.println("");
                        }
                        if (enemigoElegido instanceof Wizard && ((Wizard) enemigoElegido).energiaMagica > 0
                                        && enemigoElegido.getSalud() > 0) {
                                System.out.println("");
                                System.out.println("¡Turno de " + enemigoElegido.getNombre() + "!");
                                System.out.println("");
                                Hechizo hechizoElegido = ((Wizard) enemigoElegido).getHechizo();
                                ((IHacerMagia) enemigoElegido).atacar(personajeElegido, hechizoElegido);
                                if (hechizoElegido.getNivelDaño() > 0) {
                                        System.out.println("El hechizo conjurado fue " + hechizoElegido.getNombre()
                                                        + " y le resta " + hechizoElegido.getNivelDaño()
                                                        + " de salud al personaje.");
                                        if (artefactoEnemigo.getAmplificadorDaño() > 0) {
                                                System.out.println("La potencia del hechizo fue amplificada "
                                                                + artefactoEnemigo.getAmplificadorDaño()
                                                                + " puntos por el artefacto.");
                                        }
                                } else if (hechizoElegido.getNivelCuracion() > 0) {
                                        System.out.println("El hechizo conjurado fue " + hechizoElegido.getNombre()
                                                        + " y le suma " + hechizoElegido.getNivelCuracion()
                                                        + " de salud al enemigo.");
                                        if (artefactoEnemigo.getAmplificadorCuracion() > 0) {
                                                System.out.println("La potencia del hechizo fue amplificada "
                                                                + artefactoEnemigo.getAmplificadorCuracion()
                                                                + " puntos por el artefacto.");
                                        }
                                } else {
                                        System.out.println("El hechizo conjurado fue " + hechizoElegido.getNombre()
                                                        + " y no resta ni suma salud.");
                                }
                                System.out.println("La salud de " + enemigoElegido.getNombre() + " es de "
                                                + enemigoElegido.getSalud() + ".");
                                System.out.println("La salud de " + ((Wizard) personajeElegido).getNombre() + " es de "
                                                + ((Wizard) personajeElegido).getSalud() + ".");
                                System.out.println("La energia magica de " + enemigoElegido.getNombre() + " es de "
                                                + ((Wizard) enemigoElegido).energiaMagica + ".");
                                System.out.println("");
                        }

                }

                if (enemigoElegido.isEstaVivo() == false) {
                        Transporte transporteElegido = ((Wizard) personajeElegido).getTransporte();
                        System.out.println("¡¡¡¡ " + personajeElegido.getNombre() + " ganó el duelo !!!!");
                        System.out.println(personajeElegido.getNombre() + " ha huido en " + transporteElegido.getNombre());
                        System.out.println("El tipo de transporte es: " + transporteElegido.getTipoDeTransporte());

                } else if (personajeElegido.isEstaVivo() == false) {
                        Transporte transporteElegido = ((Wizard) enemigoElegido).getTransporte();
                        System.out.println("¡¡¡¡ " + enemigoElegido.getNombre() + " ganó el duelo !!!!");
                        System.out.println(enemigoElegido.getNombre() + " ha huido en " + transporteElegido.getNombre());
                        System.out.println("El tipo de transporte es: " + transporteElegido.getTipoDeTransporte());
                }

        }

}
