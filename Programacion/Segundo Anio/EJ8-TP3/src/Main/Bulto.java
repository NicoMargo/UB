package Main;
import java.awt.desktop.AboutEvent;
import java.util.HashMap;
import java.util.Map;

public class Bulto extends Carga{
    private double peso;
    private int cantidad;

    public Bulto(int cantidad, double peso){
        this.cantidad = cantidad;
        this.peso = peso;
    }

    @Override
    public double calcularPeso(){
        Double pesoTotal;
        if(this.peso <= 20)
            pesoTotal = cantidad * 10.0005; //10.005 es el promedio del rango de 0.01 a 20 BULTO MINI

         else if (this.peso <=100)
            pesoTotal = cantidad * 60.5; //60.5   es el promedio del rango de 21 a 100 BULTO MID

        else
            pesoTotal = cantidad *125.5; //125.5es el promedio del rango de 101 a 150 BULTO MAX

        return pesoTotal;
    }
}
