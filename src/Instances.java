public class Instances {
    static  int c_count=0;
    static int d_count=0;
    Instances()
    {
        c_count++;
    }
    public static void main(String args[])
    {

        Instances obj1=new Instances();
        Instances obj2=new Instances();
        obj1 = null;
        System.gc();
        Runtime.getRuntime().gc();
        System.out.println("Total Instances Created"+c_count);
        System.out.println("Total Instances destroyed"+d_count);
        System.out.println("Live Instances "+(c_count-d_count));

    }
    protected void finalize()
    {
    d_count++;
    }
}

