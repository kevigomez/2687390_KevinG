import java.util.Scanner;
import java.util.Random;
public class Reto9 {
    public static void main(String[] args) throws Exception  {
           Scanner lectura = new Scanner(System.in); 
           Random random = new Random();
           int  op=1,acum=0,cont=0 ;
           System.out.println("Digite el valor global con el que desea apostar");
           int global=lectura.nextInt();
           while( op==1){
            int moneda=random.nextInt(2)+1;
            cont=cont+1;
            System.out.println("cuanto desea apostar");
            int bet = lectura.nextInt();
            int sacr = global-bet;
            System.out.println("eliga cara o sello"+moneda );
            String election = lectura.next();
            acum=acum+bet;
            if (moneda==1 && election.equalsIgnoreCase("cara")) {
                acum=bet*2;
                System.out.println("su eleccion fue ganadora");
                System.out.println("desea continuar? 1.si 2.no ,gano "+acum);
                op=lectura.nextInt();
                if (op==2) {
                int rec=acum+sacr;
                System.out.println("total de jugadas fueron "+cont+" y el total recaudado es"+rec); 
                }
            }
            else if(moneda==2 && election.equalsIgnoreCase("sello")){
                acum=bet*2;
                System.out.println("su eleccion fue ganadora");
                System.out.println("desea continuar? 1.si 2.no ,gano "+acum);
                op=lectura.nextInt();
                if (op==2) {
                int rec=acum+sacr;
                System.out.println("total de jugadas fueron "+cont+" y el total recaudado es"+rec); 
                }

            }
            else{
                acum=bet;
                System.out.println("perdio");
                System.out.println("desea continuar? 1.si 2.no ,tiene "+sacr);
                op=lectura.nextInt();
                
                if (op==2) {
                    System.out.println("total de jugadas fueron "+cont+" y el total recaudado es"+sacr); 
                    }
            }
           }
               
           lectura.close();        
    }
    
}
