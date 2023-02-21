import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        double number1, number2, total;
        String option;
        System.out.println("eliga una de las siguientes opciones a relizar: Suma, Resta, Multiplicacion, Division, Potencia, Raiz cuadrada");
        option = lectura.nextLine();
        System.out.println("Digite un numero para calcular");
        number1 = lectura.nextDouble();
        System.out.println("Digite otro numero para calcular");
        number2 = lectura.nextDouble();
        switch (option) {
            case "suma":
            total = number1+number2;
                System.out.println("usted eligio "+option+" el resultado de la operacion es "+total);
                break;
            case "resta":
            total = number1-number2;
            System.out.println("usted eligio "+option+" el resultado de la operacion es "+total);
                break;
            case "multiplicacion":
            total = (number1*number2);
            System.out.println("usted eligio "+option+" el resultado de la operacion es "+total);
                break;
            case "division":
            total = (number1/number2);
            System.out.println("usted eligio "+option+" el resultado de la operacion es "+total);
                
                break;
            case "potencia":
            total = Math.pow(number1, number2);
            System.out.println("usted eligio "+option+" el resultado de la operacion es "+total);
                
                break;
            case "raiz cuadrada":
            double raiz = Math.pow(number1, 0.5);
            double raiz2 = Math.pow(number2, 0.5);  
            System.out.println("usted eligio "+option+" el resultado del primer numero es "+raiz+"el segundo es "+raiz2);              
                break;
        
            default:
            System.out.println("Seleccion no reconocida intente de nuevo");
                break;
        }
        lectura.close();
    }
}
