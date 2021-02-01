package controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.InversaMatrizGauss;
import vista.VistaOperaciones;

/**
 * Clase controlador de InversaMatrizGauss
 * @author Victor, Montserrat y Jafet
 */
public final class CtrlInversaMatrizGauss implements ActionListener {

    private VistaOperaciones vo;
    private List<JTextField> valoresDeMatrizA;
    private int filas, columnas;

    /*
     * Prepara la vista de operaciones para realizar la obtención de la inversa de una matriz con el método de Gauss-Jordan.
    */
    public CtrlInversaMatrizGauss(VistaOperaciones vo) {
        this.vo = vo;
        valoresDeMatrizA = new ArrayList<>();

        adaptarDiseñoDeVista();

        vo.getjButtonRegresar().addActionListener(this);
        vo.getjButtonResolver().addActionListener(this);
        vo.getjButtonGenerarMatrices().addActionListener(this);
    }

    /*
     * Este método genera la matriz para realizar el cálculo cuando se presiona el botón de Generar matrices.
     * Si se ingresan datos incorrectos (numeros o quedan espacios vacios), aparecera un mensaje de error.
    */
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (vo.getjButtonGenerarMatrices() == ae.getSource()) {
            generarMatrices();
        }
        if (vo.getjButtonResolver() == ae.getSource()) {
            try {
                imprimirResultado(resolverInversa());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "HUBO UN ERROR, VERIFIQUE QUE HAYA LLENADO TODO EL FORMULARIO, \n"
                        + "RECUERDA IGUAL QUE SOLO SE ADMITEN VALORES NUMERICOS.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (vo.getjButtonRegresar() == ae.getSource()) {
            vo.setVisible(false);
        }
    }

    /*
     * Cambia el título de la vista a "Inversa de una matriz (Gauss-Jordan)"
    */
    public void adaptarDiseñoDeVista() {
        vo.getjLabelTituloVista().setText("INVERSA DE UNA MATRIZ (GAUSS-JORDAN)");
        vo.getColumnasMatrizA().setVisible(false);
        vo.getColumnasMatrizB().setVisible(false);
        vo.getFilasMatrizB().setVisible(false);
        vo.getjLabeMatrizB().setText("");
    }

    /*
     * Genera las celdas para llenar la matriz con las dimensiones establecidas por el usuario. 
    */
    public void generarMatrices() {
        limpiarMatrices();
        obtenerValoresFilasColumnas();

        vo.getPanelMatrizA().setLayout(new GridLayout(filas, columnas));

        int totalDeValores = filas * columnas;
        for (int i = 0; i < totalDeValores; i++) {
            JTextField valorMatrizA = new JTextField("valorMatrizA" + i);
            valorMatrizA.setPreferredSize(new Dimension(35, 35));
            valorMatrizA.setText("");
            vo.getPanelMatrizA().add(valorMatrizA);
            valoresDeMatrizA.add(valorMatrizA);
            vo.getPanelMatrizA().updateUI();
        }
    }

    /*
     * Vacía los valores de las celdas de la matriz.
    */
    public void limpiarMatrices() {
        vo.getPanelMatrizA().removeAll();
        valoresDeMatrizA.clear();
    }

    /*
     * Obtiene el valor de las filas y las columnas de la matriz establecidas por el usuario.
    */
    public void obtenerValoresFilasColumnas() {
        filas = 1;
        columnas = 1;
        try {
            filas = Integer.parseInt(vo.getFilasMatrizA().getSelectedItem().toString());
            columnas = filas;
        } catch (NumberFormatException e) {
        }
    }

    /*
     * Imprime la matriz resultante y lo despliega en la caja de texto de resultado.
    */
    public void imprimirResultado(double[][] matrizResultante) {
        vo.getjTextAreaResultado().setText("");
        String resultado = "";
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado += "          " + matrizResultante[i][j] + "  ";
            }
            resultado += "\n";
        }
        vo.getjTextAreaResultado().setText(resultado);
    }

    /*
     * Llena la matriz A con los datos ingresados en la celda por el usuario después de convertirlos a números enteros
     * y llama a la función de la clase InversaMatrizGauss para obtener la inversa.
    */
    public double[][] resolverInversa() {
        double[][] matrizA = new double[filas][columnas];
        int i = 0, j = 0;
        for (JTextField valorMatrizA : valoresDeMatrizA) {
            if (j == columnas) {
                i++;
                j = 0;
            }
            matrizA[i][j] = Integer.parseInt(valorMatrizA.getText());
            j++;
        }

        double[][] matrizResultante;
        InversaMatrizGauss inversa = new InversaMatrizGauss();
        matrizResultante = inversa.obtenerInversa(matrizA);
        return matrizResultante;
    }
}
