/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpoo.ventanas;

import TallerPoo.TallerPOO;
import java.awt.Color;
import java.awt.Graphics;
import static java.lang.Thread.sleep;

/**
 *
 * @author ACU
 */
public class MovimientoPersona extends javax.swing.JPanel implements Runnable {

    FiguraPersona p[];
    Thread[] animacion;

    /**
     * Crea el panel MovimientoPersona , los hilos y carga la figura de la
     * persona en el arreglo p
     */
    public MovimientoPersona() {
        initComponents();
        animacion = new Thread[TallerPOO.getNinos().size()];
        for (int i = 0; i < animacion.length; i++) {
            animacion[i] = new Thread(this);
        }
        p = new FiguraPersona[TallerPOO.getNinos().size()];
        for (int i = 0; i < p.length; i++) {
            p[i] = new FiguraPersona(600, 400, TallerPOO.getNinos().get(i));
        }

        for (int i = 0; i < animacion.length; i++) {
            animacion[i].start();
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
            .addGap(0, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Pone en movimiento a la persona
     */
    @Override
    public void run() {
        for (int i = 0; i < p.length; i++) {
            p[i].setDir(((int) (Math.random() * 7)));

        }

        try {

            while (true) {
                for (int i = 0; i < p.length; i++) {
                    p[i].rebotar();
                    p[i].mover(p[i].getDir());
                    repaint();
                    try {
                        sleep((int) (Math.random() * 10));
                    } catch (InterruptedException ex) {

                    }
                }

            }
        } catch (Exception e) {
        }
    }

    /**
     * Agrega las figuras de las personas al panel
     *
     * @param g
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.white);
        g.fillRect(0, 0, getWidth(), getHeight());
        for (int i = 0; i < p.length; i++) {
            p[i].paint(g);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
