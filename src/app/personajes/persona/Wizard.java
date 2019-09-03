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

/**
 * Wizard
 */
public class Wizard extends Persona implements IHacerMagia {

    public int energiaMagica;
    private Poder poderInicial;
    private Artefacto artefactoElegido;
    private Hechizo hechizoElegido;
    public boolean esOscuro;

    public Wizard(String nombre, int salud, int energiaMagica, Poder poderInicial, boolean esOscuro) {
        super(nombre, salud);
        this.energiaMagica = energiaMagica;
        this.poderInicial = poderInicial;
        this.esOscuro = esOscuro;
    }

    public List<Hechizo> hechizos = new ArrayList<Hechizo>();

    public Poder getPoderInicial() {
        return this.poderInicial;
    }

    public void setPoderInicial(Poder poder) {
        this.poderInicial = poder;

    }

    public void atacar(Personaje enemigo, Hechizo hechizo) {
       this.energiaMagica = energiaMagica -10;
        if (esOscuro == false) {
            
            if (hechizoElegido.nombre.equals("Crucio") || hechizoElegido.nombre.equals("Imperio") || hechizoElegido.nombre.equals("Avada Kedavra")) {
               System.out.println(this.nombre + " eligió " + hechizoElegido.nombre + " sin ser mago oscuro, no causa daño.");
               return;        
            } else {
                enemigo.salud -= hechizo.nivelDaño;

            }
        } else {
            enemigo.salud -= hechizo.nivelDaño;
        }
        if (this.salud < 1000 && hechizoElegido.nombre.equals("Vulnera Sanentur")
                || this.salud < 1000 && hechizoElegido.nombre.equals("Reparifors")) {
            this.salud += hechizo.nivelCuracion;
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

    public void amplificar(Hechizo hechizo, Artefacto artefacto){
        

    }

    /*public boolean esOscuro() {
        boolean oscuro = false;
        if (this.nombre.equals("Lucius Malfoy") || this.nombre.equals("Severus Snape")) {
            oscuro = true;
        }
        return oscuro;
    }*/


}