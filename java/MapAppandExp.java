/* program 7 in lambda*/

import java.util.HashMap;

class MapAppandExp
{
    public static void main(String[] args)
    {
        HashMap<String,String> list = new HashMap<>();
        list.put("Bunny","Boo");
        list.put("Pinky","Boo");
        list.put("Hello","Hi");
        StringBuilder str = new StringBuilder();
        for(HashMap.Entry<String,String> p:list.entrySet())
        {
            String str1=p.getKey()+p.getValue();
            System.out.println(str1);
            str.append(str1);
        }
        System.out.println(str);
    }
}
