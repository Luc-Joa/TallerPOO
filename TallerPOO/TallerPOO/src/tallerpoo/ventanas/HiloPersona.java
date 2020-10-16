/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpoo.ventanas;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACU
 */
public class HiloPersona extends Thread {

    private FiguraPersona p;

    public HiloPersona(FiguraPersona p) {
        this.p = p;
    }

    @Override
    public void run() {
        p.setDir(((int) (Math.random() * 7)));
        while (true) {
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
