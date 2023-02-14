import java.util.Scanner;  
public class Entero {
    public static void main(String[] args) {
        int number ;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Digite un numero");
        number = lectura.nextInt();
        if (number > 0) {
            System.out.println("el numero es mayor "+ number);
        }
        else if (number == 0) {
            System.out.println("el numero es neutro"+ number);
        }
        else{
            System.out.println("el numero es negativo"+ number);
        }
        
        lectura.close();
    }
    
}
