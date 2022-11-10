import java.util.Scanner;
 class Employee {
     String name;
     int EMP_ID,ass1,ass2,ass3;
     String result;
     Employee(int ass1,int ass2,int ass3)
     {
         this.ass1=ass1;
         this.ass2=ass2;
         this.ass3=ass3;
     }
     void calculation()
     {
         float totalMarks=ass1+ass2+ass3;
         float percentage=(totalMarks/300)*100;
         System.out.println("Total marks="+totalMarks);
         System.out.println("Percentage="+percentage);
         if(ass1>75&&ass2>75&&ass3>75)
         {
             System.out.println("Promotion");
         }
         else
         {
             System.out.println("Demoted");
         }
     }
}
 class AssessmentResults

{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Name:");
        String name=s.nextLine();
        System.out.println("Enter the Employee Id:");
        int EMP_ID=s.nextInt();
        System.out.println("Enter the three Assessment Values:");
        int assessement1=s.nextInt();
        int assessement2=s.nextInt();
        int assessement3=s.nextInt();
        Employee e=new Employee(assessement1,assessement2,assessement3);
        e.calculation();
    }
}
