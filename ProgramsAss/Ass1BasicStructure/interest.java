/* find out the simple as well as the compound interest */

import java.util.Scanner;
public class interest
{
public static void main(String[] args)
{
 Scanner input = new Scanner(System.in);

 System.out.println("enter the principal:");
 double principal = input.nextDouble();

 System.out.println("enter the rate:");
 double rate = input.nextDouble();

 System.out.println("enter the time:");
 double time = input.nextDouble();

 double interest = (principal * time * rate) / 100;

 System.out.println("Principal: " + principal);
 System.out.println("Interest Rate: " + rate);
 System.out.println("Time Duration: " + time);
 System.out.println("simple interest: " + interest);
}
}
