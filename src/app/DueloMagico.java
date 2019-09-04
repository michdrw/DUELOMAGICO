package app;

import java.util.ArrayList;
import java.util.List;

import app.artefactos.Artefacto;
import app.artefactos.CapaInvisible;
import app.artefactos.Horrocrux;
import app.artefactos.PiedraResurreccion;
import app.artefactos.VaritaSauco;
import app.hechizos.Hechizo;
import app.hechizos.ataque.PetrificusTotalus;
import app.hechizos.ataque.SectumSempra;
import app.hechizos.curacion.Reparifors;
import app.hechizos.curacion.VulneraSanentur;
import app.hechizos.defensa.CaveInmicum;
import app.hechizos.defensa.Protego;
import app.hechizos.imperdonable.AvadaKedavra;
import app.hechizos.imperdonable.Crucio;
import app.hechizos.imperdonable.Imperio;
import app.hechizos.ocio.Alohomora;
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
import app.transporte.Escoba;
import app.transporte.HogwartsExpress;
import app.transporte.Transporte;

/**
 * DueloMagico
 */
public class DueloMagico {

    public static List<Personaje> catalogoPersonajes = new ArrayList<Personaje>();
    public static List<Poder> poderes = new ArrayList<Poder>();
    public static List<Hechizo> hechizos = new ArrayList<Hechizo>();
    public static List<Artefacto> artefactos = new ArrayList<Artefacto>();
    public static List<Transporte> transportes = new ArrayList<Transporte>();

    public static Personaje ElegirPersonaje1(String nombre) {
        for (Personaje p : DueloMagico.catalogoPersonajes) {
            if (p.getNombre().equals(nombre)) {
                return p;
            }
        }
        return null;
    }

    public static Personaje ElegirPersonaje2(String nombre) {
        for (Personaje p : DueloMagico.catalogoPersonajes) {
            if (p.getNombre().equals(nombre)) {
                return p;
            }
        }
        return null;
    }

    

    public static void InicializarCatalogoPersonajes() {
        DueloMagico.AgregarWizard();
        DueloMagico.AgregarElfo();
        DueloMagico.AgregarMuggle();
    }

    public static void AgregarWizard() {
        Wizard mago = new Wizard("Ojoloco Moody", 100, 100, DueloMagico.poderes.get(0), false);

        catalogoPersonajes.add(mago);

        mago = new Wizard("Fred Weasley", 100, 100, DueloMagico.poderes.get(1), false);

        catalogoPersonajes.add(mago);

        mago = new Wizard("Lucius Malfoy", 100, 100, DueloMagico.poderes.get(0), true);

        catalogoPersonajes.add(mago);

        mago = new Wizard("Severus Snape", 100, 100, DueloMagico.poderes.get(0), true);

        catalogoPersonajes.add(mago);
    }

    public static void AgregarElfo() {
        Elfo duende = new Elfo("Dobby", 100, 100, DueloMagico.poderes.get(1));
        catalogoPersonajes.add(duende);

        duende = new Elfo("Kreacher", 100, 100, DueloMagico.poderes.get(0));

        catalogoPersonajes.add(duende);

    }

    public static void AgregarMuggle() {
        Muggle nomag = new Muggle("Dudley Dursley", 100);
        catalogoPersonajes.add(nomag);
    }

    public static void AgregarPoder() {

        Invisibilidad invisibilidad = new Invisibilidad("Invisibilidad", 1);
        poderes.add(invisibilidad);

        Metamorfosis metamorfosis = new Metamorfosis("Metamorfosis", 2);
        poderes.add(metamorfosis);

        ParselTongue parcelTongue = new ParselTongue("ParselTongue", 3);
        poderes.add(parcelTongue);
    }

    public Poder elegirPoder(String nombre) {
        for (Personaje p : DueloMagico.catalogoPersonajes) {
            if ((p instanceof IHacerMagia)) {
                for (Poder poder : poderes) {
                    if (poder.getNombre().equals(nombre))
                        return poder;
                }
                return null;
            }
        }
        return null;
    }

    public static void AgregarArtefactos() {
        Horrocrux horrocrux = new Horrocrux("Horrocrux", 20, 0 );
        artefactos.add(horrocrux);

        CapaInvisible capaInvisible = new CapaInvisible("Capa de la Invisibilidad", 0, 10);
        artefactos.add(capaInvisible);

        VaritaSauco varitaSauco = new VaritaSauco("Varita de Sauco", 20, 20);
        artefactos.add(varitaSauco);

        PiedraResurreccion piedraResurreccion =new PiedraResurreccion("Piedra de la Resurreción", 0, 20);
        artefactos.add(piedraResurreccion);
    }


    public Artefacto elegirArtefacto(String nombre) {
        for (Personaje p : DueloMagico.catalogoPersonajes) {
            if ((p instanceof IHacerMagia)) {
                for (Artefacto a : artefactos) {
                    if (a.getNombre().equals(nombre))
                        return a;
                }
                return null;
            }
        }
        return null;
    }

    public static void AgregarTransportes() {
        HogwartsExpress hogwartsExpress = new HogwartsExpress("el Expreso Hogwarts");
        transportes.add(hogwartsExpress);

        Escoba escoba = new Escoba("una escoba voladora");
        transportes.add(escoba);
    }

    public Transporte elegirHuida(String nombre) {
        for (Personaje p : DueloMagico.catalogoPersonajes) {
            if ((p instanceof IHacerMagia)) {
                for (Transporte t : DueloMagico.transportes) {
                    if (t.getNombre().equals(nombre))
                        ;
                    return t;
                }
                return null;
            }
        }
        return null;
    }

    public static void InicializarCatalogoHechizos() {
        DueloMagico.AgregarHechizoAtaque();
        DueloMagico.AgregarHechizoCuracion();
        DueloMagico.AgregarHechizoDefensa();
        DueloMagico.AgregarHechizoOcio();
        DueloMagico.AgregarHechizoImperdonable();
    }

    public static void AgregarHechizoAtaque() {

        SectumSempra sectumSempra = new SectumSempra("Sectum Sempra", 40, 0, 10);
        hechizos.add(sectumSempra);

        PetrificusTotalus petrificusTotalus = new PetrificusTotalus("Petrificus Totalus", 20, 0, 10);
        hechizos.add(petrificusTotalus);

    }

    public static void AgregarHechizoCuracion() {

        VulneraSanentur vulneraSanentur = new VulneraSanentur("Vulnera Sanentur", 0, 40, 10);
        hechizos.add(vulneraSanentur);

        Reparifors reparifors = new Reparifors("Reparifors", 0, 20, 10);
        hechizos.add(reparifors);
    }

    public static void AgregarHechizoDefensa() {

        CaveInmicum caveInmicum = new CaveInmicum("Cave Inmicum", 0, 0, 10);
        hechizos.add(caveInmicum);

        Protego protego = new Protego("Protego", 0, 0, 10);
        hechizos.add(protego);

    }

    public static void AgregarHechizoOcio() {

        Alohomora alohomora = new Alohomora("Alohomora", 0, 0, 10);
        hechizos.add(alohomora);

        WingardiumLeviosa wingardiumLeviosa = new WingardiumLeviosa("Wingardium Leviosa", 0, 0, 10);
        hechizos.add(wingardiumLeviosa);
    }

    public static void AgregarHechizoImperdonable() {

        Crucio crucio = new Crucio("Crucio", 70, 0, 20);
        hechizos.add(crucio);

        Imperio imperio = new Imperio("Imperio", 80, 0, 20);
        hechizos.add(imperio);

        AvadaKedavra avadaKedabra = new AvadaKedavra("Avada Kedavra", 100, 0, 20);
        hechizos.add(avadaKedabra);
    }



}
