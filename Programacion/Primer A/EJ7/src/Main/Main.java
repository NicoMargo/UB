package Main;

public class Main {

    public static void main(String []args) {

        System.out.println("Bienvenido Al juego de Craps"); 

        while(Helper.nuevoJuego()){ //pregunta si se quiere iniciar un nuevo juego
            Helper.nuevaApuesta(); //se realiza una nueva apuesta

            if(Helper.primerTiro()){ //se realiza el primer tiro, si no termino el juego el programa sigue
                while(Helper.tirarDados()){ //se tiran los dados hasta que se termine el juego
                    Helper.charla(); // se le da charla al jugador
                }
            }
        }
    }
}

