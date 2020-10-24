/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TallerPoo;

import java.awt.Color;
import java.awt.Rectangle;

public class Actividad {

    final int horaPaseo, horaEscuela, horaTrabajo;

    private Rectangle rec;

    /**
     * Constructor por defecto de Actividad
     */
    public Actividad() {
        horaPaseo = 1;
        horaEscuela = 4;
        horaTrabajo = 8;
    }

    /**
     * Si una de las dos personas está contagiada, calcula la probabilidad de
     * contagio en método interactuar() y devuelve color rojo si se contagió
     *
     * @param a
     * @param b
     */
    public void Contagio(Persona a, Persona b) {
        if (a.getContagio() && !b.getContagio()) {
            if ((Math.random() * 100) < interactuar(a, b)) {
                b.setColor(Color.red);
                b.setContagio(Boolean.TRUE);
            }

        }
        if (!a.getContagio() && b.getContagio()) {
            if ((Math.random() * 100) < interactuar(b, a)) {
                a.setColor(Color.red);
                a.setContagio(Boolean.TRUE);
            }
        }
    }

    /**
     * Devuelve la posibilidad de contagio entre dos personas que interactúan
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
