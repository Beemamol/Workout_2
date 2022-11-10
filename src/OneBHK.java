 class OneBHK {
     double roomArea;
     double hallArea;
     double price;

     OneBHK() {
         this.roomArea = 0;
         this.hallArea = 0;
         this.price = 0;
     }

     OneBHK(double roomArea, double hallArea, double price) {
         this.roomArea = roomArea;
         this.hallArea = hallArea;
         this.price = price;
     }

     public void show() {
         System.out.println("roomArea = " + roomArea);
         System.out.println("hallArea = " + hallArea);
         System.out.println("price = " + price);
     }
 }
    class TwoBHK extends OneBHK
    {
        double room2Area;
        TwoBHK()
        {
            this.room2Area=0;
        }
        TwoBHK(double roomArea,double hallArea,double price,double room2Area)
        {
            super(roomArea,hallArea,price);
            this.room2Area=room2Area;
        }

       public void show() {
            super.show();
            System.out.println("room2Area = " + room2Area);
           System.out.println("\n\n");
        }
    }
   class flat_Driver {
        public static void main(String args[])
        {
           TwoBHK f1=new TwoBHK(20,40,6000,30);
           TwoBHK f2=new TwoBHK(10,50,7000,40);
           TwoBHK f3=new TwoBHK(30,60,6800,50);
            f1.show();
            f2.show();
            f3.show();
            double toalAmount=f1.price + f2.price + f3.price;
            System.out.println("Total Amount of all flats = " + toalAmount);


        }
    }

