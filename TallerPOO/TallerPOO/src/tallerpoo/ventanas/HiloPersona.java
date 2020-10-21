/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpoo.ventanas;

import TallerPoo.Persona;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HiloPersona extends Thread {

    private FiguraPersona p;
    private Persona per;

    public HiloPersona(FiguraPersona p) {
        this.p = p;
    }

    @Override
    public void run() {
        boolean t = true;
        try {
            sleep((int) (Math.random() * 5000));
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (p.llego()) {
            p.caminoEscuela();
            p.mover(p.getDir());
            try {
                sleep((int) (Math.random() * 40));
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        p.setDir(((int) (Math.random() * 7)));
        while (t) {

            p.rebotar();
            p.mover(p.getDir());
            if (p.getContagio()) {
                p.consulta();
            }
            try {
                sleep((int) (Math.random() * 40));
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
