package estructurasdedatos;
import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        int[] vector1;
        vector1 = new int[10];
        int[] vector = {30,50,25,85,12,6,32,41,23,63};
        Scanner lectura = new Scanner(System.in);
        for(int i=0; i<vector.length;i++){
            System.out.println("digite el dato de la posicion "+i);
            vector1[i]=lectura.nextInt();
        }
        for(int i :vector){
            System.out.println(i);
        }
        lectura.close();
    }
}
