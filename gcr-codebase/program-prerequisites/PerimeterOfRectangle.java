import java.util.*;
public class PerimeterOfRectangle
{
public static void main (String args[])
{
int length,width;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the length");
length=sc.nextInt();
System.out.println("Enter the width");
width=sc.nextInt();

System.out.println("Perimeter of Rectangle:"+2*(length+width));
}
}