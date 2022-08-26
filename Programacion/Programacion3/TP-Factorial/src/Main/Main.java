package Main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() { //Creacion de ventana gui
            @Override
            public void run() {
                JFrame frame = new VentanaGUI(); //ccreo la ventana
                frame.setSize(500,500); //set dimensiones ventana
                frame.setVisible(true);
            }
        });

    }
    //Metodo que recibe un numero y retorna el resultado del factorial
    public static int calcularFactorial(int n){
        int acum = n*(n-1); //Se multiplican los dos ultimos numeros
        n = n-2; //resto 2 a n que equevale a los des ultimos numeros que multiplique
        while (n>1){
            acum*=n; //se multiplica el acumulador por n
            n--;
        }
        return  acum;
    }
}
