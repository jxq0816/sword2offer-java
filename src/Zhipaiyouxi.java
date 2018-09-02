import java.util.Scanner;

public class Zhipaiyouxi {

    public static int[] quicksort(int left,int right,int[] a)
    {
        int i,j,t,temp;
        if(left>right)
            return a;

        temp=a[left]; //temp中存的就是基准数
        i=left;
        j=right;
        while(i!=j)
        {
            //顺序很重要，要先从右边开始找
            while(a[j]>=temp && i<j)
                j--;
            //再找右边的
            while(a[i]<=temp && i<j)
                i++;
            //交换两个数在数组中的位置
            if(i<j)
            {
                t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }
        //最终将基准数归位
        a[left]=a[i];
        a[i]=temp;

        a=quicksort(left,i-1,a);//继续处理左边的，这里是一个递归的过程
        a=quicksort(i+1,right,a);//继续处理右边的 ，这里是一个递归的过程
        return a;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] b = quicksort(0,a.length-1,a);
//        for(int k : b){
//            System.out.println(k);
//        }
        int rs=0;
        for(int i=b.length-1,j=0;i>=0;i--,j++){
            if(j%2==0){
                rs+=b[i];
            }else {
                rs -= b[i];
            }
        }
        System.out.println(rs);
    }
}
