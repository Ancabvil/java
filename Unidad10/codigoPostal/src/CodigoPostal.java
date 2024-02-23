public class CodigoPostal {
        private String codigoPostal;
        private String provincia;
        
        public CodigoPostal(String codigoPostal, String provincia) {
            this.codigoPostal = codigoPostal;
            this.provincia = provincia;
        }
        
        public String getCodigoPostal() {
            return codigoPostal;
        }
        
        public String getProvincia() {
            return provincia;
        }
        
        public void setCodigoPostal(String codigoPostal) {
            this.codigoPostal = codigoPostal;
        }
    }