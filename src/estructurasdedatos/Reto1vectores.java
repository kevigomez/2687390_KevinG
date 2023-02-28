package estructurasdedatos;
import java.util.Scanner;

public class Reto1vectores {
    public static void main(String[] args) throws Exception{
        double[] vector1 ;
        double acum=0;
        Scanner lectura = new Scanner(System.in);
        System.out.println("digite el numero de notas ");
        int numNotes = lectura.nextInt();
        vector1 = new double[numNotes];

        for(int i=0; i<vector1.length;i++){
            System.out.println("digite el dato de la nota ");
            vector1[i]=lectura.nextInt();
            acum = acum+vector1[i];
        }
        double prom = acum / numNotes;
        System.out.println("su promedio es de "+prom);
        lectura.close();
        if (prom >= 30 && prom <=40) {
            System.out.println("su promedio es "+prom+"paso");  
        }
        else if(prom >= 41){
            System.out.println("su promedio es "+prom+"paso con buenos resultados");
        }
        else if(prom < 30){
            System.out.println("su promedio es "+prom+"perdio");       }
            else {
                System.out.println("no se");
            }   
        }
    
}
