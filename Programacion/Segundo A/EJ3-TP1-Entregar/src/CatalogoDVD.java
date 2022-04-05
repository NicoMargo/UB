import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatalogoDVD {
    private static List<DVD> catalogoDvd = new ArrayList<DVD>();

    public static void cargarPeliculasporDefecto(){
        DVD dvd1 = new DVD("nemo","infantil",(short)20, true,"pixar","Leyenda");
        DVD dvd2 = new DVD("toy story","accion",(short)100, false,"pixar","Buenisima");
        DVD dvd3 = new DVD("monster inc","infantil",(short)55, true,"disney","Excelente");
        DVD dvd4 = new DVD("cars","aventura",(short)110, false,"pixar","Magnifica");
        DVD dvd5 = new DVD("soul","ciencia",(short)200, true,"pixar","preciosa");
        catalogoDvd.add(dvd1);
        catalogoDvd.add(dvd2);
        catalogoDvd.add(dvd3);
        catalogoDvd.add(dvd4);
        catalogoDvd.add(dvd5);
    }

    public static void nuevoDVD() { //metodo que agrega un dvd

        short tiempo = 0;
        boolean opcionCorrecta;

        System.out.println("Agregar DVD:");
        DVD nuevoDvd = new DVD();

        nuevoDvd.setTitulo(Helper.ingresoStringValido("titulo"));

        nuevoDvd.setGenero(Helper.ingresoStringValido("genero"));

        nuevoDvd.setDirector(Helper.ingresoStringValido("director"));

        nuevoDvd.setComentario(Helper.ingresoStringValido("comentario"));

        nuevoDvd.setTiempo(Helper.ingresoShortValido("tiempo"));

        nuevoDvd.setTengo(Helper.ingresoBooleanValido("si lo tiene:  True si lo tiene, False si no lo tiene."));

        catalogoDvd.add(nuevoDvd);
        System.out.println("Se ingreso correctamente el nuevo DVD");
    }

    public static void eliminarDVD() { //metodo que elimina un dvd
        String tituloEliminar = Helper.ingresoStringValido("titulo para eliminar"); //se ingresa un titulo para buscarlo y eliminar el dvd
        boolean encontrado = false;
        for(DVD midvd : catalogoDvd){ //recorro todos los dvd
            if (midvd.getTitulo().equalsIgnoreCase(tituloEliminar)){ //pregunto por cada dvd si es igual al titulo ingresado
                catalogoDvd.remove(midvd); //si encuentro el dvd se elimina
                encontrado = true;
                System.out.println("Se elimino el Dvd " + tituloEliminar);
                break; //se termina el for
            }
        }
        if(!encontrado){
            System.err.println("No se encontro un dvd con ese titulo");
        }
    }
    public static void modificarDVD(){
        String titulo = Helper.ingresoStringValido("titulo para modificar"); //se ingresa el titulo para modificar el dvd
        boolean encontrado = false;
        for(DVD midvd : catalogoDvd){ //se recorre la lista
            if (midvd.getTitulo().equalsIgnoreCase(titulo)){ //si encuentro el dvd con el titulo ingresado
                encontrado = true;
                boolean seguirEditando = true;
                do{
                    System.out.println("Ingresar que dato quiere modificar: "); //menu que opcion se quiere modificar
                    short opcion;
                    System.out.println("""
                        Ingresar opcion:
                        0. titulo
                        1. genero
                        2. director
                        3. tiempo de duracion
                        4. modificar adquisicion DVD
                        5. Comentario
                        6. salir""");
                    opcion = Helper.ingresoShortValido("opcion");
                    switch (opcion) {
                        case 0:
                            System.out.println("Modificar titulo: ");
                            midvd.setTitulo(Helper.ingresoStringValido("titulo"));
                            break;
                        case 1:
                            System.out.println("Modificar genero: ");
                            midvd.setGenero(Helper.ingresoStringValido("genero"));
                            break;
                        case 2:
                            System.out.println("Modificar director: ");
                            midvd.setDirector(Helper.ingresoStringValido("director"));
                            break;
                        case 3:
                            System.out.println("Modificar duracion: ");
                            midvd.setTiempo(Helper.ingresoShortValido("tiempo"));
                            break;
                        case 4:
                            System.out.println("Modificar adiquision de dvd true/false: ");
                            midvd.setTengo(Helper.ingresoBooleanValido("si lo tengo"));
                            break;
                        case 5:
                            System.out.println("Modificar comentario: ");
                            midvd.setComentario(Helper.ingresoStringValido("comentario"));
                            break;
                        case 6:
                            seguirEditando = false;
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                }while(seguirEditando);
                break;
            }
        }
        if(!encontrado){
            System.err.println("No se encontro un dvd con ese titulo");
        }
    }

    public static void mostrarTodosDvd(){
        System.out.println("Mostrar todos los Dvd:");
        for(DVD undvd : catalogoDvd){
            System.out.println(undvd);
        }
        System.out.println("\n");
    }

    public static void mostrarDvdQueTengo(){
        System.out.println("Mostrar todos los Dvd que tengo:");
        for(DVD undvd : catalogoDvd){
            if(undvd.isTengo()){
                System.out.println(undvd);
            }
        }
        System.out.println("\n");
    }
    public static void mostrarDvdMenorTiempo(){
        short tiempoIngresado = Helper.ingresoShortValido("tiempo");
        System.out.println("Los dvd que tienen un tiempo menor a " + tiempoIngresado);
        for(DVD undvd : catalogoDvd){
            if(undvd.getTiempo() < tiempoIngresado){
                System.out.println(undvd);
            }
        }
        System.out.println("\n");
    }
    public static void mostrarDvdPorDirector(){
        String director = Helper.ingresoStringValido("director");
        System.out.println("Los dvd que tienen al director" + director);
        for(DVD undvd : catalogoDvd){
            if(undvd.getDirector().equalsIgnoreCase(director)){
                System.out.println(undvd);
            }
        }
        System.out.println("\n");
    }

    public static void informarCantidadDVD(){
        System.out.println("El total de dvd en el catalogo es " + catalogoDvd.size());
    }

    public static void informarCantidadDVDQueTengo(){
        int contadorDvd = 0;
        for(DVD unDvd : catalogoDvd){
            if (unDvd.isTengo()){
                contadorDvd++;
            }
        }
        System.out.println("El total de dvd en el catalogo que tengo es " + contadorDvd);
    }

    public static void ordenarXTitulo(){
        String aux[] = new String[catalogoDvd.size()];
        for(int i = 0; i < catalogoDvd.size(); i++){
            aux[i] = catalogoDvd.get(i).getTitulo();
        }
        Arrays.sort(aux);
        for(int i =0; i< aux.length;i++){
            System.out.println(aux[i]);
        }
    }



}
