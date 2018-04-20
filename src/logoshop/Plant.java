package logoshop;
import java.util.Scanner;
class Plant extends Shop implements Color,Size,TypePlant {
     Scanner A2 = new Scanner(System.in);
     public String Type;
     public Plant(String Type){
             this.Type = Type;
     }

    Plant() {
        
    }
    int P ;
    public void TypePlant1(){
                 
        do{
            System.out.println("\n-------Plant Menu--------");
            System.out.println("Press 1 > Jeans :"+" 1500 THB");
            System.out.println("Press 2 > Chino :"+" 750 THB");
            System.out.println("Press 3 > Short Plant :"+" 350 THB");
            System.out.println("Press 4 > Long Plant :"+" 450 THB");
            Scanner G = new Scanner(System.in);
            System.out.print("Enter Number>>>  ");
             P = G.nextInt();
        }while(P!= 1 && P!= 2 && P!= 3 && P!= 4);      
         this.Color1();
    }
    
     
    
       public void Color1(){
            Scanner C = new Scanner(System.in);
            System.out.print("Color:  ");   
            String C1 = C.nextLine();
            this.Size1();
      }  
     
   
        public void Size1(){
            Scanner D = new Scanner(System.in);
            System.out.print("Size: ");  
            String D1 = D.nextLine();
            
        }
        
   
    //int Total_Plant = 0; int count = 10;            
        public void count(){
            
            Scanner cc1 = new Scanner(System.in);
            System.out.print("How many do you want :");
            many = cc1.nextInt();
         //  for(int i =1 ; i<=many ; i++){
              
         switch (P){
            case 1:Total_Plant = 1500*many;
                System.out.println(" Jeans :"+Total_Plant+" THB "  + many + " Piece");
                
                break;
            case 2:Total_Plant = 750*many;
                System.out.println(" Chino :"+Total_Plant+" THB "  + many + " Piece");
                
                break;
            case 3: Total_Plant =350*many;
                System.out.println(" Short Plant :"+Total_Plant+" THB "  + many + " Piece");
                
                break;
            default:Total_Plant = 450*many;
                System.out.println(" Long Plant :"+Total_Plant+" THB "  + many + " Piece");
                
                break;
        }

       

    

       
}}