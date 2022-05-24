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
        int n1=nums1.length, n2=nums2.length, k=0;
        List<Integer> resList = new ArrayList<>();
        Map<Integer, Integer> myMap = new HashMap<>();

        for (int value : nums1) {
            if ((myMap.containsKey(value))) {
                myMap.put(value, myMap.get(value) + 1);
            } else {
                myMap.put(value, 1);
            }
        }

        for (int j : nums2) {
            if (myMap.containsKey(j)) {
                if (myMap.get(j) > 0) {
                    resList.add(j);
                    myMap.put(j, myMap.get(j) - 1);
                }
            }
        }

        return resList.stream().mapToInt(i -> i).toArray();
    }
}