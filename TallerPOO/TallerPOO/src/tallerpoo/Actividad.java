/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TallerPoo;

import java.util.List;

/**
 *
 * @author ACU
 */
public class Actividad {

    private List<Persona> ninos;
    private List<Persona> adultos;
    private List<Persona> adultosMayores;
    private Contagiado contagiado;
    private int horaPaseo, horaEscuela, horaTrabajo;

    public Actividad() {
        horaPaseo = 0;
        horaEscuela = 0;
        horaTrabajo = 0;
    }

    public Actividad(int horaPaseo, int horaEscuela, int horaTrabajo) {
        this.horaPaseo = horaPaseo;
        this.horaEscuela = horaEscuela;
        this.horaTrabajo = horaTrabajo;
    }

    /*
    * return @horaPaseo
     */
    public int getHoraPaseo() {
        return horaPaseo;
    }

    /*
    * set @horaPaseo
     */
    public void setHoraPaseo(int horaPaseo) {
        this.horaPaseo = horaPaseo;
    }

    /*
    * return @horaEscuela
     */
    public int getHoraEscuela() {
        return horaEscuela;
    }

    /*
    * set @horaEscuela
     */
    public void setHoraEscuela(int horaEscuela) {
        this.horaEscuela = horaEscuela;
    }

    /*
    * return @horaTrabajo
     */
    public int getHoraTrabajo() {
        return horaTrabajo;
    }

    /*
    * set @horaTrabajo
     */
    public void setHoraTrabajo(int horaTrabajo) {
        this.horaTrabajo = horaTrabajo;
    }

    public void irPaseo() {

    }

    public void irEscuela() {

    }

    public void irTrabajo() {

    }

    /*  
    * devuelve la posibilidad de contagio entre dos personas que interactúan entre sí 
     */
    public double interactuar(Persona a, Persona b) {
        return 0;
    }
}
