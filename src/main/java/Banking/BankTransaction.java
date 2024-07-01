package Banking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BankTransaction
{
//    static ArrayList<Person>db;
    static Queue<Person> operations;
    public static void main(String[] args) {
        Queue<Person> operations=new LinkedList<Person>();
        ArrayList<Person>db=new ArrayList<>();

        Person p1=new Person(11,"gautam","withdraw",1000,5000);
        Person p2=new Person(12,"sahil","deposit",1000,500);
        Person p3=new Person(13,"chandu","withdraw",1000,2000);
        Person p4=new Person(14,"soubhagya","deposit",1000,5000);
        Person p5=new Person(15,"bhagyashree","withdraw",1000,900);
        db.add(p1);
        db.add(p2);
        db.add(p3);
        db.add(p4);
        db.add(p5);
        while(true)
        {
            System.out.println("1.Add person to queue-");
            System.out.println("2.next person for processing request-");
            Scanner sc= new Scanner(System.in);
            int choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter your acc no name:-");
                    long accNo=sc.nextLong();
                    boolean flag=true;
                    for(Person p:db)
                    {
                        if(p.getAccNo()==accNo)
                        {
                            System.out.println("Account No Exists and added to queue");
                            operations.add(p);
                            flag=false;
                        }

                    }
                    if(flag==true)
                    {
                        System.out.println("Account no not found!!");
                    }

                    break;
                case 2:
//                    System.out.println(operations.peek());
                    if(operations.isEmpty())
                    {
                        System.out.println("no one is in queue");
                        System.exit(0);
                    }
                    else {
                        Person peek = operations.peek();
                        String transactionType = peek.getTransactionType();
                        if(transactionType.equals("withdraw"))
                        {
                            if(peek.getBankBalance()>=peek.getTamount())
                            {
                                int amt = peek.getBankBalance() - peek.getTamount();
                                System.out.println("Current balance of "+peek.getName()+" is "+amt);
                                peek.setBankBalance(amt);
                            }
                            else {
                                System.out.println("insufficient Account Balance");
                            }
//                            System.out.println(peek);
                            operations.remove(peek);
                        }
                        else {
                            int amt = peek.getBankBalance() + peek.getTamount();
                            peek.setBankBalance(amt);

                            System.out.println("Current balance of "+peek.getName()+" is "+amt);
                            operations.remove(peek);
                        }
                    }
                    break;
                default:
                    System.out.println("select a valid option");
                    System.exit(0);
                    break;
            }

        }
    }
}
