/*find the total and average scored by students in each respective subject*/

import java.util.Scanner;
public class studentmarkes
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int A, B, C;
        double avg = 0.0;
        System.out.println("enter 3 subjects markes");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        avg = (A + B + C) / 3;
        System.out.println(avg);
    }
}
