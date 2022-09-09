package Main;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyPanel extends JFrame {

    private JTable table;
    private JPanel panel1;
    private JButton btnOrdenar;
    private JButton btnTransponer;
    private JLabel lblIngresarTam;
    private JButton btnCrearMatriz;
    private JTextField txtfCrearMatriz;
    private JLabel lblIngresarNumero;
    private JTextField txtfIngresarNumeroMatriz;
    private JButton btnAgregarNumero;
    private JTextField txtIngresarFilas;
    private boolean estadoOrden = true;

    private void cargarTabla(){
        String[] cantColumnas = new String[Main.matriz[0].length];

        Object[][] data = new Object[Main.matriz.length][Main.matriz[0].length];

        for(int j = 0; j < Main.matriz.length; j++){
            for(int k = 0; k < Main.matriz[0].length; k++){
                data[j][k] = Main.matriz[j][k];
            }
        }

        for(int i = 0; i < Main.matriz[0].length; i++){
            cantColumnas[i] = "Columna " + i;
        }
        table.setModel(new DefaultTableModel(
                data, cantColumnas
        ));
    }
    public MyPanel(){
        btnAgregarNumero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                boolean terminado = false;
                for(int i = 0; i < Main.matriz.length; i++){
                    for(int j = 0; j < Main.matriz[0].length; j++){
                        if(Main.matriz[i][j] == 0){
                            Main.matriz[i][j] = Integer.parseInt(txtfIngresarNumeroMatriz.getText());
                            terminado = true;
                            break;
                        }
                    }
                    if(terminado)
                        break;
                }
                cargarTabla();
                txtfIngresarNumeroMatriz.setText("");
            }
            });

        btnCrearMatriz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                Main.matriz = new int [Integer.parseInt(txtIngresarFilas.getText())][Integer.parseInt(txtfCrearMatriz.getText())];
                Main.matriz = HelperMatriz.ordenarMatrizAsc(Main.matriz);
                btnAgregarNumero.setEnabled(true);
                txtfIngresarNumeroMatriz.setEnabled(true);
                txtIngresarFilas.setText("");
                txtfCrearMatriz.setText("");
                cargarTabla();
            }
        });


        btnOrdenar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

                if(estadoOrden){
                    btnOrdenar.setText("Ordenar Asc");
                    Main.matriz = HelperMatriz.ordenarMatrizDesc(Main.matriz);
                    cargarTabla();
                }else{
                    btnOrdenar.setText("Ordenar Desc");
                    Main.matriz = HelperMatriz.ordenarMatrizAsc(Main.matriz);
                }
                cargarTabla();
                estadoOrden = !estadoOrden;


            }
        });
        btnTransponer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

                Main.matriz = HelperMatriz.transponerMatriz(Main.matriz);
                cargarTabla();

            }
        });
        setContentPane(panel1);

    }


}
