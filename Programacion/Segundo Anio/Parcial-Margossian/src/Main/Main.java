package Main;

import java.util.Scanner;

public class Main {
    public static void main(String []args) {

        //Se insertan nuevos articulos
        Articulo nuevoArticulo1 = new Articulo("Procesador",100,500);
        Articulo nuevoArticulo2 = new Articulo("Ram",200,100);
        Articulo nuevoArticulo3 = new Articulo("Placa de Video",20,1200);
        Articulo nuevoArticulo4 = new Articulo("SSD",250,40);

        //Se crea una nueva tienda.
        Tienda tienda1 = new Tienda("Mexx");
        tienda1.agregarALaLista(nuevoArticulo1); //se agregan los articulos a la tienda con el metodo agregarALaLista
        tienda1.agregarALaLista(nuevoArticulo2);
        tienda1.agregarALaLista(nuevoArticulo3);
        tienda1.agregarALaLista(nuevoArticulo4);

        System.out.println("Bienvenido al programa!");
        int opcion;
        do{
            System.out.println("1 Agregar un nuevo articulo");
            System.out.println("2 Buscar un articulo por su codigo");
            System.out.println("3 Venta de un producto");
            System.out.println("4 Escribir pedido");
            System.out.println("5 Salir");

            opcion = Helper.ingresoIntValido("opcion");
            switch (opcion) {
                case 1:
                    Articulo nuevoArticulo = new Articulo(Helper.ingresoStringValido("codigo"), Helper.ingresoIntValido("Cantidad"), Helper.ingresoIntValido("Precio por unidad"));
                    tienda1.agregarALaLista(nuevoArticulo);
                    System.out.println("Se ingreso el nuevo articulo correctamente");
                    nuevoArticulo.mostrarArticulo();
                    break;

                case 2:
                    Articulo articuloBuscado = tienda1.buscaArticulo(Helper.ingresoStringValido("codigo")); // se busca un articulo por su codigo
                    if (articuloBuscado.getCodigo().equalsIgnoreCase("")) { //si el articulo buscado tiene codigo vacio, entonces no se encontro
                        System.out.println("No se encontro ningun articulo con ese codigo");
                    } else {
                        articuloBuscado.mostrarArticulo(); //se muestra el articulo
                    }
                    break;

                case 3:
                    String codigoIngresado = Helper.ingresoStringValido("codigo");
                    int cantidad = Helper.ingresoIntValido("cantidad");
                    int cantidadVendida = tienda1.vende(codigoIngresado, cantidad);
                    if(cantidadVendida == -1){
                        System.err.println("no se encontro un articulo con ese codigo");
                    } else if (cantidadVendida == 0) {
                        System.err.println("no se realizo la venta ya que no hay suficiente cantidad de stock");
                    }else{
                        System.out.println("se vendieron " + cantidadVendida + " unidades del articulo " + codigoIngresado);
                    }
                    break;

                case 4:
                    tienda1.escribePedido(Helper.ingresoIntValido("cantidad de unidades pedido"));
                    break;

                case 5:
                    System.out.println("Nos vemos!");
                    break;

                default:
                    System.out.println("opcion no valida");
            }
        }while(opcion != 5);


    }

}
