public class Main {
    public static void main(String []args) {
        System.out.println("Bienvenido a su catalogo de peliculas");
        Catalogo.cargarPeliculasporDefecto();
        short operacion;
        do{
            operacion = Helper.nuevaOperacion();

        }while(Helper.iniciarOperacion(operacion));

    }
}
