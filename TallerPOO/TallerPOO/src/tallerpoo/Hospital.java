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
public class Hospital {

    private Persona persona;
    private CM[] cm = new CM[5];
    private CTI[] cti = new CTI[2];
    private List<Aislamiento> aislamiento;
    private List<Persona> perCont;
    private int contcm = 0, contcti = 0, cta = 0;

    /**
     * constructor por defecto
     */
    public Hospital() {
        this.perCont = new ArrayList<>();
        for (int i = 0; i < cm.length; i++) {
            cm[i] = new CM(this);
        }
        for (int i = 0; i < cti.length; i++) {
            cti[i] = new CTI(this);
        }
        this.aislamiento = new ArrayList();
    }

    /**
     * devuelve si una persona está contagiada o no, si está contagiada la
     * agrega a la lista de persona correspondiente
     *
     * @param persona
     * @return contagio
     */
    public Boolean consulta(Persona persona) {
        return persona.getContagio();
    }

    /**
     * agrega persona contagiada a la lista y la deriva según su gravedad
     *
     * @param p
     */
    public void agregarContagiado(Persona p) {
        if (!this.perCont.contains(p)) {
            this.perCont.add(p);
            derivarPersona(p);
        }

    }

    /**
     * muestra una lista de contagiados
     *
     * @return List perCont
     */
    public List<Persona> getPerCont() {
        return perCont;
    }

    public int getContcm() {
        return contcm;
    }

    public int getContcti() {
        return contcti;
    }

    public int getCta() {
        return cta;
    }

    /**
     * deriva a la persona contagiada determinando su gravedad y comorbilidades
     *
     * @param p
     */
    public void derivarPersona(Persona p) {
        if (p.getComorbilidad().getEnfCard() || p.getComorbilidad().getEnfPul()) {
            if (contcti<2) {
                cti[contcti].setPaciente(p);
                contcti++;
                System.out.println("Pacientes CTI :" + contcti);
            }
        }
        if (!(contcti >= cti.length)) {
            if (contcm >= cm.length && (p.getComorbilidad().getDiabetes() || p.getComorbilidad().getHipertencionArterial() || p.getComorbilidad().getObesidad())) {
                cm[contcm].setPaciente(p);
                contcm++;
                System.out.println("Pacientes Moderados :" + contcm);
            } else {
                this.aislamiento.add(new Aislamiento(p));

                System.out.println("Pacientes Aislamiento :" + this.aislamiento.size());
                cta++;

            }
        }
    }

    /**
     * muestra una lista de pacientes en CTI
     *
     * @return cti
     */
    public CTI[] mostrarPacientesCTI() {
        return cti;
    }

    /**
     * muestra una lista de pacientes en CM
     *
     * @return cm
     */
    public CM[] mostrarPacientesCM() {
        return cm;
    }

    /**
     * muestra una lista de pacientes en Aislamiento
     *
     * @return aislamiento
     */
    public List<Aislamiento> mostrarPacientesAislamiento() {
        return aislamiento;
    }
//
//    @Override
//    public void run() {
//        while (true) {
//            if (persona.getTerminoActividad() && persona.getSintoma()) {
//                persona.consulta();
//                if (persona.getContagio()) {
//                    this.derivarPersona(persona);
//                }
//            }
//        }
//    }
}
