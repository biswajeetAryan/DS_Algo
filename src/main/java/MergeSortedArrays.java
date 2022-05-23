import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int [] nums1 = {-1,0,0,3,3,3,0,0,0};
        int m=6;
        int [] nums2 = {1,2,2};
        int n=3;
        SolutionMergeSortedArrays obj = new SolutionMergeSortedArrays();
        obj.merge(nums1, m, nums2, n);
    }
}
class SolutionMergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Solve the problem in backward direction using simple comparison
        int end1=m-1, end2=n-1, endFinal=m+n-1;
        while(end1>=0 && end2>=0){
            if(nums1[end1]>nums2[end2]){
                nums1[endFinal] = nums1[end1];
                end1--;
            }else{
                nums1[endFinal] = nums2[end2];
                end2--;
            }
            endFinal--;
        }
        while(end2>=0){
            nums1[endFinal] = nums2[end2];
            end2--;
            endFinal--;
        }
        System.out.println(Arrays.toString(nums1));
    }

//          sorting nums2 will solve the problem but increase the time complexity by factor of log(n)
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int j=0,t;
//        System.out.println(Arrays.toString(nums1)+" "+m+" "+Arrays.toString(nums2)+" "+n);
//        if (m == 0) {
//            nums1[0] = nums2[0];
//        }
//        else {
//            for (int i = 0; i < (m+n) && j < n; i++) {
//                if(nums1[i] == 0 && i >= m){
//                    nums1[i]=nums2[j];
//                    j++;
//                }
//                else if(nums1[i] > nums2[j]){
//                    t= nums1[i];
//                    nums1[i]=nums2[j];
//                    nums2[j]=t;
//                    Arrays.sort(nums2);
//                }
//            }
//        }
//        System.out.println(Arrays.toString(nums1));
//    }
}
