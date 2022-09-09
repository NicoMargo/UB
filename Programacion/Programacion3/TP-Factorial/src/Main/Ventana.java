package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    public Ventana(){
        JFrame frame = new JFrame("TP factorial Tanzi Margossian Frontera");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();
    }
    private void iniciarComponentes(){
        Panel panel = new Panel();
        JLabel lblIngresar = new JLabel("Ingrese numero para calcular factorial");
        JButton btnCalcular = new JButton("Calcular Factorial");
        JLabel lblResultado = new JLabel();
        JTextField txtNumero = new JTextField();

        txtNumero.setPreferredSize(new Dimension( 200, 24 ) );

        panel.add(lblIngresar);
        panel.add(txtNumero);
        panel.add(btnCalcular);
        panel.add(lblResultado);


        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                lblResultado.setText("El resultado es: " + Main.calcularFactorial(Integer.parseInt(txtNumero.getText())));
            }
        });


        this.getContentPane().add(panel);


    }

}
