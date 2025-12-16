import java.util.*;
public class SimpleInterest
{
 public static void main (String args[])
 {
  double p,r,t;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the principal");
  p = sc.nextDouble();
  System.out.println("Enter the rate");
  r = sc.nextDouble();
  System.out.println("Enter the time");
  t = sc.nextDouble();
  System.out.println("Simple Doubleerest is:" + ( p * r * t ) / 100 );
  }
}