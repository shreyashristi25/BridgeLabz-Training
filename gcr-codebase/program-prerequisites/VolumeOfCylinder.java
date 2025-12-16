import java.util.*;
public class VolumeOfCylinder
{
 public static void main (String args[])
 {
  int radius, height;
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the radius");
  radius = sc.nextInt();
  System.out.println("Enter the height");
  height = sc.nextInt();
  System.out.println("Volume of Cylinder" + 3.14 * radius * radius * height);
 }
}