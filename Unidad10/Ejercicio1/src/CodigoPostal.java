import java.util.ArrayList;

public class CodigoPostal {
    private int codigo;
    ArrayList<Integer> codigoPostal = new ArrayList<>();
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void añadirCodigo(ArrayList codigoPostal){
        codigoPostal.add(codigo);
    }

    public void eliminarCodigo(ArrayList codigoPostal){
        codigoPostal.remove(codigo);
    }

    @Override
    public String toString() {
        return ""+codigoPostal;
    }

}
