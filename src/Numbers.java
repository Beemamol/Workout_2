 class Numbers
 {
     int num1;
     int num2;
     Numbers(int num1,int num2)
     {
         this.num1=num1;
         this.num2=num2;
     }
}
class swap
{
    public static void swapByValue(int x, int y)
    {
        System.out.println("Before swapping x = " + x + " y = " + y );
        int temp = x;
        x=y;
        y=temp;
        System.out.println("After swapping x = " + x + " y = " + y );
    }
    public static void swapByReference(Numbers a)
    {
        System.out.println("Before swapping num1 = " + a.num1 + " num2 = " + a.num2 );
        int temp = a.num1;
        a.num1=a.num2;
        a.num2=temp;
        System.out.println("After swapping num1 = " + a.num1 + " num2 = " + a.num2 );
    }
    public static void main(String args[])
    {
        swapByValue(6,4);
        Numbers Number=new Numbers(8,7);
        swapByReference(Number);
    }

}
