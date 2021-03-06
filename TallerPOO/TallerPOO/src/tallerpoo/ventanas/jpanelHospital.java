/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpoo.ventanas;

import TallerPoo.TallerPOO;

public class jpanelHospital extends javax.swing.JPanel implements Runnable {

    /**
     * Creates new form jpanelHospital
     */
    public jpanelHospital() {
        initComponents();
        Thread hospital = new Thread(this);
        hospital.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlModerado = new javax.swing.JLabel();
        jlIntensivo = new javax.swing.JLabel();
        jlAislamiento = new javax.swing.JLabel();

        jlModerado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlModerado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tallerpoo/imagenes/bed.png"))); // NOI18N
        jlModerado.setText("Cuidados Moderados");
        jlModerado.setToolTipText("");
        jlModerado.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jlModerado.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/tallerpoo/imagenes/bed.png"))); // NOI18N
        jlModerado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlModerado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jlIntensivo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlIntensivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tallerpoo/imagenes/bed.png"))); // NOI18N
        jlIntensivo.setText("Cuidados Intensivos");
        jlIntensivo.setToolTipText("");
        jlIntensivo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jlIntensivo.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/tallerpoo/imagenes/bed.png"))); // NOI18N
        jlIntensivo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlIntensivo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jlAislamiento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlAislamiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlAislamiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tallerpoo/imagenes/bed.png"))); // NOI18N
        jlAislamiento.setText("Aislamiento");
        jlAislamiento.setToolTipText("");
        jlAislamiento.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/tallerpoo/imagenes/bed.png"))); // NOI18N
        jlAislamiento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlAislamiento.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlAislamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlIntensivo)
                    .addComponent(jlModerado))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlIntensivo)
                .addGap(43, 43, 43)
                .addComponent(jlModerado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jlAislamiento)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlAislamiento;
    private javax.swing.JLabel jlIntensivo;
    private javax.swing.JLabel jlModerado;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while (true) {
            jlAislamiento.setText("Aislamiento: " + TallerPOO.getHospital().mostrarPacientesAislamiento().size());
            jlIntensivo.setText("Cuidados Intensivos: " + TallerPOO.getHospital().mostrarPacientesCTI().size());
            jlModerado.setText("Cuidados Moderados: " + TallerPOO.getHospital().mostrarPacientesCM().size());
        }
    }
}
