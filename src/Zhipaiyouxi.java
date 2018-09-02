import java.util.Scanner;

public class Zhipaiyouxi {
    public static int[] sort(int a[]) {
        int n=a.length;
        //用冒泡排序法将序列A中的元素按从小到大排序
        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;//表示本趟冒泡是否发生交换的标志
            for (int j = n - 1; j > i; j--) {//一趟冒泡过程
                if (a[j - 1]< a[j]) {//若为逆序
                    int t=a[j-1];
                    a[j-1]=a[j];
                    a[j]=t;
                    flag = true;
                }
            }
            if (flag == false) {
                return a;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] b = sort(a);
//        for(int k : b){
//            System.out.println(k);
//        }
        int rs=0;
        for(int j=0;j<b.length;j++){
            if(j%2==0){
                rs+=b[j];
            }else{
                rs-=b[j];
            }
        }
        System.out.println(rs);
    }
}
