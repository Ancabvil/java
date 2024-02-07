public class Pizza  {
    private static int totalPedidas = 0;
    private static int getTotalServidas=0;
    
    String tipo;
    String tamano;
    String estado;

    public Pizza(String tipo, String tamano){
        this.tipo = tipo;
        this.tamano = tamano;
        this.estado = "pedida";
        Pizza.totalPedidas++;

    }
    public String toString(){
        return"pizza " + this.tipo + " " + this.tamano + " /" + this.estado;
    }

    public static int getTotalPedidas(){
        return Pizza.totalPedidas;
    }
    public static int getTotalServidas(){
        return Pizza.getTotalServidas;
    }
    public void sirve(){
        if (this.estado.equals("pedida")) {
            this.estado="servida";
            Pizza.getTotalServidas++;
        }else{
            System.out.println("La pizza ya se ha servido");
        }
    }
}
