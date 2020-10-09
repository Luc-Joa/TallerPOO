/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TallerPoo;

import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACU
 */
public class Actividad {

    private List<Persona> nino;
    private List<Persona> adulto;
    private List<Persona> adultoMayor;
    final int horaPaseo, horaEscuela, horaTrabajo;

    public Actividad() {
        nino = new ArrayList<>();
        adulto = new ArrayList<>();
        adultoMayor = new ArrayList<>();
        horaPaseo = 1;
        horaEscuela = 4;
        horaTrabajo = 8;
    }

    /**
     * Agrega una persona a la lista según su edad
     *
     * @param a
     */
    public void agregarPersona(Persona a) {
        if (a.getEdad().equals(Edad.NIÑOS)) {
            nino.add(a);
        }
        if (a.getEdad().equals(Edad.ADULTOS)) {
            adulto.add(a);
        }
        if (a.getEdad().equals(Edad.ADULTOS_MAYORES)) {
            adultoMayor.add(a);
        }
    }

    /**
     * Elimina persona de Actividad
     *
     * @param a
     */
    public void quitarPersona(Persona a) {
        if (a.getEdad() == Edad.NIÑOS) {
            for (int i = 0; i < nino.size(); i++) {
                if (a.getID() == nino.get(i).getID()) {
                    nino.remove(i);
                }
            }
        }
        if (a.getEdad() == Edad.ADULTOS) {
            for (int i = 0; i < adulto.size(); i++) {
                if (a.getID() == adulto.get(i).getID()) {
                    adulto.remove(i);
                }
            }
        }
        if (a.getEdad() == Edad.ADULTOS_MAYORES) {
            for (int i = 0; i < adultoMayor.size(); i++) {
                if (a.getID() == adultoMayor.get(i).getID()) {
                    adultoMayor.remove(i);
                }
            }
        }
    }

    /*
    * return @horaPaseo
     */
    public int getHoraPaseo() {
        return horaPaseo;
    }

    /*
    * return @horaEscuela
     */
    public int getHoraEscuela() {
        return horaEscuela;
    }

    /*
    * return @horaTrabajo
     */
    public int getHoraTrabajo() {
        return horaTrabajo;
    }

    /**
     * ninos, adultos y adultos mayores realizan sus respectivas actividades
     *
     * @param a
     */
    public void realizarActividad(Persona a) {
        if (a.getEdad().equals(Edad.NIÑOS)) {
            escuela(a);
        }
        if (a.getEdad().equals(Edad.ADULTOS)) {
            trabajo(a);
        }
        if (a.getEdad().equals(Edad.ADULTOS_MAYORES)) {
            paseo(a);
        }
    }

    /**
     * ninos van a la escuela e interactuán con otras personas
     *
     * @param a
     */
    public void escuela(Persona a) {
        for (int i = 0; i < nino.size(); i++) {
            if (Math.random() < 0.1) {
                if (!a.equals(nino.get(i)) && !a.getContagio() && nino.get(i).getContagio()) {
                    if (Math.random() * 100 < interactuar(a, nino.get(i))) {
                        a.setContagio(true);
                        if (Math.random() < 0.5) {
                            a.setSintoma(true);
                        }
                    }
                }
            }
        }
        try {
            sleep((10000 * this.horaEscuela) / nino.size());
        } catch (InterruptedException ex) {
            Logger.getLogger(Actividad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * adultos van al trabajo e interactuán con otras personas
     *
     * @param a
     */
    public void trabajo(Persona a) {
        for (int i = 0 + 1; i < adulto.size(); i++) {
            if (Math.random() < 0.1) {
                if (!a.equals(adulto.get(i)) && !a.getContagio() && adulto.get(i).getContagio()) {
                    if (Math.random() * 100 < interactuar(a, adulto.get(i))) {
                        a.setContagio(true);
//                        if (Math.random() < 0.5) {
                            a.setSintoma(true);
//                        }
                    }
                }
            }
        }
        try {
            sleep((10000 * this.horaTrabajo) / adulto.size());
        } catch (InterruptedException ex) {
            Logger.getLogger(Actividad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * adultos mayores van de paseo e interactuán con otras personas
     *
     * @param a
     */
    public void paseo(Persona a) {
        for (int i = 0 + 1; i < adultoMayor.size(); i++) {
            if (Math.random() < 0.1) {
                if (!a.equals(adultoMayor.get(i)) && !a.getContagio() && adultoMayor.get(i).getContagio()) {
                    if (Math.random() * 100 < interactuar(a, adultoMayor.get(i))) {
                        a.setContagio(true);
//                        if (Math.random() < 0.5) {
                            a.setSintoma(true);
//                        }
                    }
                }
            }
        }
        try {
            sleep((10000 * this.horaTrabajo) / adultoMayor.size());
        } catch (InterruptedException ex) {
            Logger.getLogger(Actividad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * devuelve la posibilidad de contagio entre dos personas que interactúan
     * entre sí, dependiendo el tipo de cuidado de cada una
     *
     * @param a
     * @param b
     * @return int
     */
    public double interactuar(Persona a, Persona b) {
        if (a.getCuidado().getTapabocas() && b.getCuidado().getTapabocas()) {
            return 1.5;
        }
        if (a.getCuidado().getTapabocas() && !b.getCuidado().getTapabocas()) {
            return 5;
        }
        if (!a.getCuidado().getTapabocas() && b.getCuidado().getTapabocas()) {
            return 75;
        }
        if (!a.getCuidado().getTapabocas() && !b.getCuidado().getTapabocas()) {
            return 90;
        }
        return 0;
    }
}
