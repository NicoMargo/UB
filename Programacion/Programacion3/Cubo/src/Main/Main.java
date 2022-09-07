package Main;

public class Main {
    public static void main(String[] args) {
        Cubo elCubo = new Cubo(Helper.menuCrearCubo());
        short opcion;
        do {
            elCubo.mostrarCubo();
            opcion = Helper.nuevaOperacionCubo();
        }while (Helper.iniciarOperacionCubo(opcion, elCubo));
        System.out.println("Muchas gracias por utilizar el programa!!");
    }
}
