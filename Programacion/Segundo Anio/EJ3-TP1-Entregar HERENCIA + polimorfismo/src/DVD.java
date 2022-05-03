public class DVD extends Disco{

    private String director;
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }


    public DVD(){

    }

    public DVD(String titulo, String genero, short tiempo, boolean tengo, String director, String comentario) {
        super(titulo,genero, tiempo, tengo,comentario);
        this.director = director;
    }
    @Override
    public String mostrarDisco() //polimorfismo del metodo abstracto mostrar disco de la clase padre
    {
        return "- Titulo: " + super.getTitulo() + " Genero: " + super.getGenero() + " Director: " + this.director + " Duracion: " + super.getTiempo() + " Tengo: " + super.isTengo() + " Comentario: " + super.getComentario();
    }
}
