package Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaGUI extends JFrame{
    private JLabel lblTextoInicio;
    private JButton btnCalcular;
    private JLabel lblResultado;
    private JPanel panel1;
    private JTextField txtNumero;

    public  VentanaGUI() {
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                lblResultado.setText("El resultado es: " + Main.calcularFactorial(Integer.parseInt(txtNumero.getText())));
            }
        });
        setContentPane(panel1);
    }
}
