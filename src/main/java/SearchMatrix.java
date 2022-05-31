import java.util.Arrays;

public class SearchMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
//        int[][] matrix = {{1,1}};
        SolutionSearchMatrix obj = new SolutionSearchMatrix();
        System.out.println(obj.searchMatrix(matrix, target));
    }
}

class SolutionSearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n=matrix[0].length, targetRow=-1, res=-1;
        for (int i = 0; i < m; i++) {
            if(matrix[i][0] <= target && target <= matrix[i][n-1]) {
                targetRow = i;
                break;
            }
        }
        if(targetRow >= 0)
            res = Arrays.binarySearch(matrix[targetRow], target);
        return res >= 0;
    }
}
