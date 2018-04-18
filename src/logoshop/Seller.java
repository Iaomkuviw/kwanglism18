package logoshop;
import java.util.Scanner;
    class Seller extends Shop implements Color,Size,No,Typeshirt,TypePlant{
     Scanner A = new Scanner(System.in);
     public String Type;
     public Seller(String Type){
             this.Type = Type;
     }
      
    public void Typeshirt1(){
        int Shirt ;   
        
        do{
            System.out.println("\n-------Shirt Menu--------");
            System.out.println("Press 1 > T-Shirt :"+" 250 THB");
            System.out.println("Press 2 > Polo Shirt :"+" 350 THB");
            System.out.println("Press 3 > Shirt :"+" 450 THB");
            System.out.println("Press 4 > Jacket :"+" 550 THB");
            System.out.println("Press 5 > Dress :"+" 750 THB");
            System.out.println("Enter Number>>>  ");
            String B = A.nextLine();
            
        }while(Shirt!= 1 && Shirt!= 2 && Shirt!= 3 && Shirt!= 4 && Shirt!= 5)
          
       public void Color1(){
            Scanner C = new Scanner(System.in);
            System.out.println("Color:  ");   
            String C1 = C.nextLine();
      }  
     
        public void Size1(){
            System.out.println("Size: ");  
        }
        
        public void No1(){
            System.out.println("No: ");
            }  
                
    
    
    public void TypePlant1(){
        int Plant ;      
       
        do{
            System.out.println("\n-------Plant Menu--------");
            System.out.println("Press 1 > Jeans :"+" 1500 THB");
            System.out.println("Press 2 > Chino :"+" 750 THB");
            System.out.println("Press 3 > Short Plant :"+" 350 THB");
            System.out.println("Press 4 > Long Plant :"+" 450 THB");
            String C1 = A.nextLine();
            System.out.println("Enter Number>>>  ");
            
        }while(Plant!= 1 && Plant!= 2 && Plant!= 3 && Plant!= 4)            
    }

  
    
    public void Color1() {
      System.out.println("Color: ");
    } 
    public void Size1() {
        System.out.println("Size: ");
    }
    public void No1() { 
        System.out.println("No: ");
    }
       
    
        
        public void logo(){
        S}
        public void Shopper(){
        System.out.println("----Shirt-----");
        super.Shopper();
        this.logo();
        System.out.println("Type is " + Type);
        Typeshirt1();
        Color1();
        Size1();
        No1();
}
}




    