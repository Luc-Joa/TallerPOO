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

    private Contagiado enfermo;
    private CM[] cm = new CM[5];
    private CTI[] ci = new CTI[2];
    private List<Aislamiento> aislamiento;

    public Hospital(Aislamiento e) {
        for (int i = 0; i <cm.length; i++) {
            cm[i]= new CM(this);
        }
        for (int i = 0; i <ci.length; i++) {
            ci[i]= new CTI(this);
        }
        this.aislamiento= new ArrayList<>();
    }
    
}
