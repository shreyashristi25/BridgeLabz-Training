import java.util.*;
public class Average
{
public static void main(String args[])
{
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number");

a=sc.nextInt();
System.out.println("Enter second number");
b=sc.nextInt();
System.out.println("Enter third number");
c=sc.nextInt();
System.out.println("Average:"+ (a+b+c)/3);
}
}