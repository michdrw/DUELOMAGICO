package app.personajes.criatura;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import app.artefactos.Artefacto;
import app.hechizos.Hechizo;
import app.interfaces.IHacerMagia;
import app.personajes.Personaje;
import app.poderes.Poder;

/**
 * Elfo
 */
public class Elfo extends Criatura implements IHacerMagia {

    private int energiaMagica;
    private Poder poderInicial;
    private Artefacto artefacto;
    private Hechizo hechizoElegido;

    public Elfo(String nombre, int salud, int energiaMagica, Poder poderInicial) {
        super(nombre, salud);
        this.energiaMagica = energiaMagica;
        this.poderInicial = poderInicial;

    }

    private List<Hechizo> hechizos = new ArrayList<Hechizo>();

    public Poder getPoderInicial() {
        return this.poderInicial;
    }

    public void setPoderInicial(Poder poder) {
        this.poderInicial = poder;

    }

    public void atacar(Personaje enemigo, Hechizo hechizo) {
        if (hechizoElegido.getNombre().equals("Crucio") || hechizoElegido.getNombre().equals("Imperio")
                || hechizoElegido.getNombre().equals("Avada Kedavra")) {
            return;
        } else if (this.getSalud() < 100 && hechizoElegido.getNombre().equals("Vulnera Sanentur")
                || this.getSalud() < 100 && hechizoElegido.getNombre().equals("Reparifors")) {
            this.setSalud(this.getSalud() + hechizo.getNivelCuracion());
        } else {
            enemigo.setSalud(enemigo.getSalud() - hechizo.getNivelDaño());
        }
    }

    public void atacar(Personaje enemigo, String nombreHechizo) {

    }

    public void aprender(Hechizo hechizo) {
        this.hechizos.add(hechizo);
    }

    public Hechizo getHechizo() {
        int size = this.hechizos.size();
        Random rand = new Random();
        int hechizoRandom = rand.nextInt(size);
        this.hechizoElegido = this.hechizos.get(hechizoRandom);
        return this.hechizoElegido;
    }

    public Artefacto getArtefacto() {
        return this.artefacto;

    }

    public void setArtefacto(Artefacto artefacto) {
        this.artefacto = artefacto;
    }

    public int getEnergiaMagica() {
        return energiaMagica;
    }

    public void setEnergiaMagica(int energiaMagica) {
        this.energiaMagica = energiaMagica;
    }

}