/* Hands-on on  lambda explession */

@FunctionalInterface
interface Drawable
{
    public void draw();
}
class LambdaExpressionExample
{
    public static void main(String[] args)
    {
        int width=10;

        //with lambda
        Drawable d=()->
        {
            {
                System.out.println("Drawable" + width);
            }

        };
        d.draw();
    }
}
