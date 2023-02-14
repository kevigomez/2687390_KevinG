import java.util.Scanner;
public class Reto1 {
    public static void main(String[]args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        double gradof, gradoc ;
        System.out.println("ingrese los grados farenheit");
        gradof = lectura.nextDouble();
        gradoc = (gradof-32)*5/9;
        System.out.println("El resultado es "+ gradoc);
        lectura.close(); 
    }

}