package Main;

import java.util.Random;
import java.util.Scanner;

public class Helper {

    private static Scanner scanner = new Scanner(System.in);
    private static String opcionIngresada;
    private static Jugador miJugador = new Jugador();
    private static short puntoJugador;
    private static short dadosResultado;
    private static double apuesta;

    static boolean nuevoJuego(){

        boolean juegoOpcion = true;
        if(miJugador.getSaldoBanco() > 0) { //chequeo que el jugador tenga saldo para jugar. 
            System.out.println("Esta listo para comenzar un nuevo juego? si o no");

            do {
                opcionIngresada = scanner.nextLine();
                if (!opcionIngresada.equals("si") && !opcionIngresada.equals("no")) {
                    System.out.println("Opcion invalida, por favor vuelva a ingresar");
                }

            } while (!opcionIngresada.equals("si") && !opcionIngresada.equals("no"));   //se repite el ingreso de opcion si o no hasta que sea valido

            if (opcionIngresada.equals("no")) {
                juegoOpcion = false;
            } //si el usuario dice no se termina el juego
        }else{
            juegoOpcion = false;
            System.out.println("Se quedo sin fondos para jugar, el juego se cerrara. Adios :)");
        }

        return juegoOpcion;

    }

    public static void nuevaApuesta(){
        boolean apuestaCorrecta = true;
        System.out.println("Ingrese una nueva apuesta, usted tiene un saldo en el banco de $"+miJugador.getSaldoBanco());

        do{
            try {
                apuesta = scanner.nextDouble();
                if (apuesta <= 0 || apuesta > miJugador.getSaldoBanco()) { //chequeo que sea una apuesta valida
                    System.out.println("Apuesta invalida, por favor ingrese una apuesta mayor a 0 y menor o igual a su saldo de banco");
                } else {
                    miJugador.setSaldoBanco(miJugador.getSaldoBanco() - apuesta);
                    System.out.println("Muy bien! usted realizo una apuesta de $" + apuesta + "\nAhora tiene un saldo de $" + miJugador.getSaldoBanco());
                    apuestaCorrecta = false;
                }
            }catch (Exception e){ //si el usuario ingreso un caracter que no es dobule salta al catch y se repite el ingreso de la apuesta
                System.out.println("Apuesta invalida, por favor ingrese una apuesta mayor a 0 y menor o igual a su saldo de banco");
            }
            scanner.nextLine();

        }while(apuestaCorrecta); // se repite el ingreso de la apuesta hasta que sea valida


    }

    public static boolean primerTiro(){
        dadosResultado = miJugador.tirarDados(); //se tiran los dados
        boolean juegoTerminado = false;
        if(dadosResultado == 7 || dadosResultado == 11){ //chequea si el jugador gana la partida
            juegoTerminado(true, dadosResultado);

        }else if (dadosResultado == 2 || dadosResultado == 3 || dadosResultado == 12){//chequea si el jugador pierde la partida
            juegoTerminado(false, dadosResultado);

        }else{ 
            puntoJugador = dadosResultado;
            juegoTerminado= true;
            System.out.println("Sigue jugando! su primer tiro fue un " + dadosResultado);

        }
        return juegoTerminado;

    }

    public static boolean tirarDados(){
        boolean juegoTerminado = false;
        dadosResultado = miJugador.tirarDados();
        if(dadosResultado == 7){ //chequea si el jugador pierde la partida
            juegoTerminado(false, dadosResultado);

        }else if(dadosResultado == puntoJugador){  //chequea si el jugador gana la partida
            juegoTerminado(true, dadosResultado);

        }else{
            juegoTerminado = true;
        }

        return juegoTerminado;
    }

    public static void charla(){ //metodo que da charla random xdddd
        Random random = new Random();
        int numeroRandom = random.nextInt(8);
        switch(numeroRandom){
            case 0:
                System.out.println("Hoy es su dia de suerte, este sera su tiro ganador");
                break;
            case 1:
                System.out.println("Ya sabe que va a comprar con el dinero que gane?");
                break;
            case 2:
                System.out.println("Va a comprar criptomonedas con ese dinero?");
                break;
            case 3:
                System.out.println("Un tiro mas y ganara la jugada!");
                break;
            case 4:
                System.out.println("Se esta yendo a la quiebra? Siga jugando! ");
                break;
            case 5:
                System.out.println("Siga jugando craps para darle una buena educacion a sus hijos");
                break;
            case 6:
                System.out.println("Oh, vamos, arriesguese!");
                break;
            case 7:
                System.out.println("Que lindo dia para ganar, no?");
                break;
        }
        System.out.println("Sigue jugando! su tiro fue un " + dadosResultado);


    }

    private static void juegoTerminado(boolean gano, short resultadoDados ){ //Metodo que da aviso si se gano o perdio la partida.
        if(gano){
            miJugador.setSaldoBanco((miJugador.getSaldoBanco()+(apuesta*2)));
            System.out.println("Felicidades usted gano! Su tiro fue un " + dadosResultado+"\nUsted gano $"+ (apuesta*2));
        }else{
            System.out.println("Nooo mal ahi que perdio amigo! Su tiro fue un " + dadosResultado+"\nUsted perdio $"+ (apuesta));
        }
    }
}
