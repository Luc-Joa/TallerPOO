/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TallerPoo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Joaquin
 */
public class Persona extends Thread {

    private Edad edad;
    private Boolean contagio, sintoma;
    private Color color;
    private TipoCuidado cuidado;
    private Comorbilidad comorbilidad;
    private Contagiado hospital;
    private Actividad actividad;

    public Persona(Edad edad, Boolean contagio, Boolean sintoma, TipoCuidado cuidado, Comorbilidad comorbilidad, Actividad actividad) {
        this.edad = edad;
        this.contagio = contagio;
        this.sintoma = sintoma;
        this.color = cuidado.tipoCuidado();
        this.cuidado = cuidado;
        this.comorbilidad = comorbilidad;
        this.actividad = actividad;
    }

    //para comenzar con los threads/hilos
    //constructor por defecto
    public Persona() {
        edad = null;
        contagio = false;
        sintoma = null;
        color = null;
        cuidado = null;
        comorbilidad = null;
        actividad = null;
    }

    /*
    * return @comorbilidad
     */
    public Comorbilidad getComorbilidad() {
        return comorbilidad;
    }

    /*
    * set @comorbilidad
     */
    public void setComorbilidad(Comorbilidad comorbilidad) {
        this.comorbilidad = comorbilidad;
    }

    /*
    * return @edad
     */
    public Edad getEdad() {
        return edad;
    }

    /*
    * set @edad
     */
    public void setEdad(Edad edad) {
        this.edad = edad;
    }

    /*
    * return @contagio
     */
    public Boolean getContagio() {
        return contagio;
    }

    /*
    * set @contagio
     */
    public void setContagio(Boolean contagio) {
        this.contagio = contagio;
    }

    /*
    * return @sintoma
     */
    public Boolean getSintoma() {
        return sintoma;
    }

    /*
    * set @sintoma
     */
    public void setSintoma(Boolean sintoma) {
        this.sintoma = sintoma;
    }

    /*
    * return @color
     */
    public Color getColor() {
        return color;
    }

    /*
    * set @color
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /*
    * return @cuidado
     */
    public TipoCuidado getCuidado() {
        return cuidado;
    }

    /*
    * set @cuidado
     */
    public void setCuidado(TipoCuidado cuidado) {
        this.cuidado = cuidado;
    }

    /**
     * agrega una persona a la actividad según su edad
     */
    public void actividad() {
        actividad.agregarPersona(this);
    }

    /**
     * realiza una actividad según su edad
     */
    public void realizar() {
        actividad.realizarActividad();
    }

    /**
     * muestra el cuidado de cada persona
     *
     * @return cuidado
     */
    public TipoCuidado mostrarCuidado() {
        return cuidado;
    }

    /**
     * devuelve si una persona está contagiada o no, si está contagiada la
     * agrega a la lista de persona correspondiente
     */
    public void consulta() {
        this.hospital.consulta();
    }

    //para comenzar con los threads/hilos
    @Override
    public void run() {
        System.out.println(" hilo ejecutándose ");
        try {
            sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
