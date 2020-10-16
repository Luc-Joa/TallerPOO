/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TallerPoo;

import java.util.ArrayList;
import java.util.List;
import tallerpoo.ventanas.VentanaIngreso;

/**
 *
 * @author ACU
 */
public class TallerPOO {
    private static int cont=0;
    private static List<Persona> persona = new ArrayList<>();
    private static Actividad act = new Actividad();
    private static Hospital h = new Hospital();

    public static void main(String[] args) throws InterruptedException {
        VentanaIngreso vIng = new VentanaIngreso();
        vIng.setVisible(true);
//
//
//        while (x < 100 && y
//                < 100) {
//            vSim.moveCircle();
//            vSim.repaint();
//            Thread.sleep(10);
//            x++;
//            y++;
//        }
//
//        if (x == 100 && y
//                == 100) {
//            while (true) {
//                vSim.moveCircle2();
//                vSim.repaint();
//                Thread.sleep(10);
//                x--;
//                y--;
//            }
//        }
//        Comorbilidad co1 = new Comorbilidad(false, true, true, false, false);
//        Comorbilidad co2 = new Comorbilidad(true, false, true, false, false); //intentos
//        Comorbilidad co3 = new Comorbilidad(false, true, false, true, true); //intentos
//        TipoCuidado t1 = new TipoCuidado(true, true, true, true); //intentos
//        TipoCuidado t2 = new TipoCuidado(false, false, true, true);
//        TipoCuidado t3 = new TipoCuidado(true, true, false, false); //intentos
//        Actividad act = new Actividad();
//        Hospital h = new Hospital();
//
//        //------------NIÑOS--------------//
//        
//        for (int i = 0; i < 2; i++) {
//            ninos[i] = new Persona(Edad.NIÑOS, true, false, t2, co1, act, i, h);
//            ninos[i].actividad();
//        }
////
////        //------------------------------//
////        
//        for (int i = 2; i < 10; i++) {
//            ninos[i] = new Persona(Edad.NIÑOS, false, false, t1, co1, act, i, h);
//            ninos[i].actividad();
//        }
//
//        //------------ADULTOS-------------//
//        Persona[] adultos = new Persona[10];
//        for (int i = 0; i < 2; i++) {
//            adultos[i] = new Persona(Edad.ADULTOS, true, false, t1, co3, act, i + 10, h);
//            adultos[i].actividad();
//        }
////
////        //-------------------------------//
////        
//        for (int i = 2; i < 10; i++) {
//            adultos[i] = new Persona(Edad.ADULTOS, false, false, t3, co3, act, i + 10, h);
//            adultos[i].actividad();
//        }
//
//        //-----ADULTOS-------MAYORES------//
//        Persona[] adultosMayores = new Persona[10];
//        for (int i = 0; i < 2; i++) {
//            adultosMayores[i] = new Persona(Edad.ADULTOS_MAYORES, true, false, t3, co2, act, i + 20, h);
//            adultosMayores[i].actividad();
//        }
////
////        //-------------------------------//
////        
//        for (int i = 2; i < 10; i++) {
//            adultosMayores[i] = new Persona(Edad.ADULTOS_MAYORES, false, false, t2, co2, act, i + 20, h);
//            adultosMayores[i].actividad();
//        }
//
//        for (int i = 0; i < adultosMayores.length; i++) {
//            adultos[i].start();
//            adultosMayores[i].start();
//            ninos[i].start();
//        }
    }
    /**
     * Agrega Persona a la lista
     * @param personas 
     */
    public static void agregarPersona(Persona personas) {
        persona.add(personas);
    }
    
    /**
     * Elimina la Lista de personas
     */
    public static void resetearPersona(){
        persona.clear();
    }
    
    /**
     * devuelve la lista de personas
     * @return persona
     */
    public static List<Persona> getPersona() {
        return persona;
    }
    
    /**
     * Agrega niños a la lista de personas
     * @return ninos
     */
    public static List<Persona> getNinos() {
        List<Persona> ninos= new ArrayList<>();
        for (int i = 0; i < persona.size(); i++) {
            if (persona.get(i).getEdad().equals(Edad.NIÑOS)) {
                ninos.add(persona.get(i));
            }
        }
        return ninos;
    }
    
    /**
     * Agrega adultos a la lista de personas
     * @return adultos
     */
    public static List<Persona> getAdultos() {
            List<Persona> adultos= new ArrayList<>();
        for (int i = 0; i < persona.size(); i++) {
            if (persona.get(i).getEdad().equals(Edad.ADULTOS)) {
                adultos.add(persona.get(i));
            }
        }
        return adultos;
    }
    
    /**
     * Agrega adultos mayores a la lista de personas
     * @return mayores
     */
    public static List<Persona> getMayores() {
            List<Persona> mayores= new ArrayList<>();
        for (int i = 0; i < persona.size(); i++) {
            if (persona.get(i).getEdad().equals(Edad.ADULTOS_MAYORES)) {
                mayores.add(persona.get(i));
            }
        }
        return mayores;
    }
    
    public static Actividad getActividad() {
        return act;
    }

    public static Hospital getHospital() {
        return h;
    }

}
