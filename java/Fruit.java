/*program 1 in streams*/

import java.util.ArrayList;
import java.util.*;
import java.lang.*;

public class Fruit {
    String name;
    int calories;
    int price;
    String color;

    public Fruit(String name, int calories, int price, String color)
    {
        this.name = name;
        this.calories = calories;
        this.price = price;
        this.color = color;
    }
    public String getName()
    {
      return name;
    }
    public void setName(String name)
    {
      this.name = name;
    }
    public int getCalories()
    {
      return calories;
    }
    public void setCalories(int calories)
    {
      this.calories = calories;
    }
    public int getPrice()
    {
       return price;
    }
    public void setPrice(int price)
    {
       this.price = price;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
       this.color = color;
    }
}
class StrPro1
{
    public static void main(String[] args)
    {
        ArrayList <Fruit> fruitList = new ArrayList <Fruit>();
        fruitList.add(new Fruit("apple", 80,10,"Red"));
        fruitList.add(new Fruit("orange",100,20,"orange"));
        fruitList.add(new Fruit("Banana",110,10,"yellow"));
        fruitList.add(new Fruit("blueberry",50,30,"blue"));

        System.out.println("List of fruits sorted by calories");
        fruitList.stream().filter(f->f.calories>100).forEach(f->System.out.println(f.calories));
        System.out.println("color wise fruit names");
        fruitList.stream().sorted(new Comparator<Fruit>()
        {
            @Override
            public int compare(Fruit o1, Fruit o2)
            {
                return o1.getColor().compareTo(o2.getColor());
            }
        }).forEach(f->System.out.println(f.getName()));
        System.out.println("List of fruits which are red sorted by price:");
        fruitList.stream().filter(f->f.getColor().equalsIgnoreCase("red")).sorted((Fruit o1,Fruit o2)->(int)o1.getPrice()-o2.getPrice()).forEach(f->System.out.println(f.getName()));

    }
}
