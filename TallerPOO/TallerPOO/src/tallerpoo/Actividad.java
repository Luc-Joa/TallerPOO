/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TallerPoo;

import java.awt.Color;
/**
 *
 * @author ACU
 */
public class Actividad {

    final int horaPaseo, horaEscuela, horaTrabajo;

    /**
     * Constructor por defecto de Actividad
     */
    public Actividad() {
        horaPaseo = 1;
        horaEscuela = 4;
        horaTrabajo = 8;
    }

   

   public void Contagio(Persona a, Persona b){
      if (a.getContagio() && !b.getContagio()) {
           if ((Math.random()*100)< interactuar(a,b)) {
               a.setColor(Color.red);
           }
      }
      if (!a.getContagio() && b.getContagio()) {
           if ((Math.random()*100)< interactuar(b,a)) {
               a.setColor(Color.red);
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
