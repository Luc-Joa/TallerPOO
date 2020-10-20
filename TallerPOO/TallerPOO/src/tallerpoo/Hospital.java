/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TallerPoo;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

    private Persona persona;
//    private CM[] cm = new CM[5];
//    private CTI[] cti = new CTI[2];
    private List<CM> cm;
    private List<CTI> cti;
    private List<Aislamiento> aislamiento;
    private List<Persona> perCont;
    private int contcm = 0, contcti = 0, contais = 0;

    /**
     * constructor por defecto
     */
    public Hospital() {
        this.perCont = new ArrayList<>();
//        for (int i = 0; i < cm.length; i++) {
//            cm[i] = new CM(this);
//        }
//        for (int i = 0; i < cti.length; i++) {
//            cti[i] = new CTI(this);
//        }
        this.cm = new ArrayList();
        this.cti = new ArrayList();
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

    public int getContais() {
        return contais;
    }

    /**
     * deriva a la persona contagiada determinando su gravedad y comorbilidades
     *
     * @param p
     */
    public void derivarPersona(Persona p) {
        if (p.getComorbilidad().getEnfCard() || p.getComorbilidad().getEnfPul()) {
            if (contcti < 2) {
                this.cti.add(new CTI(p));
                contcti++;
                System.out.println("Pacientes CTI: " + contcti);
            }
        } else {
            if (contcm < 5 && (p.getComorbilidad().getDiabetes() || p.getComorbilidad().getHipertencionArterial() || p.getComorbilidad().getObesidad())) {
                this.cm.add(new CM(p));
                contcm++;
                System.out.println("Pacientes Moderados: " + contcm);
            } else {
                this.aislamiento.add(new Aislamiento(p));

                System.out.println("Pacientes Aislamiento: " + contais);
                contais++;

            }
        }
    }

    /**
     * muestra una lista de pacientes en CTI
     *
     * @return cti
     */
    public List<CTI> mostrarPacientesCTI() {
        return cti;
    }

    /**
     * muestra una lista de pacientes en CM
     *
     * @return cm
     */
    public List<CM> mostrarPacientesCM() {
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
}
