import java.util.ArrayList;
import java.util.Arrays;

public class CatalogoDisco {
    private static ArrayList<Disco> catalogoDisco = new ArrayList<Disco>();

    public static void cargarDiscosPorDefecto(){ //creo un par de dvds por defecto
        Disco dvd1 = new DVD("nemo","infantil",(short)20, true,"pixar","Leyenda");
        Disco dvd2 = new DVD("toy story","accion",(short)100, false,"pixar","Buenisima");
        Disco dvd3 = new DVD("monster inc","infantil",(short)55, true,"disney","Excelente");
        Disco dvd4 = new DVD("cars","aventura",(short)110, false,"pixar","Magnifica");
        Disco dvd5 = new DVD("soul","ciencia",(short)200, true,"pixar","preciosa");
        catalogoDisco.add(dvd1);
        catalogoDisco.add(dvd2);
        catalogoDisco.add(dvd3);
        catalogoDisco.add(dvd4);
        catalogoDisco.add(dvd5);

        Disco cd1 = new CD("The dark side of the moon","rock",(short)60,true,"Pink Floyd","Leyenda",(short)8);
        Disco cd2 = new CD("Live In Australia","pop",(short)70,true,"Elton John","Mistico",(short)9);
        Disco cd3 = new CD("Titulo B","genero B",(short)20,false,"Diana","Buenisimo",(short)8);
        Disco cd4 = new CD("A titulo","Genero A",(short)10,true,"Patricia","Genial",(short)8);
        catalogoDisco.add(cd1);
        catalogoDisco.add(cd2);
        catalogoDisco.add(cd3);
        catalogoDisco.add(cd4);
    }

    public static void nuevoDisco(byte tipoDisco) { //metodo que agrega un dvd

        System.out.println("Agregar Disco:");
        Disco nuevoDisco;

        if(tipoDisco == 1){
            nuevoDisco = new CD( Helper.ingresoStringValido("titulo"),
                    Helper.ingresoStringValido("genero"),
                    Helper.ingresoShortValido("tiempo"),
                    Helper.ingresoBooleanValido("si lo tiene:  True si lo tiene, False si no lo tiene."),
                    Helper.ingresoStringValido("Interprete"),
                    Helper.ingresoStringValido("comentario"),
                    Helper.ingresoShortValido("cantidad de canciones"));

        }else{
            nuevoDisco = new DVD(
                    Helper.ingresoStringValido("titulo"),
                    Helper.ingresoStringValido("genero"),
                    Helper.ingresoShortValido("tiempo"),
                    Helper.ingresoBooleanValido("si lo tiene:  True si lo tiene, False si no lo tiene."),
                    Helper.ingresoStringValido("director"),
                    Helper.ingresoStringValido("comentario"));
        }

        catalogoDisco.add(nuevoDisco);
        System.out.println("Se ingreso correctamente el nuevo Disco");
    }

    public static void eliminarDisco(byte tipoDisco) { //metodo que elimina un Disco
        String tituloEliminar = Helper.ingresoStringValido("titulo para eliminar"); //se ingresa un titulo para buscarlo y eliminar el Disco
        boolean encontrado = false;
        for(Disco disco : catalogoDisco){ //recorro todos los dvd
            if (disco.getTitulo().equalsIgnoreCase(tituloEliminar)){ //pregunto por cada Disco si es igual al titulo ingresado
                if((tipoDisco == 1 && disco instanceof CD) || (tipoDisco == 2 && disco instanceof DVD))
                catalogoDisco.remove(disco); //si encuentro el disco se elimina
                encontrado = true;
                System.out.println("Se elimino el Disco " + tituloEliminar);
                break; //se termina el for
            }
        }
        if(!encontrado){
            System.err.println("No se encontro un elemento con ese titulo");
        }
    }

    public static void modificarDisco(){
        String titulo = Helper.ingresoStringValido("titulo para modificar"); //se ingresa el titulo para modificar el dvd
        boolean encontrado = false;
        for(Disco midvd : catalogoDisco){ //se recorre la lista
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
                        4. modificar adquisicion Disco
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

    public static void mostrarTodosDiscos(byte tipoDisco){
        System.out.println("Mostrar todos los elementos:");
        for(Disco disco : catalogoDisco){ //recorro toda el arraylist
            if((tipoDisco == 1 && disco instanceof CD) || (tipoDisco == 2 && disco instanceof DVD))
                System.out.println(disco);
        }
        System.out.println("\n");
    }

    public static void mostrarDiscoQueTengo(byte tipoDisco){
        System.out.println("Mostrar todos los Dvd que tengo:");
        for(Disco disco : catalogoDisco){ //recorro todo el arraylist
            if(disco.isTengo()){ //pregunto si el Disco lo tengo
                if((tipoDisco == 1 && disco instanceof CD) || (tipoDisco == 2 && disco instanceof DVD))
                    System.out.println(disco); //si lo tengo se muestra
            }
        }
        System.out.println("\n");
    }
    public static void mostrarDiscoMenorTiempo(byte tipoDisco){
        short tiempoIngresado = Helper.ingresoShortValido("tiempo"); //ingreso el tiempo
        System.out.println("Los que tienen un tiempo menor a " + tiempoIngresado);
        for(Disco disco : catalogoDisco){ //recorro todo el arraylist
            if(disco.getTiempo() < tiempoIngresado){ //pregunto si el tiempo de un disco es menor al ingresado
                if((tipoDisco == 1 && disco instanceof CD) || (tipoDisco == 2 && disco instanceof DVD))
                    System.out.println(disco); //en caso de ser verdad se muestra
            }
        }
        System.out.println("\n");
    }
    public static void mostrarDvdPorDirector(){
        String director = Helper.ingresoStringValido("director"); //ingreso director
        System.out.println("Los dvd que tienen al director" + director);
        for(Disco unDisco : catalogoDisco){ //recorro todo el arraylist
            if(((DVD)unDisco).getDirector().equalsIgnoreCase(director)){
                if(unDisco instanceof DVD)
                    System.out.println(unDisco);
            }
        }
        System.out.println("\n");
    }

    public static void informarCantidadDVD(){
        short cantidad = 0;
        for(Disco disco : catalogoDisco){
            if (disco instanceof DVD)
                cantidad++;
        }
        System.out.println("El total de dvd en el catalogo es " + cantidad); //se muestra la cantidad contada previamente
    }

    public static void informarCantidadCD(){
        short cantidad = 0;
        for(Disco disco : catalogoDisco){
            if (disco instanceof CD)
                cantidad++;
        }
        System.out.println("El total de cd en el catalogo es " + cantidad); //se muestra la cantidad contada previamente
    }

    public static void informarCantidadDiscoQueTengo(byte tipoDisco){
    short contador = 0; //se declara e inicializa el contador en 0
        for(Disco unDisco : catalogoDisco){ //recorro el catalogo
            if (unDisco.isTengo() && ((unDisco instanceof  DVD && tipoDisco == 2) || (unDisco instanceof  CD && tipoDisco == 1)) ){ //pregunto si lo tengo
                contador++; //si lo tengo sumo uno al contador
            }
        }
        System.out.println("El total de elementos en el catalogo que tengo es " + contador); //muestro el contador
    }


    public static void ordenarXTitulo(){
        String aux[] = new String[catalogoDisco.size()]; //creo un array auxiliar
        for(int i = 0; i < catalogoDisco.size(); i++){ //recorro todo el catalogo
            aux[i] = catalogoDisco.get(i).getTitulo();//guardo el titulo de cada dvd en el array auxiliar
        }
        Arrays.sort(aux);//ordeno el array
        for(int i =0; i< aux.length;i++){ //recorro el array auxiliar
            System.out.println(aux[i]); //muestro el array con los titulos ya ordenados
        }
    }

    public static void cantidadDeCancionesCd(){
        String titulo = Helper.ingresoStringValido("titulo para mostrar cantidad de canciones de un cd");
        boolean encontrado = false;
        for(Disco disco : catalogoDisco)
        {
            if (disco.getTitulo().equalsIgnoreCase(titulo)) {
                if(disco instanceof CD){
                    encontrado = true;
                    System.out.println("El total de canciones dentro del cd " + titulo + " es " + ((CD)disco).getCantidadCanciones());
                }
            }
        }
        if(!encontrado){
            System.err.println("No se encontro un dvd con ese titulo");
        }
    }

}
