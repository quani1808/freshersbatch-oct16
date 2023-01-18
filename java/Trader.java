import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

 class Trader
    {
        String name;
        String city;

        public Trader(String name,String city)
        {
            this.name = name;
            this.city = city;
        }


        public void setName(String name) {
            this.name = name;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getName()
        {
            return name;
        }

        public String getCity()
        {
            return city;
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        @Override
        public String toString() {
            return "Trader{" +
                    "name ='" + name + '\'' +
                    ", city ='" + city + '\'' +
                    '}';
        }
    }
class StrPro3
{
    public static void main(String[] args)
    {
        ArrayList<Trader> trader =new ArrayList<>(Arrays.asList(
                new Trader("Gani", "Bangalore"),
                new Trader("Anu", "Pune"),
                new Trader("Siri", "Mysore"),
                new Trader("Sam", "Pune"),
                new Trader("Ravi", "Andhra"),
                new Trader("Virat", "Pune"),
                new Trader("srinivas", "Delhi")
        ));
        System.out.println("Unique cities");
        trader.stream().distinct().forEach(p->System.out.println(p.getCity()));
        System.out.println("Traders in pune sorted by name");
        trader.stream().filter(p->p.getCity().equalsIgnoreCase("pune")).sorted((Comparator.comparing(Trader::getName))).forEach(p->System.out.println(p.getName()));
        System.out.println("Trades who is in Andhra");
        trader.stream().filter(p->p.getCity().equalsIgnoreCase("andrea")).forEach(p->System.out.println(p.getName()));
        System.out.println("Trades names sorted Alphabetically");
        trader.stream().sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList()).forEach(p->System.out.println(p.getName()));

    }
}