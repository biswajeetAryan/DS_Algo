import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrThreeSum {
    public static void main(String[] args) {
        int [] arr = {-1,0,1,2,-1,-4};
        SolutionArrThreeSum obj = new SolutionArrThreeSum();
        List<List<Integer>> res = obj.threeSum(arr);
        System.out.println(res.toString());
    }
}

class SolutionArrThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resList = new LinkedList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {
            // check for duplicates
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])){
                int left=i+1,right=nums.length-1, sum=0-nums[i];
                while(left < right){
                    if(nums[left]+nums[right]==sum){
                        resList.add(Arrays.asList(nums[i],nums[left],nums[right]));
                        // shift left by 1 if found duplicates
                        while (left < right && nums[left] == nums[left+1]) left++;
                        // shift right by -1 if found duplicates
                        while (left < right && nums[right] == nums[right-1]) right--;
                        left++;
                        right--;
                    }else if(nums[left]+nums[right] < sum){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }
        return resList;
    }
}