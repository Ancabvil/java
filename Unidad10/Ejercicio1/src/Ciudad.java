import java.util.ArrayList;

public class Ciudad {
    
        ArrayList <String> ciudad = new ArrayList<>();

        public Ciudad(ArrayList<String> ciudades) {
            this.ciudad = ciudades;
        }
        public ArrayList<String> getCiudades() {
            System.out.println("Introzca posición: ");
            int pos = Integer.parseInt(System.console().readLine());
            ciudad.get(pos);
            return ciudad;
        }
        public void setCiudades(ArrayList<String> ciudad) {
            this.ciudad = ciudad;
            System.out.println("Introduzca la ciudad: ");
            String city = System.console().readLine();
            ciudad.add(city);
            
        }
        @Override
        public String toString() {
            return "Ciudad = " + ciudad;
        }
        
}
