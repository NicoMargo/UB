package Main;

import java.util.Scanner;

public class Helper {
    private static Scanner scanner = new Scanner(System.in);

    public static short[] menuCrearCubo(){
        short[] dimensionCubo = new short[3];
        System.out.println("Bienvenido al programa");
        System.out.println("-----------------------------");

        dimensionCubo[0] = ingresoShortValidoPositivo("Ingrese el ancho del cubo");

        dimensionCubo[1] = ingresoShortValidoPositivo("Ingrese el alto del cubo");

        dimensionCubo[2] = ingresoShortValidoPositivo("Ingrese la profundidad del cubo");

        System.out.println("Su cubo se creo correctamente");

        return dimensionCubo;
    }

    public static short nuevaOperacionCubo(){
        System.out.println("Ingrese la opcion a realizar:");
        System.out.println("1 = Cargar dato con las coordenadas en lugares vacios");
        System.out.println("2 = Modificar dato con las coordenadas");
        System.out.println("3 = Anular dato por coordenada");
        System.out.println("4 = Nulos (Mostrar todas las posiciones anuladas)");
        System.out.println("5 = Alea (Cargar todo el cubo con datos aleatorios)");
        System.out.println("6 = Salir");


        short opcionIngresada = 0;
        boolean opcionIncorrecta;
        do {
            try {
                opcionIngresada = ingresoShortValidoPositivo("");
                if (opcionIngresada <1 && opcionIngresada > 7) { //pregunto si la opcion es valida
                    System.out.println("Opcion invalida, por favor vuelva a ingresar");
                    opcionIncorrecta = true;
                } else {
                    opcionIncorrecta = false;
                }
            }catch (Exception e){
                opcionIncorrecta = true;
                System.out.println("Opcion invalida, por favor vuelva a ingresar");
            }

        } while (opcionIncorrecta);   //se repite el ingreso de opcion si o no hasta que sea valido

        return opcionIngresada;
    }

    public static boolean iniciarOperacionCubo(short opcion){ //se recive como parametro el numero de opcion y se ejecuta
        boolean seguir = true;
        switch(opcion){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
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

    public static Short ingresoShortValidoPositivo(String campo){
        System.out.println(campo);
        short datoIngresado = 0;
        boolean datoIncorrecto;  //booleano que indica si el dato ingredado es incorrecto
        do{
            try {
                datoIngresado = scanner.nextShort();
                scanner.nextLine();
                if(datoIngresado > 0){ //pregunto si el dato es mayor a 0
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
    public static Short ingresoShortValidoNeutro(String campo){
        System.out.println(campo);
        short datoIngresado = 0;
        boolean datoIncorrecto;  //booleano que indica si el dato ingredado es incorrecto
        do{
            try {
                datoIngresado = scanner.nextShort();
                scanner.nextLine();
                if(datoIngresado > 0){ //pregunto si el dato es mayor a 0
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

