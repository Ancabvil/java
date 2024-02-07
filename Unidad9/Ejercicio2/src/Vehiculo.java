public abstract class Vehiculo {
    private static int vehiculosCreados=0;
    private static int kilometrosTotal=0;

    private int kilometrosRecorridos;

    public Vehiculo(){
        this.kilometrosRecorridos = 0;
    }
    
    public int getkilometrosRecorridos(){
        return this.kilometrosRecorridos;
    }

    public static int getkilometrosTotales(){
        return Vehiculo.kilometrosTotal;
    }

    public void recorre(int k){
        this.kilometrosRecorridos +=k;
        Vehiculo.kilometrosTotal +=k;
    }
}
