package logoshop;
  class checkYod extends Shop {
     private double comission =0.0 ;
    
     public void  setcalculatecheck(Double Total){}

    public void calculatecheck() {
        for(int n = 1 ; n< 3 ; n++){
            System.out.println();}
        comission = (Shop.Total*0.05);
        System.out.println("Sale price "+Shop.Total);
        System.out.println("Commission  : 5% ");
        System.out.println("ค่า Commission ที่ได้รับ : "+comission);   
    }
 }

