/* Collections Hands-on */

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection
{
        public static void main(String[] args)
        {
            ArrayList<String> list = new ArrayList<String>();
            list.add("Rani"); //Adding objects in arraylist
            list.add("Anu");
            list.add("siri");
            list.add("gani");

            //Traversing list through iterator
            Iterator itr = list.iterator();
            {
                while (itr.hasNext())
                {
                    System.out.println(itr.next());
                }
            }
        }
}
