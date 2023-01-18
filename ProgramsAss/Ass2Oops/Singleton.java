/* write a singleton class, confirm that singleton class cannot be inherited */
public class Singleton
{
    static Singleton st=new Singleton();
    public Singleton()
    {
        System.out.println("Constructing singleton");
    }
    static Singleton getInstance()
    {
        return st;
    }
}
class Test
{
    public static void main(String[] args)
    {
        Singleton s1 =new Singleton();
        Singleton s2 =new Singleton();
        System.out.println(s1);
        System.out.println(s2);
    }
}