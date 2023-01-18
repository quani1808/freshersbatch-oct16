/*  lambda program 3 */
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Predicate;
import java.util.function.Function;

public class FunctionalExample
{
    public static void main(String[] args)
    {
        Supplier<Integer> s = new Supplier<Integer>()
        {
            @Override
            public Integer get()
            {
                return 1;
            }
        };
        Consumer<Integer> c = new Consumer<>()
        {
            @Override
            public void accept(Integer integer)
            {
                System.out.println(integer);
            }
        };
        Predicate<Integer> p = new Predicate<Integer>()
        {
            @Override
            public boolean test(Integer integer)

            {
                System.out.println(integer);
                return false;
            }
        };
        Function<Integer, String> f = new Function()
        {
            @Override
            public Object apply(Object o)
            {
                System.out.println(o);
                return o;
            }
        };
        s.get();
        c.accept(5);
        p.test(10);
        f.apply(2);
    }
}
