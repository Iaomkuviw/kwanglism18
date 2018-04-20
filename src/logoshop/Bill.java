package logoshop;

import java.util.Scanner;

abstract class Bill extends Shop {
   public abstract void Fok();
    public void member(){
        String m1 = "159357";
        String m2 = "741258";
        String m3 = "789654";
        char mimi;
        String id;
        
     do{
        Scanner m = new Scanner(System.in);
        System.out.println("-------------------------------------- ");
        System.out.print("คุณเป็นสมาชิกหรือไม่ (Y /N ): ");
        String mmm = m.nextLine();
        mimi = mmm.charAt(0);
    }while(!(mimi !='Y'||mimi !='y'));
       if (mimi == 'Y'|| mimi == 'y'){
    do{
    
    Scanner idee = new Scanner(System.in);
     System.out.print("Enter ID : ");
        id = idee.nextLine();
    }while(!(id.equals(m1)||id.equals(m2)||id.equals(m3)));
         discount = 0.1 ;
       }else{ discount = 0.0;}
}
 
    

     
     

        
    public void Bill2(){
       
    System.out.println("********Bill********");
    System.out.println("-----LOGO SHOP------");
    System.out.println("***Tel.090-1011101***");
       
  
   
      //ลูกค้าประจำลด 10%
      //ซื้อเกิน2000 ลด 15%
      //ซื้อเกิน 5000 ลด 20%
     // Shirt Sh = new Shirt();
     // Sh.Total_Shirt();
      
      //Plant Pa = new Plant();
     // Pa.Total_Plant();             
        System.out.println("shirt "+Shop.Total_Shirt); 
        System.out.println("plant "+Shop.Total_Plant);
        Shop.Total=Shop.Total_Plant+Shop.Total_Shirt;
        System.out.print("Total is "+Shop.Total);
       if (Total>= 2000.0 ){
           System.out.println(" ซื้อครบ 2,000 บาทขึ้นไป รับส่วนลด 15%!!!! ");
           Total =  Total-(Total*0.15);
           System.out.println(" ราคารวม " +Total);
          // checkYod c=new checkYod();
          // c.setcalculatecheck(Total);
                   
       }else if(Total >=5000.0){
           System.out.println(" ซื้อครบ 5,000 บาทขึ้นไป รับส่วนลด 20%!!!! ");
           Total =  Total-(Total*0.2);
           System.out.println(" ราคารวม " +Total);
          // checkYod c=new checkYod();
          // c.setcalculatecheck(Total);
       }else{
                 Total = Total;
             //    checkYod c=new checkYod();
         //  c.setcalculatecheck(Total);
                   }
       this.change(Total);
       }
      public void change(Double Total){
      Scanner cash = new Scanner(System.in);
      System.out.print("รับเงิน>>>>  : ");
      ca = cash.nextDouble();
      System.out.println("ทอนเงิน>>>> "+(Total = ca-Total));
      System.out.println("\n         ขอบคุณที่ใช้บริการค่ะ         ");
      System.out.println("----------------------------------");
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
   
   
   
    
   

