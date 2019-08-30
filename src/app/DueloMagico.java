package app;

import java.util.ArrayList;
import java.util.List;

import app.artefactos.Artefacto;
import app.artefactos.CapaInvisible;
import app.artefactos.Horrocrux;
import app.artefactos.VaritaSauco;
import app.hechizos.Hechizo;
import app.hechizos.ataque.HechizoAtaque;
import app.hechizos.ataque.PetrificusTotalus;
import app.hechizos.ataque.SectumSempra;
import app.hechizos.curacion.HechizoCuracion;
import app.hechizos.curacion.Reparifors;
import app.hechizos.curacion.VulneraSanentur;
import app.hechizos.defensa.CaveInmicum;
import app.hechizos.defensa.HechizoDefensa;
import app.hechizos.defensa.Protego;
import app.hechizos.ocio.Alohomora;
import app.hechizos.ocio.HechizoOcio;
import app.hechizos.ocio.WingardiumLeviosa;
import app.interfaces.IHacerMagia;
import app.personajes.Personaje;
import app.personajes.criatura.Elfo;
import app.personajes.persona.Muggle;
import app.personajes.persona.Wizard;
import app.poderes.Invisibilidad;
import app.poderes.Metamorfosis;
import app.poderes.ParselTongue;
import app.poderes.Poder;
import app.transporte.Transporte;

/**
 * DueloMagico
 */
public class DueloMagico {

    public static List<Personaje> catalogoPersonajes = new ArrayList<Personaje>();
    public static List<Wizard> wizards = new ArrayList<Wizard>();
    public static List<Elfo> elfos = new ArrayList<Elfo>();
    public static List<Muggle> nomags = new ArrayList<Muggle>();
    public static List<Poder> poderes = new ArrayList<Poder>();
    public static List<Hechizo> hechizos = new ArrayList<Hechizo>();
    public static List<Artefacto> artefactos = new ArrayList<Artefacto>();
    public static List<Transporte> transportes = new ArrayList<Transporte>();
    public static List<HechizoAtaque> atacadores = new ArrayList<HechizoAtaque>();
    public static List<HechizoCuracion> curadores = new ArrayList<HechizoCuracion>();
    public static List<HechizoDefensa> defensores = new ArrayList<HechizoDefensa>();
    public static List<HechizoOcio> ociadores = new ArrayList<HechizoOcio>();

    public static Personaje elegirPersonaje(String nombre) {
        for (Personaje p : DueloMagico.catalogoPersonajes) {
            if (p.nombre.equals(nombre))
                return p;
            System.out.println("El personaje elegido es: " + nombre);
        }
        return null;
    }

    public static void inicializarCatalogoPersonajes() {
        DueloMagico.agregarWizard();
        DueloMagico.agregarElfo();
        DueloMagico.agregarMuggle();
    }

    public static void agregarWizard() {
        Wizard mago = new Wizard("George Weasley", 100, 100, DueloMagico.poderes.get(0), DueloMagico.artefactos.get(2),
                DueloMagico.hechizos.get(7));

        wizards.add(mago);

        mago = new Wizard("Fred Weasley", 100, 100, DueloMagico.poderes.get(1), DueloMagico.artefactos.get(1), DueloMagico.hechizos.get(6));

        wizards.add(mago);

        DueloMagico.catalogoPersonajes.add((Personaje) wizards);

    }

    public static void agregarElfo() {
        Elfo duende = new Elfo("Dobby", 100, 100, DueloMagico.poderes.get(2), DueloMagico.artefactos.get(4), DueloMagico.hechizos.get(0));
        elfos.add(duende);

        duende = new Elfo("Kreacher", 100,100, DueloMagico.poderes.get(0),DueloMagico.artefactos.get(2), DueloMagico.hechizos.get(4));

        elfos.add(duende);
        DueloMagico.catalogoPersonajes.add((Personaje) elfos);
    }

    public static void agregarMuggle() {
        Muggle nomag = new Muggle("Dudley Dursley", 100);
        nomags.add(nomag);
        DueloMagico.catalogoPersonajes.add((Personaje) nomags);
    }

    public static void inicializarCatalogoHechizos() {
        DueloMagico.agregarHechizoAtaque();
        DueloMagico.agregarHechizoCuracion();
        DueloMagico.agregarHechizoDefensa();
        DueloMagico.agregarHechizoOcio();
    }

    public static void agregarHechizoAtaque() {

        SectumSempra sectumSempra= new SectumSempra ("Sectum Sempra", 90, 0);
        hechizos.add(sectumSempra);

        PetrificusTotalus  petrificusTotalus = new PetrificusTotalus( "Petrificus Totalus", 30, 0);
        hechizos.add(petrificusTotalus);

    }

    public static void agregarHechizoCuracion() {

        VulneraSanentur vulneraSanentur = new VulneraSanentur ("Vulnera Sanentur", 0, 80);
        hechizos.add(vulneraSanentur);

        Reparifors reparifors = new Reparifors("Reparifors", 0, 50);
        hechizos.add(reparifors);
    }

    public static void agregarHechizoDefensa() {

        CaveInmicum caveInmicum = new CaveInmicum("Cave Inmicum", 0, 0);
        hechizos.add(caveInmicum);

        Protego protego = new Protego("Protego", 0, 0);
        hechizos.add(protego);

    }

    public static void agregarHechizoOcio() {

        Alohomora alohomora = new Alohomora("Alohomora", 0, 0);
        hechizos.add(alohomora);

        WingardiumLeviosa wingardiumLeviosa = new WingardiumLeviosa("Wingardium Leviosa", 0, 0);
        hechizos.add(wingardiumLeviosa);
    }

    public static void agregarPoder() {

        Invisibilidad invisibilidad = new Invisibilidad();
        invisibilidad.nombre = "Invisibilidad";
        invisibilidad.nro = 1;
        poderes.add(invisibilidad);

        Metamorfosis metamorfosis = new Metamorfosis();
        metamorfosis.nombre = "Metamorfosis";
        metamorfosis.nro = 2;
        poderes.add(metamorfosis);

        ParselTongue parcelTongue = new ParselTongue();
        parcelTongue.nombre = "ParselTongue";
        parcelTongue.nro = 3;
        poderes.add(parcelTongue);
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

    public static void agregarArtefactos() {
        Horrocrux horrocrux = new Horrocrux();
        horrocrux.nombre = "Horrocrux";
        artefactos.add(horrocrux);

        CapaInvisible capaInvisible = new CapaInvisible();
        capaInvisible.nombre = "Capa Invisible";
        artefactos.add(capaInvisible);

        VaritaSauco varitaSauco = new VaritaSauco();
        varitaSauco.nombre = "VaritaSauco";
        artefactos.add(varitaSauco);
    }

    public void setArtefactos(List<Artefacto> artefactos) {
        this.artefactos = artefactos;
    }

    public Artefacto elegirArtefacto(String nombre) {
        for (Personaje p : DueloMagico.catalogoPersonajes) {
            if ((p instanceof IHacerMagia)) {
                for (Artefacto a : artefactos) {
                    if (a.nombre.equals(nombre))
                        return a;
                }
                return null;
            }
        }
        return null;
    }

    public Transporte elegirHuida(String nombre){
        for (Personaje p : DueloMagico.catalogoPersonajes) {
            if ((p instanceof IHacerMagia)) {
                for (Transporte t : transportes) {
                    if (t.nombre.equals(nombre));
                        return t;
                }
                return null;
            }
        }return null;
    }

}
