/* usa a hashset to hold the Employee Objects. upon running the application, the detailes of the employees added to the hashset should be displayed */

import java.util.HashSet;
import java.util.Iterator;

class Employees
{
    int id;
    String name;
    float salary;
    String department;
    public Employees(int id, String name, float salary, String department)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    @Override
    public int hashCode()
    {
        return id;
    }
    @Override
    public boolean equals(Object obj)
    {
        Employees employees = (Employees) obj;
        return (id == employees.id);
    }
    @Override
    public String toString()
    {
        return id + "," + name + "," + salary + "," + department;
    }
}
class MainClass
{
    public static void main(String[] args)
    {
        HashSet<Employees> Set = new HashSet<Employees>();

        //Adding elements to HashSet

        Set.add(new Employees(1, "John", 10000, "Sales"));
        Set.add(new Employees(2, "Jane", 20000, "Marketing"));
        Set.add(new Employees(3, "Joe", 30000, "Engine"));

        //Iterator through HashSet

        Iterator<Employees> itr = Set.iterator();
        {
            while (itr.hasNext())
            {
                Employees employees = (Employees) itr.next();
                System.out.println(employees.toString());
            }
        }
    }
}