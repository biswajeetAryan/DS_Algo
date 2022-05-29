import java.util.Arrays;

public class MatrixReshape {
    public static void main(String[] args) {
        int[][] mat = {{1, 2}, {3, 4}};
        int r=4, c=1;
        SolutionMatrixReshape obj = new SolutionMatrixReshape();
        System.out.println(Arrays.deepToString(obj.matrixReshape(mat,r,c)));
    }
}

class SolutionMatrixReshape {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if ((mat.length * mat[0].length) != r*c){
            System.out.println("original returned");
            return mat;
        }
        int[][] res =new int[r][c];
        int i2=0,j2=0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                res[i2][j2++] = mat[i][j];
                if(j2 == c){
                    j2=0;
                    i2++;
                }
            }
        }
        return res;
    }
}
