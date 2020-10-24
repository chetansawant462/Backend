import java.util.*;
class Calculator
{ 
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter a values a & b = ");

  int a=sc.nextInt();
  int b=sc.nextInt();
  
  System.out.println(" ADDITION       = " +(a+b));
  System.out.println(" SUBSTRACTION   = " +(a-b));
  System.out.println(" MULTIPLICATION = " +(a*b));
  System.out.println(" DIVISION       = " +(a/b));
  System.out.println(" REMAINDER      = " +(a%b));  //MODULOUS  
 }
}