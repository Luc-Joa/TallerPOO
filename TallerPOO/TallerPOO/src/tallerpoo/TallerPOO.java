/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TallerPoo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ACU
 */
public class TallerPOO extends JPanel {

    int x = 0;
    int y = 0;

    private void moveCircle() {
        x = x + 1;
        y = y + 1;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.YELLOW);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillOval(x, y, 30, 30);

        Toolkit t = Toolkit.getDefaultToolkit();
        Image school = t.getImage("school.png");
        g.drawImage(school, 300, 100, this);

        Image work = t.getImage("bank.png");
        g.drawImage(work, 100, 300, this);

        Image park = t.getImage("park.png");
        g.drawImage(park, 100, 100, this);

        Image hospital = t.getImage("hospital.png");
        g.drawImage(hospital, 300, 300, this);
    }

    private void moveCircle2() {
        x = x - 1;
        y = y - 1;
    }

    public static void main(String[] args) throws InterruptedException {

        int x = 0;
        int y = 0;

        TallerPOO tPoo = new TallerPOO();

        JFrame frame = new JFrame("Borrador");
        frame.add(tPoo);
        frame.setSize(720, 480);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while (x < 100 && y < 100) {
            tPoo.moveCircle();
            tPoo.repaint();
            Thread.sleep(10);
            x++;
            y++;
        }

        if (x == 100 && y == 100) {
            while (true) {
                tPoo.moveCircle2();
                tPoo.repaint();
                Thread.sleep(10);
                x--;
                y--;
            }
        }

//        Comorbilidad co1 = new Comorbilidad(false, true, true, false, false);
//        Comorbilidad co2 = new Comorbilidad(true, false, true, false, false); //intentos
//        Comorbilidad co3 = new Comorbilidad(false, true, false, true, true); //intentos
//        TipoCuidado t1 = new TipoCuidado(true, true, true, true); //intentos
//        TipoCuidado t2 = new TipoCuidado(false, false, true, true);
//        TipoCuidado t3 = new TipoCuidado(true, true, false, false); //intentos
//        Actividad act = new Actividad();
//
        //------------NIÑOS--------------//
//        Persona[] persona = new Persona[30];
//        for (int i = 0; i < 2; i++) {
//            persona[i] = new Persona(Edad.NIÑOS, true, false, t2, co1, act, i);
//            persona[i].start();
//        }
////
////        //------------------------------//
////        
//        for (int i = 2; i < 10; i++) {
//            persona[i] = new Persona(Edad.NIÑOS, false, false, t1, co1, act, i);
//            persona[i].start();
//        }
//
//        //------------ADULTOS-------------//
//       
//        for (int i = 10; i < 12; i++) {
//            persona[i] = new Persona(Edad.ADULTOS, true, false, t1, co3, act, i);
//            persona[i].start();
//        }
//
//        //-------------------------------//
//        
//        for (int i = 12; i < 20; i++) {
//            persona[i] = new Persona(Edad.ADULTOS, false, true, t3, co3, act, i);
//            persona[i].start();
//        }
//
//        //-----ADULTOS-------MAYORES------//
//        for (int i = 20; i < 23; i++) {
//            persona[i] = new Persona(Edad.ADULTOS_MAYORES, true, false, t3, co2, act, i);
//            persona[i].start();
//        }
////
////        //-------------------------------//
////        
//        for (int i = 20; i < 30; i++) {
//            persona[i] = new Persona(Edad.ADULTOS_MAYORES, false, false, t2, co2, act, i);
//            persona[i].start();
//        }
    }

}
