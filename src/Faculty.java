import java.util.*;
public class Faculty {
      int facultyid;
      float salary;
}


class FulltimeFaculty extends Faculty{
      float basic;
      float allowence;

      FulltimeFaculty(float basic,float allowence)
      {
            this.basic=basic;
            this.allowence=allowence;
      }

      float salaryF(){
      float salary1;
            salary1 = (basic+allowence);
            return salary1;
      }
      void display1()
      {
            System.out.println("Fulltimesalary= "+salaryF());
      }
}
class PartTimeFaculty extends Faculty{
      int hour;
      float rate;

      PartTimeFaculty(int hour,float rate)
      {
            this.hour=hour;
            this.rate=rate;
      }
      float salaryP(){
      float salary2;
            salary2=(hour*rate);
            return salary2;
      }
      void display2()
      {
            System.out.println("PartTimesalary="+salaryP());
      }
}
class DriverClass
      {
            public static void main(String[] args)
            {
                  Scanner s=new Scanner(System.in);
                  System.out.println("Enter the Details of F1");
                  FulltimeFaculty F1=new FulltimeFaculty(s.nextFloat(),s.nextFloat());
                  System.out.println("Enter the Details of F2");
                  FulltimeFaculty F2=new FulltimeFaculty(s.nextFloat(),s.nextFloat());
                  System.out.println("Enter the Details of P1");
                  PartTimeFaculty P1=new PartTimeFaculty(s.nextInt(),s.nextFloat());
                  System.out.println("Enter the Details of P2");
                  PartTimeFaculty P2=new PartTimeFaculty(s.nextInt(),s.nextFloat());
                  F1.display1();
                  F1.display1();
                  P1.display2();
                  P2.display2();
            }
      }

