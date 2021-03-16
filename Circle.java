import java.util.Scanner;
class Circle
{
public static void main(String args[])
{
double r;
 final double pi = 3.142;
double area;
double circ;
Scanner s = new Scanner(System.in);
System.out.println("enter radius:");
r = s.nextDouble();
area = pi*r*r;
circ = 2*pi*r;
System.out.println("area: " +area);
System.out.println("circum: " +circ);
}
}