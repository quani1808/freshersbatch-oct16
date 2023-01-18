/* write an application to print 10 uniqu product prog 2*/

import java.lang.*;
import java.util.*;

public class Product {
    public static void main(String[] args)
        {
         HashSet<String> obj=new HashSet<>();
         obj.add("Cups");
         obj.add("chairs");
         obj.add("pens");
         obj.add("table");
         obj.add("Books");
         obj.add("papers");
         obj.add("flank");
         obj.add("bresh");
         obj.add("colors");
         obj.add("mobiles");
         System.out.println(obj);
        }
}
