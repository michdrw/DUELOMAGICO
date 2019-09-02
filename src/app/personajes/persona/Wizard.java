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
    private Artefacto artefacto;
    private Hechizo hechizoElegido;

    public Wizard(String nombre, int salud, int energiaMagica, Poder poderInicial, Artefacto artefacto) {
        super(nombre, salud);
        this.energiaMagica = energiaMagica;
        this.poderInicial = poderInicial;
        this.artefacto = artefacto;
    }

    public List<Hechizo> hechizos = new ArrayList<Hechizo>();

    public Poder getPoderInicial() {
        return this.poderInicial;
    }

    public void setPoderInicial(Poder poder) {
        this.poderInicial = poder;

    }

    public void atacar(Personaje enemigo, Hechizo hechizo) {
        this.energiaMagica = energiaMagica - 10;
        enemigo.salud -= hechizo.nivelDaño;
        if (this.salud < 100 && hechizoElegido.nombre.equals("Vulnera Sanentur") || this.salud < 100 && hechizoElegido.nombre.equals("Reparifors")) {
            this.salud += hechizo.nivelCuracion;
        }
        System.out.println("El hechizo utilizado fue " + this.hechizoElegido.nombre + ".");
        System.out.println("La salud de " + this.nombre + " es " + this.salud + ".");
        System.out.println("La salud de " + enemigo.nombre + " es " + enemigo.salud + ".");
        System.out.println("La energia magica de " + this.nombre + " es " + this.energiaMagica + ".");
       
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
        return this.artefacto;

    }

    public void setArtefacto(Artefacto artefacto) {
        this.artefacto = artefacto;
    }
}