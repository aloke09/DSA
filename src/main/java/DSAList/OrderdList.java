package DSAList;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class OrderdList
{
    public static void main(String[] args) throws IOException {
        LinkedList<Integer> ll = new LinkedList<>();
        String filenameWithLoc = "C:\\Users\\Aloke\\IdeaProjects\\DSA\\src\\main\\java\\DSAList\\numbers.txt";
//        FileReader f=new FileReader(filenameWithLoc);
//        while(f.ready())
//        {
//            StringBuffer sb=new StringBuffer();
//            int temp=f.read();
//            if (temp == '\n') {
//                ll.add(Integer.valueOf(sb.toString()));
//                sb = new StringBuffer();
//            } else {
//                sb.append(temp);
//            }
//        }
        String str = Files.readString(Path.of(filenameWithLoc));
        System.out.println(str);
        String[] arr = str.split(" ");
        Arrays.sort(arr);
        for (String s : arr) {
            int temp = Integer.parseInt(s);
            ll.add(temp);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no->");
        int no = sc.nextInt();
        if (ll.contains(no))
        {
            System.out.println("no is present in list");
            ll.remove(Integer.valueOf(no));
        }
        else
        {
            System.out.println("not present in list");;
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i) < no) {
                    System.out.println(i); //  Print index
                } else {
                    ll.add(i, no); // Insert at req index 
                    break;
                }
            }
        }
        System.out.println(ll);
    }
}
