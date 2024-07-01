package sentanceToNumber;

import java.util.HashMap;

public class sToNo
{
    public static void main(String[] args)
    {
        String str="HELLO WORLD";
        System.out.println(sentanceToNo(str));

    }
    public static String sentanceToNo(String s)
    {
        HashMap<Character,Integer>map=new HashMap<>();
        map.put('A',2);
        map.put('B',22);
        map.put('C',222);
        map.put('D',3);
        map.put('E',33);
        map.put('F',333);
        map.put('G',4);
        map.put('H',44);
        map.put('I',444);
        map.put('J',5);
        map.put('K',55);
        map.put('L',555);
        map.put('M',6);
        map.put('N',66);
        map.put('O',666);
        map.put('P',7);
        map.put('Q',77);
        map.put('R',777);
        map.put('S',7777);
        map.put('T',8);
        map.put('U',88);
        map.put('V',777);
        map.put('W',9);
        map.put('X',99);
        map.put('Y',999);
        map.put('Z',9999);
        map.put(' ',0);
        String result=new String();
        char[] charArray = s.toCharArray();
        for(char temp:charArray)
        {
            result+=map.getOrDefault(temp, Integer.valueOf("0"));
        }


        return result;
    }
}
