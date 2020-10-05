/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TallerPoo;

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
    private Hospital hospital;
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

    public void actividad() {
        actividad.agregarPersona(this);
    }

    public void realizar() {
        actividad.realizarActividad();
    }

    public TipoCuidado mostrarCuidado() {
        return cuidado;
    }
}
