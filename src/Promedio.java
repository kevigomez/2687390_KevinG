import java.util.Scanner;

public class Promedio {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double note1, note2, note3, asist,promedio;
        System.out.println("Digite su primera nota");
        note1 = lectura.nextDouble();
        System.out.println("Digite su segunda nota");
        note2 = lectura.nextDouble();
        System.out.println("Digite su tercera nota");
        note3 = lectura.nextDouble();
        System.out.println("digite su promedio de asistencias");
        asist = lectura.nextDouble();
        promedio = (note1+note2+note3)/3;
        System.out.println("Su promedio de notas es de "+promedio);    
        if (promedio >= 3.5 && asist >= 70  ) {
            System.out.println("De acuerdo a lo revisado usted Aprovo ");
            
        }
        else if (promedio <= 3.5 && asist <= 70){
            System.out.println("De acuerdo a lo revisado usted no Aprovo ");

        }
        lectura.close();
        
    }
    
}
