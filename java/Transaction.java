/*program 3 in streams*/

import java.util.Arrays;
import java.util.*;
import java.util.List;
import java.util.Optional;

class Transaction
{
    Trader Trader;
    int year;
    int value;

    public Transaction(Trader Trader, int year, int value)
    {
        this.Trader = Trader;
        this.year = year;
        this.value = value;
    }
    public Trader getTrader()
    {
        return Trader;
    }
    public int getYear()
    {
        return year;
    }
    public int getValue()
    {
        return value;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "Trader='" + Trader + '\'' +
                ", year ='" + year + '\'' +
                ", value ='" + value + '\'' +
                '}';
    }
}

class StrPro4
{
    public static void main(String[] args)
    {
        List <Transaction> List = Arrays.asList(
                new Transaction(new Trader("Gani","Bangalore"),2001,100000),
                new Transaction(new Trader("Anu","Pune"),2003,120000),
                new Transaction(new Trader("Siri","Mysore"),2003,150000),
                new Transaction(new Trader("Sam","Pune"),2007,180000),
                new Transaction(new Trader("Ravi","Andhra"),2011,200000),
                new Transaction(new Trader("Virat","Pune"),2020,600000),
                new Transaction(new Trader("srinivas","Delhi"),2022,800000)
        );
        System.out.println(List);
        List.stream().filter(p->p.Trader.getCity().equalsIgnoreCase("Pune")).forEach(p->System.out.println(p.getValue()));
        Optional<Transaction> MaxValue = List.stream().max(Comparator.comparingInt(Transaction::getValue));
        System.out.println(MaxValue.get());
        Optional<Transaction> MinValue = List.stream().min(Comparator.comparingInt(Transaction::getValue));
        System.out.println(MinValue.get());
        List.stream().filter(p->p.getYear()==2007).forEach(p->System.out.println(p.getValue()));
    }
}
