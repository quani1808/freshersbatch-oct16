/* program 1 */

public class Singletone {

    static Singletone st=new Singletone();
    private Singletone(){
        System.out.println("constructor will invoke only one object");
    }
    static Singletone getInstance()
    {
        return st;
    }
}
class Testexp
{
    public static void main(String args[])
    {
        Singletone st1= Singletone.getInstance();
        Singletone st2= Singletone.getInstance();
        System.out.println(st1);
        System.out.println(st2);
    }
}
