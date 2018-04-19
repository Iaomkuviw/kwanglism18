package logoshop;

import java.util.Scanner;

public class Bill {
    
    public void member(){
        String m1 = "159357";
        String m2 = "741258";
        String m3 = "789654";
        char mimi;
        double discount =0.0;
        String id;
        
     do{
        Scanner m = new Scanner(System.in);
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

     
     

        
    public void Bill(int B, int P){  
        int Total = 0;
    System.out.println("********Bill********");
    System.out.println("------LOGO SHOP------");
    System.out.println("***Tel.090-1011101***");
    
   if(B == 1){
        System.out.println("T-Shirt : 250 THB");
                Total = Total+250;
    }else if(B == 2){
        System.out.println("Polo Shirt : 350 THB");
                Total = Total+350;
    }else if(B == 3){
        System.out.println("Polo Shirt : 450 THB");
                Total = Total+450;
    }else if(B == 4){  System.out.println("Polo Shirt : 550 THB");
                Total = Total+550;
   }else { System.out.println("Polo Shirt : 750 THB");
                Total = Total+750;
    }
   
   if(P==1){
       System.out.println("Press 1 > Jeans :"+" 1500 THB");
                Total = Total+1500;
    }else if(P== 2){
        System.out.println("Press 2 > Chino :"+" 750 THB");
                Total = Total+750;
    }else if(P== 3){
        System.out.println("Press 3 > Short Plant :"+" 350 THB");
                Total = Total+350;
    }else {  
        System.out.println("Press 4 > Long Plant :"+" 450 THB");
                Total = Total+450;
   }
   
   
   
   
   
   
    }

    

       
   }
   
   
   
   
   
   
   
   
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
   
   
   
    }
}
   

