package DSAList;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class UnorderedList
{
    public static LinkedList<String> ul=new LinkedList<>();
    public static void main(String[] args)
    {

        String fileNameWithLoc="C:\\Users\\Aloke\\IdeaProjects\\DSA\\src\\main\\java\\DSAList\\File.txt";
        readIntoFile(fileNameWithLoc);
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a word you want to search:-");
        String word=s.next();
        presentInList(word);
        System.out.println(ul);

    }
    public static void presentInList(String s)
    {
        if(ul.contains(s))
        {
            System.out.println("WORD "+s+" is present in the list/file and is removed");
            ul.remove(s);
        }
        else {
            System.out.println("WORD "+s+" is not present in the list/file");
            insertIntoLinkedlist(s);
        }
    }
    public static void readIntoFile(String fileNameWithLoc)
    {
        try
        {
            File f=new File(fileNameWithLoc);
            Scanner sc=new Scanner(f);
            while(sc.hasNext())
            {
                String str=sc.next();
                str.toLowerCase();
                insertIntoLinkedlist(str);

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(ul);
    }
    public static void insertIntoLinkedlist(String str)
    {
        if(ul.isEmpty())
        {
            ul.add(str);
        }
        else {
            boolean flag=false;
            for(int i=0;i<ul.size();i++)
            {
                if(str.compareTo(ul.get(i))<=0)
                {
                    ul.add(i, str);
                    flag=true;
                    break;
                }
            }
            if(flag==false)
            {
                ul.add(str);
            }

        }
    }
}
