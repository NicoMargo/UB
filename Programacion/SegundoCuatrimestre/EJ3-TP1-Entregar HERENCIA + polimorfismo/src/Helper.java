import java.util.Scanner;

public class Helper {

    private static Scanner scanner = new Scanner(System.in);

    public static short elegirCatalogo(){
        System.out.println("Ingrese la opcion a realizar");
        System.out.println("-----------------------------");
        System.out.println("1 = Catalogo CD");
        System.out.println("2 = Catalogo DVD");
        System.out.println("3 = salir");

        short opcionIngresada = 3;
        boolean opcionIncorrecta;

        do {
            try {
                opcionIngresada = scanner.nextShort(); //se ingresa la opcion
                scanner.nextLine();
                if (opcionIngresada <1 && opcionIngresada > 3) { //si la opcon no es valida tira error
                    System.out.println("Opcion invalida, por favor vuelva a ingresar");
                    opcionIncorrecta = true;
                } else {
                    opcionIncorrecta = false;
                }
            }catch (Exception e){
                opcionIncorrecta = true;
                scanner.nextLine();
                System.out.println("Opcion invalida, por favor vuelva a ingresar");
            }

        } while (opcionIncorrecta);   //se repite el ingreso de opcion si o no hasta que sea valido

        if(opcionIngresada == 1){
            System.out.println("Bienvenido a su catalogo de CD");
        }else if(opcionIngresada == 2){
            System.out.println("Bienvenido a su catalogo de DVD");
        }else if (opcionIngresada == 3){
            System.out.println("Gracias por usar el programa, nos vemos!!");
        }

        return opcionIngresada;
    }

    public static short nuevaOperacionDVD(){
        System.out.println("Ingrese la opcion a realizar:");
        System.out.println("1 = Ingresar nuevo DVD");
        System.out.println("2 = Eliminar DVD por titulo");
        System.out.println("3 = Modificar DVD por titulo");
        System.out.println("4 = Listar todos los DVD");
        System.out.println("5 = Listar todos los DVD QUE TENGO");
        System.out.println("6 = Listar los DVD que duran menor a un tiempo en minutos");
        System.out.println("7 = Listar los DVD por director");
        System.out.println("8 = Listar todos los DVD ordenados por titulo");
        System.out.println("9 = Informe cantidad de DVD");
        System.out.println("10 =Informe cantidad de DVD que tengo");
        System.out.println("11 =Listar DVD ordenados por genero");
        System.out.println("12 =Listar DVD ordenados por tiempo");
        System.out.println("13 = Salir");

        short opcionIngresada = 0;
        boolean opcionIncorrecta;
        do {
            try {
                opcionIngresada = scanner.nextShort();  // se ingresa la operacion
                scanner.nextLine();
                if (opcionIngresada <1 && opcionIngresada > 13) { //pregunto si la opcion es valida
                    System.out.println("Opcion invalida, por favor vuelva a ingresar");
                    opcionIncorrecta = true;
                } else {
                    opcionIncorrecta = false;
                }
            }catch (Exception e){
                opcionIncorrecta = true;
                scanner.nextLine();
                System.out.println("Opcion invalida, por favor vuelva a ingresar");
            }

        } while (opcionIncorrecta);   //se repite el ingreso de opcion si o no hasta que sea valido

        return opcionIngresada;
    }

    public static boolean iniciarOperacionDVD(short opcion, short catalogo){ //se recive como parametro el numero de opcion y se ejecuta
        boolean seguir = true;
        switch(opcion){
            case 1:
                CatalogoDisco.nuevoDisco(catalogo);
                break;
            case 2:
                CatalogoDisco.eliminarDisco(catalogo);
                break;
            case 3:
                CatalogoDisco.modificarDisco(catalogo);
                break;
            case 4:
                CatalogoDisco.mostrarTodosDiscos(catalogo);
                break;
            case 5:
                CatalogoDisco.mostrarDiscoQueTengo(catalogo);
                break;
            case 6:
                CatalogoDisco.mostrarDiscoMenorTiempo(catalogo);
                break;
            case 7:
                CatalogoDisco.mostrarDvdPorDirector();
                break;
            case 8:
                CatalogoDisco.ordenarXTitulo(catalogo);
                break;
            case 9:
                CatalogoDisco.informarCantidadDVD();
                break;
            case 10:
                CatalogoDisco.informarCantidadDiscoQueTengo(catalogo);
                break;
            case 11:
                CatalogoDisco.ordenarXGenero(catalogo);
                break;
            case 12:
                CatalogoDisco.ordenarXTiempo(catalogo);
                break;
            case 13:
                seguir = false;
                break;
            default:
                System.err.println("Opcion no valida");
                break;
        }
        return seguir;
    }

    public static short nuevaOperacionCD(){  //identico a DVD pero CD
        System.out.println("Ingrese la opcion a realizar:");
        System.out.println("1 = Ingresar nuevo CD");
        System.out.println("2 = Eliminar CD por titulo");
        System.out.println("3 = Modificar CD por titulo");
        System.out.println("4 = Listar todos los CD");
        System.out.println("5 = Listar todos los CD QUE TENGO");
        System.out.println("6 = Listar los CD que duran menor a un tiempo en minutos");
        System.out.println("7 = Listar los CD por Interprete");
        System.out.println("8 = Listar todos los CD ordenados por titulo");
        System.out.println("9 = Informe cantidad de CD");
        System.out.println("10 =Informe cantidad de CD que tengo");
        System.out.println("11 =Informe cantidad de canciones de un CD");
        System.out.println("12 =Listar CD ordenados por genero");
        System.out.println("13 =Listar CD ordenados por tiempo");
        System.out.println("14 = Salir");

        short opcionIngresada = 0;
        boolean opcionCorrecta;
        do {
            try {
                opcionIngresada = scanner.nextShort();
                scanner.nextLine();
                if (opcionIngresada <1 && opcionIngresada > 12) {
                    System.out.println("Opcion invalida, por favor vuelva a ingresar");
                    opcionCorrecta = true;
                } else {
                    opcionCorrecta = false;
                }
            }catch (Exception e){
                opcionCorrecta = false;
                scanner.nextLine();
                System.out.println("Opcion invalida, por favor vuelva a ingresar");
            }

        } while (opcionCorrecta);   //se repite el ingreso de opcion si o no hasta que sea valido

        return opcionIngresada;
    }

    public static boolean iniciarOperacionCD(short opcion, short catalogo){ //Identico a dvd pero CD
        boolean seguir = true;
        switch(opcion){
            case 1:
                CatalogoDisco.nuevoDisco(catalogo);
                break;
            case 2:
                CatalogoDisco.eliminarDisco(catalogo);
                break;
            case 3:
                CatalogoDisco.modificarDisco(catalogo);
                break;
            case 4:
                CatalogoDisco.mostrarTodosDiscos(catalogo);
                break;
            case 5:
                CatalogoDisco.mostrarDiscoQueTengo(catalogo);
                break;
            case 6:
                CatalogoDisco.mostrarDiscoMenorTiempo(catalogo);
                break;
            case 7:
                CatalogoDisco.mostrarCDPorInterprete();
                break;
            case 8:
                CatalogoDisco.ordenarXTitulo(catalogo);
                break;
            case 9:
                CatalogoDisco.informarCantidadCD();
                break;
            case 10:
                CatalogoDisco.informarCantidadDiscoQueTengo(catalogo);
                break;
            case 11:
                CatalogoDisco.cantidadDeCancionesCd();
                break;
            case 12:
                CatalogoDisco.ordenarXGenero(catalogo);
                break;
            case 13:
                CatalogoDisco.ordenarXTiempo(catalogo);
                break;
            case 14:
                seguir = false;
                break;
            default:
                System.err.println("Opcion no valida");
                break;
        }
        return seguir;
    }


    public static String ingresoStringValido(String campo){
        System.out.println("Ingresar " + campo); //Se muestra por pantalla lo que se quiere ingresar
        String datoIngresado;
        boolean datoIncorrecto = true; //Booleano si el dato ingresado es correcto
        do{
            datoIngresado = scanner.nextLine();
            if (datoIngresado.equals("")){ //pregunto si el dato ingresado es vacio
                System.out.println("No se permiten valores vacios");
            }else {
                datoIncorrecto = false;
            }
        }while(datoIncorrecto); //se repite la entrada de dato hasta que no sea vacio
        return  datoIngresado;
    }

    public static Short ingresoShortValido(String campo){
        System.out.println("Ingresar " + campo);
        short datoIngresado = 0;
        boolean datoIncorrecto;  //booleano que indica si el dato ingredado es incorrecto
        do{
            try {
                datoIngresado = scanner.nextShort();
                scanner.nextLine();
                if(datoIngresado >= 0){ //pregunto si el dato es mayor a 0
                    datoIncorrecto = false; //el dato es correcto
                }else {
                    datoIncorrecto = true; // si es negativo se le informa al usuario
                    System.out.print("No puede ser negativo\n");
                }
            }catch (Exception e){ //si salta al catch por el ingreso de un caracter no numerico se informa que la opcion es incorrecta
                System.out.print("Opcion incorrecta, ingrese un valor valido\n");
                scanner.nextLine();
                datoIncorrecto = true;
            }
        }while(datoIncorrecto); //se repite mientras el dato incorrecto sea true
        return  datoIngresado;
    }

    public static Boolean ingresoBooleanValido(String campo){
        System.out.println("Ingresar " + campo);
        boolean datoIngresado = false;
        boolean datoIncorrecto; //booleano que indica si el dato ingredado es incorrecto
        do{
            try {
                datoIngresado = scanner.nextBoolean();
                scanner.nextLine();
                datoIncorrecto = false;
            }catch (Exception e){
                System.out.print("Opcion incorrecta, ingrese True o False\n");
                scanner.nextLine();
                datoIncorrecto = true;
            }
        }while(datoIncorrecto); //se repite el ingreso de datos mientras sea correcto
        return  datoIngresado;
    }

}
