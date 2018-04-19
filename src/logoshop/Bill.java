package logoshop;
public class Bill {
    public void Bill(int B){  
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
    }
}
   

