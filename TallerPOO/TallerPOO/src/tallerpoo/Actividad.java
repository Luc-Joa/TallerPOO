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

    private List<Persona> ninos; //maxi gay
    private List<Persona> adultos; //maxi lindo
    private List<Persona> adultosMayores; //tur bu len cia
    final int horaPaseo, horaEscuela, horaTrabajo;

    public Actividad() {
        ninos = new ArrayList<>();
        adultos = new ArrayList<>();
        adultosMayores = new ArrayList<>();
        horaPaseo = 1;
        horaEscuela = 4;
        horaTrabajo = 8;
    }

    public void agregarPersona(Persona a) {
        if (a.getEdad() == Edad.NIÑOS) {
            ninos.add(a);
        }
        if (a.getEdad() == Edad.ADULTOS) {
            adultos.add(a);
        }
        if (a.getEdad() == Edad.ADULTOS_MAYORES) {
            adultosMayores.add(a);
        }
    }

    public int cant() {
        return ninos.size();
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

    public void realizarActividad() {
        int c = 0;
        for (int i = 0; i < ninos.size(); i++) {
            if (ninos.get(i).getContagio()) {
                escuela(ninos.get(i), i);
            }
        }
        c = ninos.stream().filter((nino) -> (nino.getContagio())).map((_item) -> 1).reduce(c, Integer::sum);
        System.out.println("Cantidad de contagiados :" + c);
        for (int i = 0; i < adultos.size(); i++) {
            if (adultos.get(i).getContagio()) {
                escuela(adultos.get(i), i);
                break;
            }
        }
        for (int i = 0; i < adultosMayores.size(); i++) {
            if (adultosMayores.get(i).getContagio()) {
                escuela(adultosMayores.get(i), i);
                break;
            }
        }

    }

    public void escuela(Persona a, int c) {
        for (int i = c + 1; i < ninos.size(); i++) {
            if (Math.random()<0.1) {
              if (!ninos.get(i).getContagio()) {
                if (Math.random() * 100 < interactuar(a, ninos.get(i))) {
                    System.out.println(i + "Se contagio");
                    ninos.get(i).setContagio(true);
                }
            }  
            }
            
        }
    }

    public void trabajo(Persona a, int c) {
        for (int i = c + 1; i < adultos.size(); i++) {
            if (!adultos.get(i).getContagio()) {
                if (Math.random() * 100 < interactuar(a, adultos.get(i))) {
                    System.out.println(i + "Se contagio");
                    adultos.get(i).setContagio(true);
                }
            }
        }
    }

    public void paseo(Persona a, int c) {
         for (int i = c + 1; i < adultosMayores.size(); i++) {
            if (!adultosMayores.get(i).getContagio()) {
                if (Math.random() * 100 < interactuar(a, adultosMayores.get(i))) {
                    System.out.println(i + "Se contagio");
                    adultosMayores.get(i).setContagio(true);
                }
            }
        }
    }


    /*  
    * devuelve la posibilidad de contagio entre dos personas que interactúan entre sí 
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
