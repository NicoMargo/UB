package Main;

import java.util.Scanner;

public class Helper {
    private static Scanner scanner = new Scanner(System.in);

    public static short elegirPila(){
        System.out.println("Ingrese la opcion a realizar");
        System.out.println("-----------------------------");
        System.out.println("1 = Pila Estatica");
        System.out.println("2 = Pila Dinamica");
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
            System.out.println("Bienvenido a su Pila Estatica");
        }else if(opcionIngresada == 2){
            System.out.println("Bienvenido a su Pila Dianmica");
        }else if (opcionIngresada == 3){
            System.out.println("Gracias por usar el programa, nos vemos!!");
        }

        return opcionIngresada;
    }

    public static short nuevaOperacionEstatica(){
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

    public static boolean iniciarOperacionDVD(short opcion){ //se recive como parametro el numero de opcion y se ejecuta
        boolean seguir = true;
        switch(opcion){

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
