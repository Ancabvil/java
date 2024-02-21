public class Libreto {
    //Aquí declaro las variables privadas para que no se puedan tocar sin setter o getter
    private int identificador;
    private String titulo;
    private int anyoPublicación;
    
    //He creado dos clases, una vacia que es la que voy a usar y otra completa por si luego se quisiera invocar.
    public Libreto(int identificador, String titulo, int anyoPublicación) {
        this.identificador = identificador;
        this.titulo = titulo;
        this.anyoPublicación = anyoPublicación;
    }

    public Libreto(){

    }

//Implemento todos los setter y getter
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public void setAnyoPublicación(int anyoPublicación) {
        this.anyoPublicación = anyoPublicación;
    }


    public int getIdentificador() {
        return identificador;
    }


    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }


    public String getTitulo() {
        return titulo;
    }


    public int getAnyoPublicación() {
        return anyoPublicación;
    }

    //Aquí invoco al metodo toString de String para escribir luego todo en un println
    @Override
    public String toString() {
        return "Identificador del libreto " + identificador + ", titulado " + titulo + " y publicado en " + anyoPublicación;
    }

    
    }

