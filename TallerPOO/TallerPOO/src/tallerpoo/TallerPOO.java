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

        //para comenzar con los threads/hilos
        Persona p1 = new Persona();

        p1.start();

//        //Boolean tapabocas, Boolean distanciamiento, Boolean desinfectar, Boolean evitarcontacto 
//        //Boolean diabetes, Boolean hipertencionArterial, Boolean obesidad, Boolean enfCard, Boolean enfPul
        Comorbilidad co = new Comorbilidad(false, true, true, false, false);
        TipoCuidado t = new TipoCuidado(false, true, true, true);
        Actividad act = new Actividad();
//
//        //Edad edad, Boolean contagio, Boolean sintoma, Color color, TipoCuidado cuidado,Comorbilidad comorbilidad
        Persona[] p = new Persona[30];
        for (int i = 0; i < 5; i++) {
            p[i] = new Persona(Edad.NIÑOS, true, false, t, co, act);
            p[i].actividad();
        }

//
//        //-------------------------------//
//        
        t = new TipoCuidado(true, false, true, true);
        for (int i = 5; i < 30; i++) {
            p[i] = new Persona(Edad.NIÑOS, false, false, t, co, act);
            p[i].actividad();
        }
        System.out.println(act.cant());
        act.realizarActividad();
    }

}
