
import java.util.Scanner;

public class Reto3 {
 public static void main(String[] args) throws Exception   {
    Scanner lectura = new Scanner(System.in);
    String eleccionH;
    int number = (int)(Math.random()*3+1);
    System.out.println("Eliga entre piedra papel o tijera");
    eleccionH = lectura.nextLine();
    if (eleccionH.equals("piedra") && number == 1) {
        System.out.println("al escoger "+eleccionH+" usted empato");
    }
    else if (eleccionH.equals("papel") && number == 2) {
        System.out.println("al escoger "+eleccionH+" usted empato");
    }
    else if (eleccionH.equals("tijera") && number == 3) {
        System.out.println("al escoger "+eleccionH+" usted empato");
    }
    else if (eleccionH.equals("piedra") && number == 3) {
        System.out.println("al escoger "+eleccionH+" la maquina seleciono tijera por tanto usted gano");
    }
    else if (eleccionH.equals("papel") && number == 1) {
        System.out.println("al escoger "+eleccionH+" la maquina seleciono piedra por tanto usted gano");
    }
    else if (eleccionH.equals("tijera") && number == 2) {
        System.out.println("al escoger "+eleccionH+" la maquina seleciono papel por tanto usted gano");
    }
    else if (eleccionH.equals("piedra") && number == 2) {
        System.out.println("al escoger "+eleccionH+" la maquina seleciono papel por tanto usted perdio");
    }
    else if (eleccionH.equals("papel") && number == 3) {
        System.out.println("al escoger "+eleccionH+" la maquina seleciono tijera por tanto usted perdio");
    }
    else if (eleccionH.equals("tijera") && number == 1) {
        System.out.println("al escoger "+eleccionH+" la maquina seleciono piedra por tanto usted perdio");
    }
    else {
        System.out.println("error intente de nuevo");

    }
    lectura.close();






    
 }   
}
