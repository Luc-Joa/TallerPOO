/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpoo.ventanas;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HiloPersona extends Thread {


    
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
            hospital();
            volverHospital();
        }
    }

    private void volver() {
        p.vuelta();
        while (!p.llego()) {
            p.vuelta();
            p.mover();
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
            p.mover();
            try {
                sleep(contador);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void camino() {
        p.camino();
        while (!p.llego()) {
            p.camino();
            p.mover();
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
            p.mover();
            try {
                sleep((int) (Math.random() * 40));
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    private void volverHospital() {
        p.volverHospital();
        while (!p.llego()) {
            p.volverHospital();
            p.mover();
            try {
                sleep((int) (Math.random() * 40));
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
