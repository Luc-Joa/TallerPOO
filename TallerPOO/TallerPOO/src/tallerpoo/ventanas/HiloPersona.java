/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpoo.ventanas;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HiloPersona extends Thread {

    Comorbilidad comorbilidadObesidad = new Comorbilidad(false, false, true, false, false); 
    Comorbilidad comorbilidadHArterial = new Comorbilidad(false, true, false, false, false); 
    Comorbilidad comorbilidadDiabetes = new Comorbilidad(true, false, false, false, false); 
    Comorbilidad comorbilidadECardiológica = new Comorbilidad(false, false, false, true, false);
    Comorbilidad comorbilidadEPulmonares = new Comorbilidad(false, false, false, false, true);
    
    private FiguraPersona p;
    
    public HiloPersona(FiguraPersona p) {
        this.p = p;
    }

    @Override
    public void run() {
        try {
            sleep((int) (p.getID() * 1000));
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (true) {
            camino();
            actividad();
            volver();
            if (p.getSintoma()) {
                hospital();
                if (p.getComorbilidad().equals(comorbilidadObesidad) || p.getComorbilidad().equals(comorbilidadHArterial) || p.getComorbilidad().equals(comorbilidadDiabetes)) {
                    //entra en CM
                } else if (p.getComorbilidad().equals(comorbilidadECardiológica) || p.getComorbilidad().equals(comorbilidadEPulmonares)) {
                    //entra en CTI
                }
            } else {
                volver();
            }
        }
    }

    private void volver() {
        while (!p.llego()) {
            p.vuelta();
            p.mover(p.getDir());
            try {
                sleep((int) (Math.random() * 40));
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void actividad() {
        boolean t = true;
        long tiempo = 0;
        int contador = 0;
        p.setDir(((int) (Math.random() * 7)));
        while (t) {
            contador = 60;
            tiempo += contador;
            if (tiempo >= 12000) {
                t = false;
            }
            p.rebotar();
            p.mover(p.getDir());
            if (p.getContagio()) {
                p.consulta();
            }
            try {
                sleep(contador);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void camino() {
        while (!p.llego()) {
            p.camino();
            p.mover(p.getDir());
            try {
                sleep((int) (Math.random() * 40));
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void hospital() {
        p.hospital();
        while (!p.llego()) {
            p.hospital();
            p.mover(p.getDir());
            try {
                sleep((int) (Math.random() * 40));
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
