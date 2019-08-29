package app.personajes.persona;

import java.util.ArrayList;
import java.util.List;

import app.artefactos.Artefacto;
import app.hechizos.Hechizo;
import app.interfaces.IHacerMagia;
import app.personajes.Personaje;
import app.poderes.Poder;

/**
 * Wizard
 */
public class Wizard extends Persona implements IHacerMagia {

    private int energiaMagica;
    private Poder poderInicial;
    private Artefacto artefacto;
    private Hechizo hechizoElegido;

     public Wizard(String nombre, int salud, int energiaMagica, Poder poderInicial, Artefacto artefacto, Hechizo hechizoElegido) {
        super (nombre, salud);
        this.energiaMagica = energiaMagica;
        this.poderInicial = poderInicial;
        this.artefacto = artefacto;
        this.hechizoElegido = hechizoElegido;
    }



    public List<Hechizo> hechizos = new ArrayList<Hechizo>();

    public Poder getPoderInicial() {
        return this.poderInicial;
    }

    public void setPoderInicial(Poder poder) {
        this.poderInicial = poder;

    }

    public void atacar(Personaje enemigo, Hechizo hechizo) {
       enemigo.salud -= hechizo.nivelDaño;
       enemigo.salud += hechizo.nivelCuracion;
       /*System.out.println("La salud del enemigo es " + enemigo.salud);*/
    }

    public void atacar(Personaje enemigo, String nombreHechizo) {

    }

    public void aprender(Hechizo hechizo) {
        this.hechizos.add(hechizo);
    }

    public Hechizo getHechizo() {
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