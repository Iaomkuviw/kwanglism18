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

    
      
     int B;
    public void Typeshirt1(){
      
        
        do{
            System.out.println("\n-------Shirt Menu--------");
            System.out.println("Press 1 > T-Shirt :"+" 250 THB");
            System.out.println("Press 2 > Polo Shirt :"+" 350 THB");
            System.out.println("Press 3 > Shirt :"+" 450 THB");
            System.out.println("Press 4 > Jacket :"+" 550 THB");
            System.out.println("Press 5 > Dress :"+" 750 THB");
            Scanner A1 = new Scanner(System.in);
            System.out.print("Enter Number>>>  ");
            B = A1.nextInt();
            
        }while(B!= 1 && B!= 2 && B!= 3 && B!= 4 && B!= 5);
        this.Color1();
                
    }
          
     
       public void Color1(){
            Scanner C = new Scanner(System.in);
            System.out.print("Color: ");   
            String C1 = C.nextLine();
            this.Size1();
      }  
     

        public void Size1(){
            Scanner D = new Scanner(System.in);
            System.out.print("Size: ");  
            String D1 = D.nextLine();
           
        }
        
   
    //int Total_Shirt = 0; int count = 10;            
        public void count(){
            
            Scanner cc = new Scanner(System.in);
            System.out.print("How many do you want :");
            many = cc.nextInt();
           
            //  for(int i =1; i<=many ;i++){
             
   
        switch (B){
            case 1:Total_Shirt = 250*many;
                 System.out.println("T-Shirt : "+Total_Shirt+" THB "  + many + " Piece");
                 
                 
                break;
            case 2:Total_Shirt = 350*many;
                System.out.println("Polo Shirt : "+Total_Shirt+" THB "  + many + " Piece");
                
                break;
            case 3:Total_Shirt = 450*many;
                System.out.println("Shirt : "+Total_Shirt+" THB "  + many + " Piece");
                
                break;
            case 4:Total_Shirt = 550*many;
                System.out.println("Jacket : "+Total_Shirt+" THB "  + many + " Piece");
                
                break;
            default:Total_Shirt = 750*many;
                    System.out.println("Dress : "+Total_Shirt+" THB "  + many+ " Piece");
                
                break;
        }

              }}
      

   
   




    