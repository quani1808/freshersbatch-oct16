/* program 1 in java 11 */

import java.util.*;
interface simple
{
    void sI(int p,int r,int t);
}
public class SimpleInterest {
    public static void main(String[] args)
    {
        simple interest=(var a,var b,var c)->{
            var i=a*b*c/100;
            System.out.println("Interest="+i);
        };
        interest.sI(20000,10,3);
    }
}
