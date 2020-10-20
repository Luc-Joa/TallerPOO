/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpoo.ventanas;

import TallerPoo.Persona;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACU
 */
public class HiloPersona extends Thread {

    private FiguraPersona p;
    private Persona per;

    public HiloPersona(FiguraPersona p) {
        this.p = p;
    }

    ifrmSimulacionHospital iH = new ifrmSimulacionHospital();

    @Override
    public void run() {
        p.setDir(((int) (Math.random() * 7)));
//        while (true) {
        for (int i = 0; i < 1000; i++) {
            p.rebotar();
            p.mover(p.getDir());

            try {
                sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
