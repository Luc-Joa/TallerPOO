/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TallerPoo;

import java.util.ArrayList;
import java.util.List;
import tallerpoo.ventanas.VentanaIngreso;

public class TallerPOO {

    private static int cont = 0;
    private static List<Persona> persona = new ArrayList<>();
    private static Actividad act = new Actividad();
    private static Hospital h = new Hospital();

    public static void main(String[] args) throws InterruptedException {
        VentanaIngreso vIng = new VentanaIngreso();
        vIng.setVisible(true);
    }

    /**
     * Agrega Persona a la lista
     *
     * @param personas
     */
    public static void agregarPersona(Persona personas) {
        persona.add(personas);
        cont++;
    }

    /**
     * Elimina la Lista de personas
     */
    public static void resetearPersona() {
        persona.clear();
    }

    /**
     * devuelve la lista de personas
     *
     * @return persona
     */
    public static List<Persona> getPersona() {
        return persona;
    }

    /**
     * Agrega niños a la lista de personas
     *
     * @return ninos
     */
    public static List<Persona> getNinos() {
        List<Persona> ninos = new ArrayList<>();
        for (int i = 0; i < persona.size(); i++) {
            if (persona.get(i).getEdad().equals(Edad.NIÑOS)) {
                ninos.add(persona.get(i));
            }
        }
        return ninos;
    }

    /**
     * Agrega adultos a la lista de personas
     *
     * @return adultos
     */
    public static List<Persona> getAdultos() {
        List<Persona> adultos = new ArrayList<>();
        for (int i = 0; i < persona.size(); i++) {
            if (persona.get(i).getEdad().equals(Edad.ADULTOS)) {
                adultos.add(persona.get(i));
            }
        }
        return adultos;
    }

    /**
     * Agrega adultos mayores a la lista de personas
     *
     * @return mayores
     */
    public static List<Persona> getMayores() {
        List<Persona> mayores = new ArrayList<>();
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

    public static int getCont() {
        return cont;
    }

    public static void setCont(int cont) {
        TallerPOO.cont = cont;
    }

}
