import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrTwoSum {
    public static void main(String[] args) {
        int [] nums = {3,3};
        SolutionTwoSum obj = new SolutionTwoSum();
        System.out.println(Arrays.toString(obj.twoSum(nums, 6)));
    }
}
class SolutionTwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> myMap=new HashMap<>();
        int[] res= new int[2];

        for (int j=0;j<nums.length;j++){
            if(myMap.containsKey(target-nums[j]) && myMap.get(target-nums[j]) != j){
                res[0]=j;
                res[1]=myMap.get(target-nums[j]);
                break;
            }
            myMap.put(nums[j],j);
        }
        return res;
    }
}