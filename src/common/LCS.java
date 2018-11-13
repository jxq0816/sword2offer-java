package common;// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
import java.util.Scanner;
public class LCS {
    public static int LCS(String str1, String str2){
        int[][] c = new int[str1.length() + 1][str2.length() + 1];
        for(int row = 0; row <= str1.length(); row++)
            c[row][0] = 0;
        for(int column = 0; column <= str2.length(); column++)
            c[0][column] = 0;

        for(int i = 1; i <= str1.length(); i++)
            for(int j = 1; j <= str2.length(); j++)
            {
                if(str1.charAt(i-1) == str2.charAt(j-1))
                    c[i][j] = c[i-1][j-1] + 1;
                else if(c[i][j-1] > c[i-1][j])
                    c[i][j] = c[i][j-1];
                else
                    c[i][j] = c[i-1][j];
            }
        return c[str1.length()][str2.length()];
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*String a=in.nextLine();
        String b=in.nextLine();*/
        String a="姜q兴琪，a";
        String b="姜兴琪,123";
        if(a=="" || b==""){
            System.out.print(0);
        }else{
            System.out.print(LCS(a.toLowerCase(),b.toLowerCase()));
        }
    }
}