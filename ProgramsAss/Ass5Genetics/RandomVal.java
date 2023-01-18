/* Print the data store in the HashMap */

import java.util.*;

class RandomVal
{
    public static void main(String[] args)
    {
        // creating an hashmap by declaring object

        HashMap<Integer,Double> map = new HashMap<Integer,Double>();
        map.put(1,7.006);
        map.put(2,8.006);
        map.put(3,9.006);
        map.put(4,10.006);
        map.put(5,11.006);
        map.put(6,12.006);
        map.put(7,13.006);
        map.put(8,14.006);
        map.put(9,15.006);
        map.put(10,16.006);

        System.out.println("Iterating HashMap...");
        for(Map.Entry m:map.entrySet())
        {
            System.out.println("Key"+m.getKey() + "Values="+ m.getValue());
        }
    }
}
