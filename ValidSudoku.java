import java.util.Set;
import java.util.HashSet;

public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        boolean isRowValid = isRowValid(board);
        boolean isColumnValid = isColumnValid(board);
        boolean isSubGridValid = isSubGridValid(board);
        return (isColumnValid && isRowValid && isSubGridValid) ? true : false;
    }
    
    public static boolean isRowValid(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            Set<Integer> row = new HashSet<>();
            for (int j = 0; j < board[i].length; j++) {
                int currentElem = board[i][j];
                if (currentElem == '.') {
                    // Do nothing
                } else if (row.contains(currentElem)) {
                    return false;
                } else {
                    row.add(currentElem);
                }
            }
        }
        return true;
    }
    
    public static boolean isColumnValid(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            Set<Integer> row = new HashSet<>();
            for (int j = 0; j < board[i].length; j++) {
                int currentElem = board[j][i];
                if (currentElem == '.') {
                    // Do nothing
                } else if (row.contains(currentElem)) {
                    return false;
                } else {
                    row.add(currentElem);
                }
            }
        }
        return true;
    }
    
    public static boolean isSubGridValid(char[][] board) {
        for (int l = 0; l < 9; l+=3) {       
            for (int k = 0; k < 9; k+=3) {   
                Set<Integer> row = new HashSet<>();    
                for (int i = 0 + l; i < 3 + l; i++) {
                    for (int j = 0 + k; j < 3 + k; j++) {
                        int currentElem = board[j][i];
                        if (currentElem == '.') {
                            // Do nothing
                        } else if (row.contains(currentElem)) {
                            return false;
                        } else {
                            row.add(currentElem);
                        }
                    }
                }
            }
        }
        return true;
    }
}