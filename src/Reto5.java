import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) throws Exception   {
        Scanner lectura = new Scanner(System.in);
        System.out.println("digite una palabra");
        String  word = lectura.nextLine();
        int length = word.length();
        System.out.println("la longitud de la palabra es "+ length);
        lectura.close();
    }
    
}

