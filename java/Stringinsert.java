/*program 5 on string buffer in strings*/

public class Stringinsert
{
    public static void main(String[] args)
    {
        StringBuffer s = new StringBuffer("inserttext");
        s.insert(6,"_");
        System.out.println(s);
    }
}
