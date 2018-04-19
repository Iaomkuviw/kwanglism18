package logoshop;
import java.util.Scanner;
public class LogoshopDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = "abcd";
        String b = "123456";
        String in,in1;
        double commission =0.5;
       
        do{
        System.out.println("---------------------------------");
        System.out.println("          YOUR WELLCOME          ");
        System.out.println("            LOGO SHOP            ");
        System.out.println("---------------------------------");
        System.out.print("Username : ");
        in = input.nextLine(); 
        System.out.print("Password : ");
        in1 = input.nextLine();        
        }while(!((in.equals(a)&&in1.equals(b))));
       
        int AB;
        do{
            System.out.println("-----------------------------");
            Scanner AC = new Scanner(System.in);
            System.out.println("Press 1 for Seller / Press 2 for Check stock? : ");
            AB = AC.nextInt();         
        }while(AB!= 1 && AB!= 2);
        
        int n;
        if(AB==1){
          // do{
           // System.out.println("-----------------------------");
          //  Scanner TP = new Scanner(System.in);
           // System.out.println("Press 1 for Thirts / Press 2 for Plants : ");
           // n = TP.nextInt();         
       // }while(n!= 1 && n!= 2);
              
              // if(n == 1){
                    Shirt sr = new Shirt();
                    sr.Typeshirt1();
                    sr.Color1();
                    sr.Size1();
                    
                    
               // }else{
                   Plant pl = new Plant("eiei") {};
                   pl.TypePlant1();
                   pl.Color1();
                   pl.Size1();
                 
                        
               
                
       
                
               
            
           // Bill B = new Bill();
               // B.Bill;
      
        }else{
      
        
        
}
    }
}


