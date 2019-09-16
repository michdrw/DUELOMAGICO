package app.personajes.criatura;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import app.DueloMagico;
import app.artefactos.Artefacto;
import app.hechizos.Hechizo;
import app.interfaces.IHacerMagia;
import app.personajes.Personaje;
import app.poderes.Poder;
import app.transporte.Transporte;

/**
 * Elfo
 */
public class Elfo extends Criatura implements IHacerMagia {

    private int energiaMagica;
    private Poder poderInicial;
    private Artefacto artefactoElegido;
    private Hechizo hechizoElegido;
    private Transporte transporteElegido;
    private boolean esOscuro;

    public Elfo(String nombre, int salud, int energiaMagica, Poder poderInicial, boolean esOscuro) {
        super(nombre, salud);
        this.energiaMagica = energiaMagica;
        this.poderInicial = poderInicial;
        this.esOscuro = esOscuro;

    }

    public List<Hechizo> hechizos = new ArrayList<Hechizo>();
    public List<Artefacto> artefactos = new ArrayList<Artefacto>();
    public List<Transporte> transportes = new ArrayList<Transporte>();

    public Poder getPoderInicial() {
        return this.poderInicial;
    }

    public void setPoderInicial(Poder poder) {
        this.poderInicial = poder;

    }

    public void atacar(Personaje enemigo, Hechizo hechizo) {

        switch (hechizo.getTipoHechizo()) {
        case "curacion":
            this.curar(hechizo);
            return;
        case "defensa":
        this.setEnergiaMagica(energiaMagica - hechizo.getNivelEnergiaMagica());
            return;
        case "ocio":
        this.setEnergiaMagica(energiaMagica - hechizo.getNivelEnergiaMagica());
            return;
        default:
            break;
        }
        if (esOscuro == false) {
            if (hechizoElegido.getNombre().equals("Crucio") || hechizoElegido.getNombre().equals("Imperio")
                    || hechizoElegido.getNombre().equals("Avada Kedavra")) {
                        
                return;
            } 
        } else if (artefactoElegido.getNombre().equals("Varita de Sauco") || artefactoElegido.getNombre().equals("Horrocrux")) {
            enemigo.setSalud(enemigo.getSalud() - (hechizo.getNivelDaño() + artefactoElegido.getAmplificadorDaño()));
            this.setEnergiaMagica(energiaMagica - hechizo.getNivelEnergiaMagica());
            if (enemigo.getSalud() < 0 || enemigo.getSalud() == 0) {
                enemigo.setEstaVivo(false);
                enemigo.setSalud(0);
            }
        } else {
            enemigo.setSalud(enemigo.getSalud() - hechizo.getNivelDaño());
            this.setEnergiaMagica(energiaMagica - hechizo.getNivelEnergiaMagica());
            if (enemigo.getSalud() < 0 || enemigo.getSalud() == 0) {
                enemigo.setEstaVivo(false);
                enemigo.setSalud(0);
            }
        }
    }

    public void curar(Hechizo hechizo) {
        if (hechizoElegido.getNombre().equals("Vulnera Sanentur") || hechizoElegido.getNombre().equals("Reparifors")) {
            if (artefactoElegido.getNombre().equals("Capa de la Invisibilidad") || artefactoElegido.getNombre().equals("Varita de Sauco") || artefactoElegido.getNombre().equals("Piedra de la Resurreción")) {
                this.setSalud(
                        this.getSalud() + (hechizo.getNivelCuracion() + artefactoElegido.getAmplificadorCuracion()));
                        this.setEnergiaMagica(energiaMagica - hechizo.getNivelEnergiaMagica());
                if (this.getSalud() > 100) {
                    this.setSalud(100);
                }
            } else {
                this.setSalud(this.getSalud() + hechizo.getNivelCuracion());
                this.setEnergiaMagica(energiaMagica - hechizo.getNivelEnergiaMagica());
                if (this.getSalud() > 100) {
                    this.setSalud(100);
                }
            }
        }

    }

    public void atacar(Personaje enemigo, String nombreHechizo) {

    }

    public void aprender(Hechizo hechizo) {
        this.hechizos.add(hechizo);
    }

    public Transporte getTransporte() {
        int size = DueloMagico.transportes.size();
        Random rand = new Random();
        int transporteRandom = rand.nextInt(size);
        this.transporteElegido = DueloMagico.transportes.get(transporteRandom);
        return this.transporteElegido;
    }

    public Hechizo getHechizo() {
        int size = DueloMagico.hechizos.size();
        Random rand = new Random();
        int hechizoRandom = rand.nextInt(size);
        this.hechizoElegido = DueloMagico.hechizos.get(hechizoRandom);
        return this.hechizoElegido;
    }

    public void setHechizo(Hechizo hechizo) {
        this.hechizoElegido = hechizo;
        this.aprender(hechizo);
    }

    public Artefacto getArtefacto() {
        int size = DueloMagico.artefactos.size();
        Random rand = new Random();
        int artefactoRandom = rand.nextInt(size);
        this.artefactoElegido = DueloMagico.artefactos.get(artefactoRandom);
        return this.artefactoElegido;
    }
    

    public void setArtefacto(Artefacto artefacto) {
        this.artefactoElegido = artefacto;
    }

    public int getEnergiaMagica() {
        return energiaMagica;
    }

    public void setEnergiaMagica(int energiaMagica) {
        this.energiaMagica = energiaMagica;
    }

    public boolean isEsOscuro() {
        return esOscuro;
    }

    public void setEsOscuro(boolean esOscuro) {
        this.esOscuro = esOscuro;
    }


    public void setHechizoElegido(Hechizo hechizoElegido) {
        this.hechizoElegido = hechizoElegido;
    }
}