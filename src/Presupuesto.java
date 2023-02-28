import java.util.Scanner;

public class Presupuesto {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int spent, budget, op, contador;
        budget = 100000;
        op = 1;
        contador = 0;

        while (op==1 || contador <= 3){
            System.out.println("Ingrese el gasto");
            spent = lectura.nextInt();
            budget = budget - spent ;
            System.out.println("el gasto fue "+ spent +" y su presupuesto restante es "+ budget);
            System.out.println("Desea registrar otro gasto 1.si 2.no");
            op = lectura.nextInt();
            contador = contador + 1;
        }
        lectura.close();


    }
    
}
