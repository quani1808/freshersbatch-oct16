public class Strings {
    public static void main(String[] args)
    {
        String s1 = "JAVA STRING POOL REFERS TO COLLECTION OF STRINGS WHICH ARE STORED IN HEAP MEMORY";
        String s1lower = s1.toLowerCase();
        System.out.println(s1lower);

        String s2 = "java string pool referes to collection of strings which are stored in heap memory";
        String s2Upper = s2.toUpperCase();
        System.out.println(s2Upper);

        String s3 = "java string pool referes to collection of strings which are stored in heap memory";
        String replaceString = s3.replace('a', '$');
        System.out.println(replaceString);


        System.out.println(s2.contains("collection"));

        String s4 = "Java String pool referes to collection of Strings which are stored in heap memory";
        System.out.println(s4.contains("java string pool referes to collection of strings which are stored in heap memory"));

        String s5 = "java string pool referes to collection of strings which are stored in heap memory";
        String s6 = "Java String pool referes to collection of Strings which are stored in heap memory";
        System.out.println(s5.equals(s6));

    }
}
