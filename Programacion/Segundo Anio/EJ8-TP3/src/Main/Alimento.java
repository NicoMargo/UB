package Main;

import java.sql.Struct;

public class Alimento extends Carga{
    private String nombre;
    private int cantidad;

    public Alimento(int cantidad, String nombre, double peso){
        this.nombre = nombre;
        this.cantidad = cantidad;
        super.peso = peso;
    }
    @Override
    public double calcularPeso(){
        return peso * this.cantidad; //se calcula el peso multiplicando el mismo por la cantidad
    }
}
