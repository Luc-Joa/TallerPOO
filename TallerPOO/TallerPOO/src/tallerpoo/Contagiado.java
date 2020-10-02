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
 * @author Joaquin
 */
public class Contagiado {

    private List<Persona> perCont, perSana;
    private List<Persona> personas;
    private Hospital hospital;

    public Contagiado() {
        this.personas = new ArrayList<>();
    }

    public Contagiado(Persona personas, Hospital hospital) {
        this.personas.add(personas);
        this.hospital = hospital;
    }

//    /*
//    * return @persona
//    */
//    public Persona getPersona() {
//        return persona;
//    }
//    /*
//    * set @persona
//    */
//    public void setPersona(Persona persona) {
//        this.persona = persona;
//    }

    /*
    * return @hospital
     */
    public Hospital getHospital() {
        return hospital;
    }

    /* creo que no va
    * set @hospital
     */
    public void settHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    /*  
    * si una persona está contagiada o no 
    * y la agrega a la lista de personas correspondiente 
     */
    public void consulta() {
        for (int i = 0; i < this.personas.size(); i++) {
            if (this.personas.get(i).getContagio()) {
                this.perCont.add(this.personas.get(i));
            } else {
                this.perSana.add(this.personas.get(i));
            }
        }

    }

    /* 
    * muestra una lista de contagiados 
     */
    public List mostrarContagiados() {
        return this.perCont;
    }

    /* 
    * muestra una lista de sanos
     */
    public List mostrarSanos() {
        return this.perSana;
    }

}
