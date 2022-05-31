import java.util.HashSet;
import java.util.Set;

public class ArrIsValidSudoku {
    public static void main(String[] args) {
        char[][] board = {{'5','3','.','.','7','.','.','.','.'}
                         ,{'6','.','.','1','9','5','.','.','.'}
                         ,{'.','9','8','.','.','.','.','6','.'}
                         ,{'8','.','.','.','6','.','.','.','3'}
                         ,{'4','.','.','8','.','3','.','.','1'}
                         ,{'7','.','.','.','2','.','.','.','6'}
                         ,{'.','6','.','.','.','.','2','8','.'}
                         ,{'.','.','.','4','1','9','.','.','5'}
                         ,{'.','.','.','.','8','.','.','7','9'}};
        SolutionArrIsValidSudoku obj = new SolutionArrIsValidSudoku();
        System.out.println(obj.isValidSudoku(board));
    }
}

class SolutionArrIsValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j] != '.') {
                    if (!seen.add(board[i][j] +"row"+ i) ||
                        !seen.add(board[i][j] +"col"+ j) ||
                        !seen.add(board[i][j] +"block"+ i / 3 + "-" + j / 3)) {
                        System.out.println(board[i][j]);
                        return false;
                    }
                }
            }
        }
        return true;
    }

    // block is the top right corner(index) of the current block(3x3) of board[i][j] out of 9 blocks(3x3)
    // block indices are:
    // 0-0  0-1  0-2
    // 1-0  1-1  1-2
    // 2-0  2-1  2-2
    // last element index is (8,8) --> block index = (8/3,8/3) == (2,2)
    // last-1 element index is (7,8) --> block index = (7/3,8/3) == (2,2)
    // last-2 element index is (6,8) --> block index = (6/3,8/3) == (2,2)
    // for all numbers inside a block will have same block index
}
