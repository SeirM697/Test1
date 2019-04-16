import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() < 1) return 0;
        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<Character> hashSet2 = new HashSet<>();
        char[] chars = s.toCharArray();
        int i = 0;
        int j = 1;
        while (i < chars.length) {
            hashSet2.add(chars[i]);
            for (; j < chars.length; j++) {
                if (hashSet2.contains(chars[j])) {
                    break;
                }
                hashSet2.add(chars[j]);
            }
            i++;
            j = i + 1;
            hashSet.add(hashSet2.size());
            System.out.println(hashSet2);
            hashSet2.clear();
        }
        return Collections.max(hashSet);
    }


    public static void main(String[] args) {
        String s = "v90qenu9yt4q8yt947v9v9ntqynvotyt0v9qtu";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
