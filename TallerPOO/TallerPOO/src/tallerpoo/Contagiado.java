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
    private Persona persona;
    Hospital hospital;

    public Contagiado() {
        this.perSana = new ArrayList<>();
        this.perCont = new ArrayList<>();
    }

    public Contagiado(Persona persona, Hospital hospital) {
        this.persona = persona;
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
//    /*
//    * return @hospital
//     */
//    public Hospital getHospital() {
//        return hospital;
//    }
//
//    /* creo que no va
//    * set @hospital
//     */
//    public void setHospital(Hospital hospital) {
//        this.hospital = hospital;
//    }

    /*  
    * si una persona está contagiada o no
    * y la agrega a la lista de persona correspondiente 
     */
    public Boolean consulta() {
        if (this.persona.getContagio()) {
            agregarContagiado(persona);
        } 
        return persona.getContagio();
    }
    
    public void agregarContagiado(Persona p){
        this.perCont.add(p);
        hospital.derivarPersona(p);
    }
    
    
       
    /* 
    * muestra una lista de contagiados 
     */
    public List<Persona> mostrarContagiados() {
        return this.perCont;
    }

    /* 
    * muestra una lista de sanos
     */
    public List<Persona> mostrarSanos() {
        return this.perSana;
    }

}
