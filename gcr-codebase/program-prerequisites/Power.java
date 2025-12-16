import java.util.*;
public class Power
{
 public static void main(String args[])
 {
  int a,b;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the base");
  a=sc.nextInt();
  System.out.println("Enter the exponent");
  b = sc.nextInt();
  int result = a;
  while(b > 1)
  {
   result* = a;
   b--;
  }
  System.out.println("Power is:" + result);

 }
}