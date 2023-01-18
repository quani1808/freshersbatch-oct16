/*program 5 in Lambda*/

import java.util.*;
interface Consumer
{
    int result();
}
public class Letter
{
    private static StringBuilder charBuffer = new StringBuilder();
    public static String processWords(String input)
    {
        String s[] = input.split("(\\s)+");
        for (String values : s) {
            charBuffer.append(values.charAt(0));
        }
        return charBuffer.toString();
    }
    public static void main(String[] args)
    {
        String str="Hi Welcome everyone";
        System.out.println(processWords(str));

    }
}