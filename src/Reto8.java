import java.util.Scanner;
public class Reto8 {
    public static void main(String[] args) throws Exception  {
           Scanner lectura = new Scanner(System.in);
           int op=0 ,buys ;
           System.out.println("digite el valor de su compra");
           buys=lectura.nextInt();
           System.out.println("En supermercados Noe estamos de aniversario y te obsequiamos un descuento en el valor de tu compra, si esta es mayor a 50.000 y dependiendo de tu suerte");
           while (op==0) {
            int  ball = (int)(Math.random()*4+1);
           
           if (buys>=50000) {
             System.out.println("dispone descuento");
            
             if (ball==1){
                System.out.println("la bolita que saco es roja por tanto tiene un 10% de descuento");
                int disc = (buys*10)/100;
                int total =(buys-disc);
                System.out.println("el  total de su compra con el descuento es "+ total);
             }
             else if (ball==2) {
                System.out.println("la bolita que saco es azul por tanto tiene un 30% de descuento");
                int disc2 = (buys*30)/100;
                int total =(buys-disc2);
                System.out.println("el total de su compra con el descuento es "+total);
             }
             
             else if (ball==3) {
                System.out.println("la bolita que saco es amarilla por tanto tiene un 50% de descuento");
                int disc3 = (buys*50)/100;
                int total =(buys-disc3);
                System.out.println("el total de su compra con el descuento es "+total);
             }
             
             else if (ball==4) {
                System.out.println("la bolita que saco es blanca por tanto su compra es gratis ");
             }
           }
           else{
            System.out.println("no dispone de un descuento");
           } 
        }
           lectura.close();       
        }
}