package logoshop;
import java.util.Scanner;
public class LogoshopDemo {

    //private static Object Total_Shirt;
    public static void main(String[] args) { 
       Scanner input = new Scanner(System.in);
       String a = "abcd";
       String b = "123456";
       String in,in1;
       char order;
                
        System.out.println("---------------------------------");
        System.out.println("          YOUR WELLCOME          ");
        System.out.println("            LOGO SHOP            ");
        System.out.println("          ***ยินดีต้อนรับ***         ");
        System.out.println("---------------------------------");
       do{
                
        System.out.print("Username : ");
        in = input.nextLine(); 
        System.out.print("Password : ");
        in1 = input.nextLine();        
        }while(!((in.equals(a)&&in1.equals(b))));
      
       int AB;
    do{
        
        
        do{
            System.out.println("-----------------------------");
            Scanner AC = new Scanner(System.in);
            System.out.println("กด 1 เพื่อขายของ / กด 2 เพื่อเช็คยอด  : ");
            AB = AC.nextInt();         
        }while(AB!= 1 && AB!= 2);
        
        int n;
        if(AB==1){
            
                    Shirt sr = new Shirt();
                    sr.Typeshirt1();
                    sr.count();
                    
                    
               // }else{
               Plant pl = new Plant();
                   pl.TypePlant1();
                   pl.count();
                   
                   
                 Donthave B = new Donthave( );
                 B.member();
                 B.Bill2();
               
            
        
      
        }else {
            checkYod CY = new checkYod();
            
           CY.calculatecheck();}
        
        
        System.out.print("คุณต้องการทำรายการอีกครั้งหรือไม่(Y/N)>>>");
        Scanner t = new Scanner(System.in);
        String t1 = t.nextLine();
        order = t1.toUpperCase().charAt(0);
    
         
    }while(order=='Y'); 
    //}while(AB!= 1 && AB!= 2);
    }}


    



      
