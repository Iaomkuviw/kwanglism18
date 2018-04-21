package logoshop;
  class checkYod extends Shop {
     private double comission =0.0 ;
    
     public void  setcalculatecheck(double Total){//เอาตัวเลขที่ขายได้มาเก็บไว้เป้นอาเรย์ลิสต์//
      
     
       // comission = Shop.Total-(Shop.Total*0.5);
     }

    public void calculatecheck() {
        for(int n = 1 ; n< 3 ; n++){
            System.out.println();}
        comission = Shop.Total-(Shop.Total*0.5);
        System.out.println("Sale price "+Shop.Total);
        System.out.println("Commission  : 5% ");
        System.out.println("Commission : "+comission);
        
        
    }

   
 

 }

