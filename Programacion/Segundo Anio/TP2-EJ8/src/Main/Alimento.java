package Main;

public class Alimento extends Carga{
    private String nombre;
    private short cantidad;

    private double peso;

    public Alimento(short cantidad){
        this.cantidad = cantidad;
    }
    @Override
    public double calcularPeso(){
        return peso * this.cantidad; //se calcula el peso multiplicando el mismo por la cantidad
    }
}
