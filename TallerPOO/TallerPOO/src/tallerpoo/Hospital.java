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
public class Hospital {

    private Contagiado enfermo;
    private CM[] cm = new CM[5];
    private CTI[] cti = new CTI[2];
    private Aislamiento aislamiento;
    private int contcm = 0, contcti = 0;

    public Hospital() {
        for (int i = 0; i < cm.length; i++) {
            cm[i] = new CM(this);
        }
        for (int i = 0; i < cti.length; i++) {
            cti[i] = new CTI(this);
        }
        this.aislamiento = new Aislamiento();
    }

    public void derivarPersona(Persona p) {
        if (p.getComorbilidad().getEnfCard() || p.getComorbilidad().getEnfPul()) {
            if (!(contcti >= cti.length)) {
                cti[contcti].setPaciente(p);
                contcti++;
            }
        }
        if (!(contcti >= cti.length)) {
            if (contcm >= cm.length && (p.getComorbilidad().getDiabetes() || p.getComorbilidad().getHipertencionArterial() || p.getComorbilidad().getObesidad())) {
                cm[contcm].setPaciente(p);
                contcm++;
            } else {
                this.aislamiento.setPaciente(p);
            }
        }
    }

    public CTI[] mostrarPacientesCTI() {
        return cti;
    }

    public CM[] mostrarPacientesCM() {
        return cm;
    }

    public Aislamiento mostrarPacientesAislamiento() {
        return aislamiento;
    }
}
