import java.util.*;

public class ArrIntersect {
    public static void main(String[] args) {
        int [] nums1 = {4,9,5};
        int [] nums2 = {9,4,9,8,4};
        SolutionArrIntersect obj = new SolutionArrIntersect();
        System.out.println(Arrays.toString(obj.intersect(nums1,nums2)));
    }
}
class SolutionArrIntersect {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> resList = new ArrayList<>();
        Map<Integer, Integer> myMap = new HashMap<>();

        for (int item1 : nums1) {
            if ((myMap.containsKey(item1))) {
                myMap.put(item1, myMap.get(item1) + 1);
            } else {
                myMap.put(item1, 1);
            }
        }

        for (int item2 : nums2) {
            if (myMap.containsKey(item2)) {
                if (myMap.get(item2) > 0) {
                    resList.add(item2);
                    myMap.put(item2, myMap.get(item2) - 1);
                }
            }
        }

        return resList.stream().mapToInt(i -> i).toArray();
    }
}