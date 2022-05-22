public class MaxSubArray {
    public static void main(String[] args) {
        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
        SolutionMaxSubArray obj = new SolutionMaxSubArray();
        System.out.println(obj.maxSubArray(nums));
    }
}
class SolutionMaxSubArray {
    // DP - Kadane’s algorithm to find sum of the maximum subarray.
    public int maxSubArray(int[] nums) {
        int sum=0, max=Integer.MIN_VALUE;
        if (nums.length == 1)
            return nums[0];

        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            max = Math.max(sum,max);
            if(sum < 0)
                sum=0;

        }
        return max;
    }
}
