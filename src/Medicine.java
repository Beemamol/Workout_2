public class Medicine {
    String name,address;
    Medicine()
    {
        name="Lifescience Pvt. Ltd.";
        address="Industrial Hub,Kochi,231423";
    }
    void displayLabel()
    {
        System.out.println("\nCompany Name:"+name+"\nAddress:"+address);
    }
}
class Tablet extends Medicine{
    @Override
    void displayLabel()
    {
        super.displayLabel();
        System.out.println("store in a cool dry place");
    }
}
class Syrup extends Medicine{
    @Override
    void displayLabel()
    {
        super.displayLabel();
        System.out.println("to be only under medical supervision");
    }
}
class Ointment extends Medicine{
    @Override
    void displayLabel()
    {
        super.displayLabel();
        System.out.println("for external use only");

    }
}
class TestMedicine{
    public static void main(String arg[])
    {
        double j=Math.random()*4;
        int k=(int)j;
        switch (k)
        {
            case 1:
                Medicine m1=new Medicine();
                Tablet t=new Tablet();
                m1.displayLabel();
                t.displayLabel();
                break;
            case 2:
                Medicine m2=new Medicine();
                Syrup s=new Syrup();
                m2.displayLabel();
                s.displayLabel();
                break;
            case 3:
                Medicine m3=new Medicine();
               Ointment o=new Ointment();
                m3.displayLabel();
                o.displayLabel();
                break;
        }
    }
}
