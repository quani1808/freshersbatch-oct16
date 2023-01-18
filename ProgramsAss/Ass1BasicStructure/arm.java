/* find out if the given number is an armstrong number */

import java.util.Scanner;

public class arm {
    public static void main(String[] args) {
        int num, temp, c = 0;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        temp = num;
        while (num != 0) {
            int d = num % 10;
            c += d * d * d;
            num /= 10;
        }
        if (temp == c) {
            System.out.println("Number is armstrong");
        } else {
            System.out.println("Number is not armstrong");
        }
    }
}