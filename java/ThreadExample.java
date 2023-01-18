/* Program 8 in lambda */

import java.util.ArrayList;
import java.util.*;
import java.lang.*;

public class ThreadExample
{
    public static void main(String[] args)
    {
        Thread t = new Thread(()->{
            List<Integer> list = new ArrayList<Integer>();
            list.add(1);
            list.add(3);
            list.add(6);
            list.add(8);
            System.out.println(list);
        });
        t.start();
    }
}
