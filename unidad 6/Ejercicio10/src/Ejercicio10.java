public class Ejercicio10 {
    public static void main(String[] args) throws Exception {
        System.out.println("Columnas de caracteres.");
    

        for (int i = 1; i <= 10; i++ ){
            System.out.println();
            int tamaño = (int)(Math.random()*40)+1;
        for(int j = 1; j <=tamaño; j++){
            String signo="";
            int caracteres = (int)(Math.random()*5)+1;
            switch (caracteres) {
        case 0:
            signo = "*";
            break;
        case 1:
            signo = "-";
            break;
        case 2: 
            signo = "=";
            break;
        case 3: 
            signo = ".";
            break;
        case 4: 
            signo = "|";
            break;
        case 5:
            signo = "@";
            break;
        default:
            break;
                    }
                System.out.print(signo);             
                }
        }
    
    
    
    
    
    
    
    
    }
}
