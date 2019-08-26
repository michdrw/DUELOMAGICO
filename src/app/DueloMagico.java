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
    
    public static Personaje ElegirPersonaje(String nombre) {
        for (Personaje p : DueloMagico.catalogoPersonajes) {
            if (p.nombre.equals(nombre))
                return p;
        }
        return null;
    }

    public static Hechizo ElegirHechizoWizard (String nombre) {
        for (Hechizo w : Wizard.hechizos) {
            if (w.nombre.equals(nombre))
                return w;
        }
        return null;
    }
    public static Hechizo ElegirHechizoElfo (String nombre) {
        for (Hechizo w : Elfo.hechizos) {
            if (w.nombre.equals(nombre))
                return w;
        }
        return null;
    }

    public static void InicializarCatalogoPersonajes()
    {
            DueloMagico.AgregarWizard();
            DueloMagico.AgregarElfo();
            DueloMagico.AgregarMuggle();
    }
    
    public static void AgregarWizard(){
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

    public static void AgregarElfo(){
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

    public static void AgregarMuggle(){
        Muggle nomag = new Muggle ();
        nomag.nombre = "Dudley Dursley";
        nomag.salud = 100;
        
        nomags.add(nomag);
    }
    
}