/* oops Assignment number 3 */

public class Saving
{
     String name;
    int money;

    Saving(String name,int money)
    {
        this.name = name;
        this.money = money;
    }
  public void fixeddeposited()
  {
      System.out.println("money deposited is"+money);
  }
  public int totalmoney()
  {
      return money;
  }
}
class Current
{
     String name;
    int moneyc;
    Current(String name,int moneyc)
    {
        this.name=name;
        this.moneyc=moneyc;
    }
    public int cashcredit()
    {
        System.out.println("money credited is "+moneyc);
        return moneyc;
    }
    public int totalmoney()
    {
        return moneyc;
    }
}
class Bank2
{
    public static void main(String[] args)
    {
        Saving s=new Saving("Rani",10000);
        s.fixeddeposited();
        int p=s.totalmoney();
        Current c=new Current("Sravya",30000);
        c.cashcredit();
        int d=c.totalmoney();
        int y=p+d;
        System.out.println("total money in the bank is"+y);
    }
}