package app.interfaces;

import app.artefactos.Artefacto;
import app.hechizos.Hechizo;
import app.personajes.Personaje;
import app.poderes.Poder;

/**
 * IHacerMagia
 */
public interface IHacerMagia {

    public Poder getPoderInicial();

    public void setPoderInicial(Poder poder);

    public void atacar(Personaje enemigo, Hechizo hechizo);

    public void atacar(Personaje enemigo, String nombreHechizo);

    public void aprender(Hechizo hechizo);

    public Artefacto getArtefacto();

    public Hechizo getHechizo();

}