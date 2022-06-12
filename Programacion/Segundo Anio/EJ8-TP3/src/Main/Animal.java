package Main;

public class Animal extends Carga{
    int cantidadCabezas;

    public Animal(int cantidad){
        cantidadCabezas = cantidad;
    }

    @Override
    public double calcularPeso(){
        return cantidadCabezas * 150; //150 es el peso promedio por cabeza, el ej no aclara de un peso exacto.
    }
}
