public class Libro extends Publicacion implements Prestable{
    
    private String isbn;
    private boolean prestado = false;
    

    public Libro() {
    }


    public Libro(String isbn, boolean prestado) {
        this.isbn = isbn;
        this.prestado = prestado;
        super.getTitulo();
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }


    @Override
    public String getTitulo() {
        return super.getTitulo();
    }


    @Override
    public int getYear() {
        return super.getYear();
    }

    @Override
    public void devuelve() {
        
    }

    @Override
    public boolean estaPrestado() {
        return false;
    }

    @Override
    public void presta() {
        
    }
    
    @Override
    public String toString() {
        
        return super.toString();
    }

   
  
    

}
