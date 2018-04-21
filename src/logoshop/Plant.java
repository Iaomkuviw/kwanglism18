package logoshop;
import java.util.Scanner;
class Plant extends Shop implements Color,Size,TypePlant {
     Scanner A2 = new Scanner(System.in);
     public String Type;
     public Plant(String Type){
             this.Type = Type;
     }
    Plant() {}
    public void TypePlant1(){
        do{
            System.out.println("\n-------Plant Menu--------");
            System.out.println("กด 1 > กางเกงยีนส์ :"+" 1500 THB");
            System.out.println("กด 2 > กางเกงผ้าชิโน :"+" 750 THB");
            System.out.println("กด 3 > กางเกงขาสั้น :"+" 350 THB");
            System.out.println("กด 4 > กางเกงขายาว :"+" 450 THB");
            Scanner G = new Scanner(System.in);
            System.out.print("Enter Number>>> ");
             P = G.nextInt();
        }while(P!= 1 && P!= 2 && P!= 3 && P!= 4);    
         this.Color1();
    }
       public void Color1(){
            Scanner C = new Scanner(System.in);
            System.out.print("สี: ");   
            String C1 = C.nextLine();
            this.Size1();
      }  
        public void Size1(){
            Scanner D = new Scanner(System.in);
            System.out.print("ไซต์: ");  
            String D1 = D.nextLine();  
        }        
        public void count(){
            
            Scanner cc1 = new Scanner(System.in);
            System.out.print("จำนวนที่คุณต้องการ : ");
            many = cc1.nextDouble();
    switch (P){
        case 1:
            sum(1500.0,many);System.out.println(" Jeans :"+Total_Plant+" THB "  + many + " Piece");
            break;
        case 2:
            sum(750.0,many);System.out.println(" Chino :"+Total_Plant+" THB "  + many + " Piece");
            break;
        case 3: 
            sum(350.0,many);System.out.println(" Short Plant :"+Total_Plant+" THB "  + many + " Piece");     
            break;
        default:
            sum(450.0,many);System.out.println(" Long Plant :"+Total_Plant+" THB "  + many + " Piece");
            break;
        }
        }
        public void sum(Double a,Double b){
            Shop.Total_Plant = (a*b);
        }
        }