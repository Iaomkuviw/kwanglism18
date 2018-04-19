package logoshop;
import java.util.Scanner;
 class Plant extends Shop implements Color,Size,No,TypePlant {
     Scanner A2 = new Scanner(System.in);
     public String Type;
     public Plant(String Type){
             this.Type = Type;
     }
    public void TypePlant1(){
        int P ;          
        do{
            System.out.println("\n-------Plant Menu--------");
            System.out.println("Press 1 > Jeans :"+" 1500 THB");
            System.out.println("Press 2 > Chino :"+" 750 THB");
            System.out.println("Press 3 > Short Plant :"+" 350 THB");
            System.out.println("Press 4 > Long Plant :"+" 450 THB");
            Scanner G = new Scanner(System.in);
            System.out.println("Enter Number>>>  ");
             P = G.nextInt();
        }while(P!= 1 && P!= 2 && P!= 3 && P!= 4);      
               
     
    public void Color1(){
            Scanner I = new Scanner(System.in);
            System.out.println("Color:  ");   
            String I1 = I.nextLine();
      }  
     
        public void Size1(){
            Scanner J = new Scanner(System.in);
            System.out.println("Size: ");  
            String J1 = J.nextLine();
        }
        
        public void No1(){
            Scanner K = new Scanner(System.in);
            System.out.println("No: ");
            String K1 = K.nextLine();
            }  
                    
        
    public void logo(){
        System.out.println("");}
        public void Shopper(){
        System.out.println("----Order-----");
        super.Shopper();
        this.logo();
        System.out.println("Type is " + Type);
        TypePlant1();
        Color1();
        Size1();
        No1();
    }

    

 }


    
    
