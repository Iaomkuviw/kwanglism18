package logoshop;
import java.util.Scanner;
public class LogoshopDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = "Employee";
        String b = "123456";
        do{
        System.out.println("Username : ");
        String Us = input.nextLine();
        System.out.println("Password : ");
        String Ps = input.nextLine();        
        }while(!((input.equals(a)&&input.equals(b))));
    
}
}
