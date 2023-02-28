import java.util.Scanner;

public class elseif {
    public static void main(String[] args) throws Exception {
        Scanner lectura=new Scanner (System.in);
        int num, op=0;
        do{
            //marca el inicio de el ciclo
            System.out.println("ingrese un numero");
            num=lectura.nextInt();
            if (num > 0) {
                System.out.println("el numero es positivo");
            }
            else if (num == 0){
                System.out.println("el numero es neutro");
            }
            else{
                System.out.println("el numero es negativo");
            }
            System.out.println("si desea continuar digite 1 y si no digite 2");
            op=lectura.nextInt();
            if(op!=1){
                break;
            }
        }
        while(op==1);
        lectura.close();
    }
    
}
