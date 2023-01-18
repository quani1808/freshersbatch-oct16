/* creating the objects of a generic class - Hands-on */
public class Test1 < T >
{
    T obj;
    Test1(T obj)
    {
        this.obj = obj;
    }
    public T getObject()
    {
        return this.obj;
    }
}
class Main
{
    public static void main(String[] args)
    {
        Test1<Integer> iobj = new Test1<Integer> (21);
        System.out.println("15");

        Test1<String> sobj = new Test1<String>("Nagalakshmi");
        System.out.println("Nagalakshmi");
    }
}