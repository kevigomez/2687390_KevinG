import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) throws Exception   {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Digite su nombre");
        String  name = lectura.nextLine();
        int length = name.length();
        System.out.println("la longitud de su nombre es de "+ length+" letras");
        System.out.println("digite su apellido");
        String  lastName = lectura.nextLine();
        int length2 = lastName.length();
        System.out.println("la longitud de su nombrela es de "+ length2+" letras");
        String resultado = name.toUpperCase(); 
        System.out.println("nombre en mayusculas "+resultado);
        String resultado2 = lastName.toLowerCase(); 
        System.out.println("apellido en minusculas "+resultado2);
        String fullName = name + " " + lastName;
        System.out.println("su nombre completo es "+fullName);
        System.out.println(name.substring(0,2)+lastName);
        lectura.close();
    }
    
}

