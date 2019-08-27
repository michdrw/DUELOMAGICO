package app;

import java.util.ArrayList;
import java.util.List;

import app.hechizos.Hechizo;
import app.hechizos.ataque.HechizoAtaque;
import app.hechizos.curacion.HechizoCuracion;
import app.hechizos.defensa.HechizoDefensa;
import app.hechizos.ocio.HechizoOcio;
import app.interfaces.IHacerMagia;
import app.personajes.Personaje;
import app.personajes.criatura.Elfo;
import app.personajes.persona.Muggle;
import app.personajes.persona.Wizard;
import app.poderes.Poder;

/**
 * DueloMagico
 */
public class DueloMagico {

    public static List<Personaje> catalogoPersonajes = new ArrayList<Personaje>();
    public static List<Wizard> wizards = new ArrayList<Wizard>();
    public static List<Elfo> elfos = new ArrayList<Elfo>();
    public static List<Muggle> nomags = new ArrayList<Muggle>();
    public List<Poder> poderes = new ArrayList<Poder>();
    private static List<Hechizo> hechizos = new ArrayList<Hechizo>();

    /*public static List<HechizoAtaque> atacadores = new ArrayList<HechizoAtaque>();
    public static List<HechizoCuracion> curadores = new ArrayList<HechizoCuracion>();
    public static List<HechizoDefensa> defensores = new ArrayList<HechizoDefensa>();
    public static List<HechizoOcio> ociadores = new ArrayList<HechizoOcio>();*/

    public static Personaje elegirPersonaje(String nombre) {
        System.out.println("Elegir personaje: ");
        for (Personaje p : DueloMagico.catalogoPersonajes) {
            if (p.nombre.equals(nombre))
                return p;
        }
        return null;
    }

    public static void inicializarCatalogoPersonajes() {
        DueloMagico.agregarWizard();
        DueloMagico.agregarElfo();
        DueloMagico.agregarMuggle();
    }

    public static void agregarWizard() {
        Wizard mago = new Wizard();
        mago.nombre = "George Weasley";
        mago.salud = 100;

        wizards.add(mago);

        mago = new Wizard();
        mago.nombre = "Fred Weasley";
        mago.salud = 100;

        wizards.add(mago);

        DueloMagico.catalogoPersonajes.add(mago);

    }

    public static void agregarElfo() {
        Elfo duende = new Elfo();
        duende.nombre = "Dobby";
        duende.salud = 100;

        elfos.add(duende);

        duende = new Elfo();
        duende.nombre = "Kreacher";
        duende.salud = 100;
        elfos.add(duende);

        DueloMagico.catalogoPersonajes.add(duende);
    }

    public static void agregarMuggle() {
        Muggle nomag = new Muggle();
        nomag.nombre = "Dudley Dursley";
        nomag.salud = 100;

        nomags.add(nomag);
    }

    public static void inicializarCatalogoHechizos() {
        DueloMagico.agregarHechizoAtaque();
        DueloMagico.agregarHechizoCuracion();
        DueloMagico.agregarHechizoDefensa();
        DueloMagico.agregarHechizoOcio();
    }

    public static void agregarHechizoAtaque() {

        HechizoAtaque ha1 = new HechizoAtaque();
        ha1.nombre = "SeptuSempra";
        hechizos.add(ha1);
        
        HechizoAtaque ha2 = new HechizoAtaque();
        ha2.nombre = "Petrificus Totalus";
        hechizos.add(ha2);

    }

    public static void agregarHechizoCuracion() {

        HechizoCuracion hc1 = new HechizoCuracion();
        hc1.nombre = "Vulnera Sanentur";
        hechizos.add(hc1);

        HechizoCuracion hc2 = new HechizoCuracion();
        hc2.nombre = "Reparifors";
        hechizos.add(hc2);
    }

    public static void agregarHechizoDefensa() {

        HechizoDefensa hd1 = new HechizoDefensa();
        hd1.nombre = "Cave Inmicum";
        hechizos.add(hd1);

        HechizoDefensa hd2 = new HechizoDefensa();
        hd2.nombre = "Protego";
        hechizos.add(hd2);

    }

    public static void agregarHechizoOcio() {

        HechizoOcio ho1 = new HechizoOcio();
        ho1.nombre = "Alohomora";
        hechizos.add(ho1);

        HechizoOcio ho2 = new HechizoOcio();
        ho2.nombre = "Wingardium Leviosa";
        hechizos.add(ho2);
    }

    public static Hechizo elegirHechizoWizard(String nombre, Wizard mago) {
        for (Hechizo w : mago.getHechizo()) {
            if (w.nombre.equals(nombre))
                return w;
        }
        return null;
    }

    public static Hechizo elegirHechizoElfo(String nombre) {
        for (Hechizo w : duende.getHechizo()) {
            if (w.nombre.equals(nombre))
                return w;
        }
        return null;
    }

    public void agregarPoder() {

        Poder p1 = new Poder();
        p1.nombre = "Invisibilidad";
        p1.nro = 1;
        poderes.add(p1);

        Poder p2 = new Poder();
        p2.nombre = "Metamorfosis";
        p2.nro = 2;
        poderes.add(p2);

        Poder p3 = new Poder();
        p3.nombre = "ParselTongue";
        p3.nro = 3;
        poderes.add(p3);
    }

    public Poder elegirPoder(String nombre) {
        for (Personaje p : DueloMagico.catalogoPersonajes) {
            if ((p instanceof IHacerMagia)) {
                for (Poder poder : poderes) {
                    if (poder.nombre.equals(nombre))
                        return poder;
                }
                return null;
            }
        }
        return null;

    }
}
