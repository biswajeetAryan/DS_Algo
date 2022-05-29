import java.util.*;

public class PascalsTriangle {
    public static void main(String[] args) {
        int r = 5;
        SolutionPascalsTriangle obj = new SolutionPascalsTriangle();
        System.out.println(Arrays.toString(obj.generate(r).toArray()));
    }
}
class SolutionPascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(Arrays.asList(1));
        for (int i = 1; i < numRows; i++) {
            List<Integer> arr = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if(j==0 || j==i) {
                    arr.add(1);
                }
                else {
                    arr.add((res.get(i - 1).get(j)) + (res.get(i - 1).get(j-1)));
                }
            }
            res.add(arr);
        }
        return res;
    }
}