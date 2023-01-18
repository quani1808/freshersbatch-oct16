abstract class Dept {
    abstract void work();
    void attendenceSystem() {
        System.out.print("enter a new employee attendence");
    }
}
class Manager1 extends Dept
{
    @Override
    void work() {
        System.out.println("Manager started working");
    }
}
class Analyst extends Dept{
    @Override
    void work() {
        System.out.println("Analyst started working");
    }
}
public class Department {
    public static void main(String[] args) {
        Manager1 m = new Manager1();
        Analyst a = new Analyst();
        m.work();
        a.work();
    }
}


