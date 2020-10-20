/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TallerPoo;

import java.util.ArrayList;
import java.util.List;

public class Contagiado {

    private List<Persona> perCont, perSana;
    private Persona persona;
    Hospital hospital;

    /**
     * constructor por defecto
     */
    public Contagiado() {
        this.perSana = new ArrayList<>();
        this.perCont = new ArrayList<>();
    }

    /**
     * constructor parametrizado
     *
     * @param persona
     * @param hospital
     */
    public Contagiado(Persona persona, Hospital hospital) {
        this.persona = persona;
        this.hospital = hospital;
    }

    /**
     * devuelve si una persona está contagiada o no, si está contagiada la
     * agrega a la lista de persona correspondiente
     *
     * @return contagio
     */
    public Boolean consulta() {
        if (this.persona.getContagio()) {
            agregarContagiado(persona);
        }
        return persona.getContagio();
    }

    /**
     * agrega persona contagiada a la lista y la deriva según su gravedad
     *
     * @param p
     */
    public void agregarContagiado(Persona p) {
        this.perCont.add(p);
        hospital.derivarPersona(p);
    }

    /**
     * muestra una lista de contagiados
     *
     * @return List perCont
     */
    public List<Persona> mostrarContagiados() {
        return this.perCont;
    }

    /**
     * muestra una lista de sanos
     *
     * @return List perSana
     */
    public List<Persona> mostrarSanos() {
        return this.perSana;
    }

}
