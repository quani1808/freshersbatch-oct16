/* hands-on in LinkedLIst */
import java.util.*;

public class Linkedlist {
    public static void main(String[] args)
    {
        LinkedList<String> al= new LinkedList <String>();
        al.add("Ravi");
        al.add("Raju");
        al.add("Rani");
        al.add("Rashi");
        Iterator<String> itr=al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
