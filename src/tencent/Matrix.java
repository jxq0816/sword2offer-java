package tencent;
//子矩阵元素和最大
public class Matrix {
    public static int maxSum(int[][] m) {
        if (m == null || m.length == 0 || m[0].length == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < m.length; i++) {
            for (int j = i; j < m.length; j++) {
                int sum = 0;
                for (int k = 0; k < m[j].length; k++) {
                    if (i != j) {
                        m[i][k] += m[j][k];// 把累加结果保存在当前行
                    }
                    sum += m[i][k];
                    max = Math.max(max, sum);
                    sum = sum > 0 ? sum : 0;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] matrix = {{0,-2,-7,0},{9,2,-6,2},{-4,1,-4,1},{-1,8,0,-2}};
        System.out.println(maxSum(matrix));

    }
}
