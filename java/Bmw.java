/* Abstraction example - handson */

abstract class Bmw
{
    abstract void run();
}
class Ferrari extends Bmw
{
 void run()
 {
     System.out.println("Riding Safely");
 }
 public static void main(String[] args)
 {
     Bmw obj = new Ferrari();
     obj.run();
 }
}
