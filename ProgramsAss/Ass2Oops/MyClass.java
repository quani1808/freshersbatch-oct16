abstract class MyClass
{
    public void display()
    {
        System.out.println("Concrete method of parent class");
    }
    abstract public void display2();
}
class Demo extends MyClass
{
    public void display2()
    {
        System.out.println("override abstract method");
    }
    public static void main(String[] args)
    {
        Demo demo = new Demo();
        demo.display();
        demo.display2();
    }
}
