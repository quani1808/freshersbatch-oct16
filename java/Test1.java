/* annotation program 1 */

import java.lang.*;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Test1
{
    String os();
}
@Test1(os="it is a testcase")
class AnnotationExp
{
    String mode;
    AnnotationExp(String mode)
    {
        this.mode= mode;
    }
}
class AnnotationExp2
{
    public static void main(String args[])
    {
        AnnotationExp n = new AnnotationExp("test case Annotation1");
        Class c=n.getClass();
        Annotation o=c.getAnnotation(Test1.class);
        Test1 s=(Test1)o;
        System.out.println(s.os());
    }
}
