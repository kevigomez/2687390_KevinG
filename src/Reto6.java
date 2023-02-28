import java.util.Scanner;
public class Reto6 {
    public static void main(String[] args) throws Exception  {
           Scanner lectura = new Scanner(System.in); 
           int addition ,given = (int)(Math.random()*6+1);
           int given2 = (int)(Math.random()*6+1);
           addition = (given + given2);

           if(given==1 && given2==1){
            System.out.println("el primer dado saco "+given+"el segundo dado saco "+given2+" por tanto has ganado");
           }
           else if(addition==3){
            System.out.println("el primer dado saco "+given+"el segundo dado saco "+given2+" y el total es "+addition+" por tanto has ganado");
           }
           else if(addition==11){
            System.out.println("el primer dado saco "+given+"el segundo dado saco "+given2+" y el total es "+addition+" por tanto has ganado");
           }
           else if(given==2||given==2||addition==12){
            System.out.println("el primer dado saco "+given+"el segundo dado saco "+given2+" y el total es "+addition+" por tanto has ganado");
           }
           else if(addition==12){
            System.out.println("el primer dado saco "+given+"el segundo dado saco "+given2+" y el total es "+addition+" por tanto has ganado");
           }
           else{
            System.out.println("el primer dado saco "+given+"el segundo dado saco "+given2+" y el total es "+addition+" por tanto has perdido");
           }
           
           
           
           
           lectura.close();        
    }
    
}
