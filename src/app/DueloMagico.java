package app;

import java.util.ArrayList;
import java.util.List;

import app.artefactos.Artefacto;
import app.artefactos.CapaInvisible;
import app.artefactos.Horrocrux;
import app.artefactos.VaritaSauco;
import app.hechizos.Hechizo;
import app.hechizos.ataque.PetrificusTotalus;
import app.hechizos.ataque.SectumSempra;
import app.hechizos.curacion.Reparifors;
import app.hechizos.curacion.VulneraSanentur;
import app.hechizos.defensa.CaveInmicum;
import app.hechizos.defensa.Protego;
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
    public static List<Maldicion> maldiciones = new ArrayList<Maldicion>();

    public static Personaje elegirPersonaje1(String nombre) {
        for (Personaje p : DueloMagico.catalogoPersonajes) {
            if (p.nombre.equals(nombre)) {
                System.out.println("El personaje elegido es: " + nombre);
                return p;
            }
        }
        return null;
    }

    public static Personaje elegirPersonaje2(String nombre) {
        for (Personaje p : DueloMagico.catalogoPersonajes) {
            if (p.nombre.equals(nombre)) {
                System.out.println("El enemigo elegido es: " + nombre);
                return p;
            }
        }
        return null;
    }

    public static void inicializarCatalogoPersonajes() {
        DueloMagico.agregarWizard();
        DueloMagico.agregarElfo();
        DueloMagico.agregarMuggle();
    }

    public static void agregarWizard() {
        Wizard mago = new Wizard("George Weasley", 100, 100, DueloMagico.poderes.get(0), DueloMagico.artefactos.get(2));

        catalogoPersonajes.add(mago);

        mago = new Wizard("Fred Weasley", 100, 100, DueloMagico.poderes.get(1), DueloMagico.artefactos.get(1));

        catalogoPersonajes.add(mago);

        mago = new Wizard("Lucius Malfoy", 100, 100, DueloMagico.poderes.get(0), DueloMagico.artefactos.get(2));

        catalogoPersonajes.add(mago);

        mago = new Wizard("Severus Snape", 100, 100, DueloMagico.poderes.get(0), DueloMagico.artefactos.get(2));

        catalogoPersonajes.add(mago);
    }

    public static void agregarElfo() {
        Elfo duende = new Elfo("Dobby", 100, 100, DueloMagico.poderes.get(1), DueloMagico.artefactos.get(2));
        catalogoPersonajes.add(duende);

        duende = new Elfo("Kreacher", 100, 100, DueloMagico.poderes.get(0), DueloMagico.artefactos.get(2));

        catalogoPersonajes.add(duende);

    }

    public static void agregarMuggle() {
        Muggle nomag = new Muggle("Dudley Dursley", 100);
        catalogoPersonajes.add(nomag);
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

    /*
     * public void setArtefactos(List<Artefacto> artefactos) { this.artefactos =
     * artefactos; }
     */

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

    public static void inicializarCatalogoHechizos() {
        DueloMagico.agregarHechizoAtaque();
        DueloMagico.agregarHechizoCuracion();
        DueloMagico.agregarHechizoDefensa();
        DueloMagico.agregarHechizoOcio();
        DueloMagico.agregarMaldicionImperdonable();
    }

    public static void agregarHechizoAtaque() {

        SectumSempra sectumSempra = new SectumSempra("Sectum Sempra", 90, 0);
        hechizos.add(sectumSempra);

        PetrificusTotalus petrificusTotalus = new PetrificusTotalus("Petrificus Totalus", 30, 0);
        hechizos.add(petrificusTotalus);

    }

    public static void agregarHechizoCuracion() {

        VulneraSanentur vulneraSanentur = new VulneraSanentur("Vulnera Sanentur", 0, 80);
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

    public static void agregarMaldicionImperdonable() {

        Crucio crucio = new Crucio("Crucio", 100, 0);
        maldiciones.add(crucio);

        Imperio imperio = new Imperio("Imperio", 100, 0);
        maldiciones.add(imperio);

        AvadaKedavra avadaKedabra = new AvadaKedavra("Imperio", 100, 0);
        maldiciones.add(avadaKedabra);
    }

    public Transporte elegirHuida(String nombre) {
        for (Personaje p : DueloMagico.catalogoPersonajes) {
            if ((p instanceof IHacerMagia)) {
                for (Transporte t : transportes) {
                    if (t.nombre.equals(nombre))
                        ;
                    return t;
                }
                return null;
            }
        }
        return null;
    }

}
