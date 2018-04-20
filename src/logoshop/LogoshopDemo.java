package logoshop;
import java.util.Scanner;
public class LogoshopDemo {

    //private static Object Total_Shirt;
    public static void main(String[] args) { 
       Scanner input = new Scanner(System.in);
       String a = "abcd";
       String b = "123456";
       String in,in1;
       double commission =0.5;
                
        System.out.println("---------------------------------");
        System.out.println("          YOUR WELLCOME          ");
        System.out.println("            LOGO SHOP            ");
        System.out.println("---------------------------------");
       do{
                
        System.out.print("Username : ");
        in = input.nextLine(); 
        System.out.print("Password : ");
        in1 = input.nextLine();        
        }while(!((in.equals(a)&&in1.equals(b))));
       do{
        int AB;
        do{
            System.out.println("-----------------------------");
            Scanner AC = new Scanner(System.in);
            System.out.println("Press 1 for Seller / Press 2 for Check stock? : ");
            AB = AC.nextInt();         
        }while(AB!= 1 && AB!= 2);
        
        int n;
        if(AB==1){
            //int Total_Shirt=0;
            //int Total_Plant=0;
          // do{
           // System.out.println("-----------------------------");
          //  Scanner TP = new Scanner(System.in);
           // System.out.println("Press 1 for Thirts / Press 2 for Plants : ");
           // n = TP.nextInt();         
       // }while(n!= 1 && n!= 2);
             // int Total= 0;
              // if(n == 1){
                    Shirt sr = new Shirt();
                    sr.Typeshirt1();
                    sr.count();
                    
                    
               // }else{
               Plant pl = new Plant();
                   pl.TypePlant1();
                   pl.count();
                   
                   
                 Bill B = new Bill( );
                 B.member();
                 B.Bill2();
               
            
        
      
        }else{
            checkYod CY = new checkYod();
              
           CY.calculatecheck();}
            
    }while();

    }
}
}

      
