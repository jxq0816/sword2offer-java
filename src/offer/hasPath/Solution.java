package offer.hasPath;
import java.util.Arrays;

public class Solution {
    public static boolean hasPath(char[] matrix, int rows, int cols, char[] str){
        boolean[] assistMatrix = new boolean[rows*cols];
        Arrays.fill(assistMatrix, true);
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if(hasPathAtAStartPoint(matrix, rows, cols, str, i, j, assistMatrix)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean hasPathAtAStartPoint(char[] matrix, int rows, int cols, char[] str, int row, int col, boolean[] assistMatrix) {
        if(str.length <= 0) {
            return true;
        }
        int index = row*cols + col;
        if(row<0 || row>=rows || col<0 || col>=cols || assistMatrix[index]==false || matrix[index] != str[0]) {
            return false;
        }
        assistMatrix[index] = false;
        char[] strRest = Arrays.copyOfRange(str, 1, str.length);
        if(hasPathAtAStartPoint(matrix,rows,cols,strRest,row+1,col,assistMatrix)||
                hasPathAtAStartPoint(matrix,rows,cols,strRest,row-1,col,assistMatrix)||
                hasPathAtAStartPoint(matrix,rows,cols,strRest,row,col+1,assistMatrix)||
                hasPathAtAStartPoint(matrix,rows,cols,strRest,row,col-1,assistMatrix)) {
            return true;
        }
        assistMatrix[index] = true;
        return false;
    }
    public static void main(String[] args) {
        char[] matrix = {'A','B','C','E','S','F','C','S','A','D','E','F'};
        char[] str = {'A','B','C','C','E','D'};
        System.out.println(hasPath(matrix,3,4,str));
    }
}
