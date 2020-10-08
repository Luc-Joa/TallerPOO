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

        Comorbilidad co1 = new Comorbilidad(false, true, true, false, false);
        Comorbilidad co2 = new Comorbilidad(true, false, true, false, false); //intentos
        Comorbilidad co3 = new Comorbilidad(false, true, false, true, true); //intentos
        TipoCuidado t1 = new TipoCuidado(true, true, true, true); //intentos
        TipoCuidado t2 = new TipoCuidado(false, false, true, true);
        TipoCuidado t3 = new TipoCuidado(true, true, false, false); //intentos
        Actividad act = new Actividad();

        //------------NIÑOS--------------//
        Persona[] ninos = new Persona[10];
        for (int i = 0; i < 2; i++) {
            ninos[i] = new Persona(Edad.NIÑOS, true, false, t2, co1, act, i);
            ninos[i].start();
        }
//
//        //------------------------------//
//        
        for (int i = 2; i < 10; i++) {
            ninos[i] = new Persona(Edad.NIÑOS, false, false, t1, co1, act, i);
            ninos[i].start();
        }

        //------------ADULTOS-------------//
        Persona[] adultos = new Persona[10];
        for (int i = 0; i < 2; i++) {
            adultos[i] = new Persona(Edad.ADULTOS, true, false, t1, co3, act, i);
            adultos[i].start();
        }
//
//        //-------------------------------//
//        
        for (int i = 2; i < 10; i++) {
            adultos[i] = new Persona(Edad.ADULTOS, false, true, t3, co3, act, i);
            adultos[i].start();
        }

        //-----ADULTOS-------MAYORES------//
        Persona[] adultosMayores = new Persona[10];
        for (int i = 0; i < 2; i++) {
            adultosMayores[i] = new Persona(Edad.ADULTOS_MAYORES, true, false, t3, co2, act, i);
            adultosMayores[i].start();
        }
//
//        //-------------------------------//
//        
        for (int i = 2; i < 10; i++) {
            adultosMayores[i] = new Persona(Edad.ADULTOS_MAYORES, false, false, t2, co2, act, i);
            adultosMayores[i].start();
        }
    }

}

//ANTERIOR PARA NO PERDER
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package TallerPoo;
//
///**
// *
// * @author ACU
// */
//public class TallerPOO {
//
//    public static void main(String[] args) throws InterruptedException {
//
//        //para comenzar con los threads/hilo
//
////        //Boolean tapabocas, Boolean distanciamiento, Boolean desinfectar, Boolean evitarcontacto 
////        //Boolean diabetes, Boolean hipertencionArterial, Boolean obesidad, Boolean enfCard, Boolean enfPul
//        Comorbilidad co = new Comorbilidad(false, true, true, false, false);
//        TipoCuidado t = new TipoCuidado(true, true, true, true);
//        Actividad act = new Actividad();
////
////        //Edad edad, Boolean contagio, Boolean sintoma, Color color, TipoCuidado cuidado,Comorbilidad comorbilidad
//        Persona[] p = new Persona[10];
//        for (int i = 0; i < 2; i++) {
//            p[i] = new Persona(Edad.NIÑOS, true, false, t, co, act, i);
//            p[i].start();
//        }
//
////
////        //-------------------------------//
////        
//        t = new TipoCuidado(false, false, true, true);
//        for (int i = 2; i < 10; i++) {
//            p[i] = new Persona(Edad.NIÑOS, false, false, t, co, act,i);
//            p[i].start();
//        }
//    }
//
//}
