import java.util.ArrayList;
import java.util.Arrays;
public class CatalogoCD {
    private static ArrayList<CD> catalogoCD = new ArrayList<CD>();


    //TODOS LOS COMENTARIOS DE DVD APLICAN PARA CD YA QUE ES LO MISMO!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1

    public static void cargarCDporDefecto(){
        CD cd1 = new CD("The dark side of the moon","rock",(short)60,true,"Pink Floyd","Leyenda",(short)8);
        CD cd2 = new CD("Live In Australia","pop",(short)70,true,"Elton John","Mistico",(short)9);
        CD cd3 = new CD("Titulo B","genero B",(short)20,false,"Diana","Buenisimo",(short)8);
        CD cd4 = new CD("A titulo","Genero A",(short)10,true,"Patricia","Genial",(short)8);

        catalogoCD.add(cd1);
        catalogoCD.add(cd2);
        catalogoCD.add(cd3);
        catalogoCD.add(cd4);
    }

    public static void nuevoCD() {

        short tiempo = 0;
        boolean opcionCorrecta;

        System.out.println("Agregar CD:");
        CD nuevoCD = new CD();

        nuevoCD.setTitulo(Helper.ingresoStringValido("titulo"));

        nuevoCD.setGenero(Helper.ingresoStringValido("genero"));

        nuevoCD.setInterprete(Helper.ingresoStringValido("Interprete"));

        nuevoCD.setComentario(Helper.ingresoStringValido("comentario"));

        nuevoCD.setTiempo(Helper.ingresoShortValido("tiempo"));

        nuevoCD.setCantidadCanciones(Helper.ingresoShortValido("cantidad de canciones"));

        nuevoCD.setTengo(Helper.ingresoBooleanValido("si lo tiene:  True si lo tiene, False si no lo tiene."));

        catalogoCD.add(nuevoCD);
        System.out.println("Se ingreso correctamente el nuevo CD");
    }

    public static void eliminarCD() {
        String tituloEliminar = Helper.ingresoStringValido("titulo para eliminar");
        boolean encontrado = false;
        for(CD miCD : catalogoCD){
            if (miCD.getTitulo().equalsIgnoreCase(tituloEliminar)){
                catalogoCD.remove(miCD);
                encontrado = true;
                System.out.println("Se elimino el CD " + tituloEliminar);
                break;
            }
        }
        if(!encontrado){
            System.err.println("No se encontro un CD con ese titulo");
        }
    }
    public static void modificarCD(){
        String titulo = Helper.ingresoStringValido("titulo para modificar");
        boolean encontrado = false;
        for(CD miCD : catalogoCD){
            if (miCD.getTitulo().equalsIgnoreCase(titulo)){
                encontrado = true;
                boolean seguirEditando = true;
                do{
                    System.out.println("Ingresar que dato quiere modificar: ");
                    int opcion;
                    System.out.println("""
                        Ingresar opcion:
                        0. titulo
                        1. genero
                        2. Interprete
                        3. tiempo de duracion
                        4. modificar adquisicion CD
                        5. Comentario
                        6. Cantidad de canciones
                        7. salir""");
                    opcion = Helper.ingresoShortValido("opcion");
                    switch (opcion) {
                        case 0:
                            System.out.println("Modificar titulo: ");
                            miCD.setTitulo(Helper.ingresoStringValido("titulo"));
                            break;
                        case 1:
                            System.out.println("Modificar genero: ");
                            miCD.setGenero(Helper.ingresoStringValido("genero"));
                            break;
                        case 2:
                            System.out.println("Modificar Interprete: ");
                            miCD.setInterprete(Helper.ingresoStringValido("Interprete"));
                            break;
                        case 3:
                            System.out.println("Modificar duracion: ");
                            miCD.setTiempo(Helper.ingresoShortValido("tiempo"));
                            break;
                        case 4:
                            System.out.println("Modificar adiquision de CD true/false: ");
                            miCD.setTengo(Helper.ingresoBooleanValido("si lo tengo"));
                            break;
                        case 5:
                            System.out.println("Modificar comentario: ");
                            miCD.setComentario(Helper.ingresoStringValido("comentario"));
                            break;
                        case 6:
                            System.out.println("Modificar Cantidad de canciones: ");
                            miCD.setCantidadCanciones(Helper.ingresoShortValido("cantidad de canciones"));
                            break;
                        case 7:
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
            System.err.println("No se encontro un CD con ese titulo");
        }
    }

    public static void mostrarTodosCD(){
        System.out.println("Mostrar todos los CD:");
        for(CD unCD : catalogoCD){
            System.out.println(unCD);
        }
        System.out.println("\n");
    }

    public static void mostrarCDQueTengo(){
        System.out.println("Mostrar todos los CD que tengo:");
        for(CD unCD : catalogoCD){
            if(unCD.isTengo()){
                System.out.println(unCD);
            }
        }
        System.out.println("\n");
    }
    public static void mostrarCDMenorTiempo(){
        short tiempoIngresado = Helper.ingresoShortValido("tiempo");
        System.out.println("Los CD que un timpo menor a " + tiempoIngresado);
        for(CD unCD : catalogoCD){
            if(unCD.getTiempo() < tiempoIngresado){
                System.out.println(unCD);
            }
        }
        System.out.println("\n");
    }
    public static void mostrarCDPorInterprete(){
        String Interprete = Helper.ingresoStringValido("Interprete");
        System.out.println("Los CD que tienen al Interprete" + Interprete);
        for(CD unCD : catalogoCD){
            if(unCD.getInterprete().equalsIgnoreCase(Interprete)){
                System.out.println(unCD);
            }
        }
        System.out.println("\n");
    }

    public static void informarCantidadCD(){
        System.out.println("El total de CD en el catalogo es " + catalogoCD.size());
    }



    public static void informarCantidadCDQueTengo(){
        int contadorCD = 0;
        for(CD unCD : catalogoCD){
            if (unCD.isTengo()){
                contadorCD++;
            }
        }
        System.out.println("El total de CD en el catalogo que tengo es " + contadorCD);
    }

    public static void ordenarXTitulo(){
        String aux[] = new String[catalogoCD.size()];
        for(int i = 0; i < catalogoCD.size(); i++){
            aux[i] = catalogoCD.get(i).getTitulo();
        }
        Arrays.sort(aux);
        for(int i =0; i< aux.length;i++){
            System.out.println(aux[i]);
        }
    }
    public static void cantidadDeCancionesCd(){
        String titulo = Helper.ingresoStringValido("titulo para mostrar cantidad de canciones de un cd");
        boolean encontrado = false;
        for(CD miCD : catalogoCD)
        {
            if (miCD.getTitulo().equalsIgnoreCase(titulo)) {
                encontrado = true;
                System.out.println("El total de canciones dentro del cd " + titulo + " es " + miCD.getCantidadCanciones());
            }
        }
        if(!encontrado){
            System.err.println("No se encontro un dvd con ese titulo");
        }
    }




}
