public class CD extends Disco {


    private String interprete;

    private short cantidadCanciones;

    public CD(String titulo, String genero, short tiempo, boolean tengo, String interprete, String comentario, short cantidadCanciones) {
        super(titulo,genero, tiempo, tengo,comentario);
        this.interprete = interprete;
        this.cantidadCanciones = cantidadCanciones;
    }

    public CD(){

    }
    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public short getCantidadCanciones() {
        return cantidadCanciones;
    }

    public void setCantidadCanciones(short cantidadCanciones) {
        this.cantidadCanciones = cantidadCanciones;
    }

    @Override
    public String mostrarDisco() //polimorfismo del metodo abstracto mostrar disco de la clase padre
    {
        return "- Titulo: " + super.getTitulo() + " Genero: " + super.getGenero() + " Interprete: " + this.interprete + " Duracion: " + super.getTiempo() + " Tengo: " + super.isTengo() + " Comentario: " + super.getComentario() + "Cantidad de canciones: " + this.cantidadCanciones;
    }
}
