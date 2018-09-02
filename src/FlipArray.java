import java.util.Scanner;

public class FlipArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        if(n<2||m<1){
            System.out.println(0);
            return;
        }
        if(n%(2*m)!=0){
            System.out.println(0);
            return;
        }
        long sum = n/(2*m)*m;
        sum*=m;
        System.out.println(sum);
    }
}
