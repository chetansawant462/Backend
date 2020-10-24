import java.util.*;
class Area
{ 
 public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("enter value of l,b,h & r =");

 int l=sc.nextInt();
 int b=sc.nextInt();
 int h=sc.nextInt();
 double d = 3.14;
 int r=sc.nextInt();

 System.out.println("area of square= " +(l*l));
 System.out.println("area of rectangle= " +(l*b));
 System.out.println("area of triangle= " +((b*h)/2));
 System.out.println("area of circle= " +(d*r*r));
 }
}
