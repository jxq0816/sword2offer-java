/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 */
package offer.StackMin;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    Stack<Integer> stack=new Stack();
    List<Integer> list=new ArrayList<Integer>();
    public void push(int node) {
        stack.push(node);
        if(list.size()!=0){
            int min = (int) list.get(list.size()-1);
            if(min<node){
                list.add(min);
            }else{
                list.add(node);
            }
        }else{
            list.add(node);
        }
    }
    public void pop() {
        stack.pop();
        list.remove(list.size()-1);
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return list.get(list.size()-1);
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.push(2);
        solution.push(3);
        int min = solution.min();
        System.out.print(min);
    }
}