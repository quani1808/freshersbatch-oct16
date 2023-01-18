import java.util.Scanner;
public class Unsupported
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=sc.nextInt();
                System.out.println("Enter the second number");
        int num2=sc.nextInt();
        try
        {
            int num3=num1+num2;
        }
        catch (ArithmeticException e) {
            System.out.println("e");
        }
        {
            System.out.println("UnsupportedOperationException");
        }
    }
}
