import java.io.*;   // imported on package 

//package is collection of class and subpackages

class MathOperation2 
{
  public static void main(String args[]) throws IOException
  {
    int num1, num2, sum;
     DataInputStream dis = new DataInputStream(System.in); 
    System.out.println("Enter Number 1 = ");
   num1 = dis.readInt();
System.out.println("Enter Number 2 = ");
   num2 = dis.readInt();

   sum = num1 + num2;
    System.out.println("Number1 = "+ num1);
    System.out.println("Number2 = "+ num2);
    System.out.println("Sum = "+ sum);
    System.out.println("Subtraction = "+ (num1-num2));
    System.out.println("Mulitplication = "+ (num1
*num2));
    System.out.println("Division = "+ (num1/num2));
    System.out.println("Remainder = "+ (num1%num2));


 }
}

//public - command prompt 
//static -  object is not created, class reference
//void  - return nothing
//main - main class
// args[] - array of object
//java DemoClassmain1  Manoj Kavedia YouTube