package Main;
import javax.swing.*;

public class Main {
    public static int matriz[][];

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new MyPanel();   //Instancio un objeto para crear el frame
                frame.setSize(700,700); //seteo dimensiones
                frame.setVisible(true); //hago visible el frame
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            }
        });



    }


}
