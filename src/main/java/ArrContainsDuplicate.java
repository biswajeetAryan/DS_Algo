import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        Solution obj = new Solution();
        System.out.println(obj.containsDuplicate(nums));
    }
}

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numsSet = new HashSet<Integer>();
        for (int item: nums) {
            if (!numsSet.add(item)) { // add() return false if curr element already present in HashSet
                return true;
            }
        }
        return false;
    }
}

//    boolean containsDuplicate(int[] nums) {
//        int len = nums.length;
//        if (len == 1)
//            return false;
//        if (len == 2)
//            return nums[0] == nums[1];
//        Arrays.sort(nums);
//        for (int i = 1; i < len; i++) {
//            if (nums[i - 1] == nums[i])
//                return true;
//        }
//        return false;
//    }

//    int binarySearch(int[] arr, int l, int r, int x){
//        if(r >= l){
//            int mid = (l+r)/2;
//            if (arr[mid] == x)
//                return mid;
//            if (arr[mid] > x)
//                return binarySearch(arr, l,mid-1, x);
//
//            return binarySearch(arr,mid+1, l, x);
//        }
//        return -1;
//    }
//}
