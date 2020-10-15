/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TallerPoo;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Objects;

/**
 *
 * @author Joaquin
 */
public class Persona  {

    private Edad edad;
    private Boolean contagio, sintoma;
    private Color color;
    private TipoCuidado cuidado;
    private Comorbilidad comorbilidad;
    private Hospital hospital;
    private Actividad actividad;
    private int id;

    public Persona(Edad edad, Boolean contagio, Boolean sintoma, TipoCuidado cuidado, Comorbilidad comorbilidad, Actividad actividad, int id, Hospital h) {
        this.edad = edad;
        this.contagio = contagio;
        this.sintoma = sintoma;
        this.color = cuidado.tipoCuidado();
        this.cuidado = cuidado;
        this.comorbilidad = comorbilidad;
        this.actividad = actividad;
        this.id = id;
        this.hospital = h;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }

    //para comenzar con los threads/hilos
    //constructor por defecto
    public Persona() {
        edad = null;
        contagio = false;
        sintoma = null;
        color = null;
        cuidado = null;
        comorbilidad = null;
        actividad = null;
    }
    //-------
//    int x;
//    int width;
//    int y, height;
//    int dir;
//    private final int vel = 1;
//
//    public void setDir(int dir) {
//        this.dir = dir;
//    }
//
//    public int getDir() {
//        return dir;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }
//
//    public void setX(int x) {
//        this.x = x;
//
//    }
//
//    public void setY(int y) {
//        this.y = y;
//    }
//
//    public void mover(int dir) {
//        switch (dir) {
//            case 0:
//                this.y += this.vel;
//                break;
//            case 1:
//                this.y -= this.vel;
//                break;
//            case 2:
//                this.x += this.vel;
//                break;
//            case 3:
//               this.x -= this.vel;
//                break;
//            case 4:
//                this.x += this.vel;
//                this.y += this.vel;
//                break;
//            case 5:
//                this.x -= this.vel;
//                this.y -= this.vel;
//                break;
//            case 6:
//                this.x += this.vel;
//                this.y -= this.vel;
//                break;
//            case 7:
//                this.x -= this.vel;
//                this.y += this.vel;
//                break;
//            default:
//                break;
//        }
//    }
//
//    public void rebotar() {
//        if (y <= 0) {
//            int nr = (int) (Math.random() * 3) + 1;
//            dir = nr == 1 ? 7 : nr == 2 ? 0 : 4;
//        }
//        if (x <= 0) {
//            int nr = (int) (Math.random() * 3) + 1;
//            dir = nr == 1 ? 2 : nr == 2 ? 6 : 4;
//        }
//        if (x <= 0 && y <= 0) {
//            int nr = (int) (Math.random() * 3) + 1;
//            dir = nr == 1 ? 0 : nr == 2 ? 2 : 4;
//        }
//        if (x >= width) {
//            int nr = (int) (Math.random() * 3) + 1;
//            dir = nr == 1 ? 5 : nr == 2 ? 7 : 3;
//        }
//        if (y >= height) {
//            int nr = (int) (Math.random() * 3) + 1;
//            dir = nr == 1 ? 6 : nr == 2 ? 1 : 5;
//        }
//    }
//
//    public void paint(Graphics g) {
//        g.setColor(this.getColor());
//        g.fillOval(x, y, 10, 10);
////        return g;
//    }

    //-------
    public void setId(int id) {
        this.id = id;
    }

    /*
    * return @comorbilidad
     */
    public Comorbilidad getComorbilidad() {
        return comorbilidad;
    }

    /*
    * set @comorbilidad
     */
    public void setComorbilidad(Comorbilidad comorbilidad) {
        this.comorbilidad = comorbilidad;
    }

    /*
    * return @edad
     */
    public Edad getEdad() {
        return edad;
    }

    /*
    * set @edad
     */
    public void setEdad(Edad edad) {
        this.edad = edad;
    }

    /*
    * return @contagio
     */
    public Boolean getContagio() {
        return contagio;
    }

    /*
    * set @contagio
     */
    public void setContagio(Boolean contagio) {
        this.contagio = contagio;
    }

    /*
    * return @sintoma
     */
    public Boolean getSintoma() {
        return sintoma;
    }

    /*
    * set @sintoma
     */
    public void setSintoma(Boolean sintoma) {
        this.sintoma = sintoma;
    }

    /*
    * return @color
     */
    public Color getColor() {
        return color;
    }

    /*
    * set @color
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /*
    * return @cuidado
     */
    public TipoCuidado getCuidado() {
        return cuidado;
    }

    /*
    * set @cuidado
     */
    public void setCuidado(TipoCuidado cuidado) {
        this.cuidado = cuidado;
    }

    /**
     * agrega una persona a la actividad según su edad
     */
    public void actividad() {
        actividad.agregarPersona(this);
    }

    /**
     * realiza una actividad según su edad
     */
    public void realizar() {
        actividad.realizarActividad(this);
    }

    /**
     * muestra el cuidado de cada persona
     *
     * @return cuidado
     */
    public TipoCuidado mostrarCuidado() {
        return cuidado;
    }

    /**
     * devuelve si una persona está contagiada o no, si está contagiada la
     * agrega a la lista de persona correspondiente
     */
    public void consulta() {
        this.hospital.consulta(this);
    }

    public int getID() {
        return id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.contagio, other.contagio)) {
            return false;
        }
        if (!Objects.equals(this.sintoma, other.sintoma)) {
            return false;
        }
        if (this.color != other.color) {
            return false;
        }
        if (!Objects.equals(this.cuidado, other.cuidado)) {
            return false;
        }
        if (!Objects.equals(this.comorbilidad, other.comorbilidad)) {
            return false;
        }
        if (!Objects.equals(this.hospital, other.hospital)) {
            return false;
        }
        return Objects.equals(this.actividad, other.actividad);
    }

    //Mientras no tengan sintomas van a realizar la actividad
//    @Override
//    public void run() {
//        while (!this.getSintoma()) {
//            realizar();
//
//            if (this.getSintoma() && hospital.consulta(this)) {
//                System.out.println(this.id + ". En cuarentena");
//                actividad.quitarPersona(this);
//                hospital.agregarContagiado(this);
//            }
//        }
//        try {
//            sleep((int) (Math.random() * 100));
//        } catch (InterruptedException ex) {
//            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }
}
