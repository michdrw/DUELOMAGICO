package app.personajes.criatura;

import java.util.ArrayList;
import java.util.List;

import app.artefactos.Artefacto;
import app.hechizos.Hechizo;
import app.interfaces.IHacerMagia;
import app.personajes.Personaje;
import app.poderes.Poder;

/**
 * Elfo
 */
public class Elfo extends Criatura implements IHacerMagia {

    public static List<Hechizo> hechizos = new ArrayList<Hechizo>();
    public static List<Artefacto> artefactos = new ArrayList<Artefacto>();

    public Poder getPoderInicial(){
        return null;

    }
    public Poder setPoderInicial(Poder poder) {
        return poder;

    }
    public void atacar(Personaje enemigo, Hechizo hechizo) {

    }
    public void atacar(Personaje enemigo, String nombreHechizo){

    }
    public void aprender(Hechizo hechizo){

    }
    public Artefacto getArtefacto(){
        return null;

    }
}