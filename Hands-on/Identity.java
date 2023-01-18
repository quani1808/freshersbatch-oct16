/* generic class - handson */

public class Identity <T,U>
{
    T obj1;
    U obj2;
    Identity(T obj1, U obj2)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    //print the two objects
    public void print()
    {
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
class Main
{
    public static void main(String[] args)
    {
        Identity<String,Integer> obj = new Identity<String,Integer>("Nagalakshmi" , 21);
        obj.print();
    }
}
