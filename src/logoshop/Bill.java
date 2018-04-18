package logoshop;
public class Bill {
    public void Bill(){
        int Shirt ;
        int Total;
    System.out.println("********Bill********");
    System.out.println("------LOGO SHOP------");
    System.out.println("***Tel.090-1011101***");
    
    switch(Shirt){
    case1:System.out.println("T-Shirt : 250 THB");
                Total = Total+250;break;
    case2:System.out.println("Polo Shirt : 350 THB");
                Total = Total+350;break;
    case3:System.out.println("Polo Shirt : 450 THB");
                Total = Total+450;break;
    case4:System.out.println("Polo Shirt : 550 THB");
                Total = Total+550;break;
    case5:System.out.println("Polo Shirt : 750 THB");
                Total = Total+750;break;
    }
    
    
}
}
