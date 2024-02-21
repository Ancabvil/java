import java.util.ArrayList;

public class CodigoPostal {
            ArrayList <Integer> codigoPostal = new ArrayList<>();

            public CodigoPostal(ArrayList<Integer> codigoPostal) {
                this.codigoPostal = codigoPostal;
            }

            public ArrayList<Integer> getCodigoPostal() {
                return codigoPostal;
            }

            public void setCodigoPostal(ArrayList<Integer> codigoPostal) {
            
                this.codigoPostal = codigoPostal;
            System.out.println("Introduzca el Código Postal:");
            int ciudad = Integer.parseInt(System.console().readLine());
            codigoPostal.add(ciudad);
            }
            @Override
            public String toString() {
                return "CodigoPostal= " + codigoPostal;
            }
}
