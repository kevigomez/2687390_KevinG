import java.util.Scanner;
public class Reto8 {
    public static void main(String[] args) throws Exception  {
           Scanner lectura = new Scanner(System.in);
           int op=1 , buys , acum=0;
           int  ball = (int)(Math.random()*4+1);
           System.out.println("En supermercados Noe estamos de aniversario y te obsequiamos un descuento en el valor de tu compra, si esta es mayor a 50.000 y dependiendo de tu suerte");
           while (op==1) {
            System.out.println("Digite el valor de el producto");
            buys=lectura.nextInt();
            acum = acum+buys;
            System.out.println("desea continuar 1.si 2.no");
            op = lectura.nextInt();
           if (acum>=50000 && op != 1) {
             System.out.println("dispone descuento");
             if (ball==1){
                System.out.println("la bolita que saco es roja por tanto tiene un 10% de descuento");
                int disc = (acum*10)/100;
                int total =(acum-disc);
                System.out.println("el  total de su compra con el descuento es "+ total);
                 System.out.println("Con que billete desea pagar?");
                int vPay =lectura.nextInt();
                int Totalcom=vPay-acum;
                System.out.println("el total a pagar es"+Totalcom);   
             }
             else if (ball==2) {
                System.out.println("la bolita que saco es azul por tanto tiene un 30% de descuento");
                int disc2 = (acum*30)/100;
                int total =(acum-disc2);
                System.out.println("el total de su compra con el descuento es "+total);
                System.out.println("Con que billete desea pagar?");
                int vPay =lectura.nextInt();
                int Totalcom=vPay-acum;
                System.out.println("el total a pagar es"+Totalcom);   
             }
             
             else if (ball==3) {
                System.out.println("la bolita que saco es amarilla por tanto tiene un 50% de descuento");
                int disc3 = (acum*50)/100;
                int total =(acum-disc3);
                System.out.println("el total de su compra con el descuento es "+total);
                System.out.println("Con que billete desea pagar?");
                int vPay =lectura.nextInt();
                int Totalcom=vPay-acum;
                System.out.println("el total a pagar es"+Totalcom);   
             }
             
             else if (ball==4) {
                System.out.println("la bolita que saco es blanca por tanto su compra es gratis");
             }
             else{
                System.out.println("hay un error de digitacion"); 
               } 
           }
           else if (acum<50000 && op != 1) {
                System.out.println("no dispone de un descuento");            
           }     
        }
           lectura.close();       
        }
}
