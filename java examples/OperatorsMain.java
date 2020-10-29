class OperatorsMain
{
public static void main(String args[])
{
int num1=100 , num2=200 , num3=300;
System.out.println("Logical operator");
System.out.println("Logical And operation = "+((num1>num2)&&(num1>num3))); //false
System.out.println("Logical And operation = "+((num3>num2)&&(num3>num1))); // True
System.out.println("Logical OR operation = "+((num1>num2)||(num1>num3))); // False
System.out.println("Logical OR operation = "+((num3>num2)||(num1>num3)));//True
num1=5;num2=4;
System.out.println("BitWise operator");
System.out.println("Bitwise And operation = "+(num1&num2)); //0101 | 0100 = 0100
System.out.println("Bitwise OR operation = "+(num1|num2)); //0101 | 0100 = 0101
System.out.println("Bitwise XOR operation = "+(num1^num2)); //0101 | 0100 = 0001
System.out.println("Assignment operator");
num1=200; num2=300;
System.out.println(" Addition Assignment ="+(num1+=num2));
System.out.println(" Subtraction Assignment ="+(num1-=num2));
System.out.println(" Remainder Assignment ="+(num2%=num1));
System.out.println("Ternary Operator");
String ch;
num1=200; num2=400;
ch = (num1>num2)?"Num1" :"Num2";
System.out.println(ch+" is Greater");




}
}