package logoshop;
import java.util.Scanner;
    class Shirt extends Shop implements Color,Size,Typeshirt{
     Scanner A = new Scanner(System.in);
     public String Type;
     public void Shirt(String Type){
             this.Type = Type;
     }
    Shirt() { 
    }
    public void Typeshirt1(){
        do{
            System.out.println("\n-------Shirt Menu--------");
            System.out.println("กด 1 > เสื้อยืด :"+" 250 THB");
            System.out.println("กด 2 > เสื้อโปโล :"+" 350 THB");
            System.out.println("กด 3 > เสื้อเชิ๊ต :"+" 450 THB");
            System.out.println("กด 4 > เสื้อแจ็คเก็ต :"+" 550 THB");
            System.out.println("กด 5 > เดรส :"+" 750 THB");
            Scanner A1 = new Scanner(System.in);
            System.out.print("Enter Number>>> ");
            super.B = A1.nextInt();
            
        }while(B!= 1 && B!= 2 && B!= 3 && B!= 4 && B!= 5);
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
            Scanner cc = new Scanner(System.in);
            System.out.print("จำนวนที่คุณต้องการ : ");
            many = cc.nextDouble();
    switch (B){
        case 1:
            sum(250.0,many);System.out.println("T-Shirt : "+Total_Shirt+" THB "  + many + " Piece");
                break;
        case 2:
            sum(350.0,many);System.out.println("Polo Shirt : "+Total_Shirt+" THB "  + many + " Piece");
                break; 
        case 3:
            sum(450.0,many);System.out.println("Shirt : "+Total_Shirt+" THB "  + many + " Piece");
                break; 
        case 4:
            sum(550.0,many);System.out.println("Jacket : "+Total_Shirt+" THB "  + many + " Piece");
                break;
        default:
            sum(750.0,many);System.out.println("Dress : "+Total_Shirt+" THB "  + many+ " Piece");
                break;
                }
        }
        public void sum(Double a,Double b){
            Shop.Total_Shirt = (a*b);
        }
    }

    