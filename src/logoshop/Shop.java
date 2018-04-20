package logoshop;
abstract class Shop {
    public int goods;
    public int B,P;
    public static double Total_Plant; 
    public static double Total_Shirt;
    public static double Total;
    public double ca ;   
    public double many ;
    double discount =0.0;
    
    public double getTotal_Shirt(){
        return Total_Shirt;
    }
    public double getTotal_Plant(){
        return Total_Plant;
    }
            public void Shopper(){
            System.out.println("LOGO SHOP");
            System.out.println(" goods = "+goods);
} 

            
}
    

