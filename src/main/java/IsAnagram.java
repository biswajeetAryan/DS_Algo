import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args) {
        String s = "rat", t = "car";
        SolutionIsAnagram obj = new SolutionIsAnagram();
        System.out.println(obj.isAnagram(s, t));
    }
}
class SolutionIsAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;

        int[] freq = new int[26];
        Arrays.fill(freq, 0);
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)-97] +=1;
        }

        for (int i = 0; i < t.length(); i++) {
            if(freq[t.charAt(i)-97] > 0)
                freq[t.charAt(i)-97] -=1;
            else
                return false;
        }

//        System.out.println(Arrays.toString(freq));
        return true;
    }
}