/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TallerPoo;

import java.awt.Color;
import java.util.Objects;
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
    private int id;

    public Persona(Edad edad, Boolean contagio, Boolean sintoma, TipoCuidado cuidado, Comorbilidad comorbilidad, Actividad actividad, int id) {
        this.edad = edad;
        this.contagio = contagio;
        this.sintoma = sintoma;
        this.color = cuidado.tipoCuidado();
        this.cuidado = cuidado;
        this.comorbilidad = comorbilidad;
        this.actividad = actividad;
        this.id = id;
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
        actividad.realizarActividad(this);
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

    public int getID() {
        return id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.contagio, other.contagio)) {
            return false;
        }
        if (!Objects.equals(this.sintoma, other.sintoma)) {
            return false;
        }
        if (this.color != other.color) {
            return false;
        }
        if (!Objects.equals(this.cuidado, other.cuidado)) {
            return false;
        }
        if (!Objects.equals(this.comorbilidad, other.comorbilidad)) {
            return false;
        }
        if (!Objects.equals(this.hospital, other.hospital)) {
            return false;
        }
        return Objects.equals(this.actividad, other.actividad);
    }

    //para comenzar con los threads/hilos
    @Override
    public void run() {

        actividad();
        if (id == 9) {
            realizar();
        }

        try {
            sleep((int) (Math.random() * 100));
        } catch (InterruptedException ex) {
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
