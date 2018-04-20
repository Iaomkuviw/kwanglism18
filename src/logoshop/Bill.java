package logoshop;

import java.util.Scanner;

public class Bill extends Shop{
    //private int Total;
   // public Bill(int Total){
    //    this.Total=Total;
    //}
    //public int getTotal(){
    //    return Total;
   // }
    public void member(){
        String m1 = "159357";
        String m2 = "741258";
        String m3 = "789654";
        char mimi;
        double discount =0.0;
        String id;
        
     do{
        Scanner m = new Scanner(System.in);
        System.out.println("-------------------------------------- ");
       System.out.print("Do you have a membership code? (Y /N ): ");
        String mmm = m.nextLine();
        mimi = mmm.charAt(0);
    }while(!(mimi !='Y'||mimi !='y' ));
       if (mimi == 'Y'|| mimi == 'y'){
    do{
    
    Scanner idee = new Scanner(System.in);
     System.out.print("Enter ID : ");
          id = idee.nextLine();
    }while(!(id.equals(m1)||id.equals(m2)||id.equals(m3)));
         discount = 0.1 ;
       }else{ discount = 0.0;}
}
  if(Total>=2000){
       System.out.print(" ซื้อครบ 2000 ลด 10%"); 
       Total = Total-(Total*(0.1))
    }else{
       System.out.print(" ซื้อครบ 5000 ลด 20% ");
}
    

     
     

        
    public void Bill2(){
       
    System.out.println("********Bill********");
    System.out.println("-----LOGO SHOP------");
    System.out.println("***Tel.090-1011101***");
       
  
    Total = Total+Total_Shirt+Total_Plant;
     
                        
     System.out.print("Total is "+Total );
      //ลูกค้าประจำลด 10%
      //ซื้อเกิน2000 ลด 5%
      //ซื้อเกิน 3000 ลด 7 %
      
      
      
      Scanner cash = new Scanner(System.in);
      System.out.print("Enter รับเงิน :");
      int ca = cash.nextInt();
      System.out.print("Total is "+(Total = ca- Total));
      System.out.print("ทอนเงิน : "+Total);

                            
        }
    

    public void logo() {
       
    }

    
    
        
   
   
   
   
   
   
    }

    
   // public void logo() {
        
    

   

    

       
   
   
   
   
   
   
   
   
   //System.out.println("Discount :" +discount);
   
  // public void Promotion(double discount,int Total){
     //  this.Bill(int B);
     //  this.member();
       
      // if (Total >=2000){
       //    discount=discount+0.15;
       //    System.out.print("Total price :"+Total-(Total*discount))
     //  }
  // }
   
   //System.out.println("Total price : "+ (Total*discount) +" THB ");
   
   
   
    
   

