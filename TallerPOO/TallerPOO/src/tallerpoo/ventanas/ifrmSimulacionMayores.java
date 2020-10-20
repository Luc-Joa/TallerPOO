/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpoo.ventanas;

import TallerPoo.Actividad;
import TallerPoo.Comorbilidad;
import TallerPoo.Edad;
import TallerPoo.Hospital;
import TallerPoo.Persona;
import TallerPoo.TallerPOO;
import TallerPoo.TipoCuidado;
import java.util.ArrayList;
import java.util.List;

public class ifrmSimulacionMayores extends javax.swing.JInternalFrame {

    List<Thread> hilo = new ArrayList();

    /**
     * Creates new form ifrmSimulacionMayores
     */
    public ifrmSimulacionMayores() {
        initComponents();
        FiguraPersona[] p = new FiguraPersona[TallerPOO.getMayores().size()];
        for (int i = 0; i < p.length; i++) {
            p[i] = new FiguraPersona(TallerPOO.getMayores().get(i), movimientoPersona3);
            movimientoPersona3.add(p[i]);
        }

        for (int i = 0; i < p.length; i++) {
            hilo.add(new Thread(new HiloPersona(p[i])));
        }
        for (int i = 0; i < hilo.size(); i++) {
            hilo.get(i).start();
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

        movimientoPersona3 = new tallerpoo.ventanas.MovimientoPersona();
        btnAgregarContagiadosAM = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Paseo");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/tallerpoo/imagenes/park.png"))); // NOI18N
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        btnAgregarContagiadosAM.setText("Agregar Contagiados");
        btnAgregarContagiadosAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarContagiadosAMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout movimientoPersona3Layout = new javax.swing.GroupLayout(movimientoPersona3);
        movimientoPersona3.setLayout(movimientoPersona3Layout);
        movimientoPersona3Layout.setHorizontalGroup(
            movimientoPersona3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, movimientoPersona3Layout.createSequentialGroup()
                .addGap(0, 255, Short.MAX_VALUE)
                .addComponent(btnAgregarContagiadosAM))
        );
        movimientoPersona3Layout.setVerticalGroup(
            movimientoPersona3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, movimientoPersona3Layout.createSequentialGroup()
                .addGap(0, 246, Short.MAX_VALUE)
                .addComponent(btnAgregarContagiadosAM))
        );

        getContentPane().add(movimientoPersona3);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarContagiadosAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarContagiadosAMActionPerformed
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
            p[i] = new FiguraPersona(pAdMayoyes[i], movimientoPersona3);
            movimientoPersona3.add(p[i]);
        }
        Thread[] a = new Thread[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Thread(new HiloPersona(p[i]));
        }
        for (int i = 0; i < a.length; i++) {
            a[i].start();
        }
    }//GEN-LAST:event_btnAgregarContagiadosAMActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarContagiadosAM;
    private tallerpoo.ventanas.MovimientoPersona movimientoPersona3;
    // End of variables declaration//GEN-END:variables
}
