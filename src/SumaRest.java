import java.util.Scanner;  

public class SumaRest {
    public static void main(String[] args) {
        int numberOne , numberTwo;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Digite un numero");
        numberOne = lectura.nextInt();
        System.out.println("Digite otro numero");
        numberTwo = lectura.nextInt();
        if (numberOne >= numberTwo) {
            int adition=(numberOne + numberTwo);
            System.out.println("numero mayor es "+ numberOne);
            System.out.println("numero menor es "+ numberTwo);
            System.out.println("Se reliza una suma y el resultado es "+ adition);
        }
        else{
            System.out.println("numero mayor es "+ numberTwo);
            System.out.println("numero menor es "+ numberOne);
         
            int subtraction=(numberTwo - numberOne);
            System.out.println("Se realiza la resta y el resultado es"+ subtraction);
        }
        lectura.close();  

        
    }
}
