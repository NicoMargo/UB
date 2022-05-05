package Main;

public class Animal extends Carga{
    short cantidadCabezas;
    double pesoPorCabeza;

    public Animal(short cantidad){
        cantidadCabezas = cantidad;
    }

    @Override
    public double calcularPeso(){
        return pesoPorCabeza * 150; //150 es el peso promedio por cabeza
    }
}
