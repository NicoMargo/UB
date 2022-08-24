package Main;
import javax.swing.*;

public class Main {
    public static int matriz[][] = {{55,33,22,5},{1,4,99,0},{14,63,46,91},{8,9,34,61}};

    public static void main(String[] args) {

        matriz = HelperMatriz.ordenarMatrizAsc(matriz);



        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new MyPanel();
                frame.setSize(700,700);
                frame.setVisible(true);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            }
        });











    }


}
