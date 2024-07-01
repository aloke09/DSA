package binary;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BinarySearch
{
    public static void main(String[] args) throws IOException {
        String fileLocWithName="C:\\Users\\Aloke\\IdeaProjects\\DSA\\src\\main\\java\\binary\\ListOfWords.txt";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word you need to search");
        String word=sc.next();
        int result = binarySearch(List_of_Words(fileLocWithName), word);
        System.out.println(result);

    }
    public static ArrayList<String> List_of_Words(String fileLocWithName)
    {
        ArrayList<String> ListOfWords=new ArrayList<>();

        String str=new String();
        char ch;
        try {
            FileReader fr=new FileReader(fileLocWithName);
            while(fr.ready())
            {
                ch= (char) fr.read();
                if(ch==' '|| ch=='.'||ch=='\n' ||ch==',')
                {
                    ListOfWords.add(str.toString());
                    str="";
                }
                else {
                    str+=ch;
                }
            }
        }
        catch (IOException e){
            System.out.println(e.toString());
        }
        return ListOfWords;
    }
    //without binary search
    public static void find(ArrayList<String> al,String w)
    {
        int i=0;
        for(String temp:al)
        {
            i++;
            if(temp.equals(w))
            {
                System.out.println(w+"found at "+i);
            }
        }
    }
    public static int binarySearch(ArrayList<String> al,String w)
    {
        Collections.sort(al);
        System.out.println(al);
        int left=0;
        int right=al.size()-1;

        while(left<=right)
        {
            int mid=(left+right)/2;
            int compareResult = w.compareTo(al.get(mid));
            if(compareResult==0)
            {
                return mid;
            }
            else if(compareResult>0)
            {
                left=mid+1;
            }
            else {
                right=mid-1;
            }
        }
        return -1;
    }
}
