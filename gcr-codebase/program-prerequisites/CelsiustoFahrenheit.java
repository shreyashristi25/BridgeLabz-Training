import java.util.*;
public class CelsiustoFahrenheit
{
public static void main (String args[])
{
int Celsius;
System.out.println("Enter value in Celsius");
Scanner sc= new Scanner(System.in);
Celsius=sc.nextInt();
int F=(Celsius * 9/5) + 32;
System.out.println("Value in Fahrenheit : "+ F);

}
}