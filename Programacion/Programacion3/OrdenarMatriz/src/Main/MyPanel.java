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
    private boolean estadoOrden = true;

    private void cargarTabla(){
        String[] cantColumnas = new String[Main.matriz[0].length];

        Object[][] data = new Object[Main.matriz.length][Main.matriz[0].length];

        for(int j = 0; j < Main.matriz.length; j++){
            for(int k = 0; k < Main.matriz[0].length; k++){
                data[j][k] = Main.matriz[j][k];
            }
        }

        for(int i = 0; i < Main.matriz.length; i++){
            cantColumnas[i] = "Columna " + i;
        }
        table.setModel(new DefaultTableModel(
                data, cantColumnas
        ));
    }
    public MyPanel(){

        cargarTabla();


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
