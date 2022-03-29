import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private static List<DVD> catalogoDvd = new ArrayList<DVD>();
    public static void nuevoDVD(){
        short tiempo = 0;
        boolean opcionCorrecta;

        System.out.println("Agregar DVD:");
        DVD nuevoDvd = new DVD();

        nuevoDvd.setTitulo(Helper.ingresoStringValido("titulo"));

        nuevoDvd.setGenero(Helper.ingresoStringValido("genero"));

        nuevoDvd.setDirector(Helper.ingresoStringValido("director"));

        nuevoDvd.setComentario(Helper.ingresoStringValido("comentario"));

        nuevoDvd.setTiempo(Helper.ingresoShortValido("tiempo"));

        nuevoDvd.setTengo(Helper.ingresoBooleanValido("si lo tiene:  True si lo tiene, False si no lo tiene."));

        catalogoDvd.add(nuevoDvd);
        System.out.println("Se ingreso correctamente el nuevo DVD");
    }

    public static DVD buscarDVDPorTitulo(){
        
    }

}
