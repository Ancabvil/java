import java.util.ArrayList;
public class Diccionario {
    
    private String palabra;
    private String significado;
    
    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    ArrayList <Diccionario> diccionario = new ArrayList<>();

    public String getSignificado() {
        diccionario.get(0);
        return significado;
    }

    public void setSignificado(String significado) {
        this.significado = significado;
    }

    public ArrayList<Diccionario> getDiccionario() {
        return diccionario;
    }

    public void setDiccionario(ArrayList<Diccionario> diccionario) {
        this.diccionario.add(0, null);
    }


}
