import java.util.Scanner;

public class MensWomans {
    public static void main(String[] args) throws Exception   {
        Scanner lectura = new Scanner(System.in);
        int contadorH , contadorM;
        contadorH = 0;
        contadorM = 0;
        for (int x=1; x<=10; x++) {
             System.out.println("Eres Hombre o Mujer");
             String answer = lectura.nextLine();
             if (answer.equalsIgnoreCase("hombre")) {
                contadorH=contadorH+1;
             }
             else if (answer.equalsIgnoreCase("mujer")){
                contadorM=contadorM+1;
             }
             else{
                System.out.println("hubo un error al digitar");
             }
        }
        System.out.println("en total hubieron "+contadorM+" mujeres y "+contadorH+" hombres");
        lectura.close();
    }
}
