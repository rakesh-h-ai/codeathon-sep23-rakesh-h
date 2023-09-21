//define a class to sort a string according to the frequency of character and return the final string
import java.util.*;
public class StringSorter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        StringSorter obj = new StringSorter();
        System.out.println(obj.sortString(str));
    }
    public String sortString(String str) {
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }
        PriorityQueue < Character > pq = new PriorityQueue < > ((a, b) -> freq[b - 'a'] - freq[a - 'a']);
        for (char i = 'a'; i <= 'z'; i++) {
            if (freq[i - 'a'] > 0) {
                pq.add(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            char ch = pq.poll();
            for (int i = 0; i < freq[ch - 'a']; i++) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}


