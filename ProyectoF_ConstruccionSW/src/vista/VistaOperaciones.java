/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * JFrame que contiene el nombre de la operación, un combobox para seleccionar las dimensiones de las matrices 
 * y las celdas que llenará el usuario para realizar el cálculo, junto con el botón de resolver y una caja de texto que contendrá el resultado.
 * @author Victor, Jafet y Montserrat
 */
public class VistaOperaciones extends javax.swing.JFrame {

    /**
     * Creates new form VistaOperaciones
     */
    public VistaOperaciones() {
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

        EtiquetaMatA = new javax.swing.JLabel();
        jButtonRegresar = new javax.swing.JButton();
        filasMatrizA = new javax.swing.JComboBox<>();
        columnasMatrizA = new javax.swing.JComboBox<>();
        filasMatrizB = new javax.swing.JComboBox<>();
        columnasMatrizB = new javax.swing.JComboBox<>();
        jButtonResolver = new javax.swing.JButton();
        jLabelTituloVista = new javax.swing.JLabel();
        jLabeMatrizA = new javax.swing.JLabel();
        jLabeMatrizB = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaResultado = new javax.swing.JTextArea();
        jLabelResultados = new javax.swing.JLabel();
        jPanelMatrizB = new javax.swing.JPanel();
        jPanelMatrizA = new javax.swing.JPanel();
        jButtonGenerarMatrices = new javax.swing.JButton();

        EtiquetaMatA.setText("Crear matriz A");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonRegresar.setText("Regresar");

        filasMatrizA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filas", "1", "2", "3", "4" }));
        filasMatrizA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filasMatrizAActionPerformed(evt);
            }
        });

        columnasMatrizA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Columnas", "1", "2", "3", "4" }));
        columnasMatrizA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                columnasMatrizAActionPerformed(evt);
            }
        });

        filasMatrizB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filas", "1", "2", "3", "4" }));
        filasMatrizB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filasMatrizBActionPerformed(evt);
            }
        });

        columnasMatrizB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Columnas", "1", "2", "3", "4" }));
        columnasMatrizB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                columnasMatrizBActionPerformed(evt);
            }
        });

        jButtonResolver.setText("Obtener resultado");
        jButtonResolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResolverActionPerformed(evt);
            }
        });

        jLabelTituloVista.setFont(new java.awt.Font("Sneakerhead BTN Shadow", 0, 24)); // NOI18N
        jLabelTituloVista.setForeground(new java.awt.Color(102, 102, 255));
        jLabelTituloVista.setText("Calculadora de Matrices");

        jLabeMatrizA.setText("MATRIZ A");

        jLabeMatrizB.setText("MATRIZ B");

        jTextAreaResultado.setColumns(20);
        jTextAreaResultado.setRows(5);
        jScrollPane1.setViewportView(jTextAreaResultado);

        jLabelResultados.setText("Resultado:");

        javax.swing.GroupLayout jPanelMatrizBLayout = new javax.swing.GroupLayout(jPanelMatrizB);
        jPanelMatrizB.setLayout(jPanelMatrizBLayout);
        jPanelMatrizBLayout.setHorizontalGroup(
            jPanelMatrizBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
        );
        jPanelMatrizBLayout.setVerticalGroup(
            jPanelMatrizBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        jPanelMatrizA.setLayout(new java.awt.GridLayout(1, 0));

        jButtonGenerarMatrices.setText("Generar Matrices");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(205, 205, 205)
                                .addComponent(jButtonGenerarMatrices))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(filasMatrizA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(columnasMatrizA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(filasMatrizB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(columnasMatrizB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jPanelMatrizB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jPanelMatrizA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(jLabeMatrizA)
                                .addGap(236, 236, 236)
                                .addComponent(jLabeMatrizB)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelResultados)
                            .addComponent(jButtonResolver)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButtonRegresar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(223, 223, 223)
                                .addComponent(jLabelTituloVista)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonRegresar)
                .addGap(1, 1, 1)
                .addComponent(jLabelTituloVista)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabeMatrizA, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabeMatrizB, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(filasMatrizA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(columnasMatrizA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(filasMatrizB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(columnasMatrizB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonResolver))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanelMatrizA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanelMatrizB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabelResultados)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(70, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonGenerarMatrices)
                        .addGap(36, 36, 36))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void filasMatrizAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filasMatrizAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filasMatrizAActionPerformed

    private void columnasMatrizAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_columnasMatrizAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_columnasMatrizAActionPerformed

    private void filasMatrizBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filasMatrizBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filasMatrizBActionPerformed

    private void columnasMatrizBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_columnasMatrizBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_columnasMatrizBActionPerformed

    private void jButtonResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonResolverActionPerformed

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
            java.util.logging.Logger.getLogger(VistaOperaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaOperaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaOperaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaOperaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaOperaciones().setVisible(true);
            }
        });
    }
    
    public JLabel getjLabelTituloVista() {
        return jLabelTituloVista;
    }

    public void setjLabelTituloVista(JLabel jLabelTituloVista) {
        this.jLabelTituloVista = jLabelTituloVista;
    }
    
    public JComboBox<String> getColumnasMatrizA() {
        return columnasMatrizA;
    }

    public void setColumnasMatrizA(JComboBox<String> columnasMatrizA) {
        this.columnasMatrizA = columnasMatrizA;
    }

    public JComboBox<String> getColumnasMatrizB() {
        return columnasMatrizB;
    }

    public void setColumnasMatrizB(JComboBox<String> columnasMatrizB) {
        this.columnasMatrizB = columnasMatrizB;
    }

    public JComboBox<String> getFilasMatrizA() {
        return filasMatrizA;
    }

    public void setFilasMatrizA(JComboBox<String> filasMatrizA) {
        this.filasMatrizA = filasMatrizA;
    }

    public JComboBox<String> getFilasMatrizB() {
        return filasMatrizB;
    }

    public void setFilasMatrizB(JComboBox<String> filasMatrizB) {
        this.filasMatrizB = filasMatrizB;
    }
    
    public JButton getjButtonRegresar() {
        return jButtonRegresar;
    }

    public void setjButtonRegresar(JButton jButtonRegresar) {
        this.jButtonRegresar = jButtonRegresar;
    }

    public JButton getjButtonResolver() {
        return jButtonResolver;
    }

    public void setjButtonResolver(JButton jButtonResolver) {
        this.jButtonResolver = jButtonResolver;
    }

    public JLabel getjLabeMatrizA() {
        return jLabeMatrizA;
    }

    public void setjLabeMatrizA(JLabel jLabeMatrizA) {
        this.jLabeMatrizA = jLabeMatrizA;
    }

    public JLabel getjLabeMatrizB() {
        return jLabeMatrizB;
    }

    public void setjLabeMatrizB(JLabel jLabeMatrizB) {
        this.jLabeMatrizB = jLabeMatrizB;
    }

    public JPanel getPanelMatrizA() {
        return jPanelMatrizA;
    }

    public void setPanelMatrizA(JPanel jPanelMatrizA) {
        this.jPanelMatrizA = jPanelMatrizA;
    }

    public JPanel getPanelMatrizB() {
        return jPanelMatrizB;
    }

    public void setPanelMatrizB(JPanel jPanelMatrizB) {
        this.jPanelMatrizB = jPanelMatrizB;
    }

    public JButton getjButtonGenerarMatrices() {
        return jButtonGenerarMatrices;
    }

    public void setjButtonGenerarMatrices(JButton jButtonGenerarMatrices) {
        this.jButtonGenerarMatrices = jButtonGenerarMatrices;
    }

    public JTextArea getjTextAreaResultado() {
        return jTextAreaResultado;
    }

    public void setjTextAreaResultado(JTextArea jTextAreaResultado) {
        this.jTextAreaResultado = jTextAreaResultado;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EtiquetaMatA;
    private javax.swing.JComboBox<String> columnasMatrizA;
    private javax.swing.JComboBox<String> columnasMatrizB;
    private javax.swing.JComboBox<String> filasMatrizA;
    private javax.swing.JComboBox<String> filasMatrizB;
    private javax.swing.JButton jButtonGenerarMatrices;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JButton jButtonResolver;
    private javax.swing.JLabel jLabeMatrizA;
    private javax.swing.JLabel jLabeMatrizB;
    private javax.swing.JLabel jLabelResultados;
    private javax.swing.JLabel jLabelTituloVista;
    private javax.swing.JPanel jPanelMatrizA;
    private javax.swing.JPanel jPanelMatrizB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaResultado;
    // End of variables declaration//GEN-END:variables
}
