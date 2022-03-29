public class DVD {
    private String titulo;
    private String genero;
    private short tiempo;
    private boolean tengo;
    private String director;
    private String comentario;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public short getTiempo() {
        return tiempo;
    }

    public void setTiempo(short tiempo) {
        this.tiempo = tiempo;
    }

    public boolean isTengo() {
        return tengo;
    }

    public void setTengo(boolean tengo) {
        this.tengo = tengo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public DVD(){

    }

    public DVD(String titulo, String genero, short tiempo, boolean tengo, String director, String comentario) {
        this.titulo = titulo;
        this.genero = genero;
        this.tiempo = tiempo;
        this.tengo = tengo;
        this.director = director;
        this.comentario = comentario;
    }
}
