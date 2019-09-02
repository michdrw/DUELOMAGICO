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

                System.out.println("¡Comienza el duelo!");
                while (personajeElegido.salud > 0 && enemigoElegido.salud > 0) {
                        if (personajeElegido instanceof Wizard && ((Wizard) personajeElegido).energiaMagica > 0)  {
                                System.out.println("Turno de : " + personajeElegido.nombre );
                                
                                ((IHacerMagia) personajeElegido).atacar(enemigoElegido,((Wizard) personajeElegido).getHechizo());
                        }
                        if (enemigoElegido instanceof Wizard && ((Wizard) enemigoElegido).energiaMagica > 0) {
                                System.out.println("Turno de : " + enemigoElegido.nombre);
                                ((IHacerMagia) enemigoElegido).atacar(personajeElegido,((Wizard) enemigoElegido).getHechizo());
                        }

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
