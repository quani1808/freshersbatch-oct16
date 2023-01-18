import java.lang.*;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Test
{
    String os();
}
@Test(os="it is a testcase")
class Annotation2
{
    String mode;
    Annotation2(String mode)
    {
        this.mode= mode;
    }
}
class Annotation1
{
    public static void main(String args[]) throws Exception
    {
        Annotation2 n=new Annotation2("test case annotation");
        Class c=n.getClass();
        Annotation o=c.getAnnotation(Test.class);
        Test s=(Test)o;
        System.out.println(s.os());
    }
}
