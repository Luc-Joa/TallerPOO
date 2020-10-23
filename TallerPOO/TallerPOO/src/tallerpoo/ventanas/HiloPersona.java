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
//            if (p.getSintoma()) {
                hospital();
//            }
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
