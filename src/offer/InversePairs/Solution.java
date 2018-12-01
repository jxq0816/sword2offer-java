package offer.InversePairs;

public class Solution {
    private long count;

    public int InversePairs(int[] array) {
        if (array == null || array.length == 0)
            return 0;
        int[] temp = new int[array.length];
        divid(array, temp, 0, array.length - 1);
        return (int) (count % 1000000007);
    }

    public void divid(int[] array, int[] temp, int low, int high) {
        if (low >= high)
            return;
        int mid = (low + high) / 2;
        divid(array, temp, low, mid);
        divid(array, temp, mid + 1, high);
        merge(array, temp, low, high);
    }

    public void merge(int[] array, int[] temp, int low, int high) {
        int lowend = (low + high) / 2;
        int highpos = lowend + 1;
        int temppos = low;
        int len = high - low + 1;
        while (low <= lowend && highpos <= high) {
            if (array[low] <= array[highpos]) {
                temp[temppos++] = array[low++];            //简化写法，节省代码
            } else {
                count += (lowend - low + 1) % 1000000007;
//改为count=count%1000000007+((middle-leftPoint+1)%1000000007);才通过
                temp[temppos++] = array[highpos++];         //简化写法，节省代码
            }
        }
        while (low <= lowend) {
            temp[temppos++] = array[low++];
        }
        while (highpos <= high) {
            temp[temppos++] = array[highpos++];
        }
        for (int i = len; i > 0; i--, high--) {                    //for循环中一个分号可以写多个条件
            array[high] = temp[high];
        }
    }
}
