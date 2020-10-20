/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpoo.ventanas;

import TallerPoo.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACU
 */
public class PanelSimulacion extends javax.swing.JInternalFrame {

    List<Thread> hiloAdulto = new ArrayList();
    List<Thread> hiloNino = new ArrayList();
    List<Thread> hiloMayor = new ArrayList();

    /**
     * Creates new form PanelSimulacion
     */
    public PanelSimulacion() {
        initComponents();
        panelAdultos();
        panelMayores();
        panelNinos();
    }

    public void panelAdultos() {
        FiguraPersona[] p = new FiguraPersona[TallerPOO.getAdultos().size()];
        for (int i = 0; i < p.length; i++) {
            p[i] = new FiguraPersona(TallerPOO.getAdultos().get(i), jpanelAdultos);
            jpanelAdultos.add(p[i]);
        }

        for (int i = 0; i < p.length; i++) {
            hiloAdulto.add(new Thread(new HiloPersona(p[i])));
        }
        for (int i = 0; i < hiloAdulto.size(); i++) {
            hiloAdulto.get(i).start();
        }
    }

    public void panelMayores() {
        FiguraPersona[] p = new FiguraPersona[TallerPOO.getMayores().size()];
        for (int i = 0; i < p.length; i++) {
            p[i] = new FiguraPersona(TallerPOO.getMayores().get(i), jpanelMayores);
            jpanelMayores.add(p[i]);
        }

        for (int i = 0; i < p.length; i++) {
            hiloMayor.add(new Thread(new HiloPersona(p[i])));
        }
        for (int i = 0; i < hiloMayor.size(); i++) {
            hiloMayor.get(i).start();
        }
    }

    public void panelNinos() {
        FiguraPersona[] p = new FiguraPersona[TallerPOO.getNinos().size()];
        for (int i = 0; i < p.length; i++) {
            p[i] = new FiguraPersona(TallerPOO.getNinos().get(i), jpanelNinos);
            jpanelNinos.add(p[i]);
        }

        for (int i = 0; i < p.length; i++) {
            hiloNino.add(new Thread(new HiloPersona(p[i])));
        }
        for (int i = 0; i < hiloNino.size(); i++) {
            hiloNino.get(i).start();
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

        jpanelAdultos = new tallerpoo.ventanas.MovimientoPersona();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jpanelMayores = new tallerpoo.ventanas.MovimientoPersona();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jpanelNinos = new tallerpoo.ventanas.MovimientoPersona();
        jButton10 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jpanelHospital1 = new tallerpoo.ventanas.jpanelHospital();

        jButton7.setText("Agregar Contagiados");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tallerpoo/imagenes/bank.png"))); // NOI18N
        jLabel1.setText("Trabajo");

        javax.swing.GroupLayout jpanelAdultosLayout = new javax.swing.GroupLayout(jpanelAdultos);
        jpanelAdultos.setLayout(jpanelAdultosLayout);
        jpanelAdultosLayout.setHorizontalGroup(
            jpanelAdultosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelAdultosLayout.createSequentialGroup()
                .addGap(0, 155, Short.MAX_VALUE)
                .addComponent(jButton7))
            .addGroup(jpanelAdultosLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanelAdultosLayout.setVerticalGroup(
            jpanelAdultosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelAdultosLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                .addComponent(jButton7))
        );

        jButton6.setText("Agregar Contagiados");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tallerpoo/imagenes/park.png"))); // NOI18N
        jLabel3.setText("Paseo");

        javax.swing.GroupLayout jpanelMayoresLayout = new javax.swing.GroupLayout(jpanelMayores);
        jpanelMayores.setLayout(jpanelMayoresLayout);
        jpanelMayoresLayout.setHorizontalGroup(
            jpanelMayoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelMayoresLayout.createSequentialGroup()
                .addGap(0, 155, Short.MAX_VALUE)
                .addComponent(jButton6))
            .addGroup(jpanelMayoresLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanelMayoresLayout.setVerticalGroup(
            jpanelMayoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelMayoresLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6))
        );

        jButton10.setText("Agregar Contagiados");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tallerpoo/imagenes/school.png"))); // NOI18N
        jLabel2.setText("Escuela");

        javax.swing.GroupLayout jpanelNinosLayout = new javax.swing.GroupLayout(jpanelNinos);
        jpanelNinos.setLayout(jpanelNinosLayout);
        jpanelNinosLayout.setHorizontalGroup(
            jpanelNinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelNinosLayout.createSequentialGroup()
                .addGap(0, 155, Short.MAX_VALUE)
                .addComponent(jButton10))
            .addGroup(jpanelNinosLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanelNinosLayout.setVerticalGroup(
            jpanelNinosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelNinosLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addComponent(jButton10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpanelMayores, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpanelHospital1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpanelAdultos, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpanelNinos, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpanelAdultos, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpanelNinos, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpanelMayores, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(jpanelHospital1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Persona[] pAdMayoyes = new Persona[3];
        FiguraPersona[] p = new FiguraPersona[3];
        Comorbilidad co1 = new Comorbilidad(false, true, true, false, false);
        Comorbilidad co2 = new Comorbilidad(true, false, true, false, false);
        Comorbilidad co3 = new Comorbilidad(false, true, false, true, true);
        TipoCuidado t1 = new TipoCuidado(true, true, true, true);
        TipoCuidado t2 = new TipoCuidado(false, false, true, true);
        TipoCuidado t3 = new TipoCuidado(true, true, false, false);
        Actividad act = new Actividad();
        Hospital h = new Hospital();
        pAdMayoyes[0] = new Persona(Edad.ADULTOS_MAYORES, true, false, t2, co1, act, 327, h);
        pAdMayoyes[1] = new Persona(Edad.ADULTOS_MAYORES, true, false, t1, co1, act, 328, h);
        pAdMayoyes[2] = new Persona(Edad.ADULTOS_MAYORES, true, false, t3, co1, act, 329, h);
        for (int i = 0; i < p.length; i++) {
            p[i] = new FiguraPersona(pAdMayoyes[i], jpanelMayores);
            jpanelMayores.add(p[i]);
        }
        Thread[] a = new Thread[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Thread(new HiloPersona(p[i]));
        }
        for (int i = 0; i < a.length; i++) {
            a[i].start();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        Persona[] pAdultos = new Persona[3];
        FiguraPersona[] p = new FiguraPersona[3];
        Comorbilidad co1 = new Comorbilidad(false, true, true, false, false);
        Comorbilidad co2 = new Comorbilidad(true, false, true, false, false);
        Comorbilidad co3 = new Comorbilidad(false, true, false, true, true);
        TipoCuidado t1 = new TipoCuidado(true, true, true, true);
        TipoCuidado t2 = new TipoCuidado(false, false, true, true);
        TipoCuidado t3 = new TipoCuidado(true, true, false, false);
        Actividad act = new Actividad();
        Hospital h = new Hospital();
        pAdultos[0] = new Persona(Edad.NIÑOS, true, false, t2, co1, act, 321, h);
        pAdultos[1] = new Persona(Edad.NIÑOS, true, false, t1, co1, act, 322, h);
        pAdultos[2] = new Persona(Edad.NIÑOS, true, false, t3, co1, act, 323, h);
        for (int i = 0; i < p.length; i++) {
            p[i] = new FiguraPersona(pAdultos[i], jpanelNinos);
            jpanelNinos.add(p[i]);
        }
        Thread[] a = new Thread[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Thread(new HiloPersona(p[i]));
        }
        for (int i = 0; i < a.length; i++) {
            a[i].start();
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Persona[] pAdultos = new Persona[3];
        FiguraPersona[] p = new FiguraPersona[3];
        Comorbilidad co1 = new Comorbilidad(false, true, true, false, false);
        Comorbilidad co2 = new Comorbilidad(true, false, true, false, false);
        Comorbilidad co3 = new Comorbilidad(false, true, false, true, true);
        TipoCuidado t1 = new TipoCuidado(true, true, true, true);
        TipoCuidado t2 = new TipoCuidado(false, false, true, true);
        TipoCuidado t3 = new TipoCuidado(true, true, false, false);
        Actividad act = new Actividad();
        Hospital h = new Hospital();
        pAdultos[0] = new Persona(Edad.ADULTOS, true, false, t2, co1, act, 321, h);
        pAdultos[1] = new Persona(Edad.ADULTOS, true, false, t1, co1, act, 322, h);
        pAdultos[2] = new Persona(Edad.ADULTOS, true, false, t3, co1, act, 323, h);
        for (int i = 0; i < p.length; i++) {
            p[i] = new FiguraPersona(pAdultos[i], jpanelAdultos);
            jpanelAdultos.add(p[i]);
        }
        Thread[] a = new Thread[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Thread(new HiloPersona(p[i]));
        }
        for (int i = 0; i < a.length; i++) {
            a[i].start();
        }
    }//GEN-LAST:event_jButton7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private tallerpoo.ventanas.MovimientoPersona jpanelAdultos;
    private tallerpoo.ventanas.jpanelHospital jpanelHospital1;
    private tallerpoo.ventanas.MovimientoPersona jpanelMayores;
    private tallerpoo.ventanas.MovimientoPersona jpanelNinos;
    // End of variables declaration//GEN-END:variables
}
