package Main;

public class Main {
    public static void main(String[] args) {
        System.err.println("test");
        Cubo elCubo = new Cubo(Helper.menuCrearCubo());
        while (Helper.iniciarOperacionCubo(Helper.nuevaOperacionCubo())) {

        }
        System.out.println("Muchas gracias por utilizar el programa!!");
    }
}
