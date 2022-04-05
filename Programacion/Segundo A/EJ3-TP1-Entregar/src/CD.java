public class CD {

    private String titulo;
    private String genero;
    private short tiempo;
    private boolean tengo;
    private String interprete;
    private String comentario;
    private short cantidadCanciones;

    public CD(String titulo, String genero, short tiempo, boolean tengo, String interprete, String comentario, short cantidadCanciones) {
        this.titulo = titulo;
        this.genero = genero;
        this.tiempo = tiempo;
        this.tengo = tengo;
        this.interprete = interprete;
        this.comentario = comentario;
        this.cantidadCanciones = cantidadCanciones;
    }

    public CD(){

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

    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public short getCantidadCanciones() {
        return cantidadCanciones;
    }

    public void setCantidadCanciones(short cantidadCanciones) {
        this.cantidadCanciones = cantidadCanciones;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



    @Override
    public String toString()
    {
        return "- Titulo: " + this.titulo + " Genero: " + this.genero + " Interprete: " + this.interprete + " Duracion: " + this.tiempo + " Tengo: " + this.tengo + " Comentario: " + this.comentario + "Cantidad de canciones: " + this.cantidadCanciones;
    }
}
