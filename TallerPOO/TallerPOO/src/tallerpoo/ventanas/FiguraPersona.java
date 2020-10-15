/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpoo.ventanas;

import TallerPoo.Persona;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author ACU
 */
public class FiguraPersona extends Persona{
    int x, width;
    int y, height;
    int dir;
    private final int vel =1;
//Edad edad, Boolean contagio, Boolean sintoma, TipoCuidado cuidado, Comorbilidad comorbilidad, Actividad actividad, int id, Hospital h
    public FiguraPersona(int width, int height, Persona p) {
        super(p.getEdad(),p.getContagio(),p.getSintoma(),p.getCuidado(),p.getComorbilidad(),p.getActividad(),p.getID(),p.getHospital());
        this.width = width;
        this.height = height;
        this.x = (int) (width * Math.random());
        this.y = (int) (height * Math.random());
    }

    public int getDir() {
        return dir;
    }

    public void setDir(int dir) {
        this.dir = dir;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void mover(int dir) {
        switch (dir) {
            case 0:
                y += vel;
                break;
            case 1:
                y -= vel;
                break;
            case 2:
                x += vel;
                break;
            case 3:
                x -= vel;
                break;
            case 4:
                x += vel;
                y += vel;
                break;
            case 5:
                x -= vel;
                y -= vel;
                break;
            case 6:
                x += vel;
                y -= vel;
                break;
            case 7:
                x -= vel;
                y += vel;
                break;
            default:
                break;
        }
    }

    public void rebotar() {
        if (y <= 0) {
            int nr = (int) (Math.random() * 3) + 1;
            dir = nr == 1 ? 7 : nr == 2 ? 0 : 4;
        }
        if (x <= 0) {
            int nr = (int) (Math.random() * 3) + 1;
            dir = nr == 1 ? 2 : nr == 2 ? 6 : 4;
        }
        if (x <= 0 && y <= 0) {
            int nr = (int) (Math.random() * 3) + 1;
            dir = nr == 1 ? 0 : nr == 2 ? 2 : 4;
        }
        if (x >= width) {
            int nr = (int) (Math.random() * 3) + 1;
            dir = nr == 1 ? 5 : nr == 2 ? 7 : 3;
        }
        if (y >= height) {
            int nr = (int) (Math.random() * 3) + 1;
            dir = nr == 1 ? 6 : nr == 2 ? 1 : 5;
        }
    }

    public void paint(Graphics g) {
        g.setColor(this.getColor());
        g.fillOval((int) x, (int) y, 10, 10);
//        return g;
    }
}
