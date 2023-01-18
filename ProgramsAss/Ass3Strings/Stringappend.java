public class Stringappend {
    public static void main(String[] args)
    {
        System.out.println("StringBuffer");
        StringBuffer sbf = new StringBuffer("StringBuffer");
        String str = new String("is a peel class of string");
        sbf.append(str);
        System.out.println("Result after appending =" +sbf);
        System.out.println("that provides much of");
        sbf = new StringBuffer("that provides much of");
        str = new String("the same functionality of strings");
        sbf.append(str);
        System.out.println("result after appending = "+ sbf);
    }
}
