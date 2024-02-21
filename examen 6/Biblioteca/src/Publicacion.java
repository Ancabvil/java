public abstract class Publicacion {
    private String titulo;
    private int year;

    
    public String getTitulo() {
        return titulo;
    }
    public int getYear() {
        return year;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return "Título de la publicación=" + titulo + ", año de su publicación=" + year;
    }

    
}
