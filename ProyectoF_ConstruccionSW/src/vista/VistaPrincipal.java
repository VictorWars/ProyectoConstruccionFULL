/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;

/**
 * JFrame que muestra el titulo y el menu para seleccionar la operacion a realizar
 * @author Jafet, Victor y Montserrat
 */
public class VistaPrincipal extends javax.swing.JFrame {

    /**
     * Crea nueva VistaPrincipal
     */
    public VistaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelTitulo1 = new javax.swing.JLabel();
        jComboBoxOperaciones = new javax.swing.JComboBox<>();
        jButtonCerrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabelTitulo.setFont(new java.awt.Font("Malayalam MN", 2, 24)); // NOI18N
        jLabelTitulo.setText("Calculadora de Matrices");

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(540, 310));
        setUndecorated(true);
        setSize(new java.awt.Dimension(540, 310));
        getContentPane().setLayout(null);

        jLabelTitulo1.setFont(new java.awt.Font("Sneakerhead BTN Shadow", 2, 24)); // NOI18N
        jLabelTitulo1.setForeground(new java.awt.Color(102, 102, 255));
        jLabelTitulo1.setText("Calculadora de Matrices");
        getContentPane().add(jLabelTitulo1);
        jLabelTitulo1.setBounds(110, 60, 320, 32);

        jComboBoxOperaciones.setBackground(new java.awt.Color(153, 153, 255));
        jComboBoxOperaciones.setForeground(new java.awt.Color(255, 255, 255));
        jComboBoxOperaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una opción...", "Suma de matrices", "Multiplicación de matriz por escalar", "Multiplicación de matrices", "Obtención de la inversa de una matriz (Gauss)", "Sistema de ecuaciones por Gauss-Jordan", "Determinante de una matriz", "Sistema de ecuaciones por Cramer" }));
        jComboBoxOperaciones.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jComboBoxOperacionesComponentAdded(evt);
            }
        });
        jComboBoxOperaciones.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jComboBoxOperacionesComponentHidden(evt);
            }
        });
        jComboBoxOperaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOperacionesActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxOperaciones);
        jComboBoxOperaciones.setBounds(110, 140, 310, 20);

        jButtonCerrar.setBackground(new java.awt.Color(255, 102, 102));
        jButtonCerrar.setText("Cerrar");
        getContentPane().add(jButtonCerrar);
        jButtonCerrar.setBounds(220, 230, 73, 23);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 90, 520, 10);

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        jLabel2.setText("Construcción del software");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 40, 240, 17);

        jLabel3.setText("Seleccione la operación que desea realizar");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 120, 260, 14);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel4.setText("Equipo: Jafet Alejandro Fernández Martínez, Víctor Enrique Cauich Dávalos y Montserrat Bustamante Rentería");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 300, 430, 11);

        setSize(new java.awt.Dimension(540, 310));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxOperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOperacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxOperacionesActionPerformed

    private void jComboBoxOperacionesComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jComboBoxOperacionesComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxOperacionesComponentAdded

    private void jComboBoxOperacionesComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jComboBoxOperacionesComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxOperacionesComponentHidden

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    public JComboBox<String> getjComboBoxOperaciones() {
        return jComboBoxOperaciones;
    }

    public void setjComboBoxOperaciones(JComboBox<String> jComboBoxOperaciones) {
        this.jComboBoxOperaciones = jComboBoxOperaciones;
    }

    public JButton getjButtonCerrar() {
        return jButtonCerrar;
    }

    public void setjButtonCerrar(JButton jButtonCerrar) {
        this.jButtonCerrar = jButtonCerrar;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JComboBox<String> jComboBoxOperaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTitulo1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
