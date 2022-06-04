import java.util.HashMap;
import java.util.Map;

public class StrCanConstruct {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "ba";
        SolutionCanConstruct obj = new SolutionCanConstruct();
        System.out.println(obj.canConstruct(ransomNote, magazine));
    }
}
class SolutionCanConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> myMap = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            if(myMap.containsKey(magazine.charAt(i)))
                myMap.put(magazine.charAt(i), myMap.get(magazine.charAt(i)) + 1);
            else
                myMap.put(magazine.charAt(i), 1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if(myMap.containsKey(ransomNote.charAt(i)) && myMap.get(ransomNote.charAt(i)) > 0)
                myMap.put(ransomNote.charAt(i), myMap.get(ransomNote.charAt(i)) - 1);
            else
                return false;
        }
        return true;
    }
}
