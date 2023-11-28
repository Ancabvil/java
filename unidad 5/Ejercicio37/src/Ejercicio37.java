public class Ejercicio37 {
    public static void main(String[] args) throws Exception {
        System.out.println("Conversor de decimal a palotes.");
 /*      long numeroIntro;
        do{
        System.out.print("Introduzca un número decimal positivo: ");
        numeroIntro=Integer.parseInt(System.console().readLine());
       }    while(numeroIntro<1);
    System.out.print(numeroIntro +  " = ");

        Long numero = numeroIntro;
        long numDig =0;
        long numReves=0;
   
        while (numero >0){
            numReves = ((numReves*10) + (numero%10));
            numDig++;
        }
        long cifra= 0;
        for (int i = 0; i < numDig; i++){
            cifra = numReves%10;
            numReves /=10;
            for(int j = 0; j < cifra; j++){
                System.out.print("|");
            }
            if (i < numDig-1){
                System.out.print("-");
            }
        }
}}*/
int num;
do {
System.out.print("Introduce un número entero positivo: ");
num = Integer.parseInt(System.console().readLine());
} while (num < 1);
System.out.print(num + " = ");
// Cuenta los números y calcula el reves
int aux = num;
int numDig = 0;
int numReves = 0;
while (aux > 0){
numReves = ((numReves*10) + (aux % 10));
aux /=10;
numDig++;
}
int cifra = 0;
// Separa las cifras y escribe los palitos
for (int i = 0; i < numDig; i++){
cifra = numReves%10;
numReves /= 10;
for (int j = 0; j < cifra; j++){
System.out.print("|");
}
if (i < numDig-1){
System.out.print("-");
}
}
}
}