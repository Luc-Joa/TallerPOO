/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpoo.ventanas;

import TallerPoo.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ACU
 */
public class frmVentanaIngreso extends javax.swing.JFrame {

    DefaultListModel modelo = new DefaultListModel();
    DefaultListModel modelon = new DefaultListModel();
    DefaultListModel modelom = new DefaultListModel();
    TipoCuidado cuidadonino = new TipoCuidado(false, false, false, false);
    TipoCuidado cuidadoAdulto = new TipoCuidado(false, false, false, false);
    TipoCuidado cuidadoAdultoM = new TipoCuidado(false, false, false, false);
    Comorbilidad comorbilidadNino = new Comorbilidad(false, false, false, false, false);
    Comorbilidad comorbilidadAdulto = new Comorbilidad(false, false, false, false, false);
    Comorbilidad comorbilidadAdultoM = new Comorbilidad(false, false, false, false, false);
    Persona pNinio = new Persona();
    Persona pAdulto = new Persona();
    Persona pAdultoM = new Persona();

    /**
     * Creates new form frmVentanaIngreso
     */
    public frmVentanaIngreso() {
        initComponents();
    }

//-------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Ltipocuidado = new javax.swing.JLabel();
        CuidadoNino = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lComorbilidadAdultosM = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        CantidadNino = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        Agregar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        CuidadoAdultos = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lComorbilidadNino = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        CantidadAdulto = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        CuidadoAdultosM = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lComorbilidadAdulto = new javax.swing.JList<>();
        jLabel13 = new javax.swing.JLabel();
        CantidadAdultosMay = new javax.swing.JSpinner();
        cbxComorbilidadAdulto = new javax.swing.JComboBox<>();
        agregarComorbilidadAdulto = new javax.swing.JButton();
        eliminarComorbilidadAdulto = new javax.swing.JButton();
        cbxComorbilidadNino = new javax.swing.JComboBox<>();
        btnagregarComorbilidadNino = new javax.swing.JButton();
        btneliminarComorbilidadNino = new javax.swing.JButton();
        cbxComorbilidadAdultoM = new javax.swing.JComboBox<>();
        agregarComorbilidadAdultoM = new javax.swing.JButton();
        eliminarComorbilidadAdultoM = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agregar Personas");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(868, 720));
        setSize(new java.awt.Dimension(0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Niños");

        Ltipocuidado.setText("Tipo de Cuidado :");

        CuidadoNino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bajo", "Medio", "Alto" }));
        CuidadoNino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuidadoNinoActionPerformed(evt);
            }
        });

        jLabel3.setText("Comorbolidad :");

        lComorbilidadAdultosM.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                lComorbilidadAdultosMComponentAdded(evt);
            }
        });
        jScrollPane1.setViewportView(lComorbilidadAdultosM);

        jLabel4.setText("Cantidad :");

        CantidadNino.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        CantidadNino.setToolTipText("");
        CantidadNino.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CantidadNinoStateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Agregar Personas");

        Agregar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Adultos");

        CuidadoAdultos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bajo", "Medio", "Alto" }));
        CuidadoAdultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuidadoAdultosActionPerformed(evt);
            }
        });

        jLabel7.setText("Tipo de Cuidado :");

        jLabel8.setText("Comorbolidad :");

        lComorbilidadNino.setVisibleRowCount(5);
        lComorbilidadNino.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                lComorbilidadNinoComponentAdded(evt);
            }
        });
        jScrollPane2.setViewportView(lComorbilidadNino);
        lComorbilidadNino.getAccessibleContext().setAccessibleName("");

        jLabel9.setText("Cantidad :");

        CantidadAdulto.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        CantidadAdulto.setToolTipText("");
        CantidadAdulto.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CantidadAdultoStateChanged(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Adultos Mayores");

        jLabel11.setText("Tipo de Cuidado :");

        CuidadoAdultosM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bajo", "Medio", "Alto" }));
        CuidadoAdultosM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuidadoAdultosMActionPerformed(evt);
            }
        });

        jLabel12.setText("Comorbolidad :");

        lComorbilidadAdulto.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                lComorbilidadAdultoComponentAdded(evt);
            }
        });
        jScrollPane3.setViewportView(lComorbilidadAdulto);

        jLabel13.setText("Cantidad :");

        CantidadAdultosMay.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        cbxComorbilidadAdulto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diabetes", "Hipertensión Arterial", "Obesidad", "Enfermedades Cardiológicas", "Enfermedades Pulmonares" }));
        cbxComorbilidadAdulto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxComorbilidadAdultoActionPerformed(evt);
            }
        });

        agregarComorbilidadAdulto.setText("Agregar");
        agregarComorbilidadAdulto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarComorbilidadAdultoActionPerformed(evt);
            }
        });

        eliminarComorbilidadAdulto.setText("Eliminar");
        eliminarComorbilidadAdulto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarComorbilidadAdultoActionPerformed(evt);
            }
        });

        cbxComorbilidadNino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diabetes", "Hipertensión Arterial", "Obesidad", "Enfermedades Cardiológicas", "Enfermedades Pulmonares" }));
        cbxComorbilidadNino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxComorbilidadNinoActionPerformed(evt);
            }
        });

        btnagregarComorbilidadNino.setText("Agregar");
        btnagregarComorbilidadNino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarComorbilidadNinoActionPerformed(evt);
            }
        });

        btneliminarComorbilidadNino.setText("Eliminar");
        btneliminarComorbilidadNino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarComorbilidadNinoActionPerformed(evt);
            }
        });

        cbxComorbilidadAdultoM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diabetes", "Hipertensión Arterial", "Obesidad", "Enfermedades Cardiológicas", "Enfermedades Pulmonares" }));
        cbxComorbilidadAdultoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxComorbilidadAdultoMActionPerformed(evt);
            }
        });

        agregarComorbilidadAdultoM.setText("Agregar");
        agregarComorbilidadAdultoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarComorbilidadAdultoMActionPerformed(evt);
            }
        });

        eliminarComorbilidadAdultoM.setText("Eliminar");
        eliminarComorbilidadAdultoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarComorbilidadAdultoMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Agregar)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CuidadoAdultos, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbxComorbilidadAdulto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(eliminarComorbilidadAdulto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(agregarComorbilidadAdulto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Ltipocuidado)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CuidadoNino, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(cbxComorbilidadNino, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CuidadoAdultosM, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxComorbilidadAdultoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(eliminarComorbilidadAdultoM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(agregarComorbilidadAdultoM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnagregarComorbilidadNino, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btneliminarComorbilidadNino, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CantidadAdultosMay, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CantidadAdulto, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CantidadNino, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel5)
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ltipocuidado)
                            .addComponent(CuidadoNino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(cbxComorbilidadNino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnagregarComorbilidadNino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btneliminarComorbilidadNino))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CantidadNino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(CuidadoAdultos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(11, 11, 11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cbxComorbilidadAdulto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(agregarComorbilidadAdulto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminarComorbilidadAdulto))
                    .addComponent(jLabel9)
                    .addComponent(CantidadAdulto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(CuidadoAdultosM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(CantidadAdultosMay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbxComorbilidadAdultoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(agregarComorbilidadAdultoM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminarComorbilidadAdultoM)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Agregar)
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CuidadoNinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuidadoNinoActionPerformed
        if (CuidadoNino.getSelectedItem() == "Bajo") {
            cuidadonino = new TipoCuidado(false, false, false, false);
        }
        if (CuidadoNino.getSelectedItem() == "Medio") {
            cuidadonino = new TipoCuidado(true, false, false, false);
        }
        if (CuidadoNino.getSelectedItem() == "Alto") {
            cuidadonino = new TipoCuidado(true, true, true, true);
        }
    }//GEN-LAST:event_CuidadoNinoActionPerformed

    private void lComorbilidadAdultosMComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_lComorbilidadAdultosMComponentAdded

    }//GEN-LAST:event_lComorbilidadAdultosMComponentAdded

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        int total=Integer.parseInt(this.CantidadNino.getValue().toString())+Integer.parseInt(this.CantidadAdulto.getValue().toString())+Integer.parseInt(this.CantidadAdulto.getValue().toString());
        if ((TallerPOO.getPersona().size()+total) <= 100) {
            comorbilidadNino.setDiabetes(modelon.contains("Diabetes"));
            comorbilidadNino.setHipertencionArterial(modelon.contains("Hipertensión Arterial"));
            comorbilidadNino.setEnfCard(modelon.contains("Enfermedades Cardiológicas"));
            comorbilidadNino.setEnfPul(modelon.contains("Enfermedades Pulmonares"));

            pNinio = new Persona(Edad.NIÑOS, false, false, cuidadonino, comorbilidadNino, TallerPOO.getActividad(), 0, TallerPOO.getHospital());
            for (int i = 0; i < Integer.parseInt(this.CantidadNino.getValue().toString()); i++) {
                TallerPOO.agregarPersona(pNinio);
            }
//-------------------Adulto-------------
            comorbilidadAdulto.setDiabetes(modelo.contains("Diabetes"));
            comorbilidadAdulto.setHipertencionArterial(modelo.contains("Hipertensión Arterial"));
            comorbilidadAdulto.setEnfCard(modelo.contains("Enfermedades Cardiológicas"));
            comorbilidadAdulto.setEnfPul(modelo.contains("Enfermedades Pulmonares"));

            pAdulto = new Persona(Edad.ADULTOS, false, false, cuidadoAdulto, comorbilidadAdulto, TallerPOO.getActividad(), 0, TallerPOO.getHospital());
            for (int i = 0; i < Integer.parseInt(this.CantidadAdulto.getValue().toString()); i++) {
                TallerPOO.agregarPersona(pAdulto);
            }
//---------------------------AdultoMayor----------
            comorbilidadAdultoM.setDiabetes(modelo.contains("Diabetes"));
            comorbilidadAdultoM.setHipertencionArterial(modelo.contains("Hipertensión Arterial"));
            comorbilidadAdultoM.setEnfCard(modelo.contains("Enfermedades Cardiológicas"));
            comorbilidadAdultoM.setEnfPul(modelo.contains("Enfermedades Pulmonares"));

            pAdultoM = new Persona(Edad.ADULTOS_MAYORES, false, false, cuidadoAdulto, comorbilidadAdultoM, TallerPOO.getActividad(), 0, TallerPOO.getHospital());
            for (int i = 0; i < Integer.parseInt(this.CantidadAdultosMay.getValue().toString()); i++) {
                TallerPOO.agregarPersona(pAdultoM);
            }
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "El limite de personas es 100");   
        }
    }//GEN-LAST:event_AgregarActionPerformed

    private void CuidadoAdultosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuidadoAdultosActionPerformed
        if (CuidadoAdultos.getSelectedItem() == "Bajo") {
            cuidadoAdulto = new TipoCuidado(false, false, false, false);
        }
        if (CuidadoAdultos.getSelectedItem() == "Medio") {
            cuidadoAdulto = new TipoCuidado(true, false, false, false);
        }
        if (CuidadoAdultos.getSelectedItem() == "Alto") {
            cuidadoAdulto = new TipoCuidado(true, true, true, true);
        }
    }//GEN-LAST:event_CuidadoAdultosActionPerformed

    private void lComorbilidadNinoComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_lComorbilidadNinoComponentAdded

    }//GEN-LAST:event_lComorbilidadNinoComponentAdded

    private void CuidadoAdultosMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuidadoAdultosMActionPerformed
        if (CuidadoAdultosM.getSelectedItem() == "Bajo") {
            cuidadoAdulto = new TipoCuidado(false, false, false, false);
        }
        if (CuidadoAdultosM.getSelectedItem() == "Medio") {
            cuidadoAdultoM = new TipoCuidado(true, false, false, false);
        }
        if (CuidadoAdultosM.getSelectedItem() == "Alto") {
            cuidadoAdultoM = new TipoCuidado(true, true, true, true);
        }
    }//GEN-LAST:event_CuidadoAdultosMActionPerformed

    private void lComorbilidadAdultoComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_lComorbilidadAdultoComponentAdded

    }//GEN-LAST:event_lComorbilidadAdultoComponentAdded

    private void CantidadNinoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CantidadNinoStateChanged
        this.CantidadAdulto.setModel(new javax.swing.SpinnerNumberModel(0, 0, (100 - Integer.parseInt(this.CantidadNino.getValue().toString())), 1));
    }//GEN-LAST:event_CantidadNinoStateChanged

    private void CantidadAdultoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CantidadAdultoStateChanged
        this.CantidadAdultosMay.setModel(new javax.swing.SpinnerNumberModel(0, 0, (100 - Integer.parseInt(this.CantidadAdulto.getValue().toString()) - Integer.parseInt(this.CantidadNino.getValue().toString())), 1));
    }//GEN-LAST:event_CantidadAdultoStateChanged

    private void agregarComorbilidadAdultoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarComorbilidadAdultoActionPerformed
        if (!modelo.contains(cbxComorbilidadAdulto.getSelectedItem())) {
            modelo.addElement((String) cbxComorbilidadAdulto.getSelectedItem());
            this.lComorbilidadAdulto.setModel(modelo);
        }
    }//GEN-LAST:event_agregarComorbilidadAdultoActionPerformed

    private void cbxComorbilidadAdultoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxComorbilidadAdultoActionPerformed

    }//GEN-LAST:event_cbxComorbilidadAdultoActionPerformed

    private void eliminarComorbilidadAdultoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarComorbilidadAdultoActionPerformed
        modelo.removeElement(lComorbilidadAdulto.getSelectedValue());
    }//GEN-LAST:event_eliminarComorbilidadAdultoActionPerformed

    private void cbxComorbilidadNinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxComorbilidadNinoActionPerformed

    }//GEN-LAST:event_cbxComorbilidadNinoActionPerformed

    private void btnagregarComorbilidadNinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarComorbilidadNinoActionPerformed
        if (!modelon.contains(cbxComorbilidadNino.getSelectedItem())) {
            modelon.addElement((String) cbxComorbilidadNino.getSelectedItem());
            this.lComorbilidadNino.setModel(modelon);
        }
    }//GEN-LAST:event_btnagregarComorbilidadNinoActionPerformed

    private void btneliminarComorbilidadNinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarComorbilidadNinoActionPerformed
        modelon.removeElement(lComorbilidadNino.getSelectedValue());
    }//GEN-LAST:event_btneliminarComorbilidadNinoActionPerformed

    private void cbxComorbilidadAdultoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxComorbilidadAdultoMActionPerformed

    }//GEN-LAST:event_cbxComorbilidadAdultoMActionPerformed

    private void agregarComorbilidadAdultoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarComorbilidadAdultoMActionPerformed
        if (!modelom.contains(cbxComorbilidadAdultoM.getSelectedItem())) {
            modelom.addElement((String) cbxComorbilidadAdultoM.getSelectedItem());
            this.lComorbilidadAdultosM.setModel(modelom);
        }
    }//GEN-LAST:event_agregarComorbilidadAdultoMActionPerformed

    private void eliminarComorbilidadAdultoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarComorbilidadAdultoMActionPerformed
        modelom.removeElement(lComorbilidadAdultosM.getSelectedValue());
    }//GEN-LAST:event_eliminarComorbilidadAdultoMActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVentanaIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVentanaIngreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JSpinner CantidadAdulto;
    private javax.swing.JSpinner CantidadAdultosMay;
    private javax.swing.JSpinner CantidadNino;
    private javax.swing.JComboBox<String> CuidadoAdultos;
    private javax.swing.JComboBox<String> CuidadoAdultosM;
    private javax.swing.JComboBox<String> CuidadoNino;
    private javax.swing.JLabel Ltipocuidado;
    private javax.swing.JButton agregarComorbilidadAdulto;
    private javax.swing.JButton agregarComorbilidadAdultoM;
    private javax.swing.JButton btnagregarComorbilidadNino;
    private javax.swing.JButton btneliminarComorbilidadNino;
    private javax.swing.JComboBox<String> cbxComorbilidadAdulto;
    private javax.swing.JComboBox<String> cbxComorbilidadAdultoM;
    private javax.swing.JComboBox<String> cbxComorbilidadNino;
    private javax.swing.JButton eliminarComorbilidadAdulto;
    private javax.swing.JButton eliminarComorbilidadAdultoM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> lComorbilidadAdulto;
    private javax.swing.JList<String> lComorbilidadAdultosM;
    private javax.swing.JList<String> lComorbilidadNino;
    // End of variables declaration//GEN-END:variables
}
