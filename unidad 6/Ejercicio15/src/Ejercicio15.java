public class Ejercicio15 {
    public static void main(String[] args) throws Exception {
        System.out.println("Melodía");
        
        int estrofa =4 * (int)(Math.random()*7+1 );
        int contador = 0;
                String notasEscritas="";
                String nota= "";
        for( contador = 0 ; contador <= estrofa; contador++){
        switch ((int)(Math.random()*7)) {
            case 1:
                notasEscritas = " do ";
                break;
            case 2:
                notasEscritas = " re ";
                break;
            case 3:
                notasEscritas = " mi ";
                break;
            case 4:
                notasEscritas = " fa ";
                break;
            case 5:
                notasEscritas = " sol ";
                break;
            case 6: 
                notasEscritas = " la ";
                break;
            case 7:
                notasEscritas = " si ";
                break;
            default:
                break;
        }
        if(contador==1){
            notasEscritas = nota;
        }
        if(contador==nota){
            nota = notasEscritas;
        }
        System.out.print(nota + " ");
        if ( contador == nota ) {
            System.out.print("||");
            } else if ( contador % 4 == 0 ) {
            System.out.print("| ");
            }
   
    }

}
}




    

