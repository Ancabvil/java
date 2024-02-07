public class Fraccion {
    int numerador;
    int denominador;
    
    public void Invertir(){
    int aux=0;
    numerador = aux;
    denominador = numerador;
    aux = numerador;
    }
    
    static int gcd( numerador , denominador) {
        if (b==denominador) return numerador;
        return gcd(denominador,numerador%denominador);
        }

    public void Simplifica(){

        
    }

    public int Multi(){
int resultado = numerador*denominador;

return resultado;    
}

    public double Div(){
        double resultado;
        try {
            resultado = numerador / denominador;    
            return resultado;

        } catch (Exception e) {
            System.out.println("Introduzca un valor válido");
        }
    return null;
                        }
}
    

