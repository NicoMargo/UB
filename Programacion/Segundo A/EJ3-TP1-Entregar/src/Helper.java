import java.util.Scanner;

public class Helper {

    private static Scanner scanner = new Scanner(System.in);

    public static short nuevaOperacion(){
        System.out.println("Ingrese la opcion a realizar:");
        System.out.println("1 = Ingresar nuevo disco");
        System.out.println("2 = Eliminar DVD por titulo");
        System.out.println("3 = Modificar DVD por titulo");
        System.out.println("4 = Listar todos los DVD");
        System.out.println("5 = Listar todos los DVD QUE TENGO");
        System.out.println("6 = Listar los DVD que duran menor a un tiempo en minutos");
        System.out.println("7 = Listar los DVD por director");
        System.out.println("8 = Listar todos los DVD ordenados por titulo");
        System.out.println("9 = Informe cantidad de DVD");
        System.out.println("10 =Informe cantidad de DVD que tengo");

        System.out.println("11 = Salir");

        short opcionIngresada = 0;
        boolean opcionCorrecta;
        do {
            try {
                opcionIngresada = scanner.nextShort();
                scanner.nextLine();
                if (opcionIngresada <1 && opcionIngresada > 11) {
                    System.out.println("Opcion invalida, por favor vuelva a ingresar");
                    opcionCorrecta = true;
                } else {
                    opcionCorrecta = false;
                }
            }catch (Exception e){
                opcionCorrecta = false;
                System.out.println("Opcion invalida, por favor vuelva a ingresar");
            }

        } while (opcionCorrecta);   //se repite el ingreso de opcion si o no hasta que sea valido

        return opcionIngresada;
    }

    public static boolean iniciarOperacion(short opcion){
        boolean seguir = true;
        switch(opcion){
            case 1:
                Catalogo.nuevoDVD();
                break;
            case 2:
                Catalogo.eliminarDVD();
                break;
            case 3:
                Catalogo.modificarDVD();
                break;
            case 4:
                Catalogo.mostrarTodosDvd();
                break;
            case 5:
                Catalogo.mostrarDvdQueTengo();
                break;
            case 6:
                Catalogo.mostrarDvdMenorTiempo();
                break;
            case 7:
                Catalogo.mostrarDvdPorDirector();
                break;
            case 8:
                System.out.println("Que lindo dia para ganar, no?");
                break;
            case 9:
                Catalogo.informarCantidadDVD();
                break;
            case 10:
                Catalogo.informarCantidadDVDQueTengo();
                break;
            case 11:
                System.out.println("Adios! Que tenga un grandioso dia :)");
                seguir = false;
                break;
            default:
                System.err.println("Opcion no valida");
                break;
        }
        return seguir;
    }


    public static String ingresoStringValido(String campo){
        System.out.println("Ingresar " + campo);
        String datoIngresado;
        boolean datoCorrecto = true;
        do{
            datoIngresado = scanner.nextLine();
            if (datoIngresado.equals("")){
                System.out.println("No se permiten valores vacios");
            }else {
                datoCorrecto = false;
            }
        }while(datoCorrecto);
        return  datoIngresado;
    }

    public static Short ingresoShortValido(String campo){
        System.out.println("Ingresar " + campo);
        short datoIngresado = 0;
        boolean datoCorrecto;
        do{
            try {
                datoIngresado = scanner.nextShort();
                scanner.nextLine();
                if(datoIngresado >= 0){
                    datoCorrecto = false;
                }else {
                    datoCorrecto = true;
                    System.out.print("No puede ser negativo");
                }
            }catch (Exception e){
                System.out.print("Opcion incorrecta, ingrese un valor valido");
                datoCorrecto = true;
            }
        }while(datoCorrecto);
        return  datoIngresado;
    }

    public static Boolean ingresoBooleanValido(String campo){
        System.out.println("Ingresar " + campo);
        boolean datoIngresado = false;
        boolean datoCorrecto;
        do{
            try {
                datoIngresado = scanner.nextBoolean();
                scanner.nextLine();
                datoCorrecto = false;
            }catch (Exception e){
                System.out.print("Opcion incorrecta, ingrese True o False");
                datoCorrecto = true;
            }
        }while(datoCorrecto);
        return  datoIngresado;
    }


}
