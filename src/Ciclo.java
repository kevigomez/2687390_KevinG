import java.util.Scanner;

public class Ciclo {
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);
        int precio, cantidad, contador, subtotal, acumulador;
        acumulador = 0;
        contador = 0;
        for (int x=1;x<=5;x++){
            System.out.println("digite el precio de el producto");
            precio = lectura.nextInt();
            System.out.println("digite la cantidad de el producto");
            cantidad = lectura.nextInt();
            contador = contador+1;
            subtotal = precio + cantidad;
            acumulador = acumulador+ subtotal;
        }
        System.out.println("su total a pagar es "+acumulador);
        System.out.println("con que billete va a pagar");
        int billete = lectura.nextInt();
        int cambio = billete - acumulador;
        System.out.println("su cambio es de "+cambio);
        String answer;
        System.out.println("cuenta con telefonia movil exito?");
        lectura.nextLine();// limpieza de buffer
        answer = lectura.nextLine();
        if(answer.equals("si")){
            System.out.println("Usted tuvo "+contador+" de minutos con telefonia exito");
        }
        else{
            System.out.println("No pierdas mas minutos, adquiere ya tu telefonia movil");
        }
        lectura.close();
    }

    
}
