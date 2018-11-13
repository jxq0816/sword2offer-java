package offer.printMatrix;

import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> rs=new ArrayList();
        int row_len = matrix.length;
        int col_len = matrix[0].length;
        int min_len = Math.min(row_len,col_len);
        if(row_len==1){
            for(int i=0;i<col_len;i++){
                rs.add(matrix[0][i]);
            }
        }else if(col_len==1){
            for(int i=0;i<row_len;i++){
                rs.add(matrix[i][0]);
            }
        }else{
            for(int k=0;k<min_len/2;k++){
                for(int i=k,j=k;j<col_len-k-1;j++){//第一条边，行不变，列 k->len-k-1
                    rs.add(matrix[i][j]);
                }
                for(int i=k,j=col_len-k-1;i<row_len-k-1;i++){//第二条边，列不变，行 k->len-k-1
                    rs.add(matrix[i][j]);
                }
                for(int i=row_len-k-1,j=col_len-k-1;j>k;j--){//第三条边，行不变,列 len-k-1 ->k
                    rs.add(matrix[i][j]);
                }
                for(int i=row_len-k-1,j=k;i>k;i--){//第四条边，列不变,行 len-k-1 -> k
                    rs.add(matrix[i][j]);
                }
            }
            if(min_len%2==1){
                if(row_len==col_len){
                    rs.add(matrix[row_len/2][row_len/2]);
                }else{
                    for(int i=row_len/2;i<col_len-1;i++){
                        rs.add(matrix[row_len/2][i]);
                    }
                }

            }
        }
        return rs;
    }
    public static void main(String[] args){
        Solution solution=new Solution();
        int [][] matrix={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        ArrayList<Integer> rs = solution.printMatrix(matrix);
        for(int i=0;i<rs.size();i++){
            System.out.print(rs.get(i)+" ");
        }
    }
}