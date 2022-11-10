import java.util.Scanner;
  public class MathFunction
  {
      public static int multiply(int num1, int num2)
      {
          return  num1 + num2;
      }
      public  static float multiply(float num1,float num2)
      {
          return num1 * num2;
      }
      public  static float multiply(float num1,int num2)
      {
          return num1 * num2;
      }
      public static void main(String args[])
      {
          System.out.println(multiply(5,3));
          System.out.println(multiply(4.2f,5.f));
          System.out.println(multiply(2.2f,3));
      }
  }

