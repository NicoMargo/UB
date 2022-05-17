package Main;

import java.util.ArrayList;

public class Tienda {
    private String nombre;
    private ArrayList<Articulo> listaArticulos;

    public void agregarALaLista(Articulo unArticulo){ //recibe un articulo y lo agrega a la lista
        listaArticulos.add(unArticulo);
    }
    public Articulo buscaArticulo (String codigo){

        Articulo articuloEncontrado = new Articulo("",0,0); //creo un articulo con valores no nulos pero con codigo ""
        for (Articulo unArticulo: listaArticulos) { //recorro toda la lista
            if(unArticulo.getCodigo().equalsIgnoreCase(codigo)){ //pregunto por cada articulo si el codigo de cada articulo es igual que el codigo recibido
                articuloEncontrado = unArticulo; //guardo el articulo en otra variable
                break; //termino el for
            }
        }
        return articuloEncontrado; //retorno el articulo encontrado, si el articulo tiene codigo "" es que no se encontro
    }

    public int vende(String codigo, int num){ //MODIFICACION DE EJ! VENDE RETORNA UN INT, INFORMA CUANTOS SE VENDIERON. EL METODO DEL ARTICULO vendeArticulo RETORNA UN BOOLEANO!!!

        Articulo articuloBuscado = buscaArticulo(codigo);
        if(!articuloBuscado.getCodigo().equals("")){ //si el articulo buscado es distinto a "" entonces se encontro un articulo con ese codigo, "" significa que no se encontro un articulo
            if(!buscaArticulo(codigo).vendeArticulo(num)){ //Si no se concreto la venta por faltante de unidades num pasa a ser 0 y lo retorno. significa que no se vendieron unidades
                num = 0; //0 no hay stock suficiente
            }
        } else{
            num = -1;// -1 no se encontro el articulo
        }
        return num; //si es mayor a 0 se realizo la venta
    }

    public void escribePedido(int min) {
        System.out.println("el nombre de la tienda es: " + nombre);
        for (Articulo unArticulo: listaArticulos) {
            if(unArticulo.getCantidad() < min){
                unArticulo.mostrarArticulo();
            }
        }
    }

    public Tienda(String nombre) { //constructor
        this.nombre = nombre;
        listaArticulos = new ArrayList<>();
    }


}
