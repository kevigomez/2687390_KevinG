import java.util.Scanner;

public class verificacion {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String user, password;
        System.out.println("Digite su usuario");
        user= lectura.nextLine();
        System.out.println("Digite su Contraseña");
        password = lectura.nextLine();
        if (user.equals("Kevin") && password.equals("Kevin1840")){
            System.out.println("Bienvenido al Sistema");
        }
        else if (user != "Kevin" && password.equals("Kevin1840")){
            System.out.println("algo paso con sus credenciales");
        }
        else if (user.equals("Kevin") && password != "Kevin1840"){
            System.out.println("Parece que olvidaste tus credenciales de acceso");
        }
        else{
            System.out.println("acceso denegeado");
        }
        lectura.close();
    }
    
}
