package Main;

import java.util.Scanner;

public class Helper {

    private static Scanner scanner = new Scanner(System.in);
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

    public static int ingresoIntValido(String campo){
        System.out.println("Ingresar " + campo);
        int datoIngresado = 0;
        boolean datoIncorrecto;  //booleano que indica si el dato ingredado es incorrecto
        do{
            try {
                datoIngresado = scanner.nextInt();
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

}
