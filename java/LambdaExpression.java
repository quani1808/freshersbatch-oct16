/* write an application using lambda expression program 2 */
import java.util.*;
import java.util.function. Predicate;

interface Orders
{
    void print(int price);
}
class LambdaExpression
{
    public static void main(String[] args)
    {
        Orders lambdaexp = (int price) ->
        {
            if(price > 9000)
            {
                System.out.println("COMPLETED");
            }
            else
            {
                System.out.println("FAILED");
            }
        };
        lambdaexp.print(10000);
    }
}
