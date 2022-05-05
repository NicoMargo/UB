package Main;
import java.util.HashMap;
import java.util.Map;

public class Bulto extends Carga{
    private String tamano;

    public Bulto(){

    }

    @Override
    public double calcularPeso(){
        return 6.0; //se calcula el peso multiplicando el mismo por la cantidad
    }
}
