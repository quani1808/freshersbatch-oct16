/* Abstract method - handson */

abstract class Objects
{
    abstract void draw();
}
class Circle extends Objects
{
    void draw()
    {
        System.out.println("draw circle");
    }
}
class Circle2D extends Objects
{
    void draw()
    {
        System.out.println("draw circle2D");
    }
}
class TestObjects
{
    public static void main(String[] args)
    {
        Objects obj=new Circle2D();
        obj.draw();
    }
}