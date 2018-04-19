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

    
      
    @Override
    public void Typeshirt1(){
        int B;   
        
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
        
                
    }
          
     @Override
       public void Color1(){
            Scanner C = new Scanner(System.in);
            System.out.print("Color:  ");   
            String C1 = C.nextLine();
      }  
     
     @Override
        public void Size1(){
            Scanner D = new Scanner(System.in);
            System.out.print("Size: ");  
            String D1 = D.nextLine();
            this.count();
        }
        
    
                
        public void count(){
            
            Scanner cc = new Scanner(System.in);
            System.out.print("How many do you want :");
            int count = cc.nextInt();
           for(int i =count ; 0 <i ; i++){
               System.out.println("Done No."+i  );
               
           }
        }
   
    
       
    
        
        public void logo(){
        System.out.println("");
        }
        public void  print(){
        System.out.println("----Order-----");
        super.Shopper();
        this.logo();
        System.out.println("Type is " + Type);
        Typeshirt1();
        Color1();
        Size1();
       
}
      
}      





    