/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TallerPoo;

import static TallerPoo.Edad.ADULTOS;
import static TallerPoo.Edad.NIÑOS;
import java.util.Date;

/**
 *
 * @author Joaquin
 */
public class Persona {

    private Edad edad;
    private Boolean contagio, sintoma;
    private Color color;
    private TipoCuidado cuidado;
    private Comorbilidad comorbilidad;
    private Contagiado contagiado;
    private Actividad actividad;

    public Persona(Edad edad, Boolean contagio, Boolean sintoma, Color color, TipoCuidado cuidado, Comorbilidad comorbilidad) {
        this.edad = edad;
        this.contagio = contagio;
        this.sintoma = sintoma;
        this.color = color;
        this.cuidado = cuidado;
        this.comorbilidad = comorbilidad;
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

    public Date realizarActividad(Edad ed) {
        if (ed == NIÑOS) { //si es niño
            actividad.getHoraEscuela(); //cambiar por irEscuela()
        } else if (ed == ADULTOS) { //si es adulto
            actividad.getHoraTrabajo(); //cambiar por irTrabajo()
        } else { //si es adulto mayor
            actividad.getHoraPaseo(); //cambiar por irPaseo()
        }

        return null;
    }

    public void mostrarCuidado(TipoCuidado tp) {
        System.out.println("Cuidado: \n" + "¿Desinfecta?" + tp.getDesinfectar()
                + "¿Toma distanciamiento?" + tp.getDistanciamiento()
                + "¿Evita contacto?" + tp.getEvitarcontacto()
                + "¿Utiliza tapabocas?" + tp.getTapabocas());
    }
}
