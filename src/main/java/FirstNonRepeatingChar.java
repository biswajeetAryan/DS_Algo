import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String s = "loveleetcode";
        SolutionFirstNonRepeatingChar obj = new SolutionFirstNonRepeatingChar();
        System.out.println(obj.firstUniqChar(s));
    }
}
class SolutionFirstNonRepeatingChar {
    public int firstUniqChar(String s) {
        Map<Character,Integer> myMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(myMap.containsKey(s.charAt(i)))
                myMap.put(s.charAt(i), myMap.get(s.charAt(i)) + 1);
            else
                myMap.put(s.charAt(i), 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if(myMap.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}