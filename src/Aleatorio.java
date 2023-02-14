
import java.util.Scanner;  
import java.util.Random;
public class Aleatorio {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner lectura = new Scanner(System.in);
        boolean moneda , eleccion;
        System.out.println("Eliga true para cara o false para sello");
        eleccion = lectura.nextBoolean();
        moneda = random.nextBoolean();
        if (eleccion == true && moneda == true) {
            System.out.println("la eleccion fue "+ eleccion+" y el resultado fue cara gano");
        }
        else if (eleccion == false && moneda == false) {
            System.out.println("la eleccion fue "+ eleccion+" y el resultado fue sello gano");
        }
        else{
            System.out.println("perdio");
        }
        lectura.close();
    }
    
}
