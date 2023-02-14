import java.util.Scanner;
public class Budget {
    public static void main(String[]args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        double Whidth, Large, Budget, Area ;
        System.out.println("Ingrese el ancho ");
        Whidth = lectura.nextDouble();
        System.out.println("Ingrese el largo");
        Large = lectura.nextDouble();
        Area = Large*Whidth;
        Budget = 45000*Area;
        System.out.println("La superficie por cubrir tiene "+Large+"M de largo por "+Whidth+"M de ancho con "+Area+" metros cuadrados ");
        System.out.println("El presupuestro de el trabajo es de "+Budget);
        lectura.close(); 
    }

}