package logoshop;
import java.util.Scanner;
public class LogoshopDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = "abcd";
        String b = "123456";
        String in,in1;
       
        do{
        System.out.println("---------------------------------");
        System.out.println("          YOUR WELLCOME          ");
        System.out.println("            LOGO SHOP            ");
        System.out.println("---------------------------------");
        System.out.print("Username : ");
        in = input.nextLine(); 
        System.out.print("Password : ");
        in1 = input.nextLine();        
        }while(!((in.equals(a)||in1.equals(b))));
       
        int AB;
        do{
            System.out.println("-----------------------------");
            Scanner AC = new Scanner(System.in);
            System.out.println("Press A for Seller / Press B for Check stock? : ");
            AB = AC.nextInt();         
        }while(AB!= 'A' && AB!= 'B');
        
        if(AB=='A'){
            super.Shopper();
        }
        
        Shirt Sh = new Shirt("");
        Sh.Typeshirt1();
        Sh.Color1();
        Sh.Size1();
        Sh.No1();
    
}
}

