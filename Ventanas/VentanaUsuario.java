/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;


public class VentanaUsuario extends javax.swing.JFrame {


    public VentanaUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanelMenu = new javax.swing.JPanel();
        jButtonInicio = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButtonInicio1 = new javax.swing.JButton();
        jButtonInicio2 = new javax.swing.JButton();
        jButtonInicio3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanelSolicitud = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelContraseña = new javax.swing.JLabel();
        jLabelProyecto = new javax.swing.JLabel();
        jLabelIdentificacion = new javax.swing.JLabel();
        jLabelSolicitud = new javax.swing.JLabel();
        jTextFieldIdentificacion = new javax.swing.JTextField();
        jComboBoxProyecto = new javax.swing.JComboBox<>();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabelTipo1 = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jLabelNickName = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldNickName = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jComboBoxTipoUsuario = new javax.swing.JComboBox<>();
        jButtonGuardar1 = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jLabelFondo2 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonInicio.setBackground(new java.awt.Color(102, 0, 0));
        jButtonInicio.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonInicio.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInicio.setText("INICIO");
        jButtonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicioActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 161, 37));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bienvenido.png"))); // NOI18N
        jPanelMenu.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jButtonInicio1.setBackground(new java.awt.Color(102, 0, 0));
        jButtonInicio1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonInicio1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInicio1.setText("SOLICITAR EQUIPO");
        jButtonInicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicio1ActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonInicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 40));

        jButtonInicio2.setBackground(new java.awt.Color(102, 0, 0));
        jButtonInicio2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonInicio2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInicio2.setText("MI PERFIL");
        jButtonInicio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicio2ActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonInicio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 161, 37));

        jButtonInicio3.setBackground(new java.awt.Color(102, 0, 0));
        jButtonInicio3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonInicio3.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInicio3.setText("CONTACTENOS");
        jButtonInicio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicio3ActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonInicio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 161, 37));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("NombreUsuario");
        jPanelMenu.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoGris.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanelMenu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 400));

        getContentPane().add(jPanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanelSolicitud.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelSolicitud.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelSolicitud.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelSolicitud.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jLabelContraseña.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelContraseña.setForeground(new java.awt.Color(102, 102, 102));
        jLabelContraseña.setText("CONTRASEÑA");
        jPanelSolicitud.add(jLabelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 30));

        jLabelProyecto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelProyecto.setForeground(new java.awt.Color(102, 102, 102));
        jLabelProyecto.setText("PROYECTO");
        jPanelSolicitud.add(jLabelProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 30));

        jLabelIdentificacion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelIdentificacion.setForeground(new java.awt.Color(102, 102, 102));
        jLabelIdentificacion.setText("IDENTIFICACION");
        jPanelSolicitud.add(jLabelIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabelSolicitud.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelSolicitud.setForeground(new java.awt.Color(102, 102, 102));
        jLabelSolicitud.setText("CREAR USUARIO");
        jPanelSolicitud.add(jLabelSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));
        jPanelSolicitud.add(jTextFieldIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 180, 30));

        jComboBoxProyecto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelSolicitud.add(jComboBoxProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 180, 30));
        jPanelSolicitud.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 180, 30));

        jLabelTipo1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTipo1.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTipo1.setText("E-MAIL");
        jPanelSolicitud.add(jLabelTipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, 30));

        jLabelTipo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTipo.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTipo.setText("TIPO");
        jPanelSolicitud.add(jLabelTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, 30));

        jLabelNickName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNickName.setForeground(new java.awt.Color(102, 102, 102));
        jLabelNickName.setText("NICK NAME");
        jPanelSolicitud.add(jLabelNickName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, 30));

        jLabelNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(102, 102, 102));
        jLabelNombre.setText("NOMBRE");
        jPanelSolicitud.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, 30));
        jPanelSolicitud.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 180, 30));
        jPanelSolicitud.add(jTextFieldNickName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 180, 30));

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        jPanelSolicitud.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 180, 30));

        jComboBoxTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanelSolicitud.add(jComboBoxTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 180, 30));

        jButtonGuardar1.setText("Vaciar");
        jButtonGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardar1ActionPerformed(evt);
            }
        });
        jPanelSolicitud.add(jButtonGuardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanelSolicitud.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        jLabelFondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondo2.setText("jLabel4");
        jPanelSolicitud.add(jLabelFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 400));

        getContentPane().add(jPanelSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 380, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInicio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicio3ActionPerformed
    }//GEN-LAST:event_jButtonInicio3ActionPerformed

    private void jButtonInicio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicio2ActionPerformed
    }//GEN-LAST:event_jButtonInicio2ActionPerformed

    private void jButtonInicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicio1ActionPerformed
        VentanaSolicitud objVentana = new VentanaSolicitud();
        objVentana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonInicio1ActionPerformed

    private void jButtonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicioActionPerformed
        VentanaInicial objVentana= new VentanaInicial();
        objVentana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonInicioActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardar1ActionPerformed
    }//GEN-LAST:event_jButtonGuardar1ActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaUsuario().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonGuardar1;
    private javax.swing.JButton jButtonInicio;
    private javax.swing.JButton jButtonInicio1;
    private javax.swing.JButton jButtonInicio2;
    private javax.swing.JButton jButtonInicio3;
    private javax.swing.JComboBox<String> jComboBoxProyecto;
    private javax.swing.JComboBox<String> jComboBoxTipoUsuario;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelFondo2;
    private javax.swing.JLabel jLabelIdentificacion;
    private javax.swing.JLabel jLabelNickName;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelProyecto;
    private javax.swing.JLabel jLabelSolicitud;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelTipo1;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelSolicitud;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldIdentificacion;
    private javax.swing.JTextField jTextFieldNickName;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
