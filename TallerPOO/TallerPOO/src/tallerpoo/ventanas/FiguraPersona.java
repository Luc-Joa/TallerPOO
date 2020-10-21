/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpoo.ventanas;

import TallerPoo.Edad;
import TallerPoo.Persona;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Rectangle;

public class FiguraPersona extends Persona {

    private Component canvas;
    int x, width;
    int y, height;
    int dir;
    private final int vel = 1;

    /**
     * Constructor Parametrizado
     *
     * @param p
     */
    public FiguraPersona(Persona p, Component canvas) {
        super(p.getEdad(), p.getContagio(), p.getSintoma(), p.getCuidado(), p.getComorbilidad(), p.getActividad(), p.getID(), p.getHospital());
        this.canvas = canvas;
        this.x = 950;
//        this.x = (int) (300 * Math.random());
        this.y = 10;
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

    public Component getCanvas() {
        return canvas;
    }

    public void setCanvas(Component canvas) {
        this.canvas = canvas;
    }

    /**
     * La persona se mueve en la dirección indicada por el parametro dir
     *
     * @param dir
     */
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
        canvas.repaint();
    }

    public void caminoEscuela() {
        
        if (this.getEdad() == Edad.NIÑOS) {
            dir = 0;
            if (y == (canvas.getHeight() / 2)) {
                dir = 3;
            }
        }
    }

    /**
     * Si la persona llega al límite del area donde se puede mover cambia de
     * direccion
     */
    public void rebotar() {
        if (y <= (canvas.getHeight()/2)-100) {
            int nr = (int) (Math.random() * 3) + 1;
            dir = nr == 1 ? 7 : nr == 2 ? 0 : 4;
        }
        if (x <= 400) {
            int nr = (int) (Math.random() * 3) + 1;
            dir = nr == 1 ? 2 : nr == 2 ? 6 : 4;
        }
        if (x <= 400 && y <= (canvas.getHeight()/2)-100) {
            int nr = (int) (Math.random() * 3) + 1;
            dir = nr == 1 ? 0 : nr == 2 ? 2 : 4;
        }
        if (x >= 600) {
            int nr = (int) (Math.random() * 3) + 1;
            dir = nr == 1 ? 5 : nr == 2 ? 7 : 3;
        }
        if (y >= (canvas.getHeight()/2)+100) {
            int nr = (int) (Math.random() * 3) + 1;
            dir = nr == 1 ? 6 : nr == 2 ? 1 : 5;
        }
        canvas.repaint();
    }

    /**
     * Crea la figura de la persona
     *
     * @param g
     */
    public void paint(Graphics g) {
        g.setColor(this.getColor());
        g.fillOval((int) x, (int) y, 10, 10);
    }

    /**
     * Obtiene las dimensiones del rectángulo, (la ventana de simulación), para
     * devolver así los límites de la misma
     *
     * @return Rectangle
     */
    public Rectangle getBounds() {
        return new Rectangle(x, y, 10, 10);
    }
    
    public boolean llego(){
        if (x==500) {
            return false;
        }
        return true;
    }
}
