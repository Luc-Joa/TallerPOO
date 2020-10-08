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
        if (a.getEdad() == Edad.NIÑOS) {
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
     * @param a
     */
    public void realizarActividad(Persona a) {
        int c = 0;
        int c2 = 0; //lo que agregué comentados con un punto (.)
        int c3 = 0; //.
        if (a.getEdad().equals(Edad.NIÑOS)) {
            escuela(a);
        }

        System.out.println("Actividad Escuela Terminada");
        if (a.getEdad().equals(Edad.ADULTOS)) {
            trabajo(a);
        }
        if (a.getEdad().equals(Edad.ADULTOS_MAYORES)) {
            paseo(a);
        }

        for (int i = 0; i < nino.size(); i++) {
            if (nino.get(i).getContagio()) {
                c++;
            }
        }
        for (int i = 0; i < adulto.size(); i++) {
            if (adulto.get(i).getContagio()) {
                c2++;
            }
        }
        for (int i = 0; i < adultoMayor.size(); i++) {
            if (adultoMayor.get(i).getContagio()) {
                c3++;
            }
        }
        System.out.println("Cantidad de niños contagiados: " + c);

        System.out.println("Cantidad de adultos contagiados: " + c2);

        System.out.println("Cantidad de adultos mayores contagiados: " + c3);

    }

    /**
     * ninos van a la escuela e interactuán con otras personas
     *
     * @param a
     */
    public void escuela(Persona a) {
        for (int i = 0; i < nino.size(); i++) {
            if (Math.random() < 0.1) {
                if (!a.equals(nino.get(i)) && nino.get(i).getContagio()) {
                    if (Math.random() * 100 < interactuar(a, nino.get(i))) {
                        System.out.println(nino.get(i).getID() + " se contagió. ");
                        nino.get(i).setContagio(true);
                    }
                }
            }
        }
        try {
            sleep((10000 * this.horaEscuela) / nino.size());
        } catch (InterruptedException ex) {
            Logger.getLogger(Actividad.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(a.getID() + "termino la tarea");
    }

    /**
     * adultos van al trabajo e interactuán con otras personas
     *
     * @param a
     */
    public void trabajo(Persona a) {
        for (int i = 0 + 1; i < adulto.size(); i++) {
            if (Math.random() < 0.1) {
                if (!a.equals(adulto.get(i)) && adulto.get(i).getContagio()) {
                    if (Math.random() * 100 < interactuar(a, adulto.get(i))) {
                        System.out.println(adulto.get(i).getID() + " se contagió. ");
                        adulto.get(i).setContagio(true);
                    }
                }
            }
        }
        try {
            sleep((10000 * this.horaTrabajo) / adulto.size());
        } catch (InterruptedException ex) {
            Logger.getLogger(Actividad.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(a.getID() + "termino la tarea");
    }

    /**
     * adultos mayores van de paseo e interactuán con otras personas
     *
     * @param a
     */
    public void paseo(Persona a) {
        for (int i = 0 + 1; i < adultoMayor.size(); i++) {
            if (Math.random() < 0.1) {
                if (!a.equals(adultoMayor.get(i)) && adultoMayor.get(i).getContagio() && Math.random() * 100 < interactuar(a, adultoMayor.get(i))) {
                    System.out.println(adultoMayor.get(i).getID() + " se contagió. ");
                    adultoMayor.get(i).setContagio(true);
                }
            }
        }
        try {
            sleep((10000 * this.horaTrabajo) / adultoMayor.size());
        } catch (InterruptedException ex) {
            Logger.getLogger(Actividad.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(a.getID() + "termino la tarea");
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
