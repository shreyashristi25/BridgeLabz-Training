import java.util.*;
public class AreaOfCircle
{
 public static void main (String args[])
 {
  int radius;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the radius");
  radius=sc.nextInt();
  System.out.println("Area of Circle :" + 3.14* radius* radius);
}
}