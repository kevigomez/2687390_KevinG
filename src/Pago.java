import java.util.Scanner;  

 
 

public class Pago { 

    public static void main(String[] args) throws Exception {  
        Scanner lectura = new Scanner(System.in);  
      int totalProduct , fullValue , payValue , change ; 
      System.out.println("Ingrese el total de productos");  
      fullValue = lectura.nextInt();  
      System.out.println("Ingrese el valor con el que realiza el pago");  
      payValue = lectura.nextInt();  
      totalProduct = (fullValue*10000); 
      change = (payValue - totalProduct); 
      System.out.println("El total de la compra es "+ totalProduct);  
      System.out.println("El cambio es "+ change);   

        lectura.close();  

 
 

    }  

 
 
 

} 

 

 