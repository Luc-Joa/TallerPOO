/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TallerPoo;

/**
 *
 * @author ACU
 */
public class TallerPOO {

    public static void main(String[] args) throws InterruptedException {

        //para comenzar con los threads/hilo

//        //Boolean tapabocas, Boolean distanciamiento, Boolean desinfectar, Boolean evitarcontacto 
//        //Boolean diabetes, Boolean hipertencionArterial, Boolean obesidad, Boolean enfCard, Boolean enfPul
        Comorbilidad co = new Comorbilidad(false, true, true, false, false);
        TipoCuidado t = new TipoCuidado(true, true, true, true);
        Actividad act = new Actividad();
//
//        //Edad edad, Boolean contagio, Boolean sintoma, Color color, TipoCuidado cuidado,Comorbilidad comorbilidad
        Persona[] p = new Persona[10];
        for (int i = 0; i < 2; i++) {
            p[i] = new Persona(Edad.NIÑOS, true, false, t, co, act, i);
            p[i].start();
        }

//
//        //-------------------------------//
//        
        t = new TipoCuidado(false, false, true, true);
        for (int i = 2; i < 10; i++) {
            p[i] = new Persona(Edad.NIÑOS, false, false, t, co, act,i);
            p[i].start();
        }
    }

}
