/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TallerPoo;

public class Cuidado {

    private int duracion;
    private Persona paciente;

    /**
     * constructor por defecto
     */
    public Cuidado() {
        duracion = 0;
        paciente = null;
    }

    /**
     * constructor parametrizado
     *
     * @param duracion
     * @param paciente
     */
    public Cuidado(int duracion, Persona paciente) {
        this.duracion = duracion;
        this.paciente = paciente;
    }

    /*
    * return @duracion
     */
    public int getDuracion() {
        return duracion;
    }

    /*
    * set @duracion
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /*
    * return @paciente
     */
    public Persona getPaciente() {
        return paciente;
    }

    /*
    * set @paciente
     */
    public void setPaciente(Persona paciente) {
        this.paciente = paciente;
    }

    /**
     * devuelve true si una persona es curada
     *
     * @return boolean curado
     */
    public boolean curado() {
        int d = duracion;
        for (int i = 0; i < duracion; i++) {
            d--;
            if (d == 0) {
                return true;
            }
        }
        return false;
    }
}
