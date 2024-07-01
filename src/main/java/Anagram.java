import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "gautam";
        String s2 = "maugmt";

        Anagram(s1, s2);
    }

    public static void Anagram(String s1, String s2) {
        HashMap<Character, Integer> m1 = new HashMap<>();

        if (s1.length() == s2.length()) {
            // Count the frequency of each character in s1
            for (int i = 0; i < s1.length(); ++i) {
                char c = s1.charAt(i);
                m1.put(c, m1.getOrDefault(c, 0) + 1);
            }

            // Decrease the frequency based on characters in s2
            for (int i = 0; i < s2.length(); ++i) {
                char c = s2.charAt(i);
                if (m1.containsKey(c)) {
                    m1.put(c, m1.get(c) - 1);
                    if (m1.get(c) == 0) {
                        m1.remove(c);
                    }
                } else {
                    System.out.println("Not anagram");
                    return;
                }
            }

            if (m1.isEmpty()) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not anagram");
            }
        } else {
            System.out.println("Not anagram");
        }
    }
}
