package Main;

import java.util.ArrayList;
import java.util.List;

public class Transporte {
    String patente;
    ArrayList<Carga> listaDeLaCarga;
    int localidadEntrada;
    int localidadSalida;

    public Transporte (int Entrada, int salida, String patente){
        localidadEntrada = Entrada;
        localidadSalida = salida;
        listaDeLaCarga = new ArrayList<>();
        this.patente = patente;
    }

    public double precioTransporte(){

        double precio;
        double pesoTotal = 0;
        for (Carga carga : listaDeLaCarga){
            pesoTotal += carga.calcularPeso();
        }
        if(pesoTotal < 1200){
            precio = pesoTotal * 6;
        } else if (pesoTotal < 2400) {
            precio = pesoTotal * 5.5;
        } else if (pesoTotal < 4000) {
            precio = pesoTotal * 4.3;
        }else{
            precio = pesoTotal * 3.6;
        }
        precio += matrizViaje.matrizCostoViaje[localidadSalida][localidadEntrada];

        return  precio;

    }

}


