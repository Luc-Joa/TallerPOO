/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TallerPoo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACU
 */
public class Actividad {

    private List<Persona> nino;
    private List<Persona> adulto;
    private List<Persona> adultoMayore;
    final int horaPaseo, horaEscuela, horaTrabajo;

    public Actividad() {
        nino = new ArrayList<>();
        adulto = new ArrayList<>();
        adultoMayore = new ArrayList<>();
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
        if (a.getEdad() == Edad.ADULTOS) {
            adulto.add(a);
        }
        if (a.getEdad() == Edad.ADULTOS_MAYORES) {
            adultoMayore.add(a);
        }
    }

    /**
     * devuelve el tamanio de la lista nino
     *
     * @return tamanio nino list
     */
    public int cant() {
        return nino.size();
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
     */
    public void realizarActividad() {
        int c = 0;
        for (int i = 0; i < nino.size(); i++) {
            if (nino.get(i).getContagio()) {
                escuela(nino.get(i), i);
            }
        }
        c = nino.stream().filter((nino) -> (nino.getContagio())).map((_item) -> 1).reduce(c, Integer::sum);
        System.out.println("Cantidad de contagiados: " + c);
        for (int i = 0; i < adulto.size(); i++) {
            if (adulto.get(i).getContagio()) {
                escuela(adulto.get(i), i);
                break;
            }
        }
        for (int i = 0; i < adultoMayore.size(); i++) {
            if (adultoMayore.get(i).getContagio()) {
                escuela(adultoMayore.get(i), i);
                break;
            }
        }

    }

    /**
     * ninos van a la escuela e interactuán con otras personas
     *
     * @param a
     * @param c
     */
    public void escuela(Persona a, int c) {
        for (int i = c + 1; i < nino.size(); i++) {
            if (Math.random() < 0.1) {
                if (!nino.get(i).getContagio()) {
                    if (Math.random() * 100 < interactuar(a, nino.get(i))) {
                        System.out.println(i + "Se contagio");
                        nino.get(i).setContagio(true);
                    }
                }
            }

        }
    }

    /**
     * adultos van al trabajo e interactuán con otras personas
     *
     * @param a
     * @param c
     */
    public void trabajo(Persona a, int c) {
        for (int i = c + 1; i < adulto.size(); i++) {
            if (!adulto.get(i).getContagio()) {
                if (Math.random() * 100 < interactuar(a, adulto.get(i))) {
                    System.out.println(i + " se contagió. ");
                    adulto.get(i).setContagio(true);
                }
            }
        }
    }

    /**
     * adultos mayores van de paseo e interactuán con otras personas
     *
     * @param a
     * @param c
     */
    public void paseo(Persona a, int c) {
        for (int i = c + 1; i < adultoMayore.size(); i++) {
            if (!adultoMayore.get(i).getContagio()) {
                if (Math.random() * 100 < interactuar(a, adultoMayore.get(i))) {
                    System.out.println(i + "Se contagio");
                    adultoMayore.get(i).setContagio(true);
                }
            }
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
