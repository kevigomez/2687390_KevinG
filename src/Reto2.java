import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) throws Exception  {
        Scanner lectura = new Scanner(System.in);
        double peso;
        int edad;
        System.out.println("digite la edad de el bebe en meses");
        edad = lectura.nextInt();
        System.out.println("digite el peso del bebe");
        peso = lectura.nextDouble();
        double result=((peso+10)/(edad*10)*8);
        System.out.println("la dosis que se le debe aplicar al niño es "+result); 
        lectura.close();

        
    }
    
}
