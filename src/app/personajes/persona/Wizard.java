package app.personajes.persona;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import app.DueloMagico;
import app.artefactos.Artefacto;
import app.hechizos.Hechizo;
import app.interfaces.IHacerMagia;
import app.personajes.Personaje;
import app.poderes.Poder;
import app.transporte.Transporte;

/**
 * Wizard
 */
public class Wizard extends Persona implements IHacerMagia {

    public int energiaMagica;
    private Poder poderInicial;
    private Artefacto artefactoElegido;
    private Hechizo hechizoElegido;
    private Transporte transporteElegido;
    public boolean esOscuro;

    public Wizard(String nombre, int salud, int energiaMagica, Poder poderInicial, boolean esOscuro) {
        super(nombre, salud);
        this.energiaMagica = energiaMagica;
        this.poderInicial = poderInicial;
        this.esOscuro = esOscuro;
        
    }

    public List<Hechizo> hechizos = new ArrayList<Hechizo>();
    public List<Artefacto> artefactos = new ArrayList<Artefacto>();
    public List<Transporte> transportes = new ArrayList<Transporte>();
    

    public Poder getPoderInicial() {
        return this.poderInicial;
    }

    public void setPoderInicial(Poder poder) {
        this.poderInicial = poder;

    }

    public void atacar(Personaje enemigo, Hechizo hechizo) {
        if (esOscuro == false) {

            if (hechizoElegido.getNombre().equals("Crucio") || hechizoElegido.getNombre().equals("Imperio")
                    || hechizoElegido.getNombre().equals("Avada Kedavra")) {
                System.out.println(
                        this.getNombre() + " eligió " + hechizoElegido.getNombre()
                                + " sin ser mago oscuro, no causa daño.");
                return;
            } else if (artefactoElegido.getNombre().equals("Varita de Sauco")) {
                enemigo.setSalud(enemigo.getSalud() - (hechizo.getNivelDaño() + artefactoElegido.getAmplificadorDaño()));
                if (enemigo.getSalud() < 0 || enemigo.getSalud() == 0) {
                    enemigo.setEstaVivo(false);
                    enemigo.setSalud(0);
                }
            } else if (artefactoElegido.getNombre().equals("Horrocrux")) {
                enemigo.setSalud(enemigo.getSalud() - (hechizo.getNivelDaño() + artefactoElegido.getAmplificadorDaño()));
                if (enemigo.getSalud() < 0 || enemigo.getSalud() == 0) {
                    enemigo.setEstaVivo(false);
                    enemigo.setSalud(0);
                }
            } else {
                enemigo.setSalud(enemigo.getSalud() - hechizo.getNivelDaño());
                if (enemigo.getSalud() < 0 || enemigo.getSalud() == 0) {
                    enemigo.setEstaVivo(false);
                    enemigo.setSalud(0);
                }
            }
        } else if (artefactoElegido.getNombre().equals("Varita de Sauco")) {
            enemigo.setSalud(enemigo.getSalud() - (hechizo.getNivelDaño() + artefactoElegido.getAmplificadorDaño()));
            if (enemigo.getSalud() < 0 || enemigo.getSalud() == 0) {
                enemigo.setEstaVivo(false);
                enemigo.setSalud(0);
            }
        } else if (artefactoElegido.getNombre().equals("Horrocrux")) {
            enemigo.setSalud(enemigo.getSalud() - (hechizo.getNivelDaño() + artefactoElegido.getAmplificadorDaño()));
            if (enemigo.getSalud() < 0 || enemigo.getSalud() == 0) {
                enemigo.setEstaVivo(false);
                enemigo.setSalud(0);
            }
        } else {
            enemigo.setSalud(enemigo.getSalud() - hechizo.getNivelDaño);
            if (enemigo.getSalud() < 0 || enemigo.salud == 0) {
                enemigo.estaVivo = false;
                enemigo.salud = 0;
            }
        }

    }  
    public void curar(Hechizo hechizo) {
        if (hechizoElegido.nombre.equals("Vulnera Sanentur")
                || hechizoElegido.nombre.equals("Reparifors")) {
            if (artefactoElegido.nombre.equals("Capa de la Invisibilidad")) {
                this.salud += (hechizo.nivelCuracion + artefactoElegido.amplificadorCuracion);
                if (this.salud > 100) {
                    this.salud = 100;
                }
            } else if (artefactoElegido.nombre.equals("Varita de Sauco")) {
                this.salud += (hechizo.nivelCuracion + artefactoElegido.amplificadorCuracion);
                if (this.salud > 100) {
                    this.salud = 100;
                }
            } else if (artefactoElegido.nombre.equals("Piedra de la Resurreción")) {
                this.salud += (hechizo.nivelCuracion + artefactoElegido.amplificadorCuracion);
                if (this.salud > 100) {
                    this.salud = 100;
                }
            } else {
                this.salud += hechizo.nivelCuracion;
                if (this.salud > 100) {
                    this.salud = 100;
                }
            }
        }

    }



    public void atacar(Personaje enemigo, String nombreHechizo) {

    }

    public void aprender(Hechizo hechizo) {
        this.hechizos.add(hechizo);
    }

    public Hechizo getHechizo() {
        int size = DueloMagico.hechizos.size();
        Random rand = new Random();
        int hechizoRandom = rand.nextInt(size);
        this.hechizoElegido = DueloMagico.hechizos.get(hechizoRandom);
        return this.hechizoElegido;

    }

    public void setHechizo(Hechizo hechizo) {
        this.hechizoElegido = hechizo;
        this.aprender(hechizo);
    }

    public Transporte getTransporte(){
        int size = DueloMagico.transportes.size();
        Random rand = new Random();
        int transporteRandom = rand.nextInt(size);
        this.transporteElegido = DueloMagico.transportes.get(transporteRandom);
        return this.transporteElegido;
    }
    

    public Artefacto getArtefacto() {
        int size = DueloMagico.artefactos.size();
        Random rand = new Random();
        int artefactoRandom = rand.nextInt(size);
        this.artefactoElegido = DueloMagico.artefactos.get(artefactoRandom);
        return this.artefactoElegido;

    }

    public void setArtefacto(Artefacto artefacto) {
        this.artefactoElegido = artefacto;
    }

   

    /*
     * public boolean esOscuro() { boolean oscuro = false; if
     * (this.nombre.equals("Lucius Malfoy") || this.nombre.equals("Severus Snape"))
     * { oscuro = true; } return oscuro; }
     */

}