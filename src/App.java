import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        int number1 ,number2, result;
        System.out.println("Ingrese un numero");
        number1 = lectura.nextInt();
        System.out.println("El numero que ingresanste es " + number1);
        System.out.println("Ingrese otro numero");
        number2 = lectura.nextInt();
        System.out.println("El numero que ingresanste es " + number2);
        result =(number1+number2);
        System.out.println("El valor es " + result);
        lectura.nextLine();
        String name ;
        System.out.println("ingrese su nombre");
        name = lectura.nextLine();
        System.out.println("su nombre es"+ name);
       lectura.close(); 
    }
}
