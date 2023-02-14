import java.util.Scanner;  

public class Age {
    public static void main(String[] args) {
        int age;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Digite su edad");
        age = lectura.nextInt();
        if (age >= 18) {
            System.out.println("Bienvenido puede ingresar");
        }
        else{
            System.out.println("No puede ingresar");
        }
        
        lectura.close();   
    }
    
    
}
