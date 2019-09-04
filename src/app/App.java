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
                DueloMagico.AgregarPoder();
                DueloMagico.AgregarArtefactos();
                DueloMagico.InicializarCatalogoHechizos();
                DueloMagico.AgregarTransportes();
                DueloMagico.InicializarCatalogoPersonajes();
                System.out.println("");
                Personaje personajeElegido = (Personaje) DueloMagico.ElegirPersonaje1("Ojoloco Moody");
                Artefacto artefactoPersonaje = ((Wizard) personajeElegido).getArtefacto();
                System.out.println("El personaje elegido es [" + personajeElegido.getNombre()
                                + "] y el artefacto elegido es ["
                                + artefactoPersonaje.getNombre() + "]");
                System.out.println("");
                Personaje enemigoElegido = (Personaje) DueloMagico.ElegirPersonaje2("Severus Snape");
                Artefacto artefactoEnemigo = ((Wizard) enemigoElegido).getArtefacto();
                System.out.println("El enemigo elegido es [" + enemigoElegido.getNombre()
                                + "] y el artefacto elegido es ["
                                + artefactoEnemigo.getNombre() + "]");
                System.out.println("");
                System.out.println("¡¡¡¡ Que comience el duelo !!!!");
                while (personajeElegido.getSalud() > 0 && enemigoElegido.getSalud() > 0) {

                        if (personajeElegido instanceof Wizard && ((Wizard) personajeElegido).getEnergiaMagica() > 0) {
                                System.out.println("");
                                System.out.println("¡Turno de " + personajeElegido.getNombre() + "!");
                                System.out.println("");
                                Hechizo hechizoElegido = ((Wizard) personajeElegido).getHechizo();
                                ((IHacerMagia) personajeElegido).atacar(enemigoElegido, hechizoElegido);
                                if (hechizoElegido.getNivelDaño() > 0) {
                                        if (((Wizard) personajeElegido).isEsOscuro() == false
                                                        && hechizoElegido.getNombre().equals("Crucio")
                                                        ||((Wizard) personajeElegido).isEsOscuro() == false
                                                        && hechizoElegido.getNombre().equals("Imperio")
                                                        ||((Wizard) personajeElegido).isEsOscuro() == false
                                                        && hechizoElegido.getNombre().equals("Avada Kedavra")) {
                                                System.out.println("Conjura el hechizo " + hechizoElegido.getNombre()
                                                                + " sin ser mago oscuro, no causa daño alguno.");
                                        } else {
                                        System.out.println("Conjura el hechizo " + hechizoElegido.getNombre()
                                                        + " y le resta " + hechizoElegido.getNivelDaño()
                                                        + " puntos de salud al enemigo.");
                                        if (artefactoPersonaje.getAmplificadorDaño() > 0) {
                                                System.out.println("La potencia del mismo fue amplificada "
                                                                + artefactoPersonaje.getAmplificadorDaño()
                                                                + " puntos por el artefacto "+ artefactoPersonaje.getNombre() + ".");
                                        } }
                                } else if (hechizoElegido.getNivelCuracion() > 0) {
                                        System.out.println("Conjura el hechizo " + hechizoElegido.getNombre()
                                                        + " y se suma " + hechizoElegido.getNivelCuracion()
                                                        + " puntos de salud a sí mismo.");
                                        if (artefactoPersonaje.getAmplificadorCuracion() > 0) {
                                                System.out.println("La potencia del mismo fue amplificada "
                                                                + artefactoPersonaje.getAmplificadorCuracion()
                                                                + " puntos por el artefacto "+ artefactoPersonaje.getNombre() + ".");
                                        }
                                } else {
                                        System.out.println("Conjura el hechizo " + hechizoElegido.getNombre()
                                                        + " que no resta ni suma salud.");
                                }
                                System.out.println("La salud de " + ((Wizard) personajeElegido).getNombre() + " es de "
                                                + ((Wizard) personajeElegido).getSalud() + ".");
                                System.out.println("La salud de " + enemigoElegido.getNombre() + " es de "
                                                + enemigoElegido.getSalud() + ".");
                                System.out.println("La energia magica de " + ((Wizard) personajeElegido).getNombre()
                                                + " es de " + ((Wizard) personajeElegido).getEnergiaMagica() + ".");
                                System.out.println("");
                        }
                        if (enemigoElegido instanceof Wizard && ((Wizard) enemigoElegido).getEnergiaMagica() > 0
                                        && enemigoElegido.getSalud() > 0) {
                                System.out.println("");
                                System.out.println("¡Turno de " + enemigoElegido.getNombre() + "!");
                                System.out.println("");
                                Hechizo hechizoElegido = ((Wizard) enemigoElegido).getHechizo();
                                ((IHacerMagia) enemigoElegido).atacar(personajeElegido, hechizoElegido);
                                if (hechizoElegido.getNivelDaño() > 0) {
                                        if (((Wizard) enemigoElegido).isEsOscuro() == false
                                                        && hechizoElegido.getNombre().equals("Crucio")
                                                        || ((Wizard) enemigoElegido).isEsOscuro() == false
                                                        && hechizoElegido.getNombre().equals("Imperio")
                                                        || ((Wizard) enemigoElegido).isEsOscuro() == false
                                                        && hechizoElegido.getNombre().equals("Avada Kedavra")) {
                                                System.out.println("Conjura el hechizo " + hechizoElegido.getNombre()
                                                                + " sin ser mago oscuro, no causa daño alguno.");
                                        } else {
                                        System.out.println("Conjura el hechizo " + hechizoElegido.getNombre()
                                                        + " y le resta " + hechizoElegido.getNivelDaño()
                                                        + " puntos de salud al personaje.");
                                        if (artefactoEnemigo.getAmplificadorDaño() > 0) {
                                                System.out.println("La potencia del mismo fue amplificada "
                                                                + artefactoEnemigo.getAmplificadorDaño()
                                                                + " puntos por el artefacto "+ artefactoEnemigo.getNombre() + ".");
                                        }}
                                } else if (hechizoElegido.getNivelCuracion() > 0) {
                                        System.out.println("Conjura el hechizo " + hechizoElegido.getNombre()
                                                        + " y se suma " + hechizoElegido.getNivelCuracion()
                                                        + " puntos de salud a sí mismo.");
                                        if (artefactoEnemigo.getAmplificadorCuracion() > 0) {
                                                System.out.println("La potencia del mismo fue amplificada "
                                                                + artefactoEnemigo.getAmplificadorCuracion()
                                                                + " puntos por el artefacto "+ artefactoEnemigo.getNombre() + ".");
                                        }
                                } else {
                                        System.out.println("Conjura el hechizo " + hechizoElegido.getNombre()
                                                        + " que no resta ni suma salud.");
                                }
                                System.out.println("La salud de " + enemigoElegido.getNombre() + " es de "
                                                + enemigoElegido.getSalud() + ".");
                                System.out.println("La salud de " + ((Wizard) personajeElegido).getNombre() + " es de "
                                                + ((Wizard) personajeElegido).getSalud() + ".");
                                System.out.println("La energia magica de " + enemigoElegido.getNombre() + " es de "
                                                + ((Wizard) enemigoElegido).getEnergiaMagica() + ".");
                                System.out.println("");
                        }

                }

                if (enemigoElegido.isEstaVivo() == false) {
                        Transporte transporteElegido = ((Wizard) personajeElegido).getTransporte();
                        System.out.println("¡¡¡¡ " + personajeElegido.getNombre() + " ganó el duelo y ha huido en " + transporteElegido.getNombre()+ " !!!!");

                } else if (personajeElegido.isEstaVivo() == false) {
                        Transporte transporteElegido = ((Wizard) enemigoElegido).getTransporte();
                        System.out.println("¡¡¡¡ " + enemigoElegido.getNombre() + " ganó el duelo y ha huido en " + transporteElegido.getNombre()+ " !!!!");
                }

        }

}
