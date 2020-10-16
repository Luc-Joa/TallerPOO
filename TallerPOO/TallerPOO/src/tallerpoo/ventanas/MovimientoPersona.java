/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpoo.ventanas;

import TallerPoo.Persona;
import TallerPoo.TallerPOO;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACU
 */
public class MovimientoPersona extends javax.swing.JPanel {

    List<FiguraPersona> p = new ArrayList<>();


    /**
     * Crea el panel MovimientoPersona , los hilos y carga la figura de la
     * persona en el arreglo p
     */
    public MovimientoPersona() {
        initComponents();
    }

    public void add(FiguraPersona per) {
        p.add(per);
    }
/**
 * Dibuja las personas
 * @param g 
 */
    public void paintComponent(Graphics g) { // Dibujamos la Persona
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (int i = 0; i < p.size(); i++) {
            FiguraPersona b = p.get(i);
            b.paint(g2);
        }
        for (int i = 0; i < p.size(); i++) {
            for (int j = 0; j <  p.size(); j++) {
               if (collision(p.get(i), p.get(j))&& j!=i) {
                            p.get(i).actividad(p.get(j));
                        }
            }
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setPreferredSize(new java.awt.Dimension(600, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 355, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Pone en movimiento a la persona
     */
//    @Override
//    public void run() {
//        for (int i = 0; i < p.length; i++) {
//            p[i].setDir(((int) (Math.random() * 7)));
//
//        }
//
//        try {
//
//            while (true) {
//                for (int i = 0; i < p.length; i++) {
//                    for (int j = 0; j < p.length; j++) {
//                        if (collision(p[i], p[j])&& j!=i) {
//                            p[i].actividad(p[j]);
//                        }
//                    }
//
//                    p[i].rebotar();
//                    p[i].mover(p[i].getDir());
//                    repaint();
//                    try {
//                        sleep((int) (Math.random() * 10));
//                    } catch (InterruptedException ex) {
//
//                    }
//                }
//
//            }
//        } catch (Exception e) {
//        }
//    }
//
//    /**
//     * Agrega las figuras de las personas al panel
//     *
//     * @param g
//     */
//    @Override
//    public void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        g.setColor(Color.white);
//        g.fillRect(0, 0, getWidth(), getHeight());
//        for (int i = 0; i < p.length; i++) {
//            p[i].paint(g);
//        }
//    }
    private boolean collision(FiguraPersona a, FiguraPersona b) {
        return a.getBounds().intersects(b.getBounds());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
