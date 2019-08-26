package app;

import java.util.ArrayList;
import java.util.List;

import app.hechizos.Hechizo;
import app.personajes.Personaje;
import app.personajes.criatura.Elfo;
import app.personajes.persona.Muggle;
import app.personajes.persona.Wizard;

/**
 * DueloMagico
 */
public class DueloMagico {

    public static List<Personaje> catalogoPersonajes = new ArrayList<Personaje>();
    public static List<Wizard> wizards = new ArrayList<Wizard>();
    public static List<Elfo> elfos = new ArrayList<Elfo>();
    public static List<Muggle> nomags = new ArrayList<Muggle>();
    
    public static Personaje elegirPersonaje(String nombre) {
        for (Personaje p : DueloMagico.catalogoPersonajes) {
            if (p.nombre.equals(nombre))
                return p;
        }
        return null;
    }


    public static void inicializarCatalogoPersonajes()
    {
            DueloMagico.agregarWizard();
            DueloMagico.agregarElfo();
            DueloMagico.agregarMuggle();
    }
    
    public static void agregarWizard(){
        Wizard mago = new Wizard ();
        mago.nombre = "George Weasley";
        mago.salud = 100;
        
        wizards.add(mago);

        mago = new Wizard();
        mago.nombre = "Fred Weasley";
        mago.salud = 100;

        wizards.add(mago);

        DueloMagico.catalogoPersonajes.add(mago);

    }

    public static void agregarElfo(){
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

    public static void agregarMuggle(){
        Muggle nomag = new Muggle ();
        nomag.nombre = "Dudley Dursley";
        nomag.salud = 100;
        
        nomags.add(nomag);
    }
    public static Hechizo elegirHechizoWizard (String nombre) {
        for (Hechizo w : Wizard.hechizos) {
            if (w.nombre.equals(nombre))
                return w;
        }
        return null;
    }

    
    public static Hechizo elegirHechizoElfo (String nombre) {
        for (Hechizo w : Elfo.hechizos) {
            if (w.nombre.equals(nombre))
                return w;
        }
        return null;
    }
    
}